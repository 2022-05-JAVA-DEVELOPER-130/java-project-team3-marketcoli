package com.itwill.marketcoli.최서영;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



public class OrdersOrderDetailDao {
	private DataSource dataSource;

	public OrdersOrderDetailDao() {
		dataSource = new DataSource();
	}
	public int insertReview(Review review) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ReviewSQL.REVIEW_INSERT);
		/*
				pstmt.setString(1, review.getR_image());
				pstmt.setString(2, review.getR_content());
				pstmt.setInt(3, review.getR_rating());
				pstmt.setInt(4, review.getProduct().getP_no()); // 상품이름으로 변경필요
				pstmt.setInt(5, review.getUserInfo().getU_no()); // 회원이름으로 변경필요
				pstmt.setString(6, review.getUserInfo().getU_name());
				pstmt.setDate(7, new java.sql.Date(review.getOrders().getO_date().getTime())); // java.util.Date ->
		*/
		int insertRowCount = pstmt.executeUpdate();

		pstmt.close();
		con.close();
		return insertRowCount;

	}

}
