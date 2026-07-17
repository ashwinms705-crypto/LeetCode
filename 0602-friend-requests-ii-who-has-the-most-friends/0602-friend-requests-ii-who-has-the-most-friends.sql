# Write your MySQL query statement below
with c1 as (
    select requester_id,count(requester_id) as count1 from RequestAccepted
    group by requester_id
    order by requester_id asc
),
c2 as (
    select accepter_id,count(accepter_id) as count2 from RequestAccepted
    group by accepter_id
    order by accepter_id asc
),
c3 as(
 select requester_id as id, count1 as count from c1 
union all
  select accepter_id as id, count2 as count from c2
)

select id,sum(count) as num
from c3
group by id
order by num desc
limit 1
