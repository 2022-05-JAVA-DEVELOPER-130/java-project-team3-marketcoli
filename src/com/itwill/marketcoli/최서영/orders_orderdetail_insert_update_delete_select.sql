--주문을 해보자
desc product;
/*
이름           널?       유형             
------------ -------- -------------- 
P_NO         NOT NULL NUMBER(10)     
P_NAME       NOT NULL VARCHAR2(50)   
P_PRICE      NOT NULL NUMBER(10)     
P_EXP                 VARCHAR2(1000) 
P_CATEGORY_B          VARCHAR2(50)   
P_CATEGORY_S          VARCHAR2(50) 
*/
desc orders;
/*
이름        널?       유형             
--------- -------- -------------- 
O_NO      NOT NULL NUMBER(10)     
O_DATE             DATE           
O_STATE   NOT NULL VARCHAR2(30)   
U_NAME    NOT NULL VARCHAR2(15)   
U_PHONE   NOT NULL NUMBER(20)     
U_ADDRESS NOT NULL VARCHAR2(100)  
U_NO      NOT NULL NUMBER(10)     
P_NO               NUMBER(10)     
D_FEE              NUMBER(10)     
D_MEMO             VARCHAR2(3000) 
P_PIECE            NUMBER(10)     
P_PRICE            NUMBER(10)     
P_NAME             VARCHAR2(50)  
*/

desc orderdetail;
/*
이름      널?       유형         
------- -------- ---------- 
OD_NO   NOT NULL NUMBER(10) 
P_PIECE          NUMBER(10) 
U_NO             NUMBER(10) 
P_NO             NUMBER(10) 
*/

select * from orders;
select * from orderdetail;

--insert 주문
insert into orders(o_no,o_date,o_state,u_name,u_phone,u_address,u_no,p_no,d_fee,d_memo,p_piece,p_price,p_name) 
                     values (ORDERS_O_NO_SEQ.nextval,sysdate,'입금완료','김첨지',11111111112,'사랑시고백구행복동',1,1,3000,'문 앞에',1,2500,'사과');

insert into orderdetail(od_no,p_piece,p_no,u_no) values ( orderdetail_od_no_SEQ.nextval,1,2,1);