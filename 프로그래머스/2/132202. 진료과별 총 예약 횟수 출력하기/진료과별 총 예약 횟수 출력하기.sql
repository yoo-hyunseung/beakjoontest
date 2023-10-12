-- 코드를 입력하세요
SELECT MCDP_CD as 진료과코드, count(*) as "5월예약건수"
from APPOINTMENT
where to_char(APNT_YMD,'yyyy-mm') like '2022-05%'
group by MCDP_CD
order by "5월예약건수",MCDP_CD 

-- SELECT MCDP_CD as "진료과코드",

-- COUNT(*) as "5월예약건수"

-- FROM APPOINTMENT 

-- WHERE APNT_YMD BETWEEN TO_DATE('2022-05-01','YYYY-MM-DD') AND  TO_DATE('2022-05-31','YYYY-MM-DD')

-- GROUP BY MCDP_CD 

-- ORDER BY "5월예약건수", MCDP_CD ASC
