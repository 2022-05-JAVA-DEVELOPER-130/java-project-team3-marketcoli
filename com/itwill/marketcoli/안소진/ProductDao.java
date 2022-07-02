package com.itwill.marketcoli.안소진;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.itwill.marketcoli.dto.Product;

public class ProductDao {

	public void insert(Product product) throws Exception {
		/*******************************************************/
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "jdeveloper40";
		String password = "jdeveloper40";
		/*******************************************************/

		/*
		이름           널?       유형             
		------------ -------- -------------- 
		P_NO         NOT NULL NUMBER(10)     
		P_NAME       NOT NULL VARCHAR2(50)   
		P_PRICE      NOT NULL NUMBER(10)     
		P_EXP                 VARCHAR2(1000) 
		P_CATEGORY_B          VARCHAR2(50)   
		P_CATEGORY_S          VARCHAR2(50)   
		*/

		String insert = "insert into product values (product_p_no_seq.nextval,'" + product.getP_name() + "','"
				+ product.getP_price() + "','" + product.getP_exp() + "','" + product.getP_category_b() + "','"
				+ product.getP_category_s() + "')";

		Class.forName(driverClass); //dirve 클래스 생성
		Connection con = DriverManager.getConnection(url, user, password); //Connection 객체생성
		Statement stmt = con.createStatement(); //Statemetn객체생성
		int insertRowCount = stmt.executeUpdate(insert);
		stmt.close();
		con.close();

	}

}
