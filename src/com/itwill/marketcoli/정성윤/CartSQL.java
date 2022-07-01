package com.itwill.marketcoli.정성윤;

public class CartSQL {

	//SQL 문장을 채워서 사용하세요
	
	public static final String CART_INSERT
								= "insert into cart values(cart_c_no_seq.nextval,?,?,?,?,?)";
	
	public static final String CART_UPDATE 
								= "update cart set c_qty=?, p_no=?, p_name=?, p_price=?, u_no=? where c_no=?";
	
	public static final String CART_DELETE 
								= "delete from cart where u_no = ?";
	
	public static final String CART_SELECT_BY_NO 
								= "select * from cart where cart.u_no = ?";
	
	public static final String CART_SELECT_ALL 
								= "select * from cart";
}
