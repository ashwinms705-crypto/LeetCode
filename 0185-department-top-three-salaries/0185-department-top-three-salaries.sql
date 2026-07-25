# Write your MySQL query statement below
with temp as(select e.id,d.name as Department,e.name as Employee,e.Salary from Employee e
join Department d
on e.departmentId=d.id
),

t2 as(select t.id,t.Department,t.Employee,t.Salary,dense_rank() over(
    partition by department
    order by salary desc
) as rnk from temp t
)
select Department,Employee,Salary from t2
where rnk<=3