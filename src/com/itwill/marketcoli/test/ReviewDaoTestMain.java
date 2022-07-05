package com.itwill.marketcoli.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.itwill.marketcoli.dao.ReviewDao;
import com.itwill.marketcoli.dto.Orders;
//Dto
import com.itwill.marketcoli.dto.Product;
import com.itwill.marketcoli.dto.Review;
import com.itwill.marketcoli.dto.UserInfo;

public class ReviewDaoTestMain {

	public static void main(String[] args) throws Exception{
		ReviewDao reviewDao = new ReviewDao();
		
		/*
	private int r_no;			//후기 번호
	private String r_image;		//후기 이미지
	private String r_content;	//후기 글
	private Date r_wdate;		//후기 작성일자
	private int r_rating;		//후기 평가
	private Product product;	//상품번호, 상품이름
	private UserInfo userInfo;			//회원번호, 회원이름
	private Orders orders;		//주문일자
		 */
		
		System.out.println(">>insert");
/*							
				// 은비깨비대장 -> 후기 입력할때, Orders정보가 필요하지 않을까유?
				Review insertReview = new Review(0, "a.png", "너무 맛있어요 최고", null, 5,
									 new Product(1, "바나나", 0, null, null, null),
									 new UserInfo(1, null, null, "은비은비", null, null, null, 0, null, null),
									 new Orders(1, null, 0, null, null)
						);
				System.out.println(reviewDao.insertReview(insertReview));
		*/	
				
		System.out.println(">>delete");
		System.out.println(reviewDao.deleteReview(2));
		
		 
		  
		System.out.println(">>update");
				
				Review updateReview = new Review(0, "hi.jpg", "정말 배불러요!!", null, 4,
						new Product(1, null, 0, null, null, null),
						new UserInfo(0, null, null, null, null, 0, null, 0, null, null),
						new Orders(0, Date, null, 0, null) 
						);
				System.out.println(">>"+reviewDao.upadateReview(updateReview));
			
		/*		
				System.out.println(">>updateByReviewNo");
				Review updateReview = new Review( 9, "up.jpg", "씨이원한 맛!!", null, 5,
													new Product(0, null, 0, null, null,null),
													new UserInfo(0,null,null,null,null,0,null,0,null,null),
													new Orders(0, null, null, 0, null, null)
												);
				System.out.println(reviewDao.updateByReviewNo(updateReview));
				*/
		/*		
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
				*/
		
	}

}
