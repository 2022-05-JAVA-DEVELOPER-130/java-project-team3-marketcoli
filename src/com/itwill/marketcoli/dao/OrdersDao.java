package com.itwill.marketcoli.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.itwill.marketcoli.common.DataSource;
import com.itwill.marketcoli.dto.Orders;

public class OrdersDao {
	private DataSource dataSource;
	
	public OrdersDao() {
		dataSource = new DataSource();
	}
	
	public int insertOrders(Orders orders) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(OrdersSQL.ORDERS_INSERT);


		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();

		return rowCount;
		
		
	}
	
	// pk를 통해 삭제
	public int deleteOrders(int o_no) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(OrdersSQL.ORDERS_DELETE);

		pstmt.setInt(1, o_no);

		int rowCount = pstmt.executeUpdate();

		pstmt.close();
		con.close();

		return rowCount;
		
	} 
	
		public int updateOrders(Orders orders) throws Exception {
			Connection con = this.dataSource.getConnection();
			PreparedStatement pstmt = con.prepareStatement(OrdersSQL.ORDERS_UPDATE);

			int rowCount = pstmt.executeUpdate();

			pstmt.close();
			con.close();

			return rowCount;
		}
		
		public Orders selectByNo(int o_no) throws Exception {
			Orders findOrders = null;

			Connection con = this.dataSource.getConnection();
			PreparedStatement pstmt = con.prepareStatement(OrdersSQL.ORDERS_SELECT_BY_NO);
			pstmt.setInt(1, o_no);

			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
			}
			rs.close();
			pstmt.close();
			con.close();
			return findOrders;
			
			
		}
		
		public List<Orders> selectAll() throws Exception {
			// String selectAllSql = "select * from guest";
			List<Orders> ordersList = new ArrayList<Orders>();

			Connection con = this.dataSource.getConnection();
			PreparedStatement pstmt = con.prepareStatement(OrdersSQL.ORDERS_SELECT_ALL);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
			}
			rs.close();
			pstmt.close();
			con.close();

			return ordersList;
			
		}
}
