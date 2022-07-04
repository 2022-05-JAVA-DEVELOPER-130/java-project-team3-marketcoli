package com.itwill.marketcoli.dto;
/*
 이름      널?       유형            
------- -------- ------------- 
O_NO    NOT NULL NUMBER(10)    
O_DATE           DATE          
O_PRICE          NUMBER(10)    
U_ID           VARCHAR2(100)
 */
 
import java.util.Date;

public class Orders {

	private int o_no;			//주문번호
	private Date o_date;		//주문일시
	private int o_price;		
	private UserInfo userInfo;	//u_no 또는 u_id를 얻기 위함

	/*	<<UserInfo>>
	 	private int u_no;			//회원번호
		private String u_id;		//아이디
		private String u_pw;		//비밀번호
		private String u_name;		//이름
		private String u_email;		//이메일
		private String u_phone;		//휴대폰번호
		private String u_address;	//주소
		private int u_birth;		//생년월일
		private String u_job;		//직업
		private Date u_joindate;	//java.util.Date
	*/	
	public Orders() {
	}

	public Orders(int o_no, Date o_date, int o_price, UserInfo userInfo) {
		super();
		this.o_no = o_no;
		this.o_date = o_date;
		this.o_price = o_price;
		this.userInfo = userInfo;
	}

	
}


	