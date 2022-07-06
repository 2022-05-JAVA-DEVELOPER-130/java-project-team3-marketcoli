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

public class NoticeList extends JPanel {

	/**
	 * Create the panel.
	 */
	public NoticeList() {
		setLayout(null);
	Notice1 notice1 = new Notice1();
		
		JPanel noticePanel = new JPanel();
		noticePanel.setBounds(0, 77, 390, 603);
		add(noticePanel);
		noticePanel.setLayout(null);
		noticePanel.setVisible(false);
		
		JButton noticeListBtn1 = new JButton("배송지연 안내");
		noticeListBtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		noticeListBtn1.setHorizontalAlignment(SwingConstants.LEFT);
		noticeListBtn1.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		noticeListBtn1.setBackground(Color.BLACK);
		noticeListBtn1.setBounds(0, 10, 390, 62);
		noticePanel.add(noticeListBtn1);
		
		JButton noticeListBtn2 = new JButton("신규회원 이벤트");
		noticeListBtn2.setHorizontalAlignment(SwingConstants.LEFT);
		noticeListBtn2.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		noticeListBtn2.setBackground(Color.BLACK);
		noticeListBtn2.setBounds(0, 79, 390, 62);
		noticePanel.add(noticeListBtn2);
		
		JButton noticeListBtn3 = new JButton("긴급 공지사항");
		noticeListBtn3.setHorizontalAlignment(SwingConstants.LEFT);
		noticeListBtn3.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		noticeListBtn3.setBackground(Color.BLACK);
		noticeListBtn3.setBounds(0, 147, 390, 62);
		noticePanel.add(noticeListBtn3);
		
		JButton noticeListBtn4 = new JButton("경품추천 이벤트");
		noticeListBtn4.setHorizontalAlignment(SwingConstants.LEFT);
		noticeListBtn4.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		noticeListBtn4.setBackground(Color.BLACK);
		noticeListBtn4.setBounds(0, 215, 390, 62);
		noticePanel.add(noticeListBtn4);

	}
}
