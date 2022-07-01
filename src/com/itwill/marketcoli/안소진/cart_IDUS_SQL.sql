--cart
desc cart;
/*
이름      널?       유형           
------- -------- ------------ 
C_NO    NOT NULL NUMBER(10)   
C_QTY            NUMBER(10)   
P_NO             NUMBER(10)   
P_NAME           VARCHAR2(50) 
P_PRICE          NUMBER(10)   
U_NO             NUMBER(10)   
*/
select * from product;
select * from userinfo;
select * from cart;


-----insert(표본)
insert into cart(c_no,c_qty,p_no,p_name,p_price,u_no) values(CART_C_NO_SEQ.nextval,1,1,'사과',2500,'1');
insert into cart(c_no,c_qty,p_no,p_name,p_price,u_no) values(CART_C_NO_SEQ.nextval,1,2,'수박',9000,'1');
insert into cart(c_no,c_qty,p_no,p_name,p_price,u_no) values(CART_C_NO_SEQ.nextval,2,3,'복숭아',5500,'2');
insert into cart(c_no,c_qty,p_no,p_name,p_price,u_no) values(CART_C_NO_SEQ.nextval,2,4,'석류',3000,'2');
insert into cart(c_no,c_qty,p_no,p_name,p_price,u_no) values(CART_C_NO_SEQ.nextval,2,2,'수박',9000,'2');


-----select
--전체보기(회원전체)
select * from cart;
/*
1	1	사과	2500	1	1
1	2	수박	9000	1	2
2	3	복숭아	5500	2	3
2	4	석류	3000	2	4
2	2	수박	9000	2	5
*/

--회원별로 장바구니보기
select * from cart where u_no=1;
/*
1	1	1	사과	2500	1
2	1	2	수박	9000	1
*/
select * from cart where u_no=2;
/*
3	2	3	복숭아	5500	2
4	2	4	석류	3000	2
5	2	2	수박	9000	2
*/

--장바구니번호별로 보기    --> 음...?! 아..cart_c_no_seq 때문에.. 이클에서는..?
select * from cart where c_no=1;

--상품별로보기
select * from cart where p_no=2;
/*
2	1	2	수박	9000	1
5	2	2	수박	9000	2
*/


-----update
--상품수량변경 (2번고객 복숭아 2개에서 6개로 변경)
update cart set c_qty=6 where u_no=2 and p_no=3;
select * from cart where u_no=2;
/*
3	2	3	복숭아	5500	2
4	2	4	석류	3000	2
5	2	2	수박	9000	2
*/
/*
3	6	3	복숭아	5500	2
4	2	4	석류	3000	2
5	2	2	수박	9000	2
*/

-----delect
-- 상품1개삭제 (2번고객 복숭아(p_no=3) 삭제
delete from cart where p_no=3 and u_no=2;
select * from cart where u_no=2;
/*
3	6	3	복숭아	5500	2
4	2	4	석류	3000	2
5	2	2	수박	9000	2
*/
/*
4	2	4	석류	3000	2
5	2	2	수박	9000	2
*/
--고객 1번 장바구니 전체삭제
select * from cart where u_no=1;
delete from cart where u_no=1;
/*
1	1	1	사과	2500	1
2	1	2	수박	9000	1
*/
/*
2개 행 이(가) 삭제되었습니다.
*/




