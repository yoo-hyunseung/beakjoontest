-- 코드를 입력하세요
SELECT ANIMAL_ID, name, TO_CHAR(datetime, 'yyyy-mm-dd') as "날짜"
from animal_ins order by animal_id
