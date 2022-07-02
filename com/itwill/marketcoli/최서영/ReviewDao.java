package com.itwill.marketcoli.최서영;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



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
		// String insertQuery="insert into cart(cart_no,userId,p_no,cart_qty) values
		// (cart_cart_no_SEQ.nextval,?,?,?)";
		// Connection con=null;
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ReviewSQL.REVIEW_INSERT);

		/*
		public static final String REVIEW_INSERT=
				"insert into review(R_NO, R_IMAGE, R_CONTENT, R_WDATE,  R_RATING, P_NO, U_NO, U_NAME, O_DATE )"
				+ "         values (REVIEW_R_NO_SEQ.nextval, ?, ?, sysdate, ?, ?, ?, ?, ?)";
		*/

		/*	//<<test1>>	
				pstmt.setString(1, "r1.png");
				pstmt.setString(2, "정말 맛있어요!!");
				pstmt.setInt(3, 5);
				pstmt.setInt(4, 1); // 상품이름으로 변경필요
				pstmt.setInt(5, 2); // 회원이름으로 변경필요
				pstmt.setString(6, "itwill2");
				pstmt.setDate(7, null); // java.util.Date ->
			*/
		pstmt.setString(1, review.getR_image());
		pstmt.setString(2, review.getR_content());
		pstmt.setInt(3, review.getR_rating());
		pstmt.setInt(4, review.getProduct().getP_no()); // 상품이름으로 변경필요
		pstmt.setInt(5, review.getUserInfo().getU_no()); // 회원이름으로 변경필요
		pstmt.setString(6, review.getUserInfo().getU_name());
		pstmt.setDate(7, new java.sql.Date(review.getOrders().getO_date().getTime())); // java.util.Date ->
		// java.sql.Date로 변경
		/*	
			new java.sql.Date(review.getOrders().getO_date().getTime())
			
			java.util.Date--> java.sql.Date
			
			java.sql.Date utilDate2ToSqlDate2 = new java.sql.Date(utilDate2.getTime());
		*/
		int insertRowCount = pstmt.executeUpdate();

		pstmt.close();
		con.close();
		return insertRowCount;

	}

	public int updateByReviewNo(Review review) throws Exception {
		
		Connection con = this.dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ReviewSQL.REVIEW_UPDATE_BY_REVIEW_NO);

		//"update review set r_image = ?, r_content=?, r_rating=? where r_no = ?";
		//"update review set r_image = 'up.jpg', r_content='씨이원한 맛!', r_rating='3' where r_no = 8";

		pstmt.setString(1, review.getR_image());
		pstmt.setString(2, review.getR_content());
		pstmt.setInt(3, review.getR_rating());
		pstmt.setInt(4, review.getR_no());
		
		int updateRowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return updateRowCount;
	}
	
	
	
	//상품번호로 후기 조회 -> 상품페이지-후기에서 보여짐. ex> 상품-바나나 -> 바나나 구매고객들의 후기
	public List<Review> selectByProductNo(int p_no) throws Exception {
		// String selectAllSql = "select * from review";
		List<Review> reviewList = new ArrayList<Review>();
		Connection con = this.dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ReviewSQL.REVIEW_SELECT_BY_PRODUCT_NO);
		
		pstmt.setInt(1, p_no);
		
		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {
			/*
					private int p_no;			//상품번호	
					private String p_name;		//상품이름
					private int p_price;		//상품가격
					private String p_exp;		//상품설명
					private String p_category_b;	//상위카테고리
					private String p_category_s;	//하위카테고리
			*/
			
			reviewList.add(new Review(rs.getInt("r_no"),
										rs.getString("r_image"),
										rs.getString("r_content"),
										rs.getDate("r_wdate"),
										rs.getInt("r_rating"),
										new Product(rs.getInt("p_no"), null, 0, null, null, null),
										new UserInfo(rs.getInt("u_no"), null, null, rs.getString("u_name"), null, 0, null, 0, null, null),
										new Orders(0, rs.getDate("o_date"), null, 0, null, null)
									)
					);
			
			
			/*
						reviewList.add(new Review(rs.getInt("review_no"),
											rs.getString("review_name"),
											rs.getDate("review_Date"),sql.date는 상위(util.date)로 자동캐스팅
											rs.getString("review_email"),
											rs.getString("review_homepage"),
											rs.getString("review_title"),
											rs.getString("review_content")
												)
										);
			*/
		}
		rs.close();
		pstmt.close();
		con.close();

		return reviewList;
	}

}
