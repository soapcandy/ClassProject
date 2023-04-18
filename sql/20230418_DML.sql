-- 2023.04.18
-- DML: 입력, 수정, 삭제
-- Create(insert), Read(select), Update(update), Delete(delete) => CRUD

-- INSERT: 데이터를 행단위로 입력

-- 테스트 테이블 생성
create table dept01 (
    deptno number(2) constraint PK_DEPT01_DEPTNO primary key,
    dname varchar2(10) not null,
    loc varchar2(10)
);
desc dept01;

-- insert into 테이블이름 (컬럼, 컬럼, ...) values(데이터, 데이터, ...)
insert into dept01 (deptno,   dname,     loc)
            values(  10,     'test',  'test-LOC');

insert into dept01 (loc, dname, deptno) values('서울', '개발팀', 20);

insert into dept01 (deptno, dname) values (30, 'QA');

-- 오류: 값을 수가 일치하지 않을 경우
insert into dept01 (deptno, dname, loc) values (30, 'QA', '서울', 'memo');
insert into dept01 (deptno, dname, loc) values (30, 'QA');
-- 오류: not null 제약이 있는 칼럼을 반드시 데이터를 입력해 주어야 한다
insert into dept01 (deptno, dname) values (null, null);
insert into dept01 (deptno, loc) values (30, '제주');
-- 오류: 오타
insert into dept01 (deptnom, danme) values (30, 'QA');

-- 모든 컬럼에 데이터를 입력하는 경우 -> 컬럼 명을생략하고 사용
insert into dept01 values (40, '기획팀', '대전');

-- null 값의 입력
-- 명시적 입력 
insert into dept01 values (50, 'TEST', null);
insert into dept01 values (70, 'TEST111', '');
-- 암묵적 입력
insert into dept01 (deptno, dname) values (60, 'TEST123' );

-- 서브 쿼리를 이용한 데이터 입력
create table dept02
as
select * from dept where 1 = 0
;
desc dept02;

insert into dept02
select * from dept;

select * from dept02;

-- update: 행단위 컬럼들의 데이터를 변경 -> 해당 컬럼 값을 입력/수정/삭제
-- update 테이블이름 set 컬럼1 = 새로운 값, 컬럼2 = 새로운 값, ... where 행을 선택하는 조건;
select * from dept01;
-- 10번 부서의 이름을 '디자인팀'으로 변경하고, 위치정보를 '판교'로 수정
update dept01
set dname = '디자인', loc = '판교'
where deptno = 10;

select * from dept01;

drop table dept02;
create table dept02 as select * from dept;

drop table emp01;
create table emp01 as  select * from emp;
select * from emp01;
-- 모든 사원의 부서번호를 30번으로 수정합시다
update emp01
set deptno = 30
;

-- 이번엔 모든 사원의 급여를 10% 인상시키는 update
update emp01
set sal = sal * 1.1
;

-- 모든 사원의 입사일을 오늘로 수정
update emp01
set hiredate = sysdate
;

-- 특정행을 수정할 경우 where의 조건으로 행을 선택
-- 부서번호가 10번인
-- 사원의 부서번호를 30으로 수정
update emp01
set deptno = 30
where deptno = 10
;

-- 급여가 3000이상인 사원만 급여를 10% 인상
update emp01
set sal = sal * 1.1
where sal >= 3000
;

-- 1987년에 입사한 사원의 입사일을 오늘로 수정합시다
update emp01
set hiredate = sysdate
where substr(hiredate, 1, 2) = '87'
;

select * from emp01;
-- SCOTT 사원의 부서번호는 40번, 직급은 MANAGER로 한꺼번에 수정
update emp01
set deptno = 40, job = 'MANAGER'
where ename = 'SCOTT'
;

-- SCOTT 사원의 입사일자는 오늘로, 급여를 50으로, 커미션을 4000으로 수정
update emp01
set hiredate = sysdate, sal = 50, comm = 4000
where ename = 'SCOTT'
;

-- 서브쿼리를 이용한 데이터 수정
-- 20번 부서의 지역명을 40번 부서의 지역명으로 변경
select loc from dept02 where deptno = 40;

select * from dept02;

update dept02
set loc = (select loc from dept02 where deptno = 40)
where deptno  = 20
;

-- 서브쿠리를 이용해서 부서번호가 20인 부서의 부서명과 지역명을
-- 부서번호가 30인 부서의 부서명과 지역명으로 바꿔라
update  dept02
set (dname, loc) = (select dname, loc from dept02 where deptno = 30)
where deptno = 20
;

-- delete: 테이블 행 단위 삭제
-- delete from 테이블이름 where 행을 선택하는 조건
select * from dept02;
-- dept01 테이블의 모든 행을 삭제, 모든 부서번호 삭제
delete from dept01;

-- 부서 테이블dept02에서 30번 부서만 삭제
delete from dept02 where deptno = 30;

select * from dept02;
select * from emp01;
-- 사원 테이블에서 부서명이 SALES인 사원을 모두 삭제해 봅시다
select deptno from dept02 where dname = 'SALES';
delete from emp01 where deptno = (select deptno from dept02 where dname = 'SALES');