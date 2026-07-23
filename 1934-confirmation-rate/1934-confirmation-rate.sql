# Write your MySQL query statement below
with c as(
    select user_id,count(action) as count from confirmations
    group by user_id
),
conf as (
    select user_id,count(if(action='confirmed',1,null)) as confirmed from confirmations
    group by user_id
),
res as (
    select a.user_id,b.confirmed/a.count as confirmation_rate from c a
    join conf b
    on a.user_id=b.user_id
)
select s.user_id,round(if(d.confirmation_rate is null,0.00,d.confirmation_rate),2) as confirmation_rate  from signups s
left join res d
on s.user_id=d.user_id 