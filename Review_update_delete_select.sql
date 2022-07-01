--Review update
update review set r_image = 'rr1.jpg', r_content='너무너무 맛있어요 최고!', r_rating='4' where u_no = 1; 

--Review delete
delete review where u_no = 1;



------------------------------------



--아이디별 후기 조회
select * from review where u_no=1;



--상품별 후기 조회
select * from review where p_no=1;




--전체 후기 조회
select * from review;


--마이페이지에서 후기 조회
select * from review where u_id= itwill1;






