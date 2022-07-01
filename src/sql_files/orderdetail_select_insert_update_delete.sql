--주문상세 orderdetail

--select 주문상세 조회
--select (회원번호로 주문목록 확인)
select * from orderdetail where u_no=1 ;

--select by (주문상세번호 주문목록 확인)
select * from orderdetail where od_no =1111;
--select by (회원이 같은상품으로 조회하여 주문목록 확인)
select * from orderdetail where  u_no=1 and p_no=1 ;



--insert 상품 추가 
insert into orderdetail(od_no,p_piece,p_no,u_no)
        values ( orderdetail_od_no_SEQ.nextval,3,3,3);


--update
--회원이 상품의 수량 변경 
update orderdetail set p_piece =7 where u_no=1 and p_no=3;



--delete 
--주문목록중에 상품 한개 삭제
delete from orderdetail where od_no=1;

--회원이 주문상세번호로 조회한 주문상세  한개 삭제
delete from orderdetail where u_no= 1 and od_no=1;


--회원이름으로 주문된 전체 상품 삭제
delete from orderdetail where u_no= 1;












