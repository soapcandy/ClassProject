-- join & subquery exam

-- 1 마당서점의고객이요구하는다음질문에대해SQL 문을작성하시오.
-- (5) 박지성이 구매한 도서의 출판사 수

select count(distinct b.publisher )
from orders o, book b, customer c
where o.bookid=b.bookid and o.custid=c.custid
and c.name='박지성'
;

-- (6) 박지성이 구매한 도서의 이름, 가격, 정가와 판매 가격의 차이
select c.name, b.bookname, b.price, o.saleprice, b.price-o.saleprice as gap
from orders o , book b, customer c
where o.bookid=b.bookid and o.custid=c.custid
;

--(7) 박지성이 구매하지 않은 도서의 이름
-- 구매한 도서를 찾고 해당 범위를 반전
-- 박지성이 구매한 도서의 bookid
select distinct bookid 
from orders o, customer c 
where o.custid=c.custid and c.name='박지성'
;

select bookname
from book
where bookid not in (select distinct bookid 
                    from orders o, customer c 
                    where o.custid=c.custid and c.name='박지성'
                    )
;

-- 2 마당서점의운영자와경영자가요구하는다음질문에대해SQL 문을작성하시오.
-- (8) 주문하지 않은 고객의 이름 ( 부속질의사용 )
-- 구매를 한 고객의 번호
select distinct custid from orders;

select name
from customer
where custid not in (select distinct custid from orders)
;

-- 구매 이력이 있는 고객
select *
from customer c
where not exists ( select * from orders o where c.custid=o.custid ) -- select의 결과가 1행이라도 있으면 참 
;

-- (9) 주문 금액의 총액과 주문의 평균 금액
select sum(saleprice) , avg(saleprice) from orders;


-- (10) 고객의 이름과 고객별 구매액
-- group by, c.custid, c.name
-- orders , customer
select c.name, sum(o.saleprice) as total
from orders o, customer c
where o.custid=c.custid
group by c.custid , c.name
order by c.custid
;



-- (11) 고객의 이름과 고객이 구매한 도서목록
select c.name, b.bookname
from orders o, book b, customer c
where o.bookid=b.bookid and o.custid=c.custid
;

-- (12) 도서의가격(Book 테이블)과 판매가격(Orders 테이블)의 차이가 가장 많은 주문
-- 정가-판매가 => 최대 차이 
select max(price-saleprice)
from orders o, book b
where o.bookid=b.bookid
;
select o.orderid, b.price, o.saleprice, price-saleprice as gap
from orders o, book b
where o.bookid=b.bookid
and b.price-o.saleprice =(select max(price-saleprice)
                            from orders o, book b
                            where o.bookid=b.bookid)
;

-- (13) 도서의 판매액 평균 보다 자신의 구매액 평균이 더 높은 고객의 이름
-- 고객별 총 판매액 출력 조건 -> 총 평균보다 더 높은 값을 가지는 고객만

select c.custid, c.name, avg(o.saleprice)
from orders o, customer c
where o.custid=c.custid
group by c.custid, c.name
having avg(o.saleprice) > (select avg(saleprice) from orders)
order by c.custid
;

select avg(saleprice) from orders;

-- 3. 마당서점에서 다음의 심화된 질문에 대해 SQL 문을 작성하시오.
-- (1) 박지성이 구매한 도서의 출판사와 같은 출판사에서 도서를 구매한 고객의 이름
-- orders, book => publisher in ( )
-- 박지성이 구매한 도서의 출판사 이름
select distinct b.publisher
from orders o, book b, customer c
where o.bookid=b.bookid and o.custid=c.custid
and c.name='박지성'
;
select c.name
from orders o, book b, customer c
where o.bookid=b.bookid and o.custid=c.custid
and b.publisher in (select distinct b.publisher
    from orders o, book b, customer c
    where o.bookid=b.bookid and o.custid=c.custid
    and c.name='박지성')
and c.name <> '박지성'
;

-- (2) 두 개 이상의 서로 다른 출판사에서 도서를 구매한 고객의 이름
-- group by custid, name
-- 고객별 구매한 도서의 출판사의 수
select c.custid, c.name, count(distinct b.publisher)
from orders o, book b, customer c
where o.bookid=b.bookid and o.custid=c.custid
group by c.custid, c.name
having count(distinct b.publisher) > 1
;

-- 2개 이상의 출판사의 책을 구매한 회원 id
select *
from customer
where custid in (select o.custid
    from orders o, book b
    where o.bookid=b.bookid
    group by o.custid
    having count(distinct b.publisher) > 1)
;

select o.custid
from orders o, book b
where o.bookid=b.bookid
group by o.custid
having count(distinct b.publisher) > 1
;