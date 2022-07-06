package com.itwill.marketcoli.ui;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;

public class ProductListPanel extends JPanel {
	private JPanel panel_4;
	private JPanel panel_2;
	private JScrollPane scrollPane;
	private JPanel panel;
	private JTabbedPane tabbedPane;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel;
	private JPanel panel_1;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;

	/**
	 * Create the panel.
	 */
	public ProductListPanel() {
		setLayout(new BorderLayout(390, 680));
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		add(tabbedPane, BorderLayout.CENTER);
		
		panel = new JPanel();
		tabbedPane.addTab("전체상품보기", null, panel, null);
		panel.setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		panel.add(scrollPane, BorderLayout.CENTER);
		
		panel_2 = new JPanel();
		panel_2.setPreferredSize(new Dimension(10, 800));
		scrollPane.setViewportView(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		panel_4 = new JPanel();
		panel_4.setBackground(new Color(230, 230, 250));
		panel_4.setPreferredSize(new Dimension(390, 155));
		panel_2.add(panel_4);
		panel_4.setLayout(null);
		
		lblNewLabel = new JLabel("사진");
		lblNewLabel.setBounds(12, 10, 135, 135);
		panel_4.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("상품명");
		lblNewLabel_1.setBounds(159, 10, 219, 15);
		panel_4.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("상품가격");
		lblNewLabel_2.setBounds(159, 50, 219, 15);
		panel_4.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("상품설명");
		lblNewLabel_3.setBounds(159, 85, 219, 60);
		panel_4.add(lblNewLabel_3);
		
		panel_1 = new JPanel();
		tabbedPane.addTab("상세페이지", null, panel_1, null);
		panel_1.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(12, 10, 310, 310);
		panel_1.add(panel_3);
		
		lblNewLabel_4 = new JLabel("상품명");
		lblNewLabel_4.setBounds(12, 352, 57, 15);
		panel_1.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(81, 352, 241, 15);
		panel_1.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("상품가격");
		lblNewLabel_6.setBounds(12, 390, 57, 15);
		panel_1.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setBounds(81, 390, 241, 15);
		panel_1.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("상품설명");
		lblNewLabel_8.setBounds(12, 430, 57, 15);
		panel_1.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setBounds(81, 430, 241, 15);
		panel_1.add(lblNewLabel_9);

	}
}
