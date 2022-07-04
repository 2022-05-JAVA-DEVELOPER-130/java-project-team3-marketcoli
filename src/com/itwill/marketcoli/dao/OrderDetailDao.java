package com.itwill.marketcoli.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.itwill.marketcoli.common.DataSource;
import com.itwill.marketcoli.dto.OrderItem;
import com.itwill.marketcoli.dto.Orders;
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
	public int update(int p_piece,int u_no,int p_no) throws Exception {
		String ORDERDETAIL_UPDATE = "update orderdetail set p_piece =? where u_no=? and p_no=?";
		Connection con =dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ORDERDETAIL_UPDATE);
		pstmt.setInt(1, p_piece);
		pstmt.setInt(2, u_no);
		pstmt.setInt(3, p_no);
		int rowCount = pstmt.executeUpdate();
		return rowCount;		
	}
		
		
		
		
	

	
	
	
	
	
}
	
	
	
	
	
	
	