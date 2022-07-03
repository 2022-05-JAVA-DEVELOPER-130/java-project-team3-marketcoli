package com.itwill.marketcoli.최서영;

public class OrdersOrdersDetailSQL {	
	//공지사항 입력 - 관리자
	public static final String NOTICE_INSERT=
			"insert into notice(n_no, n_title, n_date, n_content)"
			+ "VALUES(notice_n_no_seq.nextval,"
			+ "                         ?,"
			+ "                         sysdate,"
			+ "                         ?)";


	public static final String NOTICE_UPDATE=
			"update notice set n_title = ?,"
					+ "                    n_date = sysdate,"
					+ "                    n_content = ?"
					+ "                    where n_no = ?";
	public static final String NOTICE_DELETE=
			"delete notice where n_no = ?";
	
	public static final String NOTICE_SELECT_BY_NO=
			"select * from notice where n_no=?";
	
	public static final String NOTICE_SELECT_ALL=
			"select * from notice";
	

}
