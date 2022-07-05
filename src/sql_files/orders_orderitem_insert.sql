--orders, order_item - insert

select * from userinfo;
select * from product;
select * from orders;
select * from order_item;

/**********************orders insert************************/
insert into orders(o_no,o_date,o_price,u_id) values (orders_o_no_SEQ.nextval,sysdate,10500,'itwill7');
insert into order_item(oi_no,oi_qty,o_no,p_no) values(order_item_oi_no_SEQ.nextval,1,orders_o_no_SEQ.currval,3);
insert into order_item(oi_no,oi_qty,o_no,p_no) values(order_item_oi_no_SEQ.nextval,2,orders_o_no_SEQ.currval,2);

insert into orders(o_no,o_date,o_price,u_id) values (orders_o_no_SEQ.nextval,sysdate,400000,'itwill6');
insert into order_item(oi_no,oi_qty,o_no,p_no) values(order_item_oi_no_SEQ.nextval,5,orders_o_no_SEQ.currval,13);


insert into orders(o_no,o_date,o_price,u_id) values (orders_o_no_SEQ.nextval,sysdate,1450000,'itwill2');
insert into order_item(oi_no,oi_qty,o_no,p_no) values(order_item_oi_no_SEQ.nextval,1,orders_o_no_SEQ.currval,4);
insert into order_item(oi_no,oi_qty,o_no,p_no) values(order_item_oi_no_SEQ.nextval,2,orders_o_no_SEQ.currval,2);



insert into orders(o_no,o_date,o_price,u_id) values (orders_o_no_SEQ.nextval,sysdate-1,500000,'itwill3');    --다른날짜를 주기위해 sysdate-1한것
insert into order_item(oi_no,oi_qty,o_no,p_no) values(order_item_oi_no_SEQ.nextval,1,orders_o_no_SEQ.currval,2);

insert into orders(o_no,o_date,o_price,u_id) values (orders_o_no_SEQ.nextval,sysdate-2,1000000,'itwill4');  --다른날짜를 주기위해 sysdate-2한것
insert into order_item(oi_no,oi_qty,o_no,p_no) values(order_item_oi_no_SEQ.nextval,1,orders_o_no_SEQ.currval,2);
insert into order_item(oi_no,oi_qty,o_no,p_no) values(order_item_oi_no_SEQ.nextval,1,orders_o_no_SEQ.currval,4);


commit;
desc order_item;
/*
이름     널?       유형         
------ -------- ---------- 
OI_NO  NOT NULL NUMBER(10) 
OI_QTY          NUMBER(10) 
O_NO            NUMBER(10) 
P_NO            NUMBER(10) 
*/
desc orders;
/*
이름      널?       유형            
------- -------- ------------- 
O_NO    NOT NULL NUMBER(10)    
O_DATE           DATE          
O_PRICE          NUMBER(10)    
U_ID           VARCHAR2(100)
*/


