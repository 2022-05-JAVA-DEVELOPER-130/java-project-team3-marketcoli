package com.itwill.marketcoli.임은비;

import java.util.List;

public class ReviewTestMain {

	public static void main(String[] args) throws Exception{
		ReviewDao reviewDao = new ReviewDao();
/*		
		System.out.println(">>insert");
		
		//Review insertReview = new Review(0,"a.png", "너무 맛있어요 최고~", null, 5, 1, 1, "은비", null);
		Review insertReview = new Review(0, "a.png", "너무 맛있어요 최고", null, 5,
							 new Product(1, "바나나", 0, null, null, null),
							 new UserInfo(1, null, null, "은비은비", null, 0, null, 0, null, null),
							 null);
		System.out.println(reviewDao.insertReview(insertReview));
*/		
		
		System.out.println(">>delete");
		System.out.println(reviewDao.deleteReview(2));

		/*
		System.out.println(">>update");
		Review updateReview = new Review(0, "hi.jpg", "정말 배불러요!!", null, 4, 1, 1, "멋진은비", null);
		System.out.println(">>"+reviewDao.upadateReview(updateReview));
		
		
		
		System.out.println(">>selectproduct");
		
		*/
		
		System.out.println(">>selectNoReview");
		Review findReviewId = reviewDao.selectNoReview(2);
		System.out.println(findReviewId);
		
	
		System.out.println(">>selectidReviewAll");
		List<Review> reviewIdListAll = reviewDao.selectIdReviewAll("itwill1");
		for (Review review : reviewIdListAll) {
			System.out.println(review);
		}

		

	}

}
