package com.itwill.marketcoli.service;

import java.util.List;

import com.itwill.marketcoli.dao.ProductDao;
import com.itwill.marketcoli.dto.Product;

public class ProductService {
	private ProductDao productDao;
	
	public ProductService() {
		productDao = new ProductDao();
	}
		
	//상품넘버로 상세페이지 불러오기
	public Product productDetail(int p_no) throws Exception {
		return productDao.selectByNo(p_no);
	}
	
	//전체상품보기
	public List<Product> productList() throws Exception {
		return productDao.selsectAll();
	}
	

}
