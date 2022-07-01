--notice insert

insert into notice(n_no, n_title, n_date, n_content) 
VALUES(notice_n_no_seq.nextval, 
                        '배송지연 안내', 
                         sysdate, 
                        '안녕하세요! 마켓콜리 입니다. 마켓콜리를 사랑해주시고 아껴주신 고객님께 진심으로 감사드립니다. 현재 코로나 때문에 배송 많이 밀림 기다리셈.');
insert into notice(n_no, n_title, n_date, n_content) 
VALUES(notice_n_no_seq.nextval, 
                        '마켓컬리 여름 이벤트', 
                         sysdate, 
                         '안녕하세요! 마켓콜리 입니다. 마켓콜리를 사랑해주시고 아껴주신 고객님께 진심으로 감사드립니다. 저희 마켓콜리에서 구매하신 이력이 있는 고객님들에 한하여 추첨을 통해 수박 무료 배송 이벤트를 진행하고있습니다.');
insert into notice(n_no, n_title, n_date, n_content) 
VALUES(notice_n_no_seq.nextval, 
                        '회원가입 이벤트', 
                         sysdate, 
                        '안녕하세요! 마켓콜리 입니다. 마켓콜리를 사랑해주시고 아껴주신 고객님께 진심으로 감사드립니다. 신규가입한 회원님들께 무료 배송 1회 서비스를 진행중입니다. 많은 이용 바랍니다!');
                        
commit;