package com.itwill.marketcoli.test;

import com.itwill.marketcoli.dao.OrderDetailDao;

public class OrderDetailDaoTestMain {
	
	public static void main(String[] args) throws Exception {
		OrderDetailDao orderDetailDao = new OrderDetailDao();
		
		System.out.println("1.상품 수량 변경");
		int rowCount = orderDetailDao.update(7, 3, 3);
		System.out.println(">> "+rowCount);
		
		
		
		
		
		
		
		
		
		
		
		
}

}