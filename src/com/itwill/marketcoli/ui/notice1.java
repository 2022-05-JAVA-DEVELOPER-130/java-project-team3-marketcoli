package com.itwill.marketcoli.ui;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class notice1 extends JPanel {
	private JTextField notice1content;
	private JTextField notice1Title;
	private JTextField notice1date;

	/**
	 * Create the panel.
	 */
	public notice1() {
		setLayout(null);
		
		notice1content = new JTextField();
		notice1content.setBounds(12, 154, 366, 477);
		add(notice1content);
		notice1content.setColumns(10);
		
		JButton notice1backBtn_1 = new JButton("이전화면");
		notice1backBtn_1.setBounds(0, 641, 389, 39);
		add(notice1backBtn_1);
		
		notice1Title = new JTextField();
		notice1Title.setBounds(12, 105, 366, 39);
		add(notice1Title);
		notice1Title.setColumns(10);
		
		notice1date = new JTextField();
		notice1date.setBounds(262, 74, 116, 21);
		add(notice1date);
		notice1date.setColumns(10);

	}
}
