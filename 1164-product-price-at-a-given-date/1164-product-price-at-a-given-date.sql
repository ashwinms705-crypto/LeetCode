# Write your MySQL query statement below
/*select product_id,new_price as price from Products 
where change_date in (
    select max(change_date) from products 
    where change_date<='2019-08-16'
    group by product_id
)
group by product_id*/

with t1 as (select product_id,max(change_date) as date from products 
    where change_date<='2019-08-16'
    group by product_id
),

t2 as(
    select p.product_id,p.new_price from products p
    join t1 t
    on p.product_id=t.product_id and t.date=p.change_date
),
t3 as (
    select distinct(product_id) as pid from products
)
    select t3.pid as product_id,if(t2.product_id is null,10,new_price) as price  from t3 
    left join t2 
    on t3.pid=t2.product_id
