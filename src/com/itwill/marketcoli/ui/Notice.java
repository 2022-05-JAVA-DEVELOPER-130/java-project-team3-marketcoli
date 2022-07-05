package com.itwill.marketcoli.ui;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.ScrollPane;
import javax.swing.JScrollPane;
import java.awt.Panel;

public class Notice extends JPanel {

	/**
	 * Create the panel.
	 */
	public Notice() {
		setLayout(null);
		
		
		JPanel noticePanel = new JPanel();
		noticePanel.setBounds(0, 34, 390, 646);
		add(noticePanel);
		noticePanel.setLayout(null);
		noticePanel.setVisible(false);
		
		JPanel noticeList = new JPanel();
		noticeList.setBounds(0, 0, 390, 646);
		noticePanel.add(noticeList);
		noticeList.setLayout(null);
		
		JLabel noticeListDateLB1 = new JLabel("2022.07.05");
		noticeListDateLB1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		noticeListDateLB1.setBounds(308, 101, 82, 23);
		noticeList.add(noticeListDateLB1);
		
		JLabel noticeListDateLB2 = new JLabel("2022.07.05");
		noticeListDateLB2.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		noticeListDateLB2.setBounds(308, 31, 82, 23);
		noticeList.add(noticeListDateLB2);
		
		JLabel noticeListDateLB3 = new JLabel("2022.07.05");
		noticeListDateLB3.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		noticeListDateLB3.setBounds(308, 167, 82, 23);
		noticeList.add(noticeListDateLB3);
		
		JLabel noticeListDateLB4 = new JLabel("2022.07.05");
		noticeListDateLB4.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		noticeListDateLB4.setBounds(308, 236, 82, 23);
		noticeList.add(noticeListDateLB4);
		
		JButton noticeListBtn1 = new JButton("마켓콜리 배송안내");
		noticeListBtn1.setHorizontalAlignment(SwingConstants.LEFT);
		noticeListBtn1.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		noticeListBtn1.setBackground(Color.BLACK);
		noticeListBtn1.setBounds(0, 10, 390, 62);
		noticeList.add(noticeListBtn1);
		
		JButton noticeListBtn2 = new JButton("신규회원 이벤트");
		noticeListBtn2.setHorizontalAlignment(SwingConstants.LEFT);
		noticeListBtn2.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		noticeListBtn2.setBackground(Color.BLACK);
		noticeListBtn2.setBounds(0, 80, 390, 62);
		noticeList.add(noticeListBtn2);
		
		JButton noticeListBtn3 = new JButton("긴급 공지사항");
		noticeListBtn3.setHorizontalAlignment(SwingConstants.LEFT);
		noticeListBtn3.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		noticeListBtn3.setBackground(Color.BLACK);
		noticeListBtn3.setBounds(0, 147, 390, 62);
		noticeList.add(noticeListBtn3);
		
		JButton noticeListBtn4 = new JButton("경품추천 이벤트");
		noticeListBtn4.setHorizontalAlignment(SwingConstants.LEFT);
		noticeListBtn4.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		noticeListBtn4.setBackground(Color.BLACK);
		noticeListBtn4.setBounds(0, 216, 390, 62);
		noticeList.add(noticeListBtn4);
			
		JPanel notice1 = new JPanel();
		notice1.setBounds(0, 0, 390, 636);
		noticeList.add(notice1);
		notice1.setLayout(null);
		
		JButton notice1backBtn_1 = new JButton("이전화면");
		notice1backBtn_1.setBounds(0, 597, 389, 39);
		notice1.add(notice1backBtn_1);
		
		JPanel notice2 = new JPanel();
		notice2.setLayout(null);
		notice2.setBounds(0, 0, 390, 636);
		noticeList.add(notice2);
		
		JButton notice1backBtn_2 = new JButton("이전화면");
		notice1backBtn_2.setBounds(0, 597, 389, 39);
		notice2.add(notice1backBtn_2);
		
		JLabel noticeListMainLB_1 = new JLabel("공지사항");
		noticeListMainLB_1.setBounds(136, 10, 95, 23);
		add(noticeListMainLB_1);
		noticeListMainLB_1.setFont(new Font("맑은 고딕", Font.PLAIN, 20));

	}
}
