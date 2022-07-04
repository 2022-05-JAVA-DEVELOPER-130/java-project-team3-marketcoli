package com.itwill.marketcoli.dto;

import java.util.Date;

/*
이름     널?       유형         
------ -------- ---------- 
OI_NO  NOT NULL NUMBER(10)  - pk
OI_QTY          NUMBER(10) 
O_NO            NUMBER(10) 
P_NO            NUMBER(10)
*/
public class OrderItem {
	private int oi_no;			//주문 아이템 번호(pk)
	private int oi_qty;			//주문 상품 수량
	private int o_no;			//주문 번호
	private Product product;			//상품 - 상품 번호
	 
	/*	<<Product>>
		private int p_no;				//상품번호	
		private String p_name;			//상품이름
		private int p_price;			//상품가격
		private String p_exp;			//상품설명
		private String p_category_b;	//상위카테고리
		private String p_category_s;	//하위카테고리
	 */
	
	
	 public OrderItem() {
		// TODO Auto-generated constructor stub
	}

	public OrderItem(int oi_no, int oi_qty, int o_no, Product product) {
		super();
		this.oi_no = oi_no;
		this.oi_qty = oi_qty;
		this.o_no = o_no;
		this.product = product;
	}
	
}
