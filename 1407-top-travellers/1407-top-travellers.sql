# Write your MySQL query statement below
select u.name,if(sum(r.distance) is null,0,sum(r.distance)) as travelled_distance from rides r
right join users u
on r.user_id=u.id
group by u.id
order by travelled_distance desc,u.name asc