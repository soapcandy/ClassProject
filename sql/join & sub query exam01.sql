-- join & sub query
select * from emp;
select * from orders;
select * from book;
select * from customer;

-- 1 마당서점의고객이요구하는다음질문에대해SQL 문을작성하시오.
-- (5) 박지성이구매한도서의출판사수
select count(publisher)
    from orders o, book b
        where o.bookid = b.bookid
        and custid = 1
;

-- (6) 박지성이구매한도서의이름, 가격, 정가와판매가격의차이
select b.bookname, b.price, o.saleprice, (b.price - o.saleprice) as "차이"
    from orders o, book b
        where o.bookid = b.bookid
        and custid = 1
;

-- (7) 박지성이구매하지않은도서의이름
select *
    from orders o, book b
        where o.bookid = b.bookid
        and not custid = 1
;

