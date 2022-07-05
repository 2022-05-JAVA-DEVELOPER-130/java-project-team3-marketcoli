package com.itwill.marketcoli.test;

import java.util.ArrayList;
import java.util.List;

import com.itwill.marketcoli.dao.OrdersDao;
import com.itwill.marketcoli.dao.ProductDao;
import com.itwill.marketcoli.dto.OrderItem;
import com.itwill.marketcoli.dto.Orders;
import com.itwill.marketcoli.dto.Product;
import com.itwill.marketcoli.dto.UserInfo;
import com.itwill.marketcoli.service.OrderService;

public class OrderServiceTestMain {

	public static void main(String[] args) throws Exception {

		OrderService orderService = new OrderService();

		/*		
				System.out.println("00.주문 내역 보여주기");
				List<OrderItem> showOrderList = orderService.showOrderListByOrderNo(67);
				for (OrderItem orderitem : showOrderList) {
					System.out.println(orderitem);
				}
		*/
		System.out.println("00.주문 넣기 - 상품에서 직접주문");
		System.out.println(orderService.insertOrderOne(20, 10, "itwill4"));
		
		System.out.println("00.주문 2개 동시에 넣기");	//맞나...
		System.out.println(orderService.addOrders(20, 10, 13, 20,"itwill4"));

		// cart에서 주문 -> cart에서 Order로 옮겨닮기
		System.out.println("00.cart에서 주문");	
		System.out.println(orderService.cartToOrders(9));
		
		//주문번호 를 이용한 주문내역 전체 삭제
		System.out.println("00.주문 전체 삭제");
		System.out.println(orderService.deleteOrderAllByOrderNo(72));
		
		System.out.println("00.userId를 통해 주문 전체 삭제");
		System.out.println(orderService.deleteOrderByUserId("itwill4"));
		
		//주문목록에서 1개 삭제
		
		//주문 전체 출력 -주문 상세보기
		
		//주문내역 수량 변경
		System.out.println("00.주문내역 수량 변경");
		System.out.println(orderService.updateOrderItemQty(100, 97));
		
		//주문번호 를 이용한 주문내역 전체 검색
		
	}

}
