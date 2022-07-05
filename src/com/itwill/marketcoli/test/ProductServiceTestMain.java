package com.itwill.marketcoli.test;

import com.itwill.marketcoli.service.ProductService;


public class ProductServiceTestMain {

	public static void main(String[] args) throws Exception {
		ProductService productService = new ProductService();

<<<<<<< HEAD
		//상품1개보기-상세보기
		System.out.println("4.상품1개보기");
		System.out.println(productService.productDetail(1));

		//상품전체 보기 
		System.out.println("5.상품리스트 전체보기");
=======
		System.out.println("1.상품넘버로 상세페이지 불러오기");
		System.out.println(productService.productDetail(18));
		
		System.out.println("2.상품리스트 전체보기");
>>>>>>> branch 'master' of https://github.com/2022-05-JAVA-DEVELOPER/java-project-team3-marketcoli.git
		System.out.println(productService.productList());
	}
}
