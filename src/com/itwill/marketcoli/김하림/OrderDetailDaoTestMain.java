package com.itwill.marketcoli.김하림;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.itwill.marketcoli.dto.Product;
import com.itwill.marketcoli.dto.UserInfo;

public class OrderDetailDaoTestMain {

	public static void main(String[] args) throws Exception {
		OrderDetailDao orderDetailDao = new OrderDetailDao();

//		private int o_no;			//주문번호
//		private Date o_date;		//주문일시
//		private String o_state;		//주문상태
//		private int d_fee;			//배송비
//		private String d_memo;		//배송메모
//		private UserInfo userInfo;
//		//private String u_name;		//회원이름
//		//private int u_phone;		//휴대폰번호
//		//private String u_address;	//주소
//		//private int u_no;			//회원번호
//		private Product product;
//		//private int p_no;			//상품번호
//		//private int p_piece;		//상품수량
//		//private int p_price;		//상품가격
//		//private String p_name;			//상품이름
		/*
		String ORDERDETAIL_INSERT= "insert into orderdetail(od_no,
															p_name,
															p_piece,
															p_price,
															u_address,
															o_no,
															o_date,
															d_fee,
															d_memo)"
				+ "values ( orderdetail_od_no_SEQ.nextval,?,?,?,?,?,?,?,?)";
		*/
		System.out.println("1. 유저의 주문으로 상세내역 발생");
		OrderDetail insertOrderDetail = new OrderDetail(0,
										new Orders(0,
										new SimpleDateFormat("yyyy/MM/dd").parse("2022/07/01"), null, 3000, "살려줘", 
										new UserInfo(0, null, null, null, null, 0, "서울어딘가", 0, null, null),
										new Product(3, null, 10, 50000, null, null, null)));		
		System.out.println(orderDetailDao.insertOrderdetail(insertOrderDetail));
		
		
		
		
		
		
		System.out.println("1.유저번호를 이용한 상품수량 변경"); //유저 번호와 상품번호를 찾아서 상품 수량 변경
		OrderDetail updateOrderDetail_U_no =new OrderDetail(0,
											new Orders(0, null, null, 0, null,
											new UserInfo(3, null, null, null, null, 0, null, 0, null, null),
											new Product(3, null, 21, 0, null, null, null)));
		System.out.println(orderDetailDao.updateOrderByno(updateOrderDetail_U_no));		


		
		
		
		
		
		
		
//		System.out.println("2.유저아이디를 이용한 상품수량 변경"); //유저 번호와 유저아이디를 찾아서 상품 수량 변경
//		OrderDetail updateorderDetail_u_id =	new OrderDetail(0,new Orders(0, null, null, 0, 7,
//												new Product(3, null, 0, 0, null, null, null),
//												new UserInfo(0,null, null, null, null, 0, null, 0, null, null)));
//		System.out.println(orderDetailDao.updateOrderByno(updateorderDetail_u_id));
//		
//		
//		
//		System.out.println("3.유저아이디를 이용하여 주문목록 확인하기");
//		List<OrderDetail> orderDetailList = orderDetailDao.selectbyu_id("itwill3");
//		System.out.println(orderDetailList);

//		
//		
//		
//		
//		
		
		
		
		
		
	}
}