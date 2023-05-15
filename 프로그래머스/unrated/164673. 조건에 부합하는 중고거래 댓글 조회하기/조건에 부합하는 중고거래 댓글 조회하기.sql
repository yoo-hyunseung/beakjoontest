-- 코드를 입력하세요
SELECT a.TITLE, a.BOARD_ID, b.REPLY_ID, b.WRITER_ID, b.CONTENTS, to_char(b.CREATED_DATE,'yyyy-mm-dd') as CREATED_DATE
from USED_GOODS_BOARD a, USED_GOODS_REPLY b
where a.BOARD_ID = b.BOARD_ID and to_char(a.CREATED_DATE,'yy-mm')='22-10' 
order by b.CREATED_DATE asc , a.TITLE asc;