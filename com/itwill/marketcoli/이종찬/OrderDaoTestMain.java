package com.itwill.marketcoli.이종찬;

import java.util.List;

import com.itwill.marketcoli.dto.Orders;

public class OrderDaoTestMain {

   public static void main(String[] args) throws Exception {
      OrdersDao ordersDao = new OrdersDao();
      
      System.out.println("1.insert");
      Orders insertOrders = new Orders();
      System.out.println(">>insert row count:"+ordersDao.insertOrders(null));
      
      System.out.println("2.delete");
      System.out.println(">>delete row count:"+ordersDao.deleteOrders(1));
      
      System.out.println("3.update");
      Orders updateOrders = new Orders();
      System.out.println(">>update row count"+ordersDao.updateOrders(null));
      
      System.out.println("4.selectByno");
      Orders findOrders = ordersDao.selectByNo(1);
      System.out.println(findOrders);
      
      System.out.println("5.selectAll");
      List<Orders> ordersList = ordersDao.selectAll();
      for (Orders orders : ordersList) {
         System.out.println(orders);
         
      }
   }

}