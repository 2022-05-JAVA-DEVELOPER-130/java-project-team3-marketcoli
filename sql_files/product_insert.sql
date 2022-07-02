--상품테이블 -> 구성항목(상품번호/상품명/상품가격/상품설명/상위카테고리/하위카테고리)

--채소/과일
--과일
insert into Product values(product_p_no_seq.nextval,'사과',2500,'빨가면 사과,사과는 맛있어!','채소/과일','과일');
insert into Product values(product_p_no_seq.nextval,'수박',9000,'줄그으면 수박이지!','채소/과일','과일');
insert into Product values(product_p_no_seq.nextval,'복숭아',5500,'나는 신비복숭아','채소/과일','과일');
insert into Product values(product_p_no_seq.nextval,'석류',3000,'미인은 석류를 좋아해~','채소/과일','과일');
insert into Product values(product_p_no_seq.nextval,'체리',8000,'동글동글 체리','채소/과일','과일');
--채소
insert into Product values(product_p_no_seq.nextval,'상추',2000,'세븐 친구 아닙니다','채소/과일','채소');
insert into Product values(product_p_no_seq.nextval,'깻잎',1000,'캣잎 아닙니다','채소/과일','채소');
insert into Product values(product_p_no_seq.nextval,'시금치',5000,'시금치','채소/과일','채소');
insert into Product values(product_p_no_seq.nextval,'양파',5000,'사랑 그게 뭔데','채소/과일','채소');

--정육/수산
--정육
insert into Product values(product_p_no_seq.nextval,'소고기',30000,'한우 냠, 맛있겠다','정육/수산','정육');
insert into Product values(product_p_no_seq.nextval,'돼지고기',20000,'꿀꿀','정육/수산','정육');
insert into Product values(product_p_no_seq.nextval,'닭고기',15000,'꼬기오 꼬꼬','정육/수산','정육');
insert into Product values(product_p_no_seq.nextval,'오리고기',15000,'꽉꽉?','정육/수산','정육');
--수산
insert into Product values(product_p_no_seq.nextval,'고등어',15000,'퍼덕퍼덕','정육/수산','수산');
insert into Product values(product_p_no_seq.nextval,'갈치',15000,'퍼더덕','정육/수산','수산');
insert into Product values(product_p_no_seq.nextval,'연어',15000,'퍼덕 퍼더덕?','정육/수산','수산');

commit;

select * from Product;
