package com.itwill.marketcoli.ui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import com.itwill.marketcoli.dto.Cart;
import com.itwill.marketcoli.dto.UserInfo;
import com.itwill.marketcoli.service.CartService;
import com.itwill.marketcoli.service.UserInfoService;
import com.itwill.marketcoli.test.UserinfoServiceTestMain;

import javax.swing.JTextField;
import javax.swing.JEditorPane;
import java.awt.Color;
import java.awt.Font;
import java.util.List;
import java.util.Vector;

import javax.swing.JToggleButton;
import javax.swing.JTree;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class orders extends javax.swing.JPanel {
	
	private UserInfoService userInfoService = new UserInfoService();
	
	private JTextField userinfoTF;
	private JTextField destinationTF;
	private JTextField detailInfoTF;
	private JTextField productListTF;
	private JButton orderBtn;
	private JLabel orderFinalPriceLB;
	private JLabel orderPriceLB;
	private JLabel p_PriceLB;
	private JLabel d_FeeLB;
	private JLabel orderTotalPriceLB;
	private JLabel discount_FeeLB;
	private JTextField phoneTF;

	/**
	 * Create the panel.
	 */
	public orders() throws Exception{
		setLayout(null);
		
		try {
			UserInfo userInfo = userInfoService.selectByNo(3);
			String name = userInfo.getU_name();
			String phone = userInfo.getU_phone();
			String address = userInfo.getU_address();
			
			
		
			JLabel text1 = new JLabel("주 문 상 품");
			text1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
			text1.setHorizontalAlignment(SwingConstants.CENTER);
			text1.setBounds(38, 44, 88, 15);
			add(text1);
			
			JLabel text2 = new JLabel("주문자 정보");
			text2.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
			text2.setHorizontalAlignment(SwingConstants.CENTER);
			text2.setBounds(38, 72, 88, 15);
			add(text2);
			
			JLabel text4 = new JLabel("배 송 지");
			text4.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
			text4.setHorizontalAlignment(SwingConstants.CENTER);
			text4.setBounds(38, 134, 88, 15);
			add(text4);
			
			
			userinfoTF = new JTextField();
			userinfoTF.setBounds(138, 69, 171, 21);
			add(userinfoTF);
			userinfoTF.setColumns(10);
			userinfoTF.setText(name);
			
			
			destinationTF = new JTextField();
			destinationTF.setBounds(138, 131, 171, 21);
			add(destinationTF);
			destinationTF.setColumns(10);
			destinationTF.setText(address);
			
			detailInfoTF = new JTextField();
			detailInfoTF.setBounds(138, 162, 171, 21);
			add(detailInfoTF);
			detailInfoTF.setColumns(10);
			
			JLabel text5 = new JLabel("상세 정보 입력");
			text5.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
			text5.setHorizontalAlignment(SwingConstants.CENTER);
			text5.setBounds(38, 165, 88, 15);
			add(text5);
			
			productListTF = new JTextField();
			productListTF.setForeground(new Color(0, 0, 0));
			productListTF.setBounds(138, 41, 171, 21);
			add(productListTF);
			productListTF.setColumns(10);
			productListTF.setText("사과 외 3종");
			
			orderBtn = new JButton("주  문  하  기");
			orderBtn.setFont(new Font("맑은 고딕", Font.BOLD, 14));
			orderBtn.setBackground(new Color(147, 112, 219));
			orderBtn.setBounds(38, 509, 310, 31);
			add(orderBtn);
			
			JLabel text18 = new JLabel("최종 결제 금액");
			text18.setFont(new Font("Dialog", Font.BOLD, 15));
			text18.setBounds(58, 459, 111, 23);
			add(text18);
			
			JLabel text7 = new JLabel("결 제 금 액");
			text7.setFont(new Font("맑은 고딕", Font.BOLD, 14));
			text7.setHorizontalAlignment(SwingConstants.CENTER);
			text7.setBounds(38, 319, 88, 15);
			add(text7);
			
			JLabel text9 = new JLabel("┖ 상품금액");
			text9.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
			text9.setBounds(58, 368, 79, 15);
			add(text9);
			
			JLabel text8 = new JLabel("주 문 금 액");
			text8.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
			text8.setHorizontalAlignment(SwingConstants.CENTER);
			text8.setBounds(38, 343, 88, 15);
			add(text8);
			
			JLabel text10 = new JLabel("┖ 할인금액");
			text10.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
			text10.setBounds(58, 393, 79, 15);
			add(text10);
			
			JLabel text11 = new JLabel("배  송  비");
			text11.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
			text11.setHorizontalAlignment(SwingConstants.CENTER);
			text11.setBounds(38, 418, 88, 15);
			add(text11);
			
			orderFinalPriceLB = new JLabel();
			orderFinalPriceLB.setHorizontalAlignment(SwingConstants.RIGHT);
			orderFinalPriceLB.setBounds(222, 320, 57, 15);
			add(orderFinalPriceLB);
			orderFinalPriceLB.setText("45000");
			
			orderPriceLB = new JLabel();
			orderPriceLB.setHorizontalAlignment(SwingConstants.RIGHT);
			orderPriceLB.setBounds(222, 345, 57, 15);
			add(orderPriceLB);
			orderPriceLB.setText("42000");
			
			p_PriceLB = new JLabel();
			p_PriceLB.setHorizontalAlignment(SwingConstants.RIGHT);
			p_PriceLB.setBounds(222, 370, 57, 15);
			add(p_PriceLB);
			p_PriceLB.setText("42000");
			
			discount_FeeLB = new JLabel();
			discount_FeeLB.setHorizontalAlignment(SwingConstants.RIGHT);
			discount_FeeLB.setBounds(222, 395, 57, 15);
			add(discount_FeeLB);
			discount_FeeLB.setText("0");
			
			d_FeeLB = new JLabel();
			d_FeeLB.setHorizontalAlignment(SwingConstants.RIGHT);
			d_FeeLB.setBounds(222, 420, 57, 15);
			add(d_FeeLB);
			d_FeeLB.setText("3000");
			
			JLabel text6 = new JLabel("결 제 수 단");
			text6.setHorizontalAlignment(SwingConstants.CENTER);
			text6.setFont(new Font("맑은 고딕", Font.BOLD, 14));
			text6.setBounds(38, 204, 88, 15);
			add(text6);
			
			JLabel text16 = new JLabel("원");
			text16.setBounds(291, 420, 57, 15);
			add(text16);
			
			JLabel text15 = new JLabel("원");
			text15.setBounds(291, 395, 57, 15);
			add(text15);
			
			JLabel text14 = new JLabel("원");
			text14.setBounds(291, 370, 57, 15);
			add(text14);
			
			JLabel text13 = new JLabel("원");
			text13.setBounds(291, 345, 57, 15);
			add(text13);
			
			JLabel text12 = new JLabel("원");
			text12.setBounds(291, 320, 57, 15);
			add(text12);
			
			JLabel text17 = new JLabel("원");
			text17.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
			text17.setHorizontalAlignment(SwingConstants.LEFT);
			text17.setBounds(291, 458, 57, 24);
			add(text17);
			
			orderTotalPriceLB = new JLabel();
			orderTotalPriceLB.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
			orderTotalPriceLB.setHorizontalAlignment(SwingConstants.RIGHT);
			orderTotalPriceLB.setBounds(222, 460, 57, 21);
			add(orderTotalPriceLB);
			orderTotalPriceLB.setText("45000");
			
			JRadioButton rdbtnNewRadioButton = new JRadioButton("신용 카드");
			rdbtnNewRadioButton.setBounds(56, 241, 93, 23);
			add(rdbtnNewRadioButton);
			
			JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("간편 결제");
			rdbtnNewRadioButton_1.setBounds(56, 266, 93, 23);
			add(rdbtnNewRadioButton_1);
			
			JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("계좌 이체");
			rdbtnNewRadioButton_2.setBounds(216, 241, 93, 23);
			add(rdbtnNewRadioButton_2);
			
			JRadioButton rdbtnNewRadioButton_2_1 = new JRadioButton("휴대폰 결제");
			rdbtnNewRadioButton_2_1.setBounds(216, 266, 93, 23);
			add(rdbtnNewRadioButton_2_1);
			
			phoneTF = new JTextField();
			phoneTF.setBounds(138, 100, 171, 21);
			add(phoneTF);
			phoneTF.setColumns(10);
			phoneTF.setText(phone);
			
			JLabel text3 = new JLabel("휴대폰 번호");
			text3.setHorizontalAlignment(SwingConstants.CENTER);
			text3.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
			text3.setBounds(38, 101, 88, 15);
			add(text3);
			} catch (Exception e1) {
				e1.printStackTrace();
		}
			
		

	}

		
}