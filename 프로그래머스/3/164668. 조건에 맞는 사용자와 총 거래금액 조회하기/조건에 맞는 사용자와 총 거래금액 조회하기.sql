-- 코드를 입력하세요
SELECT b.writer_id,u.nickname,sum(b.price)
from used_goods_board b join used_goods_user u
on b.writer_id = u.user_id
where b.status ='DONE' 
group by b.writer_id, u.nickname
having sum(b.price) >=700000
order by sum(b.price)