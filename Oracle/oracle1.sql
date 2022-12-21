create table person1(
name varchar2(20),
gender varchar2(8) primary key,
address varchar2(30),
dity varchar(20)
);

create table roomtype(
typenum number(3) primary key,
typename varchar2(20) not null,
comments varchar2(32)
);
desc roomtype;
create table roominfo (
num varchar2(10) primary key,
name varchar2(20) not null,
type number(3), 
howmany number(3) default 1,
howmuch number(4) default 0,
constraint fk_typenum foreign key(type) references roomtype(typenum) 
);
insert into roomtype values(1,'Suite Room', null);
insert into roomtype values(2,'Deluxe Room', null);
insert into roomtype values(3,'Family Room', null);
select * from roomtype;
insert into roominfo values(100,'백두산',1,6,1200);
select * from roominfo;
insert into roominfo values (100,'한라산',4,6,1200);
create view under_five as select * from worker where salary< 5000;
select * from worker where salary<5000;
select * from under_five;
select * from worker where emp_name='Jonathan Taylor';
create index ndx_emp_name on worker(emp_name);
create synonym human_resource for employees;
select * from human_resource;

create sequence seq_id;
select seq_id.nextval from dual;

desc roomtype;
select * from roomtype;
insert into roomtype values(seq_id.nextval,'Domitory',null);
insert into roomtype values(seq_id.nextval,'Single Room',null);
insert into roomtype values(seq_id.nextval,'Double Room',null);
insert into roomtype values(seq_id.nextval,'Corridor',null);
select emp_name||'.'||salary from worker;
select * from worker;
-- roomtype- typenum 수정하기



-- 이름 : 매니저사번, 월급
select emp_name||':'||manager_id||', '||salary from worker;

select 1+5 from dual;
select 6/2 from dual;
select 17*5 from dual;

select * from roominfo;






















select employee_id, salary, 
    case when salary<=5000 then 'C'
        when salary>5000 and salary <= 15000 then 'B'
        else 'A'
    end as salary_level
from worker;


-- salary>=10000: 본부장급, 6000<=salary<10000: 팀장급, salary<6000: 팀원급
select emp_name, salary, 
    case when salary>=10000 then '본부장급'
        when salary>=6000 and salary<10000 then '팀장급'
        when salary<6000 then '팀원급'
    end as rank
from worker;


select emp_name, salary from worker where salary between 4000 and 6000;
-- 위는 아래와 같음
select emp_name, salary from worker where salary >= 4000 and salary <= 6000;

select emp_name, salary from worker where salary not in (6000,3000);
select emp_name from worker where emp_name like 'J___ %';

select ceil(3.14) from dual;
select ceil(10.8) from dual;
select floor(3.14) from dual;
select floor(10.8) from dual;

select power(4,4) from dual;
select sqrt(16) from dual;

select initcap('good morning vietnam') from daul;
select lower (emp_name) from worker;
select concat (concat(emp_name,','),salary) from worker;
select emp_name||','||salary from worker;
select '['||substr('good mornig',6,4)||']' from dual;
select substr('good morning',-3) from dual;

select emp_name from worker where substr(emp_name,-3)='son';
-- 위는 아래와 같다. (like는 속도가 느림)
select emp_name from worker where emp_name like '%son';
select substr('ABCDEFG',1,4), substr('가나다라마바사',1,4) from dual;
select replace('Good Morning Vietnam', 'Morning', 'Evening') from dual;
select emp_name from worker where emp_name like 'John%';
select replace (emp_name,'','') from worker where emp_name like 'John%';
select instr('내가 만약 외로울 때면, 내가 만약 괴로울 때면, 내가 만약 즐거울 때면', '만약', 5, 2) from dual;
select instr('John Wick','Joe') from dual;
select length ('good morning vietnam') from dual;
select emp_name, length(emp_name) from worker;

-- replace, substr, instr, length

-- 성 빼고 이름만 추출해서 출력하기 by using instr/substr/length
select substr(emp_name,1,instr(emp_name,' ')-1) from worker ;


-- emp_name에서 공백대신 '-'으로 대치
select replace(emp_name,' ','-') from worker;

select * from worker;
--select to_char(salary, '99.999') from worker;
select sysdate,systimestamp from dual;
select to_char(sysdate, 'yyyy-mm-dd HH24:MI:SS') from dual;
select to_char(systimestamp, 'yyyy-mm-dd HH24:MI:SS') from dual;

-- sysdate를 이용해서, 'PM x시 x분 x초'로 시각을 출력
select to_char(sysdate, 'PM HH"시" MI"분" SS"초"') from dual;
select to_char(sysdate, 'HH')||'시'||to_char(sysdate, 'MI')||'분'|| to_char(sysdate, 'SS')||'초' from dual;

select * from student;

select employee_id, to_char(start_date, 'yyyy'), to_char(end_date,'yyyy'),
        nullif(to_char(start_date, 'yyyy'),to_char(end_date,'yyyy')) nullif_year
    from job_history;

select emp_name, salary, decode(salary, 3000, '3k', 
                                        4000, '4k', 
                                        5000, '5k', 
                                        'etc') from worker;
-- decode문엔 범위지정 불가 =>범위 지정시 case 사용
select emp_name, salary, case when salary between 3000 and 3999 then '3k' 
                              when salary between 4000 and 4999 then '4k' 
                         else 'etc' end from worker;
                         
                         
                         
                         
                         commit;
                         
                         
                         
                         
                         
                         






-- 12/01

select table_name from user_tables;
select view_name from user_views;
select sequence_name from user_sequences;
select * from worker;
select employee_id eid, emp_name,salary,commission_pct pct,to_char(salary*(1+commission_pct/100),'99,999.99') final_salary
    from worker where commission_pct is not null; -- final_salary는 nickname 
    
-->>>>>> 기본집계함수 <<<<<<
select count (*), count (manager_id) from worker;
    -- null값은 집계가 안됨

select sum(salary) from worker;
select to_char(avg(salary),'99,999.99')a from worker;
select min(salary) from worker;

select manager_id,count(*),sum(salary),to_char(avg(salary),'99,999.99') from worker group by manager_id;
-- 동일한 manager_id를 가지고 있는 사람들의 월급합계 및 평균
select department_id, count(*) cnt from worker group by department_id having count(*)>1 order by cnt;
    -- group by의 where => having

    
select commission_pct, count (commission_pct) from worker group by commission_pct;
    
-- commission_pct가 같은 사람들의 월급 평균
select commission_pct, to_char(avg(salary),'99,999.99') from worker 
    group by commission_pct order by avg(salary);
    -- order by: 맨뒤에 붙이면 오름차순 정렬됨, 컬럼명 뒤에 desc를 붙이면 내림차순
    
select * from worker order by employee_id;
select commission_pct,salary from worker;
select * from customers;
    
select cust_gender, count (*) from customers group by cust_gender;
    -- 확인
select count (*) from customers where cust_gender='F';


    
select cust_marital_status, count (*) from customers group by cust_marital_status;
update customers set cust_marital_status='Married' where cust_marital_status='married';
    
-- 결혼여부별 고객수, 알파벳순으로 정렬
select cust_marital_status, count (*) from customers group by cust_marital_status order by cust_marital_status;

-- 출생년도별 고객수
select cust_year_of_birth, count(*) from customers group by cust_year_of_birth order by cust_year_of_birth;

-- 출생년도별 성별 고객수
select cust_year_of_birth 출생년도, cust_gender 고객성별, count(*) 인원수 
    from customers group by cust_year_of_birth, cust_gender order by cust_year_of_birth;
                                        
-- 이름 첫자가 같은 사람이 몇명인지 조회
select substr (emp_name,1,1) one, count (substr (emp_name,1,1)) 인원수 from worker group by substr (emp_name,1,1) order by one;

-- 월급대별 인원수
select (floor(salary/1000))*1000 월급대, count(*) 인원수 from worker 
    group by (floor(salary/1000))*1000 order by (floor(salary/1000))*1000;





create table exp_goods_asia (
country varchar2(10),seq number,goods varchar2(80));
desc exp_goods_asia;
insert into exp_goods_asia values('한국',1,'원유제외 석유류');
insert into exp_goods_asia values('한국',2,'자동차');
insert into exp_goods_asia values('한국',3,'전자집적회로');
insert into exp_goods_asia values('한국',4,'선박');
insert into exp_goods_asia values('한국',5,'LCD');
insert into exp_goods_asia values('한국',6,'자동차부품');
insert into exp_goods_asia values('한국',7,'휴대전화');
insert into exp_goods_asia values('한국',8,'환식탄화수소');
insert into exp_goods_asia values('한국',9,'무선송신기 디스플레이 부속품');
insert into exp_goods_asia values('한국',10,'철 또는 비합금강');
insert into exp_goods_asia values('일본',1,'자동차');
insert into exp_goods_asia values('일본',2,'자동차부품');
insert into exp_goods_asia values('일본',3,'전자집적회로');
insert into exp_goods_asia values('일본',4,'선박');
insert into exp_goods_asia values('일본',5,'반도체웨이퍼');
insert into exp_goods_asia values('일본',6,'화물차');
insert into exp_goods_asia values('일본',7,'원유제외 석유류');
insert into exp_goods_asia values('일본',8,'건설기계');
insert into exp_goods_asia values('일본',9,'다이오드,트랜지스터');
insert into exp_goods_asia values('일본',10,'기계류');

select * from exp_goods_asia order by goods;

select goods from exp_goods_asia where country='한국'
intersect -- 교집합
select goods from exp_goods_asia where country='일본';

select goods from exp_goods_asia where country='한국'
union -- 합집합
select goods from exp_goods_asia where country='일본';
                                        
                                        
(select 'a' from dual intersect select 'b' from dual)
minus
(select 'a' from dual union select 'b' from dual);

-- >>>>>>JOIN<<<<<<

select a.employee_id,a.emp_name,b.department_name from worker a, departments b
    where a.department_id=b.department_id;
    
-- worker 테이블을 기준으로해서 조인 --> 사원명(worker.emp_name), 직위명(jobs,job_title) 출력
select worker.emp_name, jobs.job_title from worker, jobs where worker.job_id=jobs.job_id;

select * from worker;
select * from roomtype;
select * from roominfo;
insert into roominfo values(101,'지리산',2,7,1500);
insert into roominfo values(102,'설악산',6,8,1800);
insert into roominfo values(103,'한라산',3,5,1600);

-- roominfo의 모든 컬럼을 표시 (type은 roomtypename으로 표시)
select roominfo.num, roominfo.name, roomtype.typename roomtypename, roominfo.howmany, roominfo.howmuch
    from roominfo, roomtype 
    where roominfo.type=roomtype.typenum order by roominfo.num;


-- sales 테이블의 prod_id를 product_name으로 바꾼다 (by Join with Products 테이블)
-- (prod_id) prod_name, cust_id, channel_id, employee_id
select p.prod_name, cu.cust_name, ch.channel_desc, e.emp_name, d.department_name
    from sales s, products p, customers cu, channels ch, employees e, departments d
    where s.prod_id=p.prod_id 
            and s.cust_id=cu.cust_id 
            and ch.channel_id=s.channel_id
            and s.employee_id=e.employee_id
            and e.department_id=d.department_id;
--            and d.department_name!='영업부';     department_name이 영업부가 아닌 사람 찾기
    -- join 조건 두개 이상 연결시 and로 연결
    -- 확인 할 땐 뒤에 필드를 막고 select 뒤에 count(*), 필드보다 갯수가 많으면 안됨

select p.prod_name,to_char(sum(s.amount_sold),'9,999,999,999.99') 
    from sales s,products p 
    where s.prod_id=p.prod_id
    group by p.prod_name order by p.prod_name;
    
    
-- (사번)직원명, 매출액
select e.employee_id 사번, e.emp_name 직원명, to_char(sum(s.amount_sold),'9,999,999,999.99') 매출액
    from employees e, sales s
    where s.employee_id=e.employee_id 
    group by e.employee_id, e.emp_name order by e.employee_id;












-- 12/02

select * from sales;
select * from products;
select * from customers;
select * from employees;
select * from worker;
select * from departments;

-- 사번, 이름, 매니저이름, 부서명
select a.employee_id 사번, a. emp_name 이름, b.emp_name 매니저_이름, c.department_name 부서명 -- self join
    from employees a, employees b, departments c
    where a.manager_id=b.employee_id
        and c.department_id=a.department_id
        order by a.employee_id;

 -- 부서코드 부서명 상위부서명 (departments)
 select a.department_id 부서코드, a.department_name 부서명, b.department_name 상위부서 -- self join
    from departments a, departments b 
    where a.parent_id=b.department_id 
    order by a.department_id;

select a.employee_id, a.emp_name, a.salary, b.department_name
    from employees a, departments b
    where a.department_id=b.department_id
        and a.salary>6000   -- filtering 조건
    order by a.employee_id;
        -- 위는 아래와 같음
select a.employee_id, a.emp_name, a.salary, b.department_name
    from (select * from employees where salary>6000) a, departments b   -- sub-query (거의 from이나 where 뒤에 붙음)
    where a.department_id=b.department_id
    order by a.employee_id;
select a.employee_id, a.emp_name, a.salary, b.department_name
    from employees a, departments b
    where a.department_id=b.department_id
        and a.employee_id in (select employee_id from employees where salary>6000); -- nested query
        
-- 사번, 이름, 매니저이름, 부서명, 부서장명
select a.employee_id 사번, a.emp_name 이름, b.emp_name 매니저_이름, c.department_name 부서명, b.emp_name 부서장명
    from employees a, employees b, departments c, employees d
    where a.manager_id=b.employee_id
        and c.department_id=a.department_id
        and c.manager_id=d.employee_id
        order by a.emp_name;

-- 부서명, 인원수
select b.department_name, count(*)
    from employees a, departments b
    where a.department_id=b.department_id
    group by b.department_name
    order by b.department_name;
-- 부서명/부서장/인원수
select b.department_name, c.emp_name, count(*)
    from employees a, departments b, employees c
    where a.department_id=b.department_id
        and b.manager_id=c.employee_id
    group by b.department_name, c.emp_name
    order by c.emp_name;
    -- 부서장, 인원수
select c.emp_name, count(*)
    from employees a, departments b, employees c
    where a.department_id=b.department_id
        and b.manager_id=c.employee_id
    group by c.emp_name
    order by c.emp_name;
-- 부서명, 인원수, 월급총액
select b.department_name, count(*), to_char(sum(a.salary),'9,999,999')
    from employees a, departments b
    where a.department_id=b.department_id
    group by b.department_name
    order by b.department_name;

select  a.employee_id, a.emp_name, b.emp_name
    from employees a, employees b
    where a.manager_id=b.employee_id(+);
    
select a.department_id, a.department_name, b.department_name 
    from departments a, departments b
    where a.parent_id=b.department_id(+);
    -- 아래는 위와 같음(ansi 외부조인으로 작성) only in MySQL
select a.department_id, a.department_name, b.department_name 
    from departments a left outer join departments b
    on a.parent_id=b.department_id;

create view v_six as
select a.employee_id, a.emp_name, a.salary, b.department_name
    from employees a, departments b
    where a.department_id=b.department_id
        and a.salary>6000;
drop view v_six;
        
select * from v_six;

select * from v_six order by emp_name;

select avg(salary) from employees;
select emp_name, salary from employees where salary>(select avg(salary) from employees)
order by salary;
-- subquery에는 order by 사용할 수 없다

-- 이름/부서명/부서장명 by subquery

select a.emp_name, b.department_name, c.emp_name
    from employees a, departments b, employees c
    where a.department_id=b.department_id
        and b.department_name like '%부'
        and b.manager_id=c.employee_id(+);
        
--select a.emp_name, b.department_name, c.emp_name captain
--    from employees a,
--        (select
--            from departments
--            where department_name like '%부') b,
--            employees c
--    where a.department_id=b.department_id captain_id
--        and b.captain_id=c.employee_id(+);

select x.emp_name, x.department_name, c.emp_name
    from (select a.emp_name, b.department_name, a.manager_id
            from employees a, departments b
            where a.department_id=b.department_id
                and b.department_name like '%부') x, employees c
    where x.manager_id=c.employee_id(+);
    
--select a.emp_name, b.department_name, c.emp_name captain
--    from employees a, departments b, employees c
--    where a.department_id in
--        (select department_id from departments where department_name like '%부')
--    and a.department_id=b.department_id(+)
--    and b.manager_id=c.employee_id;

commit;
        
        