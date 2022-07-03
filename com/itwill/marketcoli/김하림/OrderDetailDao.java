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
	
	

	//수량 변경(update)-유저번호를 이용하여 조회후 수량 변경 
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
	//ㅅ
	public int updateOrderByid(OrderDetail orderDetail) throws Exception {
		String ORDERDETAIL_UPDATE = "update orderdetail set p_piece =? where p_no=? and  u_id=?";
		Connection con = this.dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ORDERDETAIL_UPDATE);
		pstmt.setInt(1,orderDetail.getOrder().getProduct().getP_no());
		pstmt.setInt(2, orderDetail.getOrder().getProduct().getP_no());
		pstmt.setString(3, orderDetail.getOrder().getUserInfo().getU_id());
		int rowCount = pstmt.executeUpdate();
		return rowCount;		
	}
	
	
	
	
	
	public List<OrderDetail> selectbyu_id(String u_id) throws Exception {	
		String ORDERDETAIL_SELECT_BY_id = "select * from orderdetail where u_id=?";
		List<OrderDetail> orderDetailList = new ArrayList<OrderDetail>();
		Connection con = this.dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ORDERDETAIL_SELECT_BY_id);
		pstmt.setString(1, u_id);
		ResultSet rs= pstmt.executeQuery();
		while (rs.next()) {
			orderDetailList.add(new OrderDetail(0,
								 new Orders(0, null, null, 0, 0, null, 
								 new UserInfo(0, rs.getString("u_id"), null, null, null, 0, null, 0, null, null))));
	
	}
		rs.close();
		pstmt.close();
		con.close();
		return orderDetailList;
		
		
		
		
		
		
		
	}
	
	
	
	

}
	
	
	
	
	
	
	