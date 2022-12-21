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
insert into roominfo values(100,'��λ�',1,6,1200);
select * from roominfo;
insert into roominfo values (100,'�Ѷ��',4,6,1200);
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
-- roomtype- typenum �����ϱ�



-- �̸� : �Ŵ������, ����
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


-- salary>=10000: �������, 6000<=salary<10000: �����, salary<6000: ������
select emp_name, salary, 
    case when salary>=10000 then '�������'
        when salary>=6000 and salary<10000 then '�����'
        when salary<6000 then '������'
    end as rank
from worker;


select emp_name, salary from worker where salary between 4000 and 6000;
-- ���� �Ʒ��� ����
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
-- ���� �Ʒ��� ����. (like�� �ӵ��� ����)
select emp_name from worker where emp_name like '%son';
select substr('ABCDEFG',1,4), substr('�����ٶ󸶹ٻ�',1,4) from dual;
select replace('Good Morning Vietnam', 'Morning', 'Evening') from dual;
select emp_name from worker where emp_name like 'John%';
select replace (emp_name,'','') from worker where emp_name like 'John%';
select instr('���� ���� �ܷο� ����, ���� ���� ���ο� ����, ���� ���� ��ſ� ����', '����', 5, 2) from dual;
select instr('John Wick','Joe') from dual;
select length ('good morning vietnam') from dual;
select emp_name, length(emp_name) from worker;

-- replace, substr, instr, length

-- �� ���� �̸��� �����ؼ� ����ϱ� by using instr/substr/length
select substr(emp_name,1,instr(emp_name,' ')-1) from worker ;


-- emp_name���� ������ '-'���� ��ġ
select replace(emp_name,' ','-') from worker;

select * from worker;
--select to_char(salary, '99.999') from worker;
select sysdate,systimestamp from dual;
select to_char(sysdate, 'yyyy-mm-dd HH24:MI:SS') from dual;
select to_char(systimestamp, 'yyyy-mm-dd HH24:MI:SS') from dual;

-- sysdate�� �̿��ؼ�, 'PM x�� x�� x��'�� �ð��� ���
select to_char(sysdate, 'PM HH"��" MI"��" SS"��"') from dual;
select to_char(sysdate, 'HH')||'��'||to_char(sysdate, 'MI')||'��'|| to_char(sysdate, 'SS')||'��' from dual;

select * from student;

select employee_id, to_char(start_date, 'yyyy'), to_char(end_date,'yyyy'),
        nullif(to_char(start_date, 'yyyy'),to_char(end_date,'yyyy')) nullif_year
    from job_history;

select emp_name, salary, decode(salary, 3000, '3k', 
                                        4000, '4k', 
                                        5000, '5k', 
                                        'etc') from worker;
-- decode���� �������� �Ұ� =>���� ������ case ���
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
    from worker where commission_pct is not null; -- final_salary�� nickname 
    
-->>>>>> �⺻�����Լ� <<<<<<
select count (*), count (manager_id) from worker;
    -- null���� ���谡 �ȵ�

select sum(salary) from worker;
select to_char(avg(salary),'99,999.99')a from worker;
select min(salary) from worker;

select manager_id,count(*),sum(salary),to_char(avg(salary),'99,999.99') from worker group by manager_id;
-- ������ manager_id�� ������ �ִ� ������� �����հ� �� ���
select department_id, count(*) cnt from worker group by department_id having count(*)>1 order by cnt;
    -- group by�� where => having

    
select commission_pct, count (commission_pct) from worker group by commission_pct;
    
-- commission_pct�� ���� ������� ���� ���
select commission_pct, to_char(avg(salary),'99,999.99') from worker 
    group by commission_pct order by avg(salary);
    -- order by: �ǵڿ� ���̸� �������� ���ĵ�, �÷��� �ڿ� desc�� ���̸� ��������
    
select * from worker order by employee_id;
select commission_pct,salary from worker;
select * from customers;
    
select cust_gender, count (*) from customers group by cust_gender;
    -- Ȯ��
select count (*) from customers where cust_gender='F';


    
select cust_marital_status, count (*) from customers group by cust_marital_status;
update customers set cust_marital_status='Married' where cust_marital_status='married';
    
-- ��ȥ���κ� ����, ���ĺ������� ����
select cust_marital_status, count (*) from customers group by cust_marital_status order by cust_marital_status;

-- ����⵵�� ����
select cust_year_of_birth, count(*) from customers group by cust_year_of_birth order by cust_year_of_birth;

-- ����⵵�� ���� ����
select cust_year_of_birth ����⵵, cust_gender ������, count(*) �ο��� 
    from customers group by cust_year_of_birth, cust_gender order by cust_year_of_birth;
                                        
-- �̸� ù�ڰ� ���� ����� ������� ��ȸ
select substr (emp_name,1,1) one, count (substr (emp_name,1,1)) �ο��� from worker group by substr (emp_name,1,1) order by one;

-- ���޴뺰 �ο���
select (floor(salary/1000))*1000 ���޴�, count(*) �ο��� from worker 
    group by (floor(salary/1000))*1000 order by (floor(salary/1000))*1000;





create table exp_goods_asia (
country varchar2(10),seq number,goods varchar2(80));
desc exp_goods_asia;
insert into exp_goods_asia values('�ѱ�',1,'�������� ������');
insert into exp_goods_asia values('�ѱ�',2,'�ڵ���');
insert into exp_goods_asia values('�ѱ�',3,'��������ȸ��');
insert into exp_goods_asia values('�ѱ�',4,'����');
insert into exp_goods_asia values('�ѱ�',5,'LCD');
insert into exp_goods_asia values('�ѱ�',6,'�ڵ�����ǰ');
insert into exp_goods_asia values('�ѱ�',7,'�޴���ȭ');
insert into exp_goods_asia values('�ѱ�',8,'ȯ��źȭ����');
insert into exp_goods_asia values('�ѱ�',9,'�����۽ű� ���÷��� �μ�ǰ');
insert into exp_goods_asia values('�ѱ�',10,'ö �Ǵ� ���ձݰ�');
insert into exp_goods_asia values('�Ϻ�',1,'�ڵ���');
insert into exp_goods_asia values('�Ϻ�',2,'�ڵ�����ǰ');
insert into exp_goods_asia values('�Ϻ�',3,'��������ȸ��');
insert into exp_goods_asia values('�Ϻ�',4,'����');
insert into exp_goods_asia values('�Ϻ�',5,'�ݵ�ü������');
insert into exp_goods_asia values('�Ϻ�',6,'ȭ����');
insert into exp_goods_asia values('�Ϻ�',7,'�������� ������');
insert into exp_goods_asia values('�Ϻ�',8,'�Ǽ����');
insert into exp_goods_asia values('�Ϻ�',9,'���̿���,Ʈ��������');
insert into exp_goods_asia values('�Ϻ�',10,'����');

select * from exp_goods_asia order by goods;

select goods from exp_goods_asia where country='�ѱ�'
intersect -- ������
select goods from exp_goods_asia where country='�Ϻ�';

select goods from exp_goods_asia where country='�ѱ�'
union -- ������
select goods from exp_goods_asia where country='�Ϻ�';
                                        
                                        
(select 'a' from dual intersect select 'b' from dual)
minus
(select 'a' from dual union select 'b' from dual);

-- >>>>>>JOIN<<<<<<

select a.employee_id,a.emp_name,b.department_name from worker a, departments b
    where a.department_id=b.department_id;
    
-- worker ���̺��� ���������ؼ� ���� --> �����(worker.emp_name), ������(jobs,job_title) ���
select worker.emp_name, jobs.job_title from worker, jobs where worker.job_id=jobs.job_id;

select * from worker;
select * from roomtype;
select * from roominfo;
insert into roominfo values(101,'������',2,7,1500);
insert into roominfo values(102,'���ǻ�',6,8,1800);
insert into roominfo values(103,'�Ѷ��',3,5,1600);

-- roominfo�� ��� �÷��� ǥ�� (type�� roomtypename���� ǥ��)
select roominfo.num, roominfo.name, roomtype.typename roomtypename, roominfo.howmany, roominfo.howmuch
    from roominfo, roomtype 
    where roominfo.type=roomtype.typenum order by roominfo.num;


-- sales ���̺��� prod_id�� product_name���� �ٲ۴� (by Join with Products ���̺�)
-- (prod_id) prod_name, cust_id, channel_id, employee_id
select p.prod_name, cu.cust_name, ch.channel_desc, e.emp_name, d.department_name
    from sales s, products p, customers cu, channels ch, employees e, departments d
    where s.prod_id=p.prod_id 
            and s.cust_id=cu.cust_id 
            and ch.channel_id=s.channel_id
            and s.employee_id=e.employee_id
            and e.department_id=d.department_id;
--            and d.department_name!='������';     department_name�� �����ΰ� �ƴ� ��� ã��
    -- join ���� �ΰ� �̻� ����� and�� ����
    -- Ȯ�� �� �� �ڿ� �ʵ带 ���� select �ڿ� count(*), �ʵ庸�� ������ ������ �ȵ�

select p.prod_name,to_char(sum(s.amount_sold),'9,999,999,999.99') 
    from sales s,products p 
    where s.prod_id=p.prod_id
    group by p.prod_name order by p.prod_name;
    
    
-- (���)������, �����
select e.employee_id ���, e.emp_name ������, to_char(sum(s.amount_sold),'9,999,999,999.99') �����
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

-- ���, �̸�, �Ŵ����̸�, �μ���
select a.employee_id ���, a. emp_name �̸�, b.emp_name �Ŵ���_�̸�, c.department_name �μ��� -- self join
    from employees a, employees b, departments c
    where a.manager_id=b.employee_id
        and c.department_id=a.department_id
        order by a.employee_id;

 -- �μ��ڵ� �μ��� �����μ��� (departments)
 select a.department_id �μ��ڵ�, a.department_name �μ���, b.department_name �����μ� -- self join
    from departments a, departments b 
    where a.parent_id=b.department_id 
    order by a.department_id;

select a.employee_id, a.emp_name, a.salary, b.department_name
    from employees a, departments b
    where a.department_id=b.department_id
        and a.salary>6000   -- filtering ����
    order by a.employee_id;
        -- ���� �Ʒ��� ����
select a.employee_id, a.emp_name, a.salary, b.department_name
    from (select * from employees where salary>6000) a, departments b   -- sub-query (���� from�̳� where �ڿ� ����)
    where a.department_id=b.department_id
    order by a.employee_id;
select a.employee_id, a.emp_name, a.salary, b.department_name
    from employees a, departments b
    where a.department_id=b.department_id
        and a.employee_id in (select employee_id from employees where salary>6000); -- nested query
        
-- ���, �̸�, �Ŵ����̸�, �μ���, �μ����
select a.employee_id ���, a.emp_name �̸�, b.emp_name �Ŵ���_�̸�, c.department_name �μ���, b.emp_name �μ����
    from employees a, employees b, departments c, employees d
    where a.manager_id=b.employee_id
        and c.department_id=a.department_id
        and c.manager_id=d.employee_id
        order by a.emp_name;

-- �μ���, �ο���
select b.department_name, count(*)
    from employees a, departments b
    where a.department_id=b.department_id
    group by b.department_name
    order by b.department_name;
-- �μ���/�μ���/�ο���
select b.department_name, c.emp_name, count(*)
    from employees a, departments b, employees c
    where a.department_id=b.department_id
        and b.manager_id=c.employee_id
    group by b.department_name, c.emp_name
    order by c.emp_name;
    -- �μ���, �ο���
select c.emp_name, count(*)
    from employees a, departments b, employees c
    where a.department_id=b.department_id
        and b.manager_id=c.employee_id
    group by c.emp_name
    order by c.emp_name;
-- �μ���, �ο���, �����Ѿ�
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
    -- �Ʒ��� ���� ����(ansi �ܺ��������� �ۼ�) only in MySQL
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
-- subquery���� order by ����� �� ����

-- �̸�/�μ���/�μ���� by subquery

select a.emp_name, b.department_name, c.emp_name
    from employees a, departments b, employees c
    where a.department_id=b.department_id
        and b.department_name like '%��'
        and b.manager_id=c.employee_id(+);
        
--select a.emp_name, b.department_name, c.emp_name captain
--    from employees a,
--        (select
--            from departments
--            where department_name like '%��') b,
--            employees c
--    where a.department_id=b.department_id captain_id
--        and b.captain_id=c.employee_id(+);

select x.emp_name, x.department_name, c.emp_name
    from (select a.emp_name, b.department_name, a.manager_id
            from employees a, departments b
            where a.department_id=b.department_id
                and b.department_name like '%��') x, employees c
    where x.manager_id=c.employee_id(+);
    
--select a.emp_name, b.department_name, c.emp_name captain
--    from employees a, departments b, employees c
--    where a.department_id in
--        (select department_id from departments where department_name like '%��')
--    and a.department_id=b.department_id(+)
--    and b.manager_id=c.employee_id;

commit;
        
        