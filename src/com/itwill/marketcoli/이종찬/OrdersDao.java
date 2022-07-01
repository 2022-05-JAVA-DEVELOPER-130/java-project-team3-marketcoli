package com.itwill.marketcoli.이종찬;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.itwill.marketcoli.common.DataSource;
import com.itwill.marketcoli.dto.Orders;

public class OrdersDao {
   private DataSource dataSource;
   
   public OrdersDao() {
      dataSource = new DataSource();
   }
   
   public int insertOrders(Orders orders) throws Exception {
      Connection con = dataSource.getConnection();
      // prepared는 일반statement에 비해 준비된 pipe!
      PreparedStatement pstmt = con.prepareStatement(OrdersSQL.ORDERS_INSERT);
      /*   
      private int o_no;         //주문번호 - pk, 변경불가
      private Date o_date;      //주문일시 - 변경불가
      private String o_state;      //주문상태
      private String u_name;      //회원이름 - 변경불가
      private int u_phone;      //휴대폰번호
      private String u_address;   //주소
      private int u_no;         //회원번호 - 변경불가
      private int o_no;         //상품번호
      private int d_fee;         //배송비
      private String d_memo;      //배송메모
      private int o_piece;      //상품수량
      private int o_price;      //상품가격
      private Sting o_name;      //상품이름
   */
      pstmt.setInt(1,orders.getO_no());
      
      // (참고)
      //pstmt.setString(1, user.getU_name());
      /*********** 내용 입력 필요합니다 *********************/
      pstmt.setString(1, orders.getO_state());
      pstmt.setInt(2, orders.getUserInfo().getU_phone());
      pstmt.setString(3, orders.getUserInfo().getU_address());
      pstmt.setInt(4, orders.getO_no());
      pstmt.setInt(5, orders.getD_fee());
      pstmt.setString(6, orders.getProduct().d_memo());//?????D_memo가 없어용
      pstmt.setInt(7, orders.getOrderdetail().getP_piece());
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
         /*   
            private int o_no;         //주문번호 - pk, 변경불가
            private Date o_date;      //주문일시 - 변경불가
            private String o_state;      //주문상태
            private String u_name;      //회원이름 - 변경불가
            private int u_phone;      //휴대폰번호
            private String u_address;   //주소
            private int u_no;         //회원번호 - 변경불가
            private int o_no;         //상품번호
            private int d_fee;         //배송비
            private String d_memo;      //배송메모
            private int o_piece;      //상품수량
            private int o_price;      //상품가격
            private Sting o_name;      //상품이름
         */
         pstmt.setString(1, orders.getO_state());
         pstmt.setInt(2, orders.getUserInfo().getU_phone());
         pstmt.setString(3, orders.getUserInfo().getU_address());
         pstmt.setInt(4, orders.getO_no());
         pstmt.setInt(5, orders.getD_fee());
         pstmt.setString(6, orders.getProduct().getD_memo());  //?????D_memo가 없어용
         pstmt.setInt(7, orders.getOrderdetail().getP_piece());
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
            /*   
            private int o_no;         //주문번호 - pk, 변경불가
            private Date o_date;      //주문일시 - 변경불가
            private String o_state;      //주문상태
            private String u_name;      //회원이름 - 변경불가
            private int u_phone;      //휴대폰번호
            private String u_address;   //주소
            private int u_no;         //회원번호 - 변경불가
            private int o_no;         //상품번호
            private int d_fee;         //배송비
            private String d_memo;      //배송메모
            private int o_piece;      //상품수량
            private int o_price;      //상품가격
            private Sting o_name;         //상품이름
         */

            findOrders = new Orders(rs.getInt("o_no"),
                              rs.getDate("o_date"),/*sql.date는 상위(util.date)로 자동캐스팅*/
                              rs.getString("o_state"),
                              rs.getString("u_name"),
                              rs.getInt("u_phone"),
                              rs.getString("u_address"),
                              rs.getInt("u_no"),
                              rs.getInt("o_no"),
                              rs.getInt("d_fee"),
                              rs.getString("d_memo"),
                              rs.getInt("o_piece"),
                              rs.getInt("o_price"),
                              rs.getString("o_name")
                              );
            
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
            /*   
            private int o_no;         //주문번호 - pk, 변경불가
            private Date o_date;      //주문일시 - 변경불가
            private String o_state;      //주문상태
            private String u_name;      //회원이름 - 변경불가
            private int u_phone;      //휴대폰번호
            private String u_address;   //주소
            private int u_no;         //회원번호 - 변경불가
            private int o_no;         //상품번호
            private int d_fee;         //배송비
            private String d_memo;      //배송메모
            private int o_piece;      //상품수량
            private int o_price;      //상품가격
            private Sting o_name;         //상품이름
             */

                     ordersList.add(new Orders(rs.getInt("o_no"),
                                          rs.getDate("o_date"),
                                          rs.getString("o_state"),
                                          rs.getString("u_name"),
                                          rs.getInt("u_phone"),
                                          rs.getString("u_address"),
                                          rs.getInt("u_no"),
                                          rs.getInt("o_no"),
                                          rs.getInt("d_fee"),
                                          rs.getString("d_memo"),
                                          rs.getInt("o_piece"),
                                          rs.getInt("o_price"),
                                          rs.getString("o_name")));
         }
         rs.close();
         pstmt.close();
         con.close();

         return ordersList;
         
         
         
      }
}