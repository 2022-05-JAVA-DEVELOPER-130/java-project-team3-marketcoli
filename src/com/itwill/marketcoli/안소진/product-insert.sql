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
insert into product(p_no,p_name,p_price,p_exp,p_category_b,p_category_s) values (product_p_no_seq.nextval,'피망',1000,'맛있어요','"채소,과일','채소');

