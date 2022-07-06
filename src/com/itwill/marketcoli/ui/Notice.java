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
		noticePanel.setBounds(0, 77, 390, 603);
		add(noticePanel);
		noticePanel.setLayout(null);
		noticePanel.setVisible(false);
		
		JButton noticeListBtn1_1 = new JButton("마켓콜리 배송안내");
		noticeListBtn1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		noticeListBtn1_1.setHorizontalAlignment(SwingConstants.LEFT);
		noticeListBtn1_1.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		noticeListBtn1_1.setBackground(Color.BLACK);
		noticeListBtn1_1.setBounds(0, 10, 390, 62);
		noticePanel.add(noticeListBtn1_1);
		
		JButton noticeListBtn2_1 = new JButton("신규회원 이벤트");
		noticeListBtn2_1.setHorizontalAlignment(SwingConstants.LEFT);
		noticeListBtn2_1.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		noticeListBtn2_1.setBackground(Color.BLACK);
		noticeListBtn2_1.setBounds(0, 79, 390, 62);
		noticePanel.add(noticeListBtn2_1);
		
		JButton noticeListBtn3_1 = new JButton("긴급 공지사항");
		noticeListBtn3_1.setHorizontalAlignment(SwingConstants.LEFT);
		noticeListBtn3_1.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		noticeListBtn3_1.setBackground(Color.BLACK);
		noticeListBtn3_1.setBounds(0, 147, 390, 62);
		noticePanel.add(noticeListBtn3_1);
		
		JButton noticeListBtn4_1 = new JButton("경품추천 이벤트");
		noticeListBtn4_1.setHorizontalAlignment(SwingConstants.LEFT);
		noticeListBtn4_1.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		noticeListBtn4_1.setBackground(Color.BLACK);
		noticeListBtn4_1.setBounds(0, 215, 390, 62);
		noticePanel.add(noticeListBtn4_1);

	}
}
