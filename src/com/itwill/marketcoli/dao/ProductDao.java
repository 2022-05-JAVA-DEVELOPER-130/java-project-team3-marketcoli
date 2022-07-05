package com.itwill.marketcoli.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.itwill.marketcoli.common.DataSource;
import com.itwill.marketcoli.dto.Product;

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
public class ProductDao {

	private DataSource dataSource;

	public ProductDao() {
		dataSource = new DataSource();
	}
	
	//상품번호로 상품 출력 -상품번호로
	public Product selectByNo(int p_no) throws Exception {
		
		Product findProduct=null;
			
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ProductSQL.PRODUCT_SELECT_BY_NO);
		pstmt.setInt(1, p_no);
		
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()) {
			findProduct =new Product(rs.getInt("p_no"),
									 rs.getString("p_name"),
									 rs.getInt("p_price"),
									 rs.getString("p_exp"),
									 rs.getString("p_category_b"),
									 rs.getString("p_category_s")
									 );
		}
		rs.close();
		pstmt.close();
		con.close();
		return findProduct;
	}
	
	
	//전체 상품 출력
	public List<Product> selsectAll() throws Exception {
		
		List<Product> productList=new ArrayList<Product>();
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ProductSQL.PRODUCT_SELECT_ALL);
		ResultSet rs=pstmt.executeQuery();
		
		while(rs.next()) {
			productList.add(new Product(rs.getInt("p_no"),
									 rs.getString("p_name"),
									 rs.getInt("p_price"),
									 rs.getString("p_exp"),
									 rs.getString("p_category_b"),
									 rs.getString("p_category_s")
									 )
							);
		}
		rs.close();
		pstmt.close();
		con.close();
		return productList;
	}
	
	
	
	
		//상품등록
		public int insertProduct(Product product) throws Exception {

			Connection con = dataSource.getConnection();
			PreparedStatement pstmt = con.prepareStatement(ProductSQL.PRODUCT_INSERT);
			
			pstmt.setString(1, product.getP_name());
			pstmt.setInt(2, product.getP_price());
			pstmt.setString(3, product.getP_exp());
			pstmt.setString(4, product.getP_category_b());
			pstmt.setString(5, product.getP_category_s());

			int rowCount = pstmt.executeUpdate();
			pstmt.close();
			con.close();
			return rowCount;
		}

		//상품삭제 -상품번호로
		public int deleteProduct(int P_no) throws Exception {   
			
			Connection con = dataSource.getConnection();
			PreparedStatement pstmt = con.prepareStatement(ProductSQL.PRODUCT_DELETE);

			pstmt.setInt(1, P_no);

			int rowCount = pstmt.executeUpdate();
			pstmt.close();
			con.close();
			return rowCount;

		}
		
		//상품수정 -상품번호로
		public int updateProduct(Product product) throws Exception {
			
			Connection con=dataSource.getConnection();
			PreparedStatement pstmt=con.prepareStatement(ProductSQL.PRODUCT_UPDATE);
			
			pstmt.setString(1, product.getP_name());
			pstmt.setInt(2, product.getP_price());
			pstmt.setString(3, product.getP_exp());
			pstmt.setString(4, product.getP_category_b());
			pstmt.setString(5, product.getP_category_s());
			pstmt.setInt(6, product.getP_no());  //해당번호 상품 수정
			
			int rowCount = pstmt.executeUpdate();
			pstmt.close();
			con.close();
			return rowCount;
		}
		
}