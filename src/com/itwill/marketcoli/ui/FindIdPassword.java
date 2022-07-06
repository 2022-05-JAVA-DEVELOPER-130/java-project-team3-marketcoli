package com.itwill.marketcoli.ui;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;

public class FindIdPassword extends JPanel {
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public FindIdPassword() {
		setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(136, 199, 179, 21);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("아이디 찾기");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lblNewLabel.setBounds(136, 150, 87, 15);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("이메일");
		lblNewLabel_1.setBounds(68, 202, 57, 15);
		add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("아이디 찾기");
		btnNewButton.setBounds(134, 249, 116, 23);
		add(btnNewButton);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(136, 453, 179, 21);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(136, 501, 179, 21);
		add(textField_3);
		
		JLabel lblNewLabel_3 = new JLabel("비밀번호 찾기");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lblNewLabel_3.setBounds(134, 398, 95, 21);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("아이디");
		lblNewLabel_1_1.setBounds(68, 456, 57, 15);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("이메일");
		lblNewLabel_2_1.setBounds(68, 504, 57, 15);
		add(lblNewLabel_2_1);
		
		JButton btnNewButton_1 = new JButton("비밀번호 찾기");
		btnNewButton_1.setBounds(134, 563, 116, 23);
		add(btnNewButton_1);

	}
}
