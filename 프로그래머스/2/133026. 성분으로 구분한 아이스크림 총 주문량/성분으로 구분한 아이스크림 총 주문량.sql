-- 코드를 입력하세
select  INGREDIENT_TYPE,sum(TOTAL_ORDER)
from FIRST_HALF,ICECREAM_INFO
where FIRST_HALF.FLAVOR = ICECREAM_INFO.FLAVOR
group by INGREDIENT_TYPE
order by sum(total_order)