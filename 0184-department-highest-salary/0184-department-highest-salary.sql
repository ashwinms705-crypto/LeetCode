# Write your MySQL query statement below
with t1 as(
    select departmentId as dept_id,max(salary) as max_sal from employee
    group by dept_id
),
t2 as (
    select departmentId as id,name as Employee,salary as Salary from employee 
    where departmentId in (select dept_id from t1) and salary in (select max_sal from t1)
),
t3 as(
    select e.departmentId as id,e.name as Employee,e.salary as Salary  from t1 a
    join employee e
    on a.dept_id=e.departmentId and a.max_sal=e.salary
)
/*select d.name as Department,a.Employee,a.Salary from t2 a
join department d
on a.id=d.id*/
select d.name as Department,b.Employee,b.Salary from t3 b
join department d
on b.id=d.id