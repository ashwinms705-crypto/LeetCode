# Write your MySQL query statement below
/*with sell as (
    select stock_name as stock_name1,price from stocks
    where operation='Sell'
),
buy as (
    select stock_name as stock_name2,price from stocks
    where operation='Buy'
),
res as(
    select b.stock_name2,b.price as buy,s.stock_name1,s.price as sell from buy b
    join sell s
    on b.stock_name2=s.stock_name1
)
select * from res*/
select stock_name,sum(if(operation='Buy',-price,price)) as capital_gain_loss
from stocks
group by stock_name