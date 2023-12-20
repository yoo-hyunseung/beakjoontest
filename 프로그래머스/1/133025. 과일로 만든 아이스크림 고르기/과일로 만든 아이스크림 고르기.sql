-- 코드를 입력하세요
SELECT a.FLAVOR 
from FIRST_HALF a, ICECREAM_INFO b
where a.FLAVOR = b.FLAVOR
and a.TOTAL_ORDER>=3000
and b.INGREDIENT_TYPE = 'fruit_based'