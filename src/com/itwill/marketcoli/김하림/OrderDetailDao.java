package com.itwill.marketcoli.김하림;




import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

import com.itwill.marketcoli.dto.Product;
import com.itwill.marketcoli.dto.UserInfo;



public class OrderDetailDao {
	private DataSource dataSource;
	
	public OrderDetailDao() {
		dataSource = new DataSource();
	}
	
//	private int o_no;			//주문번호
//	private Date o_date;		//주문일시
//	private int d_fee;			//배송비
//	private String d_memo;		//배송메모

//	private UserInfo userInfo;
//	//private String u_address;	//주소
//	//private int u_no;			//회원번호
	
//	private Product product;
//	//private int p_piece;		//상품수량
//	//private int p_price;		//상품가격
//	//private String p_name;			//상품이름
	
	
	//주문이 들어오고 (order) 상세내역 받기
	public int insertOrderdetail(OrderDetail orderDetail) throws Exception {
		String ORDERDETAIL_INSERT= "insert into orderdetail(od_no,p_name,p_piece,p_price,u_address,o_no,o_date,d_fee,d_memo)"
				+ "values ( orderdetail_od_no_SEQ.nextval,?,?,?,?,?,?,?,?)";
		Connection con =dataSource.getConnection();
		PreparedStatement pstmt= con.prepareStatement(ORDERDETAIL_INSERT);
		pstmt.setString(1, orderDetail.getOrder().getProduct().getP_name());//p_name
		pstmt.setInt(2, orderDetail.getOrder().getProduct().getP_piece());//p_piece
		pstmt.setInt(3, orderDetail.getOrder().getProduct().getP_price());//p_price
		pstmt.setString(4, orderDetail.getOrder().getUserInfo().getU_address());//u_address
		pstmt.setInt(5, orderDetail.getOrder().getO_no());//o_no
		pstmt.setDate(6, new java.sql.Date(orderDetail.getOrder().getO_date().getTime()));//o_date
		pstmt.setInt(7, orderDetail.getOrder().getD_fee());//d_fee
		pstmt.setString(8, orderDetail.getOrder().getD_memo());//d_memo
		int insertRowCount	= pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return insertRowCount;
		
	}
	
	
	
	
	
	
		
	
	//수량 변경(update)-유저번호를 이용하여 조회후 수량 변경 
	public int updateOrderByno(OrderDetail orderDetail) throws Exception  {
		String ORDERDETAIL_UPDATE = "update orderdetail set p_piece =? where p_no=? and u_no=?";
		Connection con = this.dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ORDERDETAIL_UPDATE);
		pstmt.setInt(1, orderDetail.getOrder().getProduct().getP_piece());
		pstmt.setInt(2, orderDetail.getOrder().getProduct().getP_no());
		pstmt.setInt(3, orderDetail.getOrder().getUserInfo().getU_no());
		int rowCount = pstmt.executeUpdate();
		return rowCount;
		
	}
	
}	
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//	public List<OrderDetail> selectbyu_id(String u_id) throws Exception {	
//		String ORDERDETAIL_SELECT_BY_id = "select * from orderdetail where u_id=?";
//		List<OrderDetail> orderDetailList = new ArrayList<OrderDetail>();
//		Connection con = this.dataSource.getConnection();
//		PreparedStatement pstmt = con.prepareStatement(ORDERDETAIL_SELECT_BY_id);
//		pstmt.setString(1, u_id);
//		ResultSet rs= pstmt.executeQuery();
//		while (rs.next()) {
//			orderDetailList.add(new OrderDetail(0,
//								 new Orders(0, null, null, 0, 0, null, 
//								 new UserInfo(0, rs.getString("u_id"), null, null, null, 0, null, 0, null, null))));
//	
//	}
	

//	}
//	//수량변경(update)- 유저아이디를 이용하여 조회후 수량 변경
//	public int updateOrderByid(OrderDetail orderDetail) throws Exception {
//		String ORDERDETAIL_UPDATE = "update orderdetail set p_piece =? where p_no=? and  u_id=?";
//		Connection con = this.dataSource.getConnection();
//		PreparedStatement pstmt = con.prepareStatement(ORDERDETAIL_UPDATE);
//		pstmt.setInt(1,orderDetail.getOrder().getProduct().getP_price());
//		pstmt.setInt(2, orderDetail.getOrder().getProduct().getP_no());
//		pstmt.setString(3, orderDetail.getOrder().getUserInfo().getU_id());
//		int rowCount = pstmt.executeUpdate();
//		return rowCount;		
//	}
//	
//	
//	
//	
//		rs.close();
//		pstmt.close();
//		con.close();
//		return orderDetailList;
//		
//		
//		
//		
//		
//		
//		
//	}
//	
//	
//	
//	
//
//}
//	
//	
//	
//	
//	
//	
//	