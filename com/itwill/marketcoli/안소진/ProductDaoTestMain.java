package com.itwill.marketcoli.안소진;

public class ProductDaoTestMain {

	public static void main(String[] args) throws Exception {
		ProductDao productDao=new ProductDao();
		
		Product insertProduct=new Product(0, "파인애플", 12000, "한 입먹은사과는?", "채소,과일", "과일");		
		productDao.insert(insertProduct);
		
		
		
		
		
		

	}

}
