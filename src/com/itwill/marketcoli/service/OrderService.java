package com.itwill.marketcoli.service;

import java.util.ArrayList;
import java.util.List;

import com.itwill.marketcoli.dao.CartDao;
import com.itwill.marketcoli.dao.OrdersDao;
import com.itwill.marketcoli.dao.ProductDao;
import com.itwill.marketcoli.dto.Cart;
import com.itwill.marketcoli.dto.OrderItem;
import com.itwill.marketcoli.dto.Orders;
import com.itwill.marketcoli.dto.Product;
import com.itwill.marketcoli.dto.UserInfo;

public class OrderService {
	private OrdersDao orderDao;
	private ProductDao productDao;
	private CartDao cartDao;
	
	public OrderService() throws Exception{
		orderDao=new OrdersDao();
		productDao=new ProductDao();
		cartDao=new CartDao();
	}
	
	/*public List<OrderItem> showOrderListByOrderNo (int o_no) throws Exception {
		List<Orders> orderList = orderDao.selectAll();
		Orders orderListByOrderNo = null;
		for (Orders orders : orderList) {
			if(orders.getO_no() == o_no) {
				orderListByOrderNo = orders;
				break;
			}
		}
		
		List<OrderItem> orderItemList = null;
		
		for (int i = 0; i < orderListByOrderNo.getOrderItemList().size(); i++) {
			orderItemList.add(orderListByOrderNo.getOrderItemList().get(i));
		}
		return orderItemList;
	}
	*/
	
	
	//주문 1개 전체 삭제
	public int deleteOrderAllByOrderNo (int o_no) throws Exception {
		return orderDao.deleteOrdersByOrderNo(o_no);
	}
	
	//주문 넣기
	public int insertOrderOne (int p_no,int o_qty,String u_id ) throws Exception {
		ProductDao selectProduct = new ProductDao();
		Product product = selectProduct.selectByNo(p_no);
		ArrayList<OrderItem> orderItemList = new ArrayList<OrderItem>();
		orderItemList.add(new OrderItem(0, o_qty, 0, product));

		Orders insertOrder = new Orders(0, null, product.getP_price() * orderItemList.get(0).getOi_qty(),
				new UserInfo(0, u_id, null, null, null, null, null, 0, null, null), orderItemList);
		return orderDao.insertOrders(insertOrder);
	}
	
	//주문을 넣은 상태에서, 추가하는 경우를 하고 싶었으나,
	//동시에 2개를 주문을 넣는 경우
	public int addOrders (int p1_no, int o1_qty, int p2_no, int o2_qty, String u_id ) throws Exception {
		ProductDao selectProduct = new ProductDao();
		ArrayList<OrderItem> orderItemList = new ArrayList<OrderItem>();
		
		
		//총가격 계산		-> (확인 필요)메소드로 넣는 작업, SQL문을 추가하여 작업
		int totalPrice = 0;

		ArrayList<Product> productList = new ArrayList<Product>();

		Product product = selectProduct.selectByNo(p1_no);
		productList.add(product);
		orderItemList.add(new OrderItem(0, o1_qty, 0, product));
		
		product = selectProduct.selectByNo(p2_no);
		productList.add(product);
		
		orderItemList.add(new OrderItem(0, o2_qty, 0, product));
		
		for (int i = 0; i < orderItemList.size(); i++) {
			totalPrice += orderItemList.get(i).getOi_qty()*productList.get(i).getP_price();
		}
		
		Orders insertOrder = new Orders(0, null, totalPrice,
				new UserInfo(0, u_id, null, null, null, null, null, 0, null, null), orderItemList);

		// (확인 완료)order_item 테이블 - insert order_item이 안되는 상태 -> excuteQuery가 주석처리
		return orderDao.insertOrders(insertOrder);

	}
	
	
	//cart에서 주문 -> cart에서 Order로 옮겨닮기
	
	public int cartToOrder (int c_no) throws Exception {
		
		ArrayList<Cart> cartList = new ArrayList<Cart>();
		cartList = cartDao.selectAll(c_no);
		
		ArrayList<Orders> orderList = new ArrayList<Orders>();
		
		//for
		
		return 0;
	}
	
	
	
	

}