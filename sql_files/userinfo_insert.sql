--userinfo insert(회원가입)
insert into userinfo(u_no, u_id, u_pw, u_name, u_email, u_phone, u_address, u_birth, u_job, u_joindate)
VALUES (userinfo_u_no_seq.nextval, 'itwill1', '1111', '김첨지', 'a@www.a.com', '11111111111', '사랑시고백구행복동','19500625',null,sysdate);
insert into userinfo(u_no, u_id, u_pw, u_name, u_email, u_phone, u_address, u_birth, u_job, u_joindate)
VALUES (userinfo_u_no_seq.nextval, 'itwill2', '2222', '박혁거세', 'b@www.b.com', '22222222222', 'egg','19001225','조류관찰자',sysdate);
insert into userinfo(u_no, u_id, u_pw, u_name, u_email, u_phone, u_address, u_birth, u_job, u_joindate)
VALUES (userinfo_u_no_seq.nextval, 'itwill3', '3333', '최배달', 'c@www.c.com', '33333333333', '부여성','19100102','배민라이더',sysdate);
insert into userinfo(u_no, u_id, u_pw, u_name, u_email, u_phone, u_address, u_birth, u_job, u_joindate)
VALUES (userinfo_u_no_seq.nextval, 'itwill4', '4444', '미륵', 'd@www.d.com', '44444444444', '감비아','15410131','목사',sysdate);
insert into userinfo(u_no, u_id, u_pw, u_name, u_email, u_phone, u_address, u_birth, u_job, u_joindate)
VALUES (userinfo_u_no_seq.nextval, 'itwill5', '5555', '도요토미', 'e@www.japan.com', '5555555555', '몽골','20020202','독립운동가',sysdate);
insert into userinfo(u_no, u_id, u_pw, u_name, u_email, u_phone, u_address, u_birth, u_job, u_joindate)
VALUES (userinfo_u_no_seq.nextval, 'itwill6', '6666', '히데요시', 'f@www.love.com', '66666666666', '그랜드캐년','19990808','해군장교',sysdate);

commit;