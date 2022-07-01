package com.itwill.marketcoli.최서영;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;

import com.itwill.marketcoli.common.DataSource;

public class ReviewDao {
	private DataSource dataSource;
	
	public ReviewDao() {
		dataSource = new DataSource();
	}
	
	/*
		private int r_no;			//후기 번호
		private String r_image;		//후기 이미지
		private String r_content;	//후기 글
		private Date r_wdate;		//후기 작성일자
		private int r_rating;		//후기 평가
		
		private Product product;			//상품번호, 상품이름
		
		private UserInfo userInfo;
		
		private Orders orders;		// 상품번호를 통해 주문일자 얻어와야함
	*/
	/*
	public static final String REVIEW_INSERT=
	"insert into review(R_NO, R_IMAGE, R_CONTENT, R_WDATE,\r\n"
	+ "            R_RATING, P_NO, U_NO, U_NAME, O_DATE )\r\n"
	+ "            values (REVIEW_R_NO_SEQ.nextval,'r1.png','정말 맛있어요!!',sysdate,5,'1','1','김두유',sysdate-7)";
	*/
	
	public int insertReview(Review review) throws Exception {
		//String insertQuery="insert into cart(cart_no,userId,p_no,cart_qty) values (cart_cart_no_SEQ.nextval,?,?,?)";
		//Connection con=null;
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(ReviewSQL.REVIEW_INSERT);
		
		int insertRowCount=pstmt.executeUpdate();
		
		/*
		public static final String REVIEW_INSERT=
				"insert into review(R_NO, R_IMAGE, R_CONTENT, R_WDATE,  R_RATING, P_NO, U_NO, U_NAME, O_DATE )"
				+ "         values (REVIEW_R_NO_SEQ.nextval, ?, ?, sysdate, ?, ?, ?, ?, ?)";
		*/
		
		pstmt.setNString(1, review.getR_image());
		pstmt.setNString(2, review.getR_content());
		pstmt.setInt(3, review.getR_rating());
		pstmt.setInt(4, review.getProduct().getP_no());	// 상품이름으로 변경필요
		pstmt.setInt(5, review.getUserInfo().getU_no());	// 회원이름으로 변경필요
		pstmt.setString(6, review.getUserInfo().getU_name());
		//pstmt.setDate(7, review.getOrders().getO_date());	// java.util.Date -> java.sql.Date로 변경
		pstmt.setDate(7, new java.sql.Date(review.getOrders().getO_date().getTime()));	// java.util.Date -> java.sql.Date로 변경
		
		/*	
			new java.sql.Date(review.getOrders().getO_date().getTime())
			
			java.util.Date--> java.sql.Date
			
			java.sql.Date utilDate2ToSqlDate2 = new java.sql.Date(utilDate2.getTime());
		*/
		
		/*		
				try {
					con=dataSource.getConnection();
					pstmt=con.prepareStatement(insertQuery);
					pstmt.setString(1, review.getUser().getUserId());
					pstmt.setInt(2, review.getProduct().getP_no());
					pstmt.setInt(3, review.getCart_qty());
					insertRowCount = pstmt.executeUpdate();
				}finally {
					if(con!=null) {
						con.close();
					}
				}
		*/
		pstmt.close();
		con.close();
		return insertRowCount;
		
	}
	
	
	
	
}
