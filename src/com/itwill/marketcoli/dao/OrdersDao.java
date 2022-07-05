package com.itwill.marketcoli.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.itwill.marketcoli.common.DataSource;
import com.itwill.marketcoli.dto.OrderItem;
import com.itwill.marketcoli.dto.Orders;
import com.itwill.marketcoli.dto.UserInfo;


public class OrdersDao {
	private DataSource dataSource;

	public OrdersDao() {
		dataSource = new DataSource();
	}

	public int insertOrder(Orders orders) throws Exception {

		/*
		private int o_no;			//주문번호
		private Date o_date;		//주문일시
		private int o_price;		//주문 총가격 total_price
		private UserInfo userInfo;
		
		private ArrayList<OrderItem> orderItemList=new ArrayList<OrderItem>();
		*/
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt1 = con.prepareStatement(OrdersSQL.ORDERS_INSERT);
		/*
		public static final String ORDERS_INSERT
				= "insert into orders(o_no, o_date, o_price, u_id) values (orders_o_no_SEQ.nextval,sysdate, ?, ?)";
		public static final String ORDERITEM_INSERT
			= "insert into order_item(oi_no, oi_qty, o_no, p_no) values(order_item_oi_no_SEQ.nextval, ? ,orders_o_no_SEQ.currval, ?)";
				*/

		pstmt1.setInt(1, orders.getO_price());
		pstmt1.setString(2, orders.getUserInfo().getU_id());
		int rowCount1 = pstmt1.executeUpdate();

		int rowCount2 = 0;
		int rowCount2Sum =0;
		PreparedStatement pstmt2 = con.prepareStatement(OrdersSQL.ORDERITEM_INSERT);

		for (OrderItem orderItem : orders.getOrderItemList()) {

			// pstmt2.setInt(1, orderItem.getO_no());
			pstmt2.setInt(1, orderItem.getOi_qty());
			pstmt2.setInt(2, orderItem.getProduct().getP_no());
			rowCount2 = pstmt2.executeUpdate();
			rowCount2Sum++;
		}

		pstmt1.close();
		pstmt2.close();
		con.close();

		return rowCount1 * rowCount2Sum; // 둘중에 하나라도 안되면 0이므로 곱한다.

	}
	
	
	/****************************************************************/
	// 주문 전체 출력
		public List<Orders> selectAll() throws Exception {
			List<Orders> orderslist = new ArrayList<Orders>();
			String selectAll = "select * from orders o join userinfo u on o.u_id = u.u_id";
			Connection con = dataSource.getConnection();
			PreparedStatement pstmt = con.prepareStatement(selectAll);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				orderslist.add(new Orders(rs.getInt("O_no"),
										  rs.getDate("O_date"),
										  rs.getInt("O_PRICE"), 
							   new UserInfo(), null));
			}
			rs.close();
			pstmt.close();
			con.close();
			return orderslist;
		}
			
			// 유저 id를 이용한 검색
			public Orders findOrders(String u_id) throws Exception {
				Orders findOrders = null;
				String selectOrders = "select * from orders o join userinfo u on o.u_id = u.u_id where o.u_id =?";
				Connection con = dataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(selectOrders);
				pstmt.setString(1, u_id);
				ResultSet rs = pstmt.executeQuery();
				if (rs.next()) {
					findOrders = new Orders(rs.getInt("o_no"),
											rs.getDate("O_date"),
											rs.getInt("O_PRICE"),
								 new UserInfo(), null);
				}
				rs.close();
				pstmt.close();
				con.close();
				return findOrders;	
			}
			
			
			
	
	
	
	/*
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
	
		}*/
}
