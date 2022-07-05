package com.itwill.marketcoli.ui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class join extends JPanel {
	private JTextField joinidtext;
	private JTextField joinPwtext;
	private JTextField joinPwRetext;
	private JTextField joinNameText;
	private JTextField textField_4;
	private JTextField joinAddressText;
	private JTextField joinPhoneText;
	private JTextField joinEmailText;
	private JTextField textField_8;

	/**
	 * Create the panel.
	 */
	public join() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		lblNewLabel.setBounds(124, 51, 131, 72);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC544\uC774\uB514");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(43, 146, 57, 15);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_1_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(43, 209, 57, 15);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("\uBE44\uBC00\uBC88\uD638\uD655\uC778");
		lblNewLabel_1_2.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(43, 271, 139, 15);
		add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2 = new JLabel("\uC774\uB984");
		lblNewLabel_2.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(43, 332, 57, 15);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("\uC774\uBA54\uC77C");
		lblNewLabel_2_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(43, 388, 57, 15);
		add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("\uD734\uB300\uD3F0");
		lblNewLabel_2_2.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_2_2.setBounds(43, 437, 57, 15);
		add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("\uC8FC\uC18C");
		lblNewLabel_2_3.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_2_3.setBounds(43, 479, 57, 15);
		add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("\uC0DD\uB144\uC6D4\uC77C");
		lblNewLabel_2_4.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_2_4.setBounds(43, 520, 57, 15);
		add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_4_1 = new JLabel("\uC9C1\uC5C5");
		lblNewLabel_2_4_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_2_4_1.setBounds(43, 576, 57, 15);
		add(lblNewLabel_2_4_1);
		
		joinidtext = new JTextField();
		joinidtext.setBounds(129, 143, 116, 21);
		add(joinidtext);
		joinidtext.setColumns(10);
		
		joinPwtext = new JTextField();
		joinPwtext.setColumns(10);
		joinPwtext.setBounds(129, 206, 116, 21);
		add(joinPwtext);
		
		joinPwRetext = new JTextField();
		joinPwRetext.setColumns(10);
		joinPwRetext.setBounds(129, 268, 116, 21);
		add(joinPwRetext);
		
		joinNameText = new JTextField();
		joinNameText.setColumns(10);
		joinNameText.setBounds(129, 329, 116, 21);
		add(joinNameText);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(129, 517, 116, 21);
		add(textField_4);
		
		joinAddressText = new JTextField();
		joinAddressText.setColumns(10);
		joinAddressText.setBounds(129, 476, 116, 21);
		add(joinAddressText);
		
		joinPhoneText = new JTextField();
		joinPhoneText.setColumns(10);
		joinPhoneText.setBounds(129, 434, 116, 21);
		add(joinPhoneText);
		
		joinEmailText = new JTextField();
		joinEmailText.setColumns(10);
		joinEmailText.setBounds(129, 388, 116, 21);
		add(joinEmailText);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(129, 573, 116, 21);
		add(textField_8);
		
		JButton btnNewButton = new JButton("\uAC00\uC785\uD558\uAE30");
		btnNewButton.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		btnNewButton.setBounds(62, 623, 227, 42);
		add(btnNewButton);

	}

}
