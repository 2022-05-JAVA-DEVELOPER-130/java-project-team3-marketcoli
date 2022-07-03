--product
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

-----insert
insert into product(p_no,p_name,p_price,p_exp,p_category_b,p_category_s) values (product_p_no_seq.nextval,'상큼사과',5000,'맛있어요','채소/과일','과일');
 
-----delete
delete from product where p_no=21;

-----update (p_no=20 상품  전체 고치기 )
update product set p_name='오이', p_price='2500', p_exp='봉균곤듀는 오이를 싫어해요', p_category_b='채소/과일', p_category_s='채소' where p_no=20;

-----select
---상품 전체 불러오기
select * from product;
---상품 각각 불러내기
select * from product where p_name='사과';  --상품명
select * from product where p_category_b='정육/수산'; --큰카테고리
select * from product where p_category_s='채소'; --작은테고리

---ㅇㅇ사과 상품불러오기
select * from product where p_name='사과';  --상품명
