package com.itwill.marketcoli.ui;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Notice1 extends JPanel {
	private JTextField notice1Content;
	private JTextField notice1Title;
	private JTextField notice1Date;

	/**
	 * Create the panel.
	 */
	public Notice1() {
		setLayout(null);
		
		notice1Content = new JTextField();
		notice1Content.setBounds(12, 154, 366, 477);
		add(notice1Content);
		notice1Content.setColumns(10);
		
		JButton notice1backBtn_1 = new JButton("이전화면");
		notice1backBtn_1.setBounds(0, 641, 389, 39);
		add(notice1backBtn_1);
		
		notice1Title = new JTextField();
		notice1Title.setBounds(12, 105, 366, 39);
		add(notice1Title);
		notice1Title.setColumns(10);
		
		notice1Date = new JTextField();
		notice1Date.setBounds(262, 74, 116, 21);
		add(notice1Date);
		notice1Date.setColumns(10);

	}
}
