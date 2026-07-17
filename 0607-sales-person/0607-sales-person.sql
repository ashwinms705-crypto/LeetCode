# Write your MySQL query statement below
with t1 as (select o.sales_id,o.com_id from Orders o
join Company c
on o.com_id=c.com_id
where c.name="RED"
)
select s.name from SalesPerson s
left join t1 t
on s.sales_id=t.sales_id
where t.com_id is null