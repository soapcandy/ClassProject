
-- 2023.04.17
--ddl

create table ddl_test (
    -- 컬럼들을 정의
    no number(3),
    name varchar(10),
    birth date default sysdate
);