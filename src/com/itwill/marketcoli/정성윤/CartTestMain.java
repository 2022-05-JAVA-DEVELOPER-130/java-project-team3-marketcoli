package com.itwill.marketcoli.정성윤;
import java.util.List;

public class CartTestMain {

	public static void main(String[] args) throws Exception{
		CartDao CartDao = new CartDao();
		
		System.out.println(">> 장바구니 담기");
		Cart insertCart = new Cart(1,1,1,"사과",1,1);
		System.out.println(CartDao.insertCart(insertCart));
				
		System.out.println(">> 장바구니 삭제");
		System.out.println(CartDao.deleteCart(2));
		
		System.out.println(">> 장바구니 수정");
		Cart updateCart = new Cart(8,10,8,"시금치",80000,1);
		System.out.println(CartDao.updateCart(updateCart));
		
		System.out.println(">> 장바구니 번호로 출력");
		Cart selectCartByNo = CartDao.selectCartByNo(1);
		System.out.println(selectCartByNo);
		
		System.out.println(">> 장바구니 전체 출력");
		List<Cart> cartList = CartDao.selectAll();
		System.out.println(cartList);
	
	}

}