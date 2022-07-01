package com.itwill.marketcoli.test;

import java.util.List;

import com.itwill.marketcoli.dao.UserDao;
import com.itwill.marketcoli.dto.User;

public class UserDaoTestMain {

	public static void main(String[] args) throws Exception {

		UserDao userDao= new UserDao();
		//VALUES (userinfo_u_no_seq.nextval, 'itwill1', '1111', '김첨지', 'a@www.a.com', '11111111111', '사랑시고백구행복동','19500625',null,sysdate);
		//User insertDao = new User(0, 'today', '0630', '오늘이, 'today@nail.com', '', null, 0, null, null)
		//아직 진행줒ㅇ
		
		System.out.println("1.insertUser");
		// (수정)생성자 변경하여 사용
		User insertUser = new User(0, "today2", "0630", "오늘이", "today@nail.com", 888888888, "하늘", 20220303, null, null);
		System.out.println(userDao.insertUser(insertUser));

		/*
		 * = "insert into userinfo(u_no, u_id, u_pw, u_name, u_email, u_phone, u_address, u_birth, u_job, u_joindate)\r\n"
				+ "VALUES (userinfo_u_no_seq.nextval, ?, ?, ?, ?, ?, ?, ?, ? , sysdate) ";
		 * 
		System.out.println("2.deleteUser");
		System.out.println(userDao.deleteUser(5));

		System.out.println("3.updateUser");
			// (수정)생성자 변경하여 사용
		User updateUser = new User();
		System.out.println(userDao.updateUser(updateUser));

		System.out.println("4.selectByNo");
		System.out.println(userDao.selectByNo(3));

		System.out.println("5.selectAll");
		List<User> userList = userDao.selectAll();
		System.out.println(userList);
		
		System.out.println("---for each사용---");
		for(User user : userList) {
			System.out.print(user);
		*/
		}
		
		
		
	}

