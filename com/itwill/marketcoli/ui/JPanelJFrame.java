package com.itwill.marketcoli.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JPasswordField;

public class JPanelJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JPanelJFrame frame = new JPanelJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JPanelJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel NorthPanel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) NorthPanel.getLayout();
		NorthPanel.setBackground(new Color(230, 230, 250));
		contentPane.add(NorthPanel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(JPanelJFrame.class.getResource("/images/title_logo25.png")));
		NorthPanel.add(lblNewLabel);
		
		textField = new JTextField();
		NorthPanel.add(textField);
		textField.setColumns(20);
		
		JButton btnNewButton = new JButton("검색");
		NorthPanel.add(btnNewButton);
		
		JPanel SouthPanel = new JPanel();
		SouthPanel.setBackground(new Color(250, 250, 210));
		contentPane.add(SouthPanel, BorderLayout.SOUTH);
		
		JButton btnNewButton_1 = new JButton("회원가입");
		SouthPanel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("로그인");
		SouthPanel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("회원리스트");
		SouthPanel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("회원삭제");
		SouthPanel.add(btnNewButton_4);
		
		JPanel CenterPanel = new JPanel();
		CenterPanel.setBackground(new Color(211, 211, 211));
		contentPane.add(CenterPanel, BorderLayout.CENTER);
		CenterPanel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("아이디");
		lblNewLabel_2.setBounds(62, 95, 57, 15);
		CenterPanel.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(177, 92, 103, 21);
		CenterPanel.add(passwordField);
		
		JLabel lblNewLabel_3 = new JLabel("패스워드");
		lblNewLabel_3.setBounds(62, 143, 57, 15);
		CenterPanel.add(lblNewLabel_3);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(177, 140, 103, 21);
		CenterPanel.add(passwordField_1);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setBounds(62, 194, 97, 23);
		CenterPanel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("New button");
		btnNewButton_6.setBounds(183, 194, 97, 23);
		CenterPanel.add(btnNewButton_6);
		
		JPanel WestPanel = new JPanel();
		WestPanel.setBackground(new Color(255, 222, 173));
		contentPane.add(WestPanel, BorderLayout.WEST);
		WestPanel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("회원리스트");
		WestPanel.add(lblNewLabel_1, BorderLayout.NORTH);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"김도레", "이미파", "박솔라", "정시도", "최보미", "강여름", "한가을", "김겨울"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		WestPanel.add(list, BorderLayout.CENTER);
		
		JPanel EastPanel = new JPanel();
		EastPanel.setBackground(new Color(255, 182, 193));
		contentPane.add(EastPanel, BorderLayout.EAST);
	}
}
