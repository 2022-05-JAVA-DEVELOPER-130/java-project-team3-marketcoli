--Review update
update review set r_image = 'ff.jpg', r_content='너무 맛있어요 최고!', r_rating='4' where u_no = 4; 

--Review delete
delete review where u_no = 1;



------------------------------------



--후기목록에서 회원번호로 조회
select * from review where u_no=1;

--    >> 후기테이블과 회원정보 테이블 조인
select * from review r
join userinfo u
on r.u_no = u.u_no ;

--후기목록에서 회원아이디로 조회
select * from (select * from review r
                join userinfo u
                on r.u_no = u.u_no)
where u_id='itwill4';


--상품별 후기 조회
select * from review where p_no=1;




--전체 후기 조회
select * from review;









