package com.itwill.marketcoli.김하림;

public class OrderDetailDaoTestMain {

	public static void main(String[] args) throws Exception {
		OrderDetailDao orderDetailDao = new OrderDetailDao();

		System.out.println("1.상품 수량 변경");
		int rowCount = orderDetailDao.update(8, 2, 3);
		System.out.println(">> " + rowCount);

		System.out.println("2.유저id로 결제상품 출력");
		int rowCount1 = orderDetailDao.selectByBirth(19500625);
		System.out.println(">> " + rowCount1);
	}
}