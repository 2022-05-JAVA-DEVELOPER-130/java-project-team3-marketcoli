package com.itwill.marketcoli.ui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JToggleButton;
import javax.swing.JTree;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class orders extends javax.swing.JPanel {
	private JTextField userinfoTF;
	private JTextField destinationTF;
	private JTextField detailInfoTF;
	private JTextField productListTF;

	/**
	 * Create the panel.
	 */
	public orders() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("주 문 상 품 : ");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(38, 44, 88, 15);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("주문자 정보 : ");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(38, 86, 88, 15);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("배 송 지 : ");
		lblNewLabel_2.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(38, 128, 88, 15);
		add(lblNewLabel_2);
		
		userinfoTF = new JTextField();
		userinfoTF.setBounds(138, 83, 171, 21);
		add(userinfoTF);
		userinfoTF.setColumns(10);
		
		destinationTF = new JTextField();
		destinationTF.setBounds(138, 125, 171, 21);
		add(destinationTF);
		destinationTF.setColumns(10);
		
		detailInfoTF = new JTextField();
		detailInfoTF.setBounds(138, 167, 171, 21);
		add(detailInfoTF);
		detailInfoTF.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("상세 정보 입력 :");
		lblNewLabel_3.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(38, 170, 88, 15);
		add(lblNewLabel_3);
		
		productListTF = new JTextField();
		productListTF.setForeground(new Color(0, 0, 0));
		productListTF.setBounds(138, 41, 171, 21);
		add(productListTF);
		productListTF.setColumns(10);
		
		JButton orderBtn = new JButton("주  문  하  기");
		orderBtn.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		orderBtn.setBackground(new Color(147, 112, 219));
		orderBtn.setBounds(38, 613, 310, 31);
		add(orderBtn);
		
		JLabel lblNewLabel_4 = new JLabel("최종 결제 금액");
		lblNewLabel_4.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_4.setBounds(58, 535, 111, 23);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("결 제 금 액");
		lblNewLabel_5.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(38, 379, 88, 15);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("┖ 상품금액");
		lblNewLabel_6.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(58, 428, 79, 15);
		add(lblNewLabel_6);
		
		JLabel lblNewLabel_5_1 = new JLabel("주 문 금 액");
		lblNewLabel_5_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1.setBounds(38, 403, 88, 15);
		add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("┖ 할인금액");
		lblNewLabel_6_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_6_1.setBounds(58, 453, 79, 15);
		add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("배  송  비");
		lblNewLabel_5_1_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_5_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1_1.setBounds(38, 478, 88, 15);
		add(lblNewLabel_5_1_1);
		
		JLabel orderFinalPriceLB = new JLabel("0");
		orderFinalPriceLB.setHorizontalAlignment(SwingConstants.RIGHT);
		orderFinalPriceLB.setBounds(222, 380, 57, 15);
		add(orderFinalPriceLB);
		
		JLabel orderPriceLB = new JLabel("0");
		orderPriceLB.setHorizontalAlignment(SwingConstants.RIGHT);
		orderPriceLB.setBounds(222, 405, 57, 15);
		add(orderPriceLB);
		
		JLabel p_PriceLB = new JLabel("0");
		p_PriceLB.setHorizontalAlignment(SwingConstants.RIGHT);
		p_PriceLB.setBounds(222, 430, 57, 15);
		add(p_PriceLB);
		
		JLabel discount_FeeLB = new JLabel("0");
		discount_FeeLB.setHorizontalAlignment(SwingConstants.RIGHT);
		discount_FeeLB.setBounds(222, 455, 57, 15);
		add(discount_FeeLB);
		
		JLabel d_FeeLB = new JLabel("0");
		d_FeeLB.setHorizontalAlignment(SwingConstants.RIGHT);
		d_FeeLB.setBounds(222, 480, 57, 15);
		add(d_FeeLB);
		
		JLabel lblNewLabel_5_2 = new JLabel("결 제 수 단");
		lblNewLabel_5_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		lblNewLabel_5_2.setBounds(38, 229, 88, 15);
		add(lblNewLabel_5_2);
		
		JLabel won5 = new JLabel("원");
		won5.setBounds(291, 480, 57, 15);
		add(won5);
		
		JLabel won4 = new JLabel("원");
		won4.setBounds(291, 455, 57, 15);
		add(won4);
		
		JLabel won3 = new JLabel("원");
		won3.setBounds(291, 430, 57, 15);
		add(won3);
		
		JLabel won2 = new JLabel("원");
		won2.setBounds(291, 405, 57, 15);
		add(won2);
		
		JLabel won1 = new JLabel("원");
		won1.setBounds(291, 380, 57, 15);
		add(won1);
		
		JLabel won6 = new JLabel("원");
		won6.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		won6.setHorizontalAlignment(SwingConstants.LEFT);
		won6.setBounds(291, 534, 57, 24);
		add(won6);
		
		JLabel orderTotalPriceLB = new JLabel("0");
		orderTotalPriceLB.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		orderTotalPriceLB.setHorizontalAlignment(SwingConstants.RIGHT);
		orderTotalPriceLB.setBounds(222, 536, 57, 21);
		add(orderTotalPriceLB);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("신용 카드");
		rdbtnNewRadioButton.setBounds(56, 266, 93, 23);
		add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("간편 결제");
		rdbtnNewRadioButton_1.setBounds(56, 300, 93, 23);
		add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("계좌 이체");
		rdbtnNewRadioButton_2.setBounds(216, 266, 93, 23);
		add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_2_1 = new JRadioButton("휴대폰 결제");
		rdbtnNewRadioButton_2_1.setBounds(216, 300, 93, 23);
		add(rdbtnNewRadioButton_2_1);
		
		JCheckBox agreeCHK = new JCheckBox("결제 진행 필수 동의");
		agreeCHK.setBounds(68, 578, 139, 23);
		add(agreeCHK);
		

	}
}