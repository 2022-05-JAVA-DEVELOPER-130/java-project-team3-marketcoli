--Review insert
insert into review(R_NO, R_IMAGE, R_CONTENT, R_WDATE,
                        R_RATING, P_NO, U_NO, U_NAME, O_DATE )
                        values (REVIEW_R_NO_SEQ.nextval,'r1.png','정말 맛있어요!!',sysdate,5,'1','1','김두유',sysdate-7);

insert into review(R_NO, R_IMAGE, R_CONTENT, R_WDATE,
                        R_RATING, P_NO, U_NO, U_NAME, O_DATE )
                        values (REVIEW_R_NO_SEQ.nextval,'r2.png','정말 맛있어요!!',sysdate,4,'2','2','둘째임',sysdate-7);

insert into review(R_NO, R_IMAGE, R_CONTENT, R_WDATE,
                        R_RATING, P_NO, U_NO, U_NAME, O_DATE )
                        values (REVIEW_R_NO_SEQ.nextval,'d4.png','정말 맛있어요!!',sysdate,3,'4','4','셋째임',sysdate-7);



commit;