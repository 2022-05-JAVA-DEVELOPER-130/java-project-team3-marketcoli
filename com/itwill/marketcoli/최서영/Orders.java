package com.itwill.marketcoli.최서영;
/*
이름        널?       유형             
--------- -------- -------------- 
O_NO      NOT NULL NUMBER(10)     
O_DATE             DATE           
O_STATE   NOT NULL VARCHAR2(30)   
U_NAME    NOT NULL VARCSHAR2(15)   
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
	/******/
	private UserInfo userInfo;		// -> u_name, u_phone, u_address, u_no
	/*private int u_no;			//회원번호
	private String u_id;		//아이디
	private String u_pw;		//비밀번호
	private String u_name;		//이름
	private String u_email;		//이메일
	private int u_phone;		//휴대폰번호
	private String u_address;	//주소
	private int u_birth;		//생년월일
	private String u_job;		//직업
	private Date u_joindate;	//java.util.Date
	*/
	/*
		private Product product;	// -> p_no, p_price
	  	private int p_no;			//상품번호	
		private String p_name;		//상품이름
		private int p_price;		//상품가격
		private String p_exp;		//상품설명
		private String p_category_b;	//상위카테고리
		private String p_category_s;	//하위카테고리
	*/	
	private int d_fee;			//배송비
	private String d_memo;	
	private OrderDetail orderDetail;	// -> p_no, p_piece
	/*
	private int od_no;		//주문상세번호
	private int p_piece;	//주문상품갯수
	private int u_no;		//회원 번호
	private int p_no;		//상품 번호
	*/	
	
	
}

	