--product

desc product;
/*
�̸�           ��?       ����             
------------ -------- -------------- 
P_NO         NOT NULL NUMBER(10)     
P_NAME       NOT NULL VARCHAR2(50)   
P_PRICE      NOT NULL NUMBER(10)     
P_EXP                 VARCHAR2(1000) 
P_CATEGORY_B          VARCHAR2(50)   
P_CATEGORY_S          VARCHAR2(50)   
*/

-----insert
insert into product(p_no,p_name,p_price,p_exp,p_category_b,p_category_s) values (product_p_no_seq.nextval,'�Ǹ�',1000,'���־��','"ä��,����','ä��');
