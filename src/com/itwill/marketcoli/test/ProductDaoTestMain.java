package com.itwill.marketcoli.test;

import java.util.List;

import com.itwill.marketcoli.dao.ProductDao;
import com.itwill.marketcoli.dto.Product;

public class ProductDaoTestMain {

	public static void main(String[] args) throws Exception {
		
		ProductDao productDao = new ProductDao();

		Product insertProduct=new Product(0, "딸기",9000, "새콤달콤....", "채소/과일", "과일");		
		int rowCount = productDao.insertProduct(insertProduct);	

		
		rowCount = productDao.deleteProduct(16);

				
		Product updateProduct = new Product(1,"귤",8000,"생귤탱귤...!","채소/과일","과일");
		rowCount = productDao.updateProduct(updateProduct);

		Product findProduct = productDao.selectByNo(15);
		System.out.println(findProduct);

		List<Product> productList = productDao.selsectAll();
		for (Product product : productList) {
			System.out.println(product);
		}
		

	}

}
