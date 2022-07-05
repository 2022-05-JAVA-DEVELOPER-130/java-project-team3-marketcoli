package com.itwill.marketcoli.service;

import com.itwill.marketcoli.dao.CartDao;
import com.itwill.marketcoli.dao.OrdersDao;
import com.itwill.marketcoli.dao.ProductDao;

public class OrderService {
	private OrdersDao orderDao;
	private ProductDao productDao;
	private CartDao cartDao;
	
	public OrderService() throws Exception{
		orderDao=new OrdersDao();
		productDao=new ProductDao();
		cartDao=new CartDao();
	}

}
