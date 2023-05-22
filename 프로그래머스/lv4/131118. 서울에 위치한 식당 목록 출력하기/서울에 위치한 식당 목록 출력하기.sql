-- 코드를 입력하세요
SELECT r.REST_ID ,REST_NAME,FOOD_TYPE,FAVORITES ,ADDRESS,
round(avg(REVIEW_SCORE),2) as score
from REST_REVIEW r,REST_INFO i
where i.ADDRESS like '서울%'
and r.REST_ID = i.REST_ID
group by  r.REST_ID ,REST_NAME,FOOD_TYPE,FAVORITES ,ADDRESS
order by score desc, FAVORITES desc;