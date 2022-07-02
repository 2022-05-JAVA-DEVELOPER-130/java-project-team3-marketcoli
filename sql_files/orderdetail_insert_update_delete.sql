--insert 상품 추가 
insert into orderdetail(od_no,p_piece,p_no,u_no) values ( orderdetail_od_no_SEQ.nextval,1,2,1);

--수량변경 
update orderdetail set p_piece =2 where p_no=2 and u_no=2;

-- 삭제
delete from orderdetail where od_no=1;

--select 주문확인
select * from orderdetail;