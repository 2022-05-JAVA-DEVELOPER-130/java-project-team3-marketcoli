package com.itwill.marketcoli.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.itwill.marketcoli.common.DataSource;
import com.itwill.marketcoli.dto.Cart;

public class CartDao {
	private DataSource dataSource;

	public CartDao() {
		dataSource = new DataSource();
	}

	public int insertCart(Cart cart) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CartSQL.CART_INSERT);

		pstmt.setInt(1, cart.getC_qty());
		pstmt.setInt(2, cart.getP_no());
		pstmt.setInt(3, cart.getU_no());

		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		
		return rowCount;
	}

	// pk를 통해 삭제
	public int deleteCartNo(int c_no) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CartSQL.CART_DELETE_CART_NO);

		pstmt.setInt(1, c_no);

		int rowCount = pstmt.executeUpdate();

		pstmt.close();
		con.close();

		return rowCount;
	} 
	
	public int deleteUserNo(int u_no) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CartSQL.CART_DELETE_USER_NO);
		
		pstmt.setInt(1, u_no);
		
		int rowCount = pstmt.executeUpdate();
		
		pstmt.close();
		con.close();
		
		return rowCount;
	} 

	public int updateCartQty(Cart cart) throws Exception {
		Connection con = this.dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CartSQL.CART_UPDATE_QTY);
		
		pstmt.setInt(1, cart.getC_qty());
		pstmt.setInt(2, cart.getU_no());


		int rowCount = pstmt.executeUpdate();

		pstmt.close();
		con.close();

		return rowCount;
	}
	
	public int updateCartProduct(Cart cart) throws Exception {
		Connection con = this.dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CartSQL.CART_UPDATE_PRODUCT);
		
		pstmt.setInt(1, cart.getP_no());
		pstmt.setInt(2, cart.getU_no());
		
		
		int rowCount = pstmt.executeUpdate();
		
		pstmt.close();
		con.close();
		
		return rowCount;
	}
	
	
	public Cart selectCartByNo(int c_no) throws Exception {
		Cart findCart = null;
		Connection con = this.dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CartSQL.CART_SELECT_BY_USER_NO);
		pstmt.setInt(1, c_no);

		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			
			findCart = new Cart(rs.getInt("c_no"),
									rs.getInt("c_qty"),
									rs.getInt("p_no"),
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
									rs.getInt("u_no")));

		}
		rs.close();
		pstmt.close();
		con.close();

		return cartList;
	}
}