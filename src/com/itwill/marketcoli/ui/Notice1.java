package com.itwill.marketcoli.ui;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class Notice1 extends JPanel {
	private JTextField notice1Title;
	private JTextField notice1Date;

	/**
	 * Create the panel.
	 */
	public Notice1() {
		setToolTipText("");
		setLayout(null);
		
		JButton notice1BackBtn_1 = new JButton("이전화면");
		notice1BackBtn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		notice1BackBtn_1.setBounds(0, 641, 389, 39);
		add(notice1BackBtn_1);
		
		notice1Title = new JTextField();
		notice1Title.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		notice1Title.setText("배송지연 안내");
		notice1Title.setBounds(12, 105, 366, 39);
		add(notice1Title);
		notice1Title.setColumns(10);
		
		notice1Date = new JTextField();
		notice1Date.setText("작성날짜");
		notice1Date.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		notice1Date.setBounds(262, 74, 116, 21);
		add(notice1Date);
		notice1Date.setColumns(10);
		
		JTextPane notice1Content = new JTextPane();
		notice1Content.setText("안녕하세요! 마켓콜리 입니다. 마켓콜리를 사랑해주시고 아껴주신 고객님께 진심으로 감사드립니다. 현재 코로나 때문에 배송 많이 밀림 기다리셈.");
		notice1Content.setToolTipText("");
		notice1Content.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		notice1Content.setBounds(12, 155, 366, 476);
		add(notice1Content);

	}
}
