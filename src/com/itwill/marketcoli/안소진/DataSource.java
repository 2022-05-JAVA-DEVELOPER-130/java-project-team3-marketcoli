package com.itwill.marketcoli.안소진;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * Connection을 생성하고, 해지하는 역할을 하는 클래스
 */
public class DataSource {
	
	/*****************개인서버 정보*************************/
	String driverClass = "oracle.jdbc.OracleDriver";
	String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
	String user = "jdeveloper40";
	String password = "jdeveloper40";
	/******************************************************/

	
	/*
	 * Connection 객체를 생성해서 반환하는 메소드
	 */
	public Connection getConnection() throws Exception{	//객체를 생성하는 역할
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		return con;
	}
	
	
	
	
}
