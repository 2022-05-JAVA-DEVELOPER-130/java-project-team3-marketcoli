package com.itwill.marketcoli.정성윤;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CartDao {
	private DataSource dataSource;

	public CartDao() {
		dataSource = new DataSource();
	}

	public int insertCart(Cart cart) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CartSQL.CART_INSERT);
		
		pstmt.setInt(1, cart.getC_no());
		pstmt.setInt(2, cart.getC_qty());
		pstmt.setInt(3, cart.getP_no());
		pstmt.setString(4, cart.getP_name());
		pstmt.setInt(5, cart.getP_price());
		pstmt.setInt(6, cart.getU_no());

		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		
		return rowCount;
	}

	// pk를 통해 삭제
	public int deleteCart(int c_no) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CartSQL.CART_DELETE);

		pstmt.setInt(1, c_no);

		int rowCount = pstmt.executeUpdate();

		pstmt.close();
		con.close();

		return rowCount;
	} 

	public int updateCart(Cart cart) throws Exception {
		Connection con = this.dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CartSQL.CART_UPDATE);
		
		pstmt.setInt(1, cart.getC_no());
		pstmt.setInt(2, cart.getC_qty());
		pstmt.setInt(3, cart.getP_no());
		pstmt.setString(4, cart.getP_name());
		pstmt.setInt(5, cart.getP_price());
		pstmt.setInt(6, cart.getU_no());


		int rowCount = pstmt.executeUpdate();

		pstmt.close();
		con.close();

		return rowCount;
	}
	
	
	public Cart selectCartByNo(int c_no) throws Exception {
		Cart findCart = null;
		Connection con = this.dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CartSQL.CART_SELECT_BY_NO);
		pstmt.setInt(1, c_no);

		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			
			findCart = new Cart(rs.getInt("c_no"),
									rs.getInt("c_qty"),
									rs.getInt("p_no"),
									rs.getString("p_name"),
									rs.getInt("p_price"),
									rs.getInt("u_no"));
		}
		rs.close();
		pstmt.close();
		con.close();
		return findCart;
	}

	public List<Cart> selectAll() throws Exception {
		//String selectAllSql = "select * from user";
		List<Cart> cartList = new ArrayList<Cart>();

		Connection con = this.dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CartSQL.CART_SELECT_ALL);
		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {

			cartList.add(new Cart(rs.getInt("c_no"),
									rs.getInt("c_qty"),
									rs.getInt("p_no"),
									rs.getString("p_name"),
									rs.getInt("p_price"),
									rs.getInt("u_no")));

		}
		rs.close();
		pstmt.close();
		con.close();

		return cartList;
	}
}
