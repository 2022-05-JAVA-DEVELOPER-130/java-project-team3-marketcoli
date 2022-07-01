package com.itwill.marketcoli.dao;

public class UserSQL {
	
	//SQL 문장을 채워서 사용하세요
	
	/*	
	private int u_no;			//회원번호 - pk
	private String u_id;		//아이디 - 변경불가
	private String u_pw;		//비밀번호
	private String u_name;		//이름
	private String u_email;		//이메일
	private int u_phone;		//휴대폰번호
	private String u_address;	//주소
	private int u_birth;		//생년월일
	private String u_job;		//직업
	private Date u_joindate;	//java.util.Date - 변경불가
	*/
	
	
	public static final String USER_INSERT
								= "insert into userinfo(u_no, u_id, u_pw, u_name, u_email, u_phone, u_address, u_birth, u_job, u_joindate)\r\n"
										+ "VALUES (userinfo_u_no_seq.nextval, ?, ?, ?, ?, ?, ?, ?, ? , sysdate) ";
	
	public static final String USER_UPDATE 
								= " ";
	
	public static final String USER_DELETE 
								= " ";
	
	public static final String USER_SELECT_BY_NO 
								= " ";
	
	public static final String USER_SELECT_ALL 
								= " ";

}
