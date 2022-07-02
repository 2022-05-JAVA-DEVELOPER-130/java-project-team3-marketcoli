package com.itwill.marketcoli.임은비;
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
public class OrderDetail {
	private int od_no;		//주문상세번호
	private int p_piece;	//주문상품갯수
	private int u_no;		//회원 번호
	private int p_no;		//상품 번호
	
	 public OrderDetail() {
		// TODO Auto-generated constructor stub
	}

	public OrderDetail(int od_no, int p_piece, int u_no, int p_no) {
		super();
		this.od_no = od_no;
		this.p_piece = p_piece;
		this.u_no = u_no;
		this.p_no = p_no;
	}

	public int getOd_no() {
		return od_no;
	}

	public void setOd_no(int od_no) {
		this.od_no = od_no;
	}

	public int getP_piece() {
		return p_piece;
	}

	public void setP_piece(int p_piece) {
		this.p_piece = p_piece;
	}

	public int getU_no() {
		return u_no;
	}

	public void setU_no(int u_no) {
		this.u_no = u_no;
	}

	public int getP_no() {
		return p_no;
	}

	public void setP_no(int p_no) {
		this.p_no = p_no;
	}

	@Override
	public String toString() {
		return "OrderDetail [od_no=" + od_no + ", p_piece=" + p_piece + ", u_no=" + u_no + ", p_no=" + p_no + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
