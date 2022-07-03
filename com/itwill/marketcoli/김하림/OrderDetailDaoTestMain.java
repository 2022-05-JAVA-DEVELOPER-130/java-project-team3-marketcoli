package com.itwill.marketcoli.김하림;

import java.util.List;

import com.itwill.marketcoli.dto.Product;
import com.itwill.marketcoli.dto.UserInfo;

public class OrderDetailDaoTestMain {

	public static void main(String[] args) throws Exception {
		OrderDetailDao orderDetailDao = new OrderDetailDao();

		
		System.out.println("1.유저번호를 이용한 상품수량 변경"); //유저 번호와 상품번호를 찾아서 상품 수량 변경
		OrderDetail updateorderDetail_u_no =	new OrderDetail(0,new Orders(0, null, null, 0, 7,
										new Product(3, null, 0, 0, null, null, null),
										new UserInfo(2, null, null, null, null, 0, null, 0, null, null)));
		System.out.println(orderDetailDao.updateOrderByno(updateorderDetail_u_no));							  
		
		System.out.println("2.유저아이디를 이용한 상품수량 변경"); //유저 번호와 유저아이디를 찾아서 상품 수량 변경
		OrderDetail updateorderDetail =	new OrderDetail(0,new Orders(0, null, null, 0, 7,
										new Product(3, null, 0, 0, null, null, null),
										new UserInfo(2,"itwill2", null, null, null, 0, null, 0, null, null)));
		System.out.println(orderDetailDao.updateOrderByno(updateorderDetail));
	
		
		
		
		
//		System.out.println("1-1.상품 수량 변경"); //유저 아이디를 이용해서 상품 수량 변경
//		OrderDetail updateorderDetail =	new OrderDetail(0,new Orders(0, null, null, 0, 7,
//										new Product(3, null, 0, null, null, null),
//										new UserInfo(3, itwill3, null, null, null, 0, null, 0, null, null)));
//		System.out.println(orderDetailDao.update(updateorderDetail));	
//		
		
		

		System.out.println("2.유저id로 결제상품 출력");
		List<OrderDetail> orderDetailsList = orderDetailDao.selectbyid("itwill3");
		System.out.println(">> " + orderDetailsList);
		
		
		
		
		
		
		
		
		
	}
}