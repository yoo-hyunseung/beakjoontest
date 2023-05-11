-- 코드를 입력하세요
SELECT MEMBER_ID,MEMBER_NAME,GENDER,to_char(date_of_birth, 'yyyy-MM-dd') date_of_birth from MEMBER_PROFILE
where to_char(DATE_OF_BIRTH , 'mm') = 03 and TLNO is not null and gender ='W'
order by MEMBER_ID