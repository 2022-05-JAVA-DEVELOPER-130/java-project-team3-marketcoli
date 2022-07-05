--select <<주문 조회>>
--유저번호를 이용하여 주문 조회
 select *from orders where u_no =1;
--이름,전화번호를 이용하여 주문조회 
 select *from orders where u_name='김첨지'and u_phone =11111111112;
 
 
--insert <상품 주문>
--장바구니에서 구매  
insert into orders(o_no,o_date,o_state,u_name,u_phone,u_address,u_no,p_no,d_fee,d_memo,p_piece,p_price,p_name) 
                     values (ORDERS_O_NO_SEQ.nextval,sysdate,'입금완료','김첨지',11111111112,'사랑시고백구행복동',1,1,3000,'문 앞에',1,2500,'사과');
insert into orders(o_no,o_date,o_state,u_name,u_phone,u_address,u_no,p_no,d_fee,d_memo,p_piece,p_price,p_name) 
                     values (ORDERS_O_NO_SEQ.nextval,sysdate,'출고완료','박혁거세',22222222222,'egg',2,2,3000,'경비실에 전달',2,2000,'딸기');
insert into orders(o_no,o_date,o_state,u_name,u_phone,u_address,u_no,p_no,d_fee,d_memo,p_piece,p_price,p_name) 
                     values (ORDERS_O_NO_SEQ.nextval,sysdate,'배송중','김샛달',01043218765,'tjsdjsadj',3,3,3000,' ',3,3000,'바나나');






--update
--주문(주문상태 변경) 이름과 핸드폰 번호를 이용하여 주문 추소
update orders set o_state = '주문취소'  where u_name = '김첨지' and u_phone =11111111112; 
--주문변경 회원번호이용해서 변경
update orders set o_state = '주문취소'  where u_no =3; 



--관리자 권한이라 필요없음;
--delete(주문 삭제) -유저이름과 핸드폰번호가 같은경우
--delete orders  where u_name = '김첨지' and u_phone =11111111111;




































/********order insert**************/
/*
insert into order(od_no,p_poece,,email) values('guard1','1111','김경호1','guard1@korea.com');
insert into order(od_no,p_poece,name,email) values('guard2','2222','김경호2','guard2@korea.com');
insert into order(od_no,p_poece,name,email) values('guard3','3333','김경호3','guard3@korea.com');
insert into order(od_no,p_poece,name,email) values('guard4','4444','김경호4','guard4@korea.com');
*/

/*******product insert************/
/*
insert into product values(1,'비글',55000,'bigle.png','귀여워요...',0);
insert into product values(2,'달마시안',55000,'bigle.png','귀여워요...',0);
insert into product values(3,'퍼그',55000,'bigle.png','귀여워요...',0);
insert into product values(4,'페키니즈',55000,'bigle.png','귀여워요...',0);
insert into product values(5,'포메라이안',55000,'bigle.png','귀여워요...',0);
insert into product values(6,'샤페이',55000,'bigle.png','귀여워요...',0);
insert into product values(7,'닥스훈트',55000,'bigle.png','귀여워요...',0);
insert into product values(8,'샤모예드',55000,'bigle.png','귀여워요...',0);
*/

/**********cart insert************/
/*
--guard1님 카트아이템 담기(insert)
insert into cart(cart_no,cart_qty,p_no,userid) values(cart_cart_no_seq.nextval,1,3,'guard1');
insert into cart(cart_no,cart_qty,p_no,userid) values(cart_cart_no_seq.nextval,2,7,'guard1');
insert into cart(cart_no,cart_qty,p_no,userid) values(cart_cart_no_seq.nextval,3,8,'guard1');
*/

--guard2님 카트아이템 담기(insert)
/*
insert into cart(cart_no,cart_qty,p_no,userid) values(cart_cart_no_seq.nextval,1,1,'guard2');
insert into cart(cart_no,cart_qty,p_no,userid) values(cart_cart_no_seq.nextval,2,2,'guard2');
*/


commit;













