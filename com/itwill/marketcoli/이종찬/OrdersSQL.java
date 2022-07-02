package com.itwill.marketcoli.이종찬;

public class OrdersSQL {

   //SQL 문장을 채워서 사용하세요
   
   public static final String ORDERS_INSERT
                        = "insert into orders(o_no,o_date,o_state,u_name,u_phone,u_address,u_no,p_no,d_fee,d_memo,p_piece,p_price,p_name) values(orders_o_no_seq.nextval,sysdate,?,?,?,?,?,?,?,?,?,?,?) " ;
   
   public static final String ORDERS_UPDATE 
                        = "update orders set p_piece =? where u_no ? ";
   
   public static final String ORDERS_DELETE 
                        = "delete from orders where u_no=? ";
   
   public static final String ORDERS_SELECT_BY_NO 
                        = "select * from orders where u_no=? ";
   
   public static final String ORDERS_SELECT_ALL 
                        = "select * from oders";
}
