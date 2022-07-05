package com.itwill.marketcoli.ui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class login extends JPanel {
	private JTextField idText;
	private JTextField pwText;

	/**
	 * Create the panel.
	 */
	public login() {
		setLayout(null);
		
		JLabel loginTitle = new JLabel("로그인");
		loginTitle.setFont(new Font("굴림", Font.PLAIN, 30));
		loginTitle.setBounds(124, 64, 120, 65);
		add(loginTitle);
		
		JLabel loginidLB = new JLabel("아이디");
		loginidLB.setBounds(55, 167, 57, 15);
		add(loginidLB);
		
		idText = new JTextField();
		idText.setBounds(124, 164, 217, 21);
		add(idText);
		idText.setColumns(10);
		
		JLabel loginpwLB = new JLabel("비밀번호");
		loginpwLB.setBounds(55, 241, 57, 15);
		add(loginpwLB);
		
		pwText = new JTextField();
		pwText.setBounds(124, 238, 217, 21);
		add(pwText);
		pwText.setColumns(10);
		
		JButton loginBtn = new JButton("로그인");
		loginBtn.setBackground(new Color(128, 0, 128));
		loginBtn.setBounds(44, 335, 120, 39);
		add(loginBtn);
		
		JButton joinBtn = new JButton("회원가입");
		joinBtn.setBackground(new Color(128, 0, 128));
		joinBtn.setBounds(44, 384, 297, 39);
		add(joinBtn);
		
		JButton cancleBtn = new JButton("취소");
		cancleBtn.setBackground(new Color(128, 0, 128));
		cancleBtn.setBounds(221, 335, 120, 39);
		add(cancleBtn);
		
		JLabel messageLB = new JLabel("");
		messageLB.setForeground(Color.RED);
		messageLB.setBounds(55, 278, 175, 15);
		add(messageLB);

	}
}