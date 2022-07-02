package com.itwill.marketcoli.이종찬;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class OrdersDao {
   private DataSource dataSource;

   public OrdersDao() {
      dataSource = new DataSource();
   }

   public int insertOrders(Orders orders) throws Exception {
      Connection con = dataSource.getConnection();
      PreparedStatement pstmt = con.prepareStatement(OrdersSQL.ORDERS_INSERT);
      
      pstmt.setString(1, orders.getO_state());
      pstmt.setInt(2, orders.getUserInfo().getU_phone());
      pstmt.setString(3, orders.getUserInfo().getU_address());
      pstmt.setInt(4, orders.getO_no());
      pstmt.setInt(5, orders.getD_fee());
      pstmt.setString(6, orders.getD_memo());
      pstmt.setInt(7, orders.getProduct().getP_piece()); //Product p_piece 추가 필요
      pstmt.setInt(8, orders.getProduct().getP_price());
      pstmt.setString(9, orders.getProduct().getP_name());

      int rowCount = pstmt.executeUpdate();
      pstmt.close();
      con.close();
      return rowCount;

   }

   // pk를 통해 삭제
   public int deleteOrders(int o_no) throws Exception {
      Connection con = dataSource.getConnection();
      PreparedStatement pstmt = con.prepareStatement(OrdersSQL.ORDERS_DELETE);

      pstmt.setInt(1, o_no);
      
      int rowCount = pstmt.executeUpdate();
      pstmt.close();
      con.close();
      return rowCount;

   }

   public int updateOrders(Orders orders) throws Exception {
      Connection con = this.dataSource.getConnection();
      PreparedStatement pstmt = con.prepareStatement(OrdersSQL.ORDERS_UPDATE);
      
      pstmt.setString(1, orders.getO_state());
      pstmt.setInt(2, orders.getUserInfo().getU_phone());
      pstmt.setString(3, orders.getUserInfo().getU_address());
      pstmt.setInt(4, orders.getO_no());
      pstmt.setInt(5, orders.getD_fee());
      pstmt.setString(6, orders.getD_memo());
      pstmt.setInt(7, orders.getProduct().getP_piece());  //Product p_piece 추가 필요
      pstmt.setInt(8, orders.getProduct().getP_price());
      pstmt.setString(9, orders.getProduct().getP_name());

      int rowCount = pstmt.executeUpdate();
      pstmt.close();
      con.close();

      return rowCount;
   }

   public Orders selectByNo(int o_no) throws Exception {
      Orders findOrders = null;
      Connection con = this.dataSource.getConnection();
      
      PreparedStatement pstmt = con.prepareStatement(OrdersSQL.ORDERS_SELECT_BY_NO);
      pstmt.setInt(1, o_no);
      ResultSet rs = pstmt.executeQuery();
      
      if (rs.next()) {
    	  findOrders = new Orders(rs.getInt("o_no"), 
                  				  rs.getDate("o_date"), /* sql.date는 상위(util.date)로 자동캐스팅 */
                  				  rs.getString("o_state"), 
                  				  rs.getInt("d_fee"), 
                  				  rs.getString("d_memo"),
                  				  new UserInfo(0, null, null, null, null, rs.getInt("u_phone"), rs.getString("u_address"), 0, null,null),
                  				  new Product(0, rs.getString("p_name"), rs.getInt("p_price"), null, null, null));
}

      rs.close();
      pstmt.close();
      con.close();
      return findOrders;

   }

   public List<Orders> selectAll() throws Exception {
         // String selectAllSql = "select * from guest";
         List<Orders> ordersList = new ArrayList<Orders>();

         Connection con = this.dataSource.getConnection();
         PreparedStatement pstmt = con.prepareStatement(OrdersSQL.ORDERS_SELECT_ALL);
         ResultSet rs = pstmt.executeQuery();

         while (rs.next()) {
          ordersList.add(new Orders(rs.getInt("o_no"), 
  				  					rs.getDate("o_date"), /* sql.date는 상위(util.date)로 자동캐스팅 */
  				  					rs.getString("o_state"), 
  				  					rs.getInt("d_fee"), 
  				  					rs.getString("d_memo"),
  				  					new UserInfo(0, null, null, null, null, rs.getInt("u_phone"), rs.getString("u_address"), 0, null,null),
  				  					new Product(0, rs.getString("p_name"), rs.getInt("p_price"), null, null, null)));
       }
         
         rs.close();
         pstmt.close();
         con.close();

         return ordersList;
         
         
         
      }
}