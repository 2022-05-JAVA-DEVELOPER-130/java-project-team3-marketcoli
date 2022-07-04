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

	public int insertProduct(Product product) throws Exception {

		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ProductSQL.PRODUCT_INSERT);

		// pstmt.setString(1, product.getP_name()());

		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();

		return rowCount;
	}

	// pk를 통해 삭제
	public int deleteProduct(int p_no) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ProductSQL.PRODUCT_DELETE);

		//pstmt.setInt(1, p_no);

		int rowCount = pstmt.executeUpdate();

		pstmt.close();
		con.close();

		return rowCount;

	}

	public int updateProduct(Product product) throws Exception {

		Connection con = this.dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ProductSQL.PRODUCT_UPDATE);

		// pstmt.setString(1, product.getP_name());

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

			
		}
		rs.close();
		pstmt.close();
		con.close();

		return findProduct;
	}

	public List<Product> selectAll() throws Exception {

		List<Product> productList = new ArrayList<Product>();

		Connection con = this.dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ProductSQL.PRODUCT_SELECT_ALL);
		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {

		}
		rs.close();
		pstmt.close();
		con.close();

		return productList;

	}

}
