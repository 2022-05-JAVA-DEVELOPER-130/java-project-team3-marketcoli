package com.itwill.marketcoli.ui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class login extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public login() {
		setLayout(null);
		
		JLabel loginTitle = new JLabel("\uB85C\uADF8\uC778");
		loginTitle.setFont(new Font("굴림", Font.PLAIN, 30));
		loginTitle.setBounds(124, 64, 120, 65);
		add(loginTitle);
		
		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514");
		lblNewLabel.setBounds(55, 167, 57, 15);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(124, 164, 217, 21);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_1.setBounds(55, 241, 57, 15);
		add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(124, 238, 217, 21);
		add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("\uB85C\uADF8\uC778");
		btnNewButton.setBackground(new Color(128, 0, 128));
		btnNewButton.setBounds(44, 335, 120, 39);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btnNewButton_1.setBackground(new Color(128, 0, 128));
		btnNewButton_1.setBounds(44, 384, 297, 39);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("취소");
		btnNewButton_2.setBackground(new Color(128, 0, 128));
		btnNewButton_2.setBounds(221, 335, 120, 39);
		add(btnNewButton_2);
		
		JLabel messageLB = new JLabel("");
		messageLB.setForeground(Color.RED);
		messageLB.setBounds(55, 278, 175, 15);
		add(messageLB);

	}
}