package com.itwill.marketcoli.안소진;

public class CartSQL {

	//SQL 문장을 채워서 사용하세요
	
	public static final String CART_INSERT
								= "insert into cart values (cart_c_no_seq.nextval,?,?,?,?,?)";
	
	public static final String CART_UPDATE 
								= "update cart set c_qty=?,p_no=?,p_name=?,p_price=? where u_no";
	
	public static final String CART_DELETE 
								= " ";
	
	public static final String CART_SELECT_BY_NO 
								= " ";
	
	public static final String CART_SELECT_ALL 
								= " ";
	
	//
}
