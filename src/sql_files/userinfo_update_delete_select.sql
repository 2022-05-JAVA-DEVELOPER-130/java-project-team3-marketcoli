--회원정보 수정
update userinfo set u_id = 'itwill5', 
u_pw = '5555', 
u_name = '도요토미', 
u_email = 'e@www.japan.com', 
u_phone = '5555555555', 
u_address = '몽골', 
u_birth = '20020202',
u_job = '독립운동가'
where u_no = '5';

--아이디 찾기
select u_id from userinfo where u_email = 'e@www.japan.com';

--비밀번호 찾기
select u_pw from userinfo where u_id = 'itwill5' and u_email = 'e@www.japan.com';

--회원 탈퇴
delete userinfo where u_id = 'itwill8';

--총회원 정보
select * from userinfo;

--아이디로 회원 한명 조회
select * from userinfo where u_id = 'itwill1';