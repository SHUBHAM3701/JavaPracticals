show databases;
use shubham;
create table employee(employee_id int(6) ,last_name varchar(25),job_id varchar(10),slalary double(8,2), comm_pct double(4,2),mgr_id int(6),department_id int(4));
insert into employee values(198,"connell","sh_clerk",2600,2.5,124,50);
insert into employee values(199,"grant","sh_clerk",2600,2.2,124,50);
insert into employee values(200,"whalen","ad_asst",4400,1.3,101,50);
insert into employee values(201,"hartstein","it_prog",6600,null,100,20);
insert into employee values(202,"fay","ad_mgr",6500,null,210,20);
insert into employee values(203,"mavris","ad_vp",7500,null,101,40);
insert into employee values(204,"baer","ad_pres",3500,1.5,101,90);
insert into employee values(205,"higgins","ac_mgr",2300,null,101,60);
insert into employee values(206,"gitz","it_prog",5000,null,103,60);
insert into employee values(100,"king","ad_asst",8956,0.3,108,100);
insert into employee values(101,"kochar","sh_clerk",3400,1.3,118,30);
select * from employee;
select employee_id,job_id,last_name from employee;
select * from employee where department_id =60;
select * from employee where last_name = "king";
select distinct(job_id) as 'job_details' from employee;
update employee set slalary = slalary+300;
select slalary, (slalary+300) as 'increased_salary' from employee;
SELECT last_name, slalary, (slalary*12)+100 as annual_compensation FROM employee;
select comm_pct from employee where comm_pct is not null;
select comm_pct from employee where comm_pct is null;
select last_name,slalary from employee where slalary>5000;
select employee_id,department_id,slalary from employee where slalary>5000;
select last_name,slalary from employee where slalary between 5000 and 7000;
select * from employee where department_id in (10,20,30,40);
select * from employee where slalary != 5000;
select job_id from employee where job_id= "sh_clerk";
update employee set job_id = 'GRADE_A' where slalary >5000;
use mg1;
update employee set job_id = 'GRADE_A' where slalary >5000;
select * from employee where job_id = 'SH_CLERK 'or job_id='IT_PROG' or job_id='AD_ASST';
select last_name, mgr_id from employee where slalary >3000 and mgr_id = 101;
