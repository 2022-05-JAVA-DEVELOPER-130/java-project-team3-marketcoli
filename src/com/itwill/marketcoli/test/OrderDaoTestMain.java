package com.itwill.marketcoli.test;

import java.util.ArrayList;
import java.util.List;

import com.itwill.marketcoli.dao.OrdersDao;
import com.itwill.marketcoli.dao.ProductDao;
import com.itwill.marketcoli.dto.OrderItem;
import com.itwill.marketcoli.dto.Orders;
import com.itwill.marketcoli.dto.Product;
import com.itwill.marketcoli.dto.UserInfo;

public class OrderDaoTestMain {

	public static void main(String[] args) throws Exception {

		OrdersDao ordersDao = new OrdersDao();

		System.out.println("1.insertOrders");
		/*
		insert into orders(o_no,o_date,o_price,u_id) values (orders_o_no_SEQ.nextval,sysdate,10500,'itwill7');
		insert into order_item(oi_no,oi_qty,o_no,p_no) values(order_item_oi_no_SEQ.nextval,1,orders_o_no_SEQ.currval,3);
		*/
		
		
		// 1가지 상품 주문 넣기
		ProductDao selectProduct = new ProductDao();
		Product product = selectProduct.selectByNo(12);
		ArrayList<OrderItem> orderItemList=new ArrayList<OrderItem>();
		orderItemList.add(new OrderItem(0, 2, 0, product));
		//System.out.println(orderItemList.get(0).getOi_qty());
		Orders insertOrder = new Orders(0, null, product.getP_price()*orderItemList.get(0).getOi_qty(), 
										new UserInfo(0, "itwill6", null, null, null, null, null, 0, null, null), 
										orderItemList);

		//(확인 필요)order_item 테이블 - insert order_item이 안되는 상태 -> excuteQuery가 주석처리 되어있었음...
		System.out.println(ordersDao.insertOrder(insertOrder));

	}

}
