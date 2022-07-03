package com.itwill.marketcoli.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.itwill.marketcoli.common.DataSource;
import com.itwill.marketcoli.dto.Product;

public class ProductDao {
	private DataSource dataSource;

	public ProductDao() {
		dataSource = new DataSource();
	}
	/*
	private int p_no;			//상품번호	
	private String p_name;		//상품이름
	private int p_price;		//상품가격
	private String p_exp;		//상품설명
	private String p_category_b;	//상위카테고리
	private String p_category_s;	//하위카테고리
	 */

	public int insertProduct(Product product) throws Exception {

		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ProductSQL.PRODUCT_INSERT);

		// (참고)
		// pstmt.setString(1, product.getP_name()());
		/*********** 내용 입력 필요합니다 *********************/

		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();

		return rowCount;
	}

	// pk를 통해 삭제
	public int deleteProduct(int p_no) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ProductSQL.PRODUCT_DELETE);

		pstmt.setInt(1, p_no);

		int rowCount = pstmt.executeUpdate();

		pstmt.close();
		con.close();

		return rowCount;

	}

	public int updateProduct(Product product) throws Exception {

		Connection con = this.dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ProductSQL.PRODUCT_UPDATE);

		// (참고)
		// pstmt.setString(1, product.getP_name());
		/*********** 내용 입력 필요합니다 *********************/

		int rowCount = pstmt.executeUpdate();

		pstmt.close();
		con.close();

		return rowCount;
	}

	public Product selectByNo(int p_no) throws Exception {

		Product findProduct = null;

		Connection con = this.dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ProductSQL.PRODUCT_SELECT_BY_NO);
		pstmt.setInt(1, p_no);


		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			/*
				private int p_no;			//상품번호	
				private String p_name;		//상품이름
				private int p_price;		//상품가격
				private String p_exp;		//상품설명
				private String p_category_b;	//상위카테고리
				private String p_category_s;	//하위카테고리
			 */
			findProduct = new Product(rs.getInt("p_no"),
										rs.getString("p_name"), 
										rs.getInt("p_price"),
										rs.getString("p_exp"), 
										rs.getString("p_category_b"), 
										rs.getString("p_category_s"));

		}
		rs.close();
		pstmt.close();
		con.close();

		return findProduct;
	}

	public List<Product> selectAll() throws Exception {

		// String selectAllSql = "select * from guest";
		List<Product> productList = new ArrayList<Product>();

		Connection con = this.dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ProductSQL.PRODUCT_SELECT_ALL);
		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {
			/*
				private int p_no;			//상품번호	
				private String p_name;		//상품이름
				private int p_price;		//상품가격
				private String p_exp;		//상품설명
				private String p_category_b;	//상위카테고리
				private String p_category_s;	//하위카테고리
			 */
						productList.add(new Product(rs.getInt("p_no"),
													rs.getString("p_name"),
													rs.getInt("p_price"),
													rs.getString("p_exp"),
													rs.getString("p_category_b"),
													rs.getString("p_category_s")));
		}
		rs.close();
		pstmt.close();
		con.close();

		return productList;

	}

}
