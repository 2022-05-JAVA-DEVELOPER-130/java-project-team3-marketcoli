package com.itwill.marketcoli.최서영;

import java.util.Date;

public class ReviewDaoTestMain {

	public static void main(String[] args) throws Exception {
		
		ReviewDao reviewDao = new ReviewDao();
		/*
		private int r_no;			//후기 번호  - pk
		private String r_image;		//후기 이미지
		private String r_content;	//후기 글
		private Date r_wdate;		//후기 작성일자 - 입력안함
		private int r_rating;		//후기 평가
		
		private Product product;			//상품번호, 상품이름
		
		private UserInfo userInfo;
		
		private Orders orders;		// 상품번호를 통해 주문일자 얻어와야
		*/
		/*
		private int p_no;			//상품번호	
		private String p_name;		//상품이름
		private int p_price;		//상품가격
		private String p_exp;		//상품설명
		private String p_category_b;	//상위카테고리
		private String p_category_s;	//하위카테고리
		*/
		/*
		private int u_no;			//회원번호
		private String u_id;		//아이디
		private String u_pw;		//비밀번호
		private String u_name;		//이름
		private String u_email;		//이메일
		private int u_phone;		//휴대폰번호
		private String u_address;	//주소
		private int u_birth;		//생년월일
		private String u_job;		//직업
		private Date u_joindate;	//java.util.Date
		*/
		
	System.out.println("1.insertGuest");
	Review insertReview = new Review(0, "r1.png", "정말 맛있어요!!", null, 5,
										new Product(1, null, 0, null, null,null),
												 new UserInfo(1,"김두유",null,null,null,0,null,0,null,null),
												 null);
	//System.out.println(reviewDao.insertGuest(insertReview));
	/*
	insert into review(R_NO, R_IMAGE, R_CONTENT, R_WDATE,\r\n"
			+ "            R_RATING, P_NO, U_NO, U_NAME, O_DATE )\r\n"
			+ "            values (REVIEW_R_NO_SEQ.nextval,'r1.png','정말 맛있어요!!',sysdate,5,'1','1','김두유',sysdate-7)";
			*/
	
	System.out.println(reviewDao.insertReview(insertReview));
	
	
	
	}
}
