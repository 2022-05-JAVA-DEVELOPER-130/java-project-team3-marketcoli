package com.itwill.marketcoli.임은비;

public class ReviewSql {
	
	
	public static final String REVIEW_INSERT = "insert into review(R_NO, R_IMAGE, R_CONTENT, R_WDATE,R_RATING, P_NO, U_NO, U_NAME, O_DATE )values (REVIEW_R_NO_SEQ.nextval,?,?,sysdate,?,?,?,?,?)";
	public static final String REVIEW_UPDATE = "update review set r_image = ?, r_content=?, r_rating=? where u_no = ?";
	public static final String REVIEW_DELETE = "delete review where u_no = ?";
	public static final String REVIEW_SELECT_ID = "select * from review where u_no=?";
	public static final String REVIEW_SELECT_PRODUCT = "select * from review where p_no=?";
	
	
	
}
