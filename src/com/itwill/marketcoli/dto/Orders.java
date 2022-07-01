package com.itwill.marketcoli.dto;
/*
이름        널?       유형             
--------- -------- -------------- 
O_NO      NOT NULL NUMBER(10)     
O_DATE             DATE           
O_STATE   NOT NULL VARCHAR2(30)   
U_NAME    NOT NULL VARCHAR2(15)   
U_PHONE   NOT NULL NUMBER(20)     
U_ADDRESS NOT NULL VARCHAR2(100)  
U_NO      NOT NULL NUMBER(10)     
P_NO               NUMBER(10)     
D_FEE              NUMBER(10)     
D_MEMO             VARCHAR2(3000) 
P_PIECE            NUMBER(10)     
P_PRICE            NUMBER(10)     
P_NAME             VARCHAR2(50)   
 */

import java.util.Date;

public class Orders {

	private int o_no;			//주문번호
	private Date o_date;		//주문일시
	private String o_state;		//주문상태
	private String u_name;		//회원이름
	private int u_phone;		//휴대폰번호
	private String u_address;	//주소
	private int u_no;			//회원번호
	private int p_no;			//상품번호
	private int d_fee;			//배송비
	private String d_memo;		//배송메모
	private int p_piece;		//상품수량
	private int p_price;		//상품가격
	private String p_name;			//상품이름
	
	public Orders() {
	}

	public Orders(int o_no, Date o_date, String o_state, String u_name, int u_phone, String u_address, int u_no,
			int p_no, int d_fee, String d_memo, int p_piece, int p_price, String p_name) {
		super();
		this.o_no = o_no;
		this.o_date = o_date;
		this.o_state = o_state;
		this.u_name = u_name;
		this.u_phone = u_phone;
		this.u_address = u_address;
		this.u_no = u_no;
		this.p_no = p_no;
		this.d_fee = d_fee;
		this.d_memo = d_memo;
		this.p_piece = p_piece;
		this.p_price = p_price;
		this.p_name = p_name;
	}

	public int getO_no() {
		return o_no;
	}

	public void setO_no(int o_no) {
		this.o_no = o_no;
	}

	public Date getO_date() {
		return o_date;
	}

	public void setO_date(Date o_date) {
		this.o_date = o_date;
	}

	public String getO_state() {
		return o_state;
	}

	public void setO_state(String o_state) {
		this.o_state = o_state;
	}

	public String getU_name() {
		return u_name;
	}

	public void setU_name(String u_name) {
		this.u_name = u_name;
	}

	public int getU_phone() {
		return u_phone;
	}

	public void setU_phone(int u_phone) {
		this.u_phone = u_phone;
	}

	public String getU_address() {
		return u_address;
	}

	public void setU_address(String u_address) {
		this.u_address = u_address;
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

	public int getD_fee() {
		return d_fee;
	}

	public void setD_fee(int d_fee) {
		this.d_fee = d_fee;
	}

	public String getD_memo() {
		return d_memo;
	}

	public void setD_memo(String d_memo) {
		this.d_memo = d_memo;
	}

	public int getP_piece() {
		return p_piece;
	}

	public void setP_piece(int p_piece) {
		this.p_piece = p_piece;
	}

	public int getP_price() {
		return p_price;
	}

	public void setP_price(int p_price) {
		this.p_price = p_price;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	@Override
	public String toString() {
		return "Orders [o_no=" + o_no + ", o_date=" + o_date + ", o_state=" + o_state + ", u_name=" + u_name
				+ ", u_phone=" + u_phone + ", u_address=" + u_address + ", u_no=" + u_no + ", p_no=" + p_no + ", d_fee="
				+ d_fee + ", d_memo=" + d_memo + ", p_piece=" + p_piece + ", p_price=" + p_price + ", p_name=" + p_name
				+ "]";
	}

	
}
