package com.itwill.marketcoli.김하림;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.itwill.marketcoli.common.DataSource;
import com.itwill.marketcoli.dto.OrderDetail;

public class OrderDetailDao {
	private DataSource dataSource;
	
	public OrderDetailDao() {
		dataSource = new DataSource();
	}

	public int insertOrderDetail(OrderDetail orderdetail)  {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(OrderDetailSQL.ORDERDETAIL_INSERT);
	}
	