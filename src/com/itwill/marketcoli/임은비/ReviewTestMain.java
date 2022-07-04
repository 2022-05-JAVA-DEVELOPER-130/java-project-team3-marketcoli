package com.itwill.marketcoli.임은비;

import java.text.SimpleDateFormat;
import java.util.List;

import com.itwill.marketcoli.dao.ReviewDao;

//Dto
import com.itwill.marketcoli.임은비.Orders;
import com.itwill.marketcoli.임은비.Review;
import com.itwill.marketcoli.임은비.Product;
import com.itwill.marketcoli.임은비.UserInfo;
/* 추후 변경 필요
import com.itwill.marketcoli.dto.Product;
import com.itwill.marketcoli.dto.Review;
import com.itwill.marketcoli.dto.UserInfo;
*/

public class ReviewTestMain {

	public static void main(String[] args) throws Exception{
		ReviewDao reviewDao = new ReviewDao();
		
		System.out.println(">>insert");
		
		// 은비깨비대장 -> 후기 입력할때, Orders정보가 필요하지 않을까유?
		
		Review insertReview = new Review(0, "a.png", "너무 맛있어요 최고", null, 5,
							 new Product(1, "바나나", 0, null, null, null),
							 new UserInfo(1, null, null, "은비은비", null, 0, null, 0, null, null),
							 new Orders(1, new SimpleDateFormat("yyyy-mm-dd").parse("2022-02-20"), null, 0, null, null,null)
				);
		System.out.println(reviewDao.insertReview(insertReview));
	
		
		System.out.println(">>delete"); 
		System.out.println(reviewDao.deleteReview(2));
		/* (수정예정)
		 * where 후기번호로 줘야함.
				System.out.println(">>update");
				//The constructor Review(int, String, String, null, int, int, int, String, null) is undefined
				Review updateReview = new Review(0, "hi.jpg", "정말 배불러요!!", null, 4,
						new Product(1, null, 0, null, null, null),
						new UserInfo(0, null, null, "멋진은비", null, 0, null, 0, null, null),
						new Orders(0, null, null, 0, null, null) 
						);
				System.out.println(">>"+reviewDao.upadateReview(updateReview));
				*/
		
		System.out.println(">>updateByReviewNo");
		Review updateReview = new Review( 9, "up.jpg", "씨이원한 맛!!", null, 5,
											new Product(0, null, 0, null, null,null),
											new UserInfo(0,null,null,null,null,0,null,0,null,null),
											new Orders(0, null, null, 0, null, null,null)
										);
		System.out.println(reviewDao.updateByReviewNo(updateReview));
		
		
		System.out.println(">>selectNoReview");
		Review findReviewId = reviewDao.selectNoReview(2);
		System.out.println(findReviewId);
		
	
		System.out.println(">>selectidReviewAll");
		List<Review> reviewIdListAll = reviewDao.selectIdReviewAll("itwill1");
		for (Review review : reviewIdListAll) {
			System.out.println(review);
		}

		System.out.println("5.selectByProductNo");
		List<Review> reviewList = reviewDao.selectByProductNo(1);
		//System.out.println(reviewList);

		for (Review review : reviewList) {
			System.out.println(review);
		}
		
		
	}

}
