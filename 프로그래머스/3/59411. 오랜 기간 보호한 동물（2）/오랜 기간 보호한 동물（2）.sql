# -- 코드를 입력하세요
# SELECT animal_outs.animal_id,animal_outs.name from 
# animal_outs join animal_ins on using(animal_id)
# where 1=1
# order by timediff(animal_outs.datetime,animal_ins.datetime) desc
# limit 2;
SELECT O.ANIMAL_ID, O.NAME
FROM ANIMAL_INS I JOIN ANIMAL_OUTS O USING(ANIMAL_ID)
# WHERE I.NAME = O.NAME
WHERE 1 = 1
ORDER BY (DATEDIFF(O.DATETIME, I.DATETIME)) DESC
LIMIT 2