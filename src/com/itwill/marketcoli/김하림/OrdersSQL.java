package com.itwill.marketcoli.김하림;

public class OrdersSQL {

	//SQL 문장을 채워서 사용하세요
	
	public static final String ORDERS_INSERT
		= "insert into orders values (ORDERS_O_NO_SEQ.nextval,sysdate,?,?,?,?,?,?,?,?,?,?,?)";
	
	public static final String ORDERS_UPDATE 
		= "update orders set o_state = ?  where u_no =?";
	
	public static final String ORDERS_DELETE 
		= "elete orders  where u_name = ? and u_phone =? ";
	
	public static final String ORDERS_SELECT_BY_NO 
		= "select *from orders where u_no =? ";
	
	public static final String ORDERS_SELECT_ALL 
		= "select *from orders";
}
