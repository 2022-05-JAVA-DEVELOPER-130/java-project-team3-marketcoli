package com.itwill.marketcoli.dao;

import java.util.ArrayList;
import java.util.List;

import com.itwill.marketcoli.common.DataSource;
import com.itwill.marketcoli.dto.Cart;

public class CartDao {
	private DataSource dataSource;

	public CartDao() {
		dataSource = new DataSource();
	}

	public int insertCart(Cart cart) throws Exception {
		return 0;
	}

	// pk를 통해 삭제
	public int deleteCart(int c_no) throws Exception {
		return 0;

	}

	public int updateCart(Cart cart) throws Exception {

		return 0;
	}

	public Cart selectByNo(int c_no) throws Exception {
		Cart findCart = new Cart();
		
		return findCart;
	}

	public List<Cart> selectAll() throws Exception {

		List<Cart> cartList = new ArrayList<Cart>();
		return cartList;
	}
}
