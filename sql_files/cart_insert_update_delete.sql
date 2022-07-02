-- 조회
-- 회원 전체 장바구니 조회
select * from cart;
-- 회원 번호로 장바구니 조회
select * from cart where cart.u_no = 1;


-- 장바구니 담기
insert into cart values(cart_c_no_seq.nextval, 1, 1, '사과', 2500, 1);
insert into cart values(cart_c_no_seq.nextval, 5, 1, '체리', 8000, 2);
insert into cart values(cart_c_no_seq.nextval, 3, 1, '복숭아', 5500, 3);
insert into cart values(cart_c_no_seq.nextval, 8, 1, '시금치', 5000, 4);


-- 수정
-- 장바구니 번호로 장바구니 정보 수정
update cart set c_qty=3, p_no = 1, p_name = '사과', p_price=(2500*c_qty), u_no = 1 where c_no = 1;


--삭제
-- 장바구니 전체 삭제
delete from cart;
-- 장바구니 번호로 삭제
delete from cart where c_no = 1;
--------------------------------------------------------------------------------

-- 상품 테이블 조회 및 테이블 초기화
select * from product; 

drop table cart cascade CONSTRAINTS;
CREATE TABLE cart(
		c_no                          		NUMBER(10)		 DEFAULT 0		 NULL ,
		c_qty                         		NUMBER(10)		 NULL ,
		p_no                          		NUMBER(10)		 NULL ,
		p_name                        		VARCHAR2(50)		 NULL ,
		p_price                       		NUMBER(10)		 NULL ,
		u_no                          		NUMBER(10)		 NULL 
);
DROP SEQUENCE cart_c_no_SEQ;
CREATE SEQUENCE cart_c_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;