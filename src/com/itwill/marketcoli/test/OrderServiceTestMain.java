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
		System.out.println(orderService.insertOrderOne(20, 10, "itwill3"));
		
		System.out.println("00.주문 2개 동시에 넣기");	//맞나...
		System.out.println(orderService.addOrders(20, 10, 13, 20,"itwill3"));

		//cart에서 주문
		
		//cart에서 선택 주문
		
		System.out.println("00.주문 전체 삭제");
		System.out.println(orderService.deleteOrderAllByOrderNo(72));
		
		//주문목록에서 1개 삭제
		
		//cart에서 주문
		
		//주문 상세보기
		
	}

}
