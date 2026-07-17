# Write your MySQL query statement below
with cnt as(
    select managerId,count(managerId) as coun from Employee
    group by managerId
)

select e.name from employee e
join cnt as c
on e.id=c.managerId
where coun>=5