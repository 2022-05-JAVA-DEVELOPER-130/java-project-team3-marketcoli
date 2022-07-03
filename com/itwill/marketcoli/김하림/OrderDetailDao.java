package com.itwill.marketcoli.김하림;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import com.itwill.marketcoli.dto.UserInfo;

public class OrderDetailDao {
	private DataSource dataSource;
	
	public OrderDetailDao() {
		dataSource = new DataSource();
	}
	/*
	private int od_no;		//주문상세번호
	private Orders order;
	*/
	
	//주문상세 내역 확인 -유저아이디로 확인
	
	
	//주문상세 내역 상품 수량 변경 - update
//	public int update(int p_piece,int u_no,int p_no) throws Exception {
//		String ORDERDETAIL_UPDATE = "update orderdetail set p_piece =? where u_no=? and p_no=?";
//		Connection con =dataSource.getConnection();
//		PreparedStatement pstmt = con.prepareStatement(ORDERDETAIL_UPDATE);
//		pstmt.setInt(1, p_piece);
//		pstmt.setInt(2, u_no);
//		pstmt.setInt(3, p_no);
//		int rowCount = pstmt.executeUpdate();
//		return rowCount;		
//	}
	public int updateOrderByno(OrderDetail orderDetail) throws Exception {
		String ORDERDETAIL_UPDATE = "update orderdetail set p_piece =? where p_no=? and  u_no=?";
		Connection con = this.dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ORDERDETAIL_UPDATE);
		pstmt.setInt(1,orderDetail.getOrder().getProduct().getP_no());
		pstmt.setInt(2, orderDetail.getOrder().getProduct().getP_no());
		pstmt.setInt(3, orderDetail.getOrder().getUserInfo().getU_no());
		int rowCount = pstmt.executeUpdate();
		return rowCount;		
	}
	
	public int update(OrderDetail orderDetail) throws Exception {
		String ORDERDETAIL_UPDATE = "update orderdetail set p_piece =? where p_no=? and  u_no=?";
		Connection con = this.dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ORDERDETAIL_UPDATE);
		pstmt.setInt(1,orderDetail.getOrder().getProduct().getP_no());
		pstmt.setInt(2, orderDetail.getOrder().getProduct().getP_no());
		pstmt.setInt(3, orderDetail.getOrder().getUserInfo().getU_no());
		int rowCount = pstmt.executeUpdate();
		return rowCount;		
	}
	
	
	
	
	
	public List<OrderDetail> selectbyid(String u_id) throws Exception {	
		String ORDERDETAIL_SELECT_BY_id = "select * from orderdetail where u_id=?";
		List<OrderDetail> orderDetailsList = new ArrayList<OrderDetail>();
		Connection con = this.dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ORDERDETAIL_SELECT_BY_id);
		pstmt.setString(1, u_id);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			orderDetailsList.add(new OrderDetail(0,
								 new Orders(0, null, null, 0, 0, null, 
								 new UserInfo(0, rs.getString("u_id"), null, null, null, 0, null, 0, null, null))));
	
	}
		rs.close();
		pstmt.close();
		con.close();
		return orderDetailsList;
		
		
		
		
		
		
		
	}
	
	
	
	
		
	//주문상세 내역 - 생일 인자를 이용하여 검색 -> 인자 수정예정	
	public int selectByBirth(int u_birth) throws Exception	{
		String ORDERDETAIL_SELECT_BY_phone = "select * from orderdetail od join UserInfo u on od.u_no = u.u_no where u_birth=? ";
		Connection con =dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ORDERDETAIL_SELECT_BY_phone);
		pstmt.setInt(1, u_birth);
		int rowCount = pstmt.executeUpdate();
		return rowCount;
		
	}
	
	
}
	
	
	
	
	
	
	