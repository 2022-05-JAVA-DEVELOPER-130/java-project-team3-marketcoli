--noitce_update_delete_select

--공지사항 수정
update notice set n_title = '배송지연 안내',  
                    n_date = sysdate,
                    n_content = '안녕하세요! 마켓콜리 입니다. 마켓콜리를 사랑해주시고 아껴주신 고객님께 진심으로 감사드립니다. 현재 코로나 때문에 배송 많이 밀림 기다리셈.'
                    where n_no = 5;

--공지사항 삭제
delete notice where n_no = 2;

--공지사항 선택
select * from notice where n_no=5;

--공지사항 목록
select * from notice;