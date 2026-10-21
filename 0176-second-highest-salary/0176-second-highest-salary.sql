# Write your MySQL query statement below
/*with t1 as(select salary,dense_rank() over(
    order by salary desc
) as rnk from employee
),
t2 as(
    select max(salary) as salary from t1
    where rnk=2
)
select salary as SecondHighestSalary from t2*/

select max(salary) as SecondHighestSalary 
from employee 
where salary<(
    select max(salary) from employee
)
