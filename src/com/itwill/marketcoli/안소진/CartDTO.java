package com.itwill.marketcoli.안소진;

/*
이름      널?       유형           
------- -------- ------------ 
C_NO    NOT NULL NUMBER(10)   
C_QTY            NUMBER(10)   
P_NO             NUMBER(10)   
P_NAME           VARCHAR2(50) 
P_PRICE          NUMBER(10)   
U_NO             NUMBER(10)   
 */
public class CartDTO {
	private int c_no;
	private int c_qty;
	private int p_no;
	private String p_name;
	private int p_price;
	private int u_no;

	public CartDTO() {
		// TODO Auto-generated constructor stub
	}

	public CartDTO(int c_no, int c_qty, int p_no, String p_name, int p_price, int u_no) {
		super();
		this.c_no = c_no;
		this.c_qty = c_qty;
		this.p_no = p_no;
		this.p_name = p_name;
		this.p_price = p_price;
		this.u_no = u_no;
	}

	public int getC_no() {
		return c_no;
	}

	public void setC_no(int c_no) {
		this.c_no = c_no;
	}

	public int getC_qty() {
		return c_qty;
	}

	public void setC_qty(int c_qty) {
		this.c_qty = c_qty;
	}

	public int getP_no() {
		return p_no;
	}

	public void setP_no(int p_no) {
		this.p_no = p_no;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public int getP_price() {
		return p_price;
	}

	public void setP_price(int p_price) {
		this.p_price = p_price;
	}

	public int getU_no() {
		return u_no;
	}

	public void setU_no(int u_no) {
		this.u_no = u_no;
	}

	@Override
	public String toString() {
		return "cartDTO [c_no=" + c_no + ", c_qty=" + c_qty + ", p_no=" + p_no + ", p_name=" + p_name + ", p_price="
				+ p_price + ", u_no=" + u_no + "]";
	}

}
