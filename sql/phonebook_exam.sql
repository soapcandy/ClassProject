
-- 전화번호 저장 테이블

drop TABLE phoneInfo_basic;
drop TABLE phoneInfo_univ;
drop TABLE phoneInfo_com;

create table phoneInfo_basic (
    idx number(6) constraint pk_phoneInfo_basic PRIMARY KEY not null,
    fr_name varchar(20) not null,
    fr_phoneNumber varchar(20) not null,
    fr_email varchar(20),
    fr_address varchar(20),
    fr_regdate Date default sysdate
);

create table phoneInfo_univ (
    idx number(6) constraint pk_phoneInfo_univ PRIMARY KEY not null,
    fr_u_major varchar(20) default 'N' not null,
    fr_u_year number(1) default '1' check (fr_u_year between 1 and 4) not null,
    fr_ref number(7) constraint fk_phoneInfo_univ REFERENCES phoneInfo_basic(idx) not null
);

create table phoneInfo_com (
    idx number(6) constraint pk_phoneInfo_com PRIMARY KEY not null,
    fr_c_company varchar(20) default 'N' not null,
    fr_ref number(6) constraint fk_phoneInfo_com REFERENCES phoneInfo_basic(idx) not null
);

------------------------------------------------------------------------------------

-- 1. phoneInfo_basic 테이블의 SELECT, UPDATE, DELETE, INSERT 하는 SQL
select * from phoneinfo_basic;
update phoneInfo_basic set fr_address = 'busan' where idx = 10;
delete from phoneinfo_basic;
insert into phoneInfo_basic values(10,'Park','010-1234-5678', 'hr@gmail.com', 'korea', default);



-- 2. phoneinfo_univ 테이블의 SELECT, UPDATE, DELETE, INSERT 하는 SQL
select * from phoneinfo_univ;
update phoneInfo_univ set fr_u_year = '2' where idx = 10;
delete from phoneinfo_univ;
insert into phoneinfo_univ values(10, 'baseball', '3', 10);

-- 3. phoneinfo_com 테이블의 SELECT, UPDATE, DELETE, INSERT 하는 SQL
select * from phoneinfo_com;
update phoneInfo_com set fr_c_company = 'hi' where idx = 10;
delete from phoneinfo_com;
insert into phoneinfo_com values(10, 'hr', 10);
