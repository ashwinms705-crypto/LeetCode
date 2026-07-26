# Write your MySQL query statement below
with t1 as(
    select u.name from movierating m
    join users u
    on u.user_id=m.user_id
    group by u.user_id
    order by count(m.rating) desc,u.name asc
    limit 1
),
t2 as (
    select m.title from movierating mr
    join movies m
    on m.movie_id=mr.movie_id
    where mr.created_at like "2020-02-%"
    group by mr.movie_id
    order by avg(mr.rating) desc,m.title asc
    limit 1
)
select name as results from t1
union all
select title as results from t2