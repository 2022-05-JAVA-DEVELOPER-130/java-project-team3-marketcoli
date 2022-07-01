package com.itwill.marketcoli.dto;

import java.util.Date;

/*
이름        널?       유형             
--------- -------- -------------- 
R_NO      NOT NULL NUMBER(10)     
R_IMAGE            VARCHAR2(10)   
R_CONTENT NOT NULL VARCHAR2(3000) 
R_WDATE   NOT NULL DATE           
R_RATING  NOT NULL NUMBER(10)     
P_NO      NOT NULL NUMBER(10)     
U_NO               NUMBER(10)     
U_NAME             VARCHAR2(50)   
O_DATE             DATE  
 */
public class Review {

	private int r_no;			//후기 번호
	private String r_image;		//후기 이미지
	private String r_content;	//후기 글
	private Date r_wdate;		//후기 작성일자
	private int r_rating;		//후기 평가
	private int p_no;			//상품번호
	private int u_no;			//상품이름
	private String u_name;		//회원이름
	private Date o_date;		//주문일자
	
	public Review() {
		// TODO Auto-generated constructor stub
	}

	public int getR_no() {
		return r_no;
	}

	public void setR_no(int r_no) {
		this.r_no = r_no;
	}

	public String getR_image() {
		return r_image;
	}

	public void setR_image(String r_image) {
		this.r_image = r_image;
	}

	public String getR_content() {
		return r_content;
	}

	public void setR_content(String r_content) {
		this.r_content = r_content;
	}

	public Date getR_wdate() {
		return r_wdate;
	}

	public void setR_wdate(Date r_wdate) {
		this.r_wdate = r_wdate;
	}

	public int getR_rating() {
		return r_rating;
	}

	public void setR_rating(int r_rating) {
		this.r_rating = r_rating;
	}

	public int getP_no() {
		return p_no;
	}

	public void setP_no(int p_no) {
		this.p_no = p_no;
	}

	public int getU_no() {
		return u_no;
	}

	public void setU_no(int u_no) {
		this.u_no = u_no;
	}

	public String getU_name() {
		return u_name;
	}

	public void setU_name(String u_name) {
		this.u_name = u_name;
	}

	public Date getO_date() {
		return o_date;
	}

	public void setO_date(Date o_date) {
		this.o_date = o_date;
	}

	@Override
	public String toString() {
		return "Review [r_no=" + r_no + ", r_image=" + r_image + ", r_content=" + r_content + ", r_wdate=" + r_wdate
				+ ", r_rating=" + r_rating + ", p_no=" + p_no + ", u_no=" + u_no + ", u_name=" + u_name + ", o_date="
				+ o_date + "]";
	}
	
	
}
