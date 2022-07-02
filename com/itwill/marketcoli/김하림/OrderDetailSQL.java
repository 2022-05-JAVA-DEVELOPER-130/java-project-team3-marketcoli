package com.itwill.marketcoli.김하림;

public class OrderDetailSQL {

	//SQL 문장을 채워서 사용하세요
	
	public static final String ORDERDETAIL_INSERT
			= "insert into orderdetail(od_no,p_piece,p_no,u_no)values ( orderdetail_od_no_SEQ.nextval,?,?,?)";
	
	public static final String ORDERDETAIL_UPDATE 
								= "update orderdetail set p_piece =? where u_no=? and p_no=? ";
	
	public static final String ORDERDETAIL_DELETE 
								= " ";
	
	public static final String ORDERDETAIL_SELECT_BY_ID 
	= "select * from orderdetail where u_id=? ";
	
	public static final String ORDERDETAIL_SELECT_BY_NO 
			= "select * from orderdetail where u_no=1 ";
	
	public static final String ORDERDETAIL_SELECT_ALL 
								= " ";
}
