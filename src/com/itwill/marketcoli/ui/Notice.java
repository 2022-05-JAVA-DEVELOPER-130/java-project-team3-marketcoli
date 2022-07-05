package com.itwill.marketcoli.ui;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JSeparator;

public class Notice extends JPanel {

	/**
	 * Create the panel.
	 */
	public Notice() {
		setLayout(null);
		
		JLabel NoticeLB = new JLabel("공지사항");
		NoticeLB.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		NoticeLB.setBounds(145, 29, 77, 23);
		add(NoticeLB);
		
		JLabel NoticeListTitleLB1 = new JLabel("마켓콜리 배송 안내");
		NoticeListTitleLB1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		NoticeListTitleLB1.setBounds(12, 91, 241, 30);
		add(NoticeListTitleLB1);
		
		JLabel NoticeListDateLB1 = new JLabel("2022.07.05");
		NoticeListDateLB1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		NoticeListDateLB1.setBounds(308, 96, 82, 23);
		add(NoticeListDateLB1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 137, 390, 4);
		add(separator);
		
		JLabel NoticeListTitleLB2 = new JLabel("신규회원 이벤트");
		NoticeListTitleLB2.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		NoticeListTitleLB2.setBounds(12, 151, 241, 30);
		add(NoticeListTitleLB2);
		
		JLabel NoticeListDateLB2 = new JLabel("2022.07.05");
		NoticeListDateLB2.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		NoticeListDateLB2.setBounds(308, 156, 82, 23);
		add(NoticeListDateLB2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 198, 390, 4);
		add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 79, 390, 2);
		add(separator_2);
		
		JLabel NoticeListTitleLB3 = new JLabel("긴급 공지사항");
		NoticeListTitleLB3.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		NoticeListTitleLB3.setBounds(12, 212, 241, 30);
		add(NoticeListTitleLB3);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(0, 259, 390, 4);
		add(separator_1_1);
		
		JLabel NoticeListDateLB3 = new JLabel("2022.07.05");
		NoticeListDateLB3.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		NoticeListDateLB3.setBounds(308, 217, 82, 23);
		add(NoticeListDateLB3);
		
		JLabel NoticeListTitleLB4 = new JLabel("경품 추천 이벤트");
		NoticeListTitleLB4.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		NoticeListTitleLB4.setBounds(12, 273, 241, 30);
		add(NoticeListTitleLB4);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBounds(0, 320, 390, 4);
		add(separator_1_1_1);
		
		JLabel NoticeListDateLB4 = new JLabel("2022.07.05");
		NoticeListDateLB4.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		NoticeListDateLB4.setBounds(308, 278, 82, 23);
		add(NoticeListDateLB4);

	}
}
