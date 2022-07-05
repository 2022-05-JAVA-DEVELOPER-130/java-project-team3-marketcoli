package com.itwill.marketcoli.ui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class join extends JPanel {
	private JTextField joinidtext;
	private JTextField joinPwtext;
	private JTextField joinPwRetext;
	private JTextField joinNameText;
	private JTextField joinhbdText;
	private JTextField joinAddressText;
	private JTextField joinPhoneText;
	private JTextField joinEmailText;
	private JTextField joinjobText;

	/**
	 * Create the panel.
	 */
	public join() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("회원가입");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		lblNewLabel.setBounds(124, 51, 131, 72);
		add(lblNewLabel);
		
		JLabel joinidLB = new JLabel("아이디");
		joinidLB.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		joinidLB.setBounds(43, 146, 57, 15);
		add(joinidLB);
		
		JLabel joinPwLB = new JLabel("비밀번호");
		joinPwLB.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		joinPwLB.setBounds(43, 209, 57, 15);
		add(joinPwLB);
		
		JLabel joinPwReLB = new JLabel("비밀번호확인");
		joinPwReLB.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		joinPwReLB.setBounds(43, 271, 139, 15);
		add(joinPwReLB);
		
		JLabel joinNameLB = new JLabel("이름");
		joinNameLB.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		joinNameLB.setBounds(43, 332, 57, 15);
		add(joinNameLB);
		
		JLabel joinemailLB = new JLabel("이메일");
		joinemailLB.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		joinemailLB.setBounds(43, 388, 57, 15);
		add(joinemailLB);
		
		JLabel joinphoneLB = new JLabel("핸드폰");
		joinphoneLB.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		joinphoneLB.setBounds(43, 437, 57, 15);
		add(joinphoneLB);
		
		JLabel joinaddressLB = new JLabel("주소");
		joinaddressLB.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		joinaddressLB.setBounds(43, 479, 57, 15);
		add(joinaddressLB);
		
		JLabel joinhbdLB = new JLabel("생년월일");
		joinhbdLB.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		joinhbdLB.setBounds(43, 520, 57, 15);
		add(joinhbdLB);
		
		JLabel joinjobLB = new JLabel("직업");
		joinjobLB.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		joinjobLB.setBounds(43, 576, 57, 15);
		add(joinjobLB);
		
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
		
		joinhbdText = new JTextField();
		joinhbdText.setColumns(10);
		joinhbdText.setBounds(129, 517, 116, 21);
		add(joinhbdText);
		
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
		
		joinjobText = new JTextField();
		joinjobText.setColumns(10);
		joinjobText.setBounds(129, 573, 116, 21);
		add(joinjobText);
		
		JButton joinBtn = new JButton("가입");
		joinBtn.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		joinBtn.setBounds(45, 621, 124, 42);
		add(joinBtn);
		
		JButton cancleBt = new JButton("취소");
		cancleBt.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		cancleBt.setBounds(235, 621, 124, 42);
		add(cancleBt);
		
		JLabel lblNewLabel_6 = new JLabel("*");
		lblNewLabel_6.setForeground(Color.RED);
		lblNewLabel_6.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel_6.setBounds(257, 143, 15, 15);
		add(lblNewLabel_6);
		
		JLabel messageLB = new JLabel("");
		messageLB.setForeground(Color.RED);
		messageLB.setBounds(128, 168, 175, 15);
		add(messageLB);

	}
}