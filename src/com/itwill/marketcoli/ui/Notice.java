package com.itwill.marketcoli.ui;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.ScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Notice extends JPanel {
	private JTable noticeTable;

	/**
	 * Create the panel.
	 */
	public Notice() {
		setLayout(null);
		
		JLabel noticeListMainLB = new JLabel("공지사항");
		noticeListMainLB.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		noticeListMainLB.setBounds(146, 29, 77, 23);
		add(noticeListMainLB);
		
		noticeTable = new JTable();
		noticeTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"\uACF5\uC9C0\uC0AC\uD56D", "\uC791\uC131\uC77C\uC790"
			}
		));
		noticeTable.setBounds(12, 605, 366, -461);
		add(noticeTable);

	}
}
