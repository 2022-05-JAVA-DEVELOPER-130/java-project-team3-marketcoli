package com.itwill.marketcoli.김하림;



/*
orderdetail(
		od_no   NUMBER(10)		 NULL ,
		p_piece NUMBER(10)		 NULL ,
		u_no    NUMBER(10)		 NULL ,
		p_no    NUMBER(10)		 NULL 
);
*/
/**
 * @author ITWILL
 *
 */
/**
 * @author ITWILL
 *
 */
public class OrderDetail {
	private int od_no;		//주문상세번호
	private Orders order;
	//private int p_piece;	//주문상품갯수
	//private int u_no;		//회원 번호
	//private int p_no;		//상품 번호
	
	 public OrderDetail() {
		// TODO Auto-generated constructor stub
	}

	public OrderDetail(int od_no, Orders order) {
		this.od_no = od_no;
		this.order = order;
	}

	public int getOd_no() {
		return od_no;
	}

	public void setOd_no(int od_no) {
		this.od_no = od_no;
	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "OrderDetail [od_no=" + od_no + ", order=" + order + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
