package com.itwill.marketcoli.안소진;

import java.util.List;

public class ProductDaoTestMain {

	public static void main(String[] args) throws Exception {
		ProductDao productDao = new ProductDao();

		Product insertProduct=new Product(0, "귤", 15000, "귤....", "채소,과일", "과일");		
		int rowCount = productDao.insertProduct(insertProduct);	

		rowCount = productDao.deleteProduct(18);

		Product updateProduct = new Product(39,"낑깡",8000,"낑깡낑깡","채소/과일","과일");
		rowCount = productDao.updateProduct(updateProduct);

		Product findProduct = productDao.selectByNo(23);
		System.out.println(findProduct);

		List<Product> productList = productDao.selsectAll();
		for (Product product : productList) {
			System.out.println(product);
		}

	}

}
