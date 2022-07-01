package com.itwill.marketcoli.김하림;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.itwill.marketcoli.common.DataSource;
import com.itwill.marketcoli.dto.OrderDetail;
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
	
	//주문상세 내역 확인
	public int SelectOrderDetail(UserInfo u_id) {
		return 0;
		
	}
	
	
	
	
	
}
	
	
	
	
	
	
	