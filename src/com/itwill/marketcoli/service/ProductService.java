package com.itwill.marketcoli.service;

import java.util.List;

import com.itwill.marketcoli.dao.ProductDao;
import com.itwill.marketcoli.dto.Product;

public class ProductService {
	
	private ProductDao productDao;
	
	//상품 1개보기-상세보기
	public Product productDetail(int p_no) throws Exception {
		return productDao.selectByNo(p_no);
	}
	
	//전체상품보기
	public List<Product> productList() throws Exception {
		return productDao.selsectAll();
	}	
		
	

}
