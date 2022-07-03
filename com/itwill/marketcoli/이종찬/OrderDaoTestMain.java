package com.itwill.marketcoli.이종찬;

import java.util.List;

import com.itwill.marketcoli.dto.Orders;


public class OrderDaoTestMain {

   public static void main(String[] args) throws Exception {
      OrdersDao ordersDao = new OrdersDao();
   
      System.out.println("1.insert");
      /*
      Orders insertOrders = new Orders(0, null, null, 3000, null, 
    		  null, 
    		  null); 
      System.out.println(ordersDao.insertOrders(insertOrders));
      */
      System.out.println("2.update");
      /*
      Orders updateOrders = new Orders(0, null, null, 3000, null, 
    		  null, 
    		  null);
      System.out.println(ordersDao.updateOrders(updateOrders));
      */
      System.out.println("3.delete");
      System.out.println(ordersDao.deleteOrders(0));
    
      System.out.println("4.selectByno");
      Orders selectByno = ordersDao.selectByNo(1);
      System.out.println(selectByno);
      
      System.out.println("5.selectAll");
      List<Orders> ordersList = ordersDao.selectAll();
      for (Orders orders : ordersList) {   
      System.out.println(ordersList);
      } 
   	
   }
}