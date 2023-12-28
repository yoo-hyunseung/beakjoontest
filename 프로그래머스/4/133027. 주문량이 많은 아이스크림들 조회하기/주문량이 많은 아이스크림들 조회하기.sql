-- 코드를 입력하세요
SELECT FLAVOR
from
(
    select b.FLAVOR , sum(a.TOTAL_ORDER+b.TOTAL_ORDER) as price
    from JULY a , FIRST_HALF b
    where a.FLAVOR = b.FLAVOR
    group by b.FLAVOR
    order by price desc
)
where rownum <=3