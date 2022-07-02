package com.itwill.marketcoli.김봉균;

import java.util.List;


public class UserInfoDaoTestMain {

	public static void main(String[] args) throws Exception {
		UserInfoDao userInfoDao = new UserInfoDao();
		/*
		//회원가입
		//VALUES (userinfo_u_no_seq.nextval, 'itwill1', '1111', '김첨지', 'a@www.a.com', '11111111111', '사랑시고백구행복동','19500625',null,sysdate);
		//User insertDao = new User(0, 'today', '0630', '오늘이, 'today@mail.com', '', null, 0, null, null)
		//아직 진행중
		
		System.out.println("1.insertUserInfo");
		// (수정)생성자 변경하여 사용
		UserInfo insertUserInfo = 
				new UserInfo(0, "today2", "0630", "오늘이", 
						"today@mail.com", 888888888, "하늘", 
						20220303, null, null);
		System.out.println(userInfoDao.insertUserInfo(insertUserInfo));
		
		
		 = "insert into userinfo(u_no, u_id, u_pw, u_name, u_email, u_phone, u_address, u_birth, u_job, u_joindate)\r\n"
				+ "VALUES (userinfo_u_no_seq.nextval, ?, ?, ?, ?, ?, ?, ?, ? , sysdate) ";
		 */
		
		//회원 탈퇴
		System.out.println("2.deleteUserInfo");
		System.out.println(userInfoDao.deleteUserInfo(1));
		/*
		//회원정보 수정
		System.out.println("3.updateUserInfo");
			// (수정)생성자 변경하여 사용
		UserInfo updateUserInfo = new UserInfo();
		System.out.println(userInfoDao.updateUserInfo(updateUserInfo));
		*/
		//회원 아이디 찾기
		System.out.println("4.selectByEmail");
		System.out.println(userInfoDao.selectByNo(3));
		
		//회원 아이디 찾기
		System.out.println("5.selectByEmailPw");
		System.out.println(userInfoDao.selectByNo(3));
		
		//회원정보찾기(관리자)
		System.out.println("6.selectAll");
		List<UserInfo> userInfoList = userInfoDao.selectAll();
		System.out.println(userInfoList);
		
		System.out.println("---for each사용---");
		for(UserInfo userinfo : userInfoList) {
			System.out.print(userinfo);
		}
		/*
			//회원번호로 출력(삭제해도 될거같음)
			System.out.println("7.selectByNo");
			System.out.println(UserInfoDao.selectByNo(3));
			
		
		
		*/
	}
}