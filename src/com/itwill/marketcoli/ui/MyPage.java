package com.itwill.marketcoli.ui;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import com.itwill.marketcoli.dto.UserInfo;
import com.itwill.marketcoli.service.OrderService;
import com.itwill.marketcoli.service.UserInfoService;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyPage extends JPanel {
	/**********1.Service객체선언*******/
	private OrderService orderService;
	private UserInfoService userInfoService;
	
	private JTextField idField;
	private JTextField nowPWField;
	private JTextField newPwField;
	private JTextField newPwReField;
	private JTextField nameField;
	private JTextField emailField;
	private JTextField phoneField;
	private JTextField birthField;
	private JTextField jobField;
	private JPanel orderDataPanel;
	private JTextField userNoField;

	/**
	 * Create the panel.
	 * @throws Exception 
	 */
	public MyPage() throws Exception {
		setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setPreferredSize(new Dimension(5, 800));
		add(tabbedPane, BorderLayout.CENTER);
		
		JPanel changeUserDataPanel = new JPanel();
		changeUserDataPanel.setPreferredSize(new Dimension(10, 800));
		tabbedPane.addTab("\uAC1C\uC778\uC815\uBCF4\uC218\uC815", null, changeUserDataPanel, null);
		changeUserDataPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		changeUserDataPanel.add(scrollPane, BorderLayout.CENTER);
		
		JPanel changeUserDataPanel2 = new JPanel();
		changeUserDataPanel2.setPreferredSize(new Dimension(10, 800));
		scrollPane.setViewportView(changeUserDataPanel2);
		changeUserDataPanel2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uAC1C\uC778\uC815\uBCF4\uC218\uC815");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 25));
		lblNewLabel.setBounds(129, 34, 164, 46);
		changeUserDataPanel2.add(lblNewLabel);
		
		idField = new JTextField();
		idField.setBounds(58, 169, 315, 21);
		changeUserDataPanel2.add(idField);
		idField.setColumns(10);
		
		JLabel idLabel = new JLabel("\uC544\uC774\uB514");
		idLabel.setBounds(58, 146, 57, 15);
		changeUserDataPanel2.add(idLabel);
		
		JLabel nowPwLabel = new JLabel("\uD604\uC7AC \uBE44\uBC00\uBC88\uD638");
		nowPwLabel.setBounds(58, 211, 121, 15);
		changeUserDataPanel2.add(nowPwLabel);
		
		nowPWField = new JTextField();
		nowPWField.setColumns(10);
		nowPWField.setBounds(58, 234, 315, 21);
		changeUserDataPanel2.add(nowPWField);
		
		JLabel newPwLabel = new JLabel("\uC0C8 \uBE44\uBC00\uBC88\uD638");
		newPwLabel.setBounds(58, 275, 121, 15);
		changeUserDataPanel2.add(newPwLabel);
		
		newPwField = new JTextField();
		newPwField.setColumns(10);
		newPwField.setBounds(58, 298, 315, 21);
		changeUserDataPanel2.add(newPwField);
		
		JLabel newPwReLabel = new JLabel("\uC0C8 \uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		newPwReLabel.setBounds(58, 340, 108, 15);
		changeUserDataPanel2.add(newPwReLabel);
		
		newPwReField = new JTextField();
		newPwReField.setColumns(10);
		newPwReField.setBounds(58, 363, 315, 21);
		changeUserDataPanel2.add(newPwReField);
		
		JLabel nameLabel = new JLabel("\uC774\uB984");
		nameLabel.setBounds(58, 406, 57, 15);
		changeUserDataPanel2.add(nameLabel);
		
		nameField = new JTextField();
		nameField.setColumns(10);
		nameField.setBounds(58, 429, 315, 21);
		changeUserDataPanel2.add(nameField);
		
		JLabel emailLabel = new JLabel("\uC774\uBA54\uC77C");
		emailLabel.setBounds(58, 471, 57, 15);
		changeUserDataPanel2.add(emailLabel);
		
		emailField = new JTextField();
		emailField.setColumns(10);
		emailField.setBounds(58, 494, 315, 21);
		changeUserDataPanel2.add(emailField);
		
		JLabel phoneLabel = new JLabel("\uD578\uB4DC\uD3F0 \uBC88\uD638");
		phoneLabel.setBounds(58, 535, 108, 15);
		changeUserDataPanel2.add(phoneLabel);
		
		phoneField = new JTextField();
		phoneField.setColumns(10);
		phoneField.setBounds(58, 558, 315, 21);
		changeUserDataPanel2.add(phoneField);
		
		JLabel birthLabel = new JLabel("\uC0DD\uB144\uC6D4\uC77C");
		birthLabel.setBounds(58, 600, 57, 15);
		changeUserDataPanel2.add(birthLabel);
		
		birthField = new JTextField();
		birthField.setColumns(10);
		birthField.setBounds(58, 623, 315, 21);
		changeUserDataPanel2.add(birthField);
		
		JLabel jobLabel = new JLabel("\uC9C1\uC5C5");
		jobLabel.setBounds(58, 665, 57, 15);
		changeUserDataPanel2.add(jobLabel);
		
		jobField = new JTextField();
		jobField.setColumns(10);
		jobField.setBounds(58, 688, 315, 21);
		changeUserDataPanel2.add(jobField);
		
		JButton dataChangeButton = new JButton("\uC218\uC815\uD558\uAE30");
		dataChangeButton.setBounds(58, 735, 137, 38);
		changeUserDataPanel2.add(dataChangeButton);
		
		JLabel lblNewLabel_1 = new JLabel("*\uD544\uC218");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(332, 146, 36, 15);
		changeUserDataPanel2.add(lblNewLabel_1);
		
		JButton dataDeleteButton = new JButton("탈퇴하기");
		dataDeleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String u_no = userNoField.getText();
					userInfoService.deleteUserInfo(ABORT);
					
					//비밀번호 입력 정보 초기화
					
					
				}catch (Exception e1) {
					
				}
					
				
				
			}
		});
		dataDeleteButton.setBounds(236, 735, 137, 38);
		changeUserDataPanel2.add(dataDeleteButton);
		
		JLabel userNoLabel = new JLabel("\uD68C\uC6D0\uBC88\uD638");
		userNoLabel.setBounds(58, 92, 57, 15);
		changeUserDataPanel2.add(userNoLabel);
		
		userNoField = new JTextField();
		userNoField.setColumns(10);
		userNoField.setBounds(58, 115, 315, 21);
		changeUserDataPanel2.add(userNoField);
		
		
		
		JPanel orderUserData = new JPanel();
		tabbedPane.addTab("\uC8FC\uBB38\uB0B4\uC5ED", null, orderUserData, null);
		orderUserData.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		orderUserData.add(scrollPane_1, BorderLayout.CENTER);
		
		orderDataPanel = new JPanel();
		orderDataPanel.setPreferredSize(new Dimension(10, 800));
		scrollPane_1.setViewportView(orderDataPanel);
		//orderDataPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
//		
		
		JLabel orderTitleLabel = new JLabel("\uC8FC\uBB38\uB0B4\uC5ED");
		orderDataPanel.add(orderTitleLabel);
		orderTitleLabel.setFont(new Font("굴림", Font.PLAIN, 25));
		
		/*******************************************************************/
		
		JPanel orderProductPanel = new JPanel();
		orderProductPanel.setPreferredSize(new Dimension(400, 150));
		orderProductPanel.setBackground(new Color(221, 160, 221));
		orderDataPanel.add(orderProductPanel);
		orderProductPanel.setLayout(null);
		
		JLabel orderProductImg = new JLabel("\uC8FC\uBB38\uC0C1\uD488\uC0AC\uC9C4");
		orderProductImg.setBackground(Color.WHITE);
		orderProductImg.setBounds(12, 10, 105, 114);
		orderProductPanel.add(orderProductImg);
		
		JLabel orderNoLabel = new JLabel("\uC8FC\uBB38\uBC88\uD638");
		orderNoLabel.setBounds(129, 10, 146, 15);
		orderProductPanel.add(orderNoLabel);
		
		JLabel orderProductNameLabel = new JLabel("\uC8FC\uBB38 \uC0C1\uD488 \uC774\uB984");
		orderProductNameLabel.setBounds(129, 59, 146, 15);
		orderProductPanel.add(orderProductNameLabel);
		
		JLabel orderProductPriceLabel = new JLabel("\uC8FC\uBB38 \uC0C1\uD488 \uAC00\uACA9");
		orderProductPriceLabel.setBounds(129, 84, 146, 15);
		orderProductPanel.add(orderProductPriceLabel);
		
		JLabel orderProductCountLabel = new JLabel("\uC8FC\uBB38 \uC0C1\uD488 \uC218\uB7C9");
		orderProductCountLabel.setBounds(129, 109, 146, 15);
		orderProductPanel.add(orderProductCountLabel);
		
		JLabel orderDateLabel = new JLabel("\uC8FC\uBB38\uB0A0\uC9DC");
		orderDateLabel.setBounds(129, 34, 146, 15);
		orderProductPanel.add(orderDateLabel);
		/*******************************************************************/
		/********2.Service객체생성**********/
		orderService=new OrderService();
		
		/******처음프레임생성될때UI초기화****************/
		orderProductList();
		
		
	}//생성자끝
	public void orderProductList() {
		orderDataPanel.removeAll();
		for(int i=0; i<5; i++) {
			JPanel orderProductPanel = new JPanel();
			orderProductPanel.setPreferredSize(new Dimension(400, 150));
			orderProductPanel.setBackground(new Color(221, 160, 221));
			orderDataPanel.add(orderProductPanel);
			orderProductPanel.setLayout(null);
			
			JLabel orderProductImg = new JLabel("\uC8FC\uBB38\uC0C1\uD488\uC0AC\uC9C4");
			orderProductImg.setBackground(Color.WHITE);
			orderProductImg.setBounds(12, 10, 105, 114);
			orderProductPanel.add(orderProductImg);
			
			JLabel orderNoLabel = new JLabel("\uC8FC\uBB38\uBC88\uD638"+i);
			orderNoLabel.setBounds(129, 10, 146, 15);
			orderProductPanel.add(orderNoLabel);
			
			JLabel orderProductNameLabel = new JLabel("\uC8FC\uBB38 \uC0C1\uD488 \uC774\uB984"+i);
			orderProductNameLabel.setBounds(129, 59, 146, 15);
			orderProductPanel.add(orderProductNameLabel);
			
			JLabel orderProductPriceLabel = new JLabel("\uC8FC\uBB38 \uC0C1\uD488 \uAC00\uACA9"+i);
			orderProductPriceLabel.setBounds(129, 84, 146, 15);
			orderProductPanel.add(orderProductPriceLabel);
			
			JLabel orderProductCountLabel = new JLabel("\uC8FC\uBB38 \uC0C1\uD488 \uC218\uB7C9"+i);
			orderProductCountLabel.setBounds(129, 109, 146, 15);
			orderProductPanel.add(orderProductCountLabel);
			
			JLabel orderDateLabel = new JLabel("\uC8FC\uBB38\uB0A0\uC9DC"+i);
			orderDateLabel.setBounds(129, 34, 146, 15);
			orderProductPanel.add(orderDateLabel);
		}
	}
	
	
	
	
	
	
	
	
	
}//클래스끝
