-- 코드를 입력하세요
SELECT BOOK_ID,AUTHOR_NAME,to_char(PUBLISHED_DATE,'yyyy-mm-dd')
from BOOK b,AUTHOR a
where CATEGORY = '경제'
and b.AUTHOR_ID = a.AUTHOR_ID
order by PUBLISHED_DATE asc;