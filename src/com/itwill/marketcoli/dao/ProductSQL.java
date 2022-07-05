package com.itwill.marketcoli.dao;

public class ProductSQL {

	//SQL 문장을 채워서 사용하세요

	public static final String PRODUCT_INSERT = 
			"insert into product values (product_p_no_seq.nextval,?,?,?,?,?)";

	public static final String PRODUCT_UPDATE = 
			"update product set p_name=?,p_price=?,p_exp=?,p_category_b=?,p_category_s=? where p_no=?";

	public static final String PRODUCT_DELETE = 
			"delete from product where p_no=?";

	public static final String PRODUCT_SELECT_BY_NO = 
			"select * from product where p_no=? ";

	public static final String PRODUCT_SELECT_ALL = 
			"select * from product";

}