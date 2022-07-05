package com.itwill.marketcoli.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import java.awt.Dimension;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;

public class JFrame extends javax.swing.JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame frame = new JFrame();
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
	public JFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 640);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu_1 = new JMenu("");
		mnNewMenu_1.setIcon(new ImageIcon("C:\\2022-05-JAVA-DEVELOPER\\git-repositories\\java-project-team3-marketcoli\\src\\images\\작은문.jpg"));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenu mnNewMenu = new JMenu("가운데");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_2 = new JMenu("");
		mnNewMenu_2.setIcon(new ImageIcon("C:\\2022-05-JAVA-DEVELOPER\\git-repositories\\java-project-team3-marketcoli\\src\\images\\작은문.jpg"));
		menuBar.add(mnNewMenu_2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel joinPanel = new JPanel();
		joinPanel.setName("");
		tabbedPane.addTab("회원가입", null, joinPanel, null);
		
		JPanel mypagePanel = new JPanel();
		tabbedPane.addTab("마이페이지", null, mypagePanel, null);
		
		JPanel loginPanel = new JPanel();
		tabbedPane.addTab("로그인", null, loginPanel, null);
		
		JPanel productPanel = new JPanel();
		tabbedPane.addTab("상품", null, productPanel, null);
		
		JPanel cartPanel = new JPanel();
		tabbedPane.addTab("장바구니", null, cartPanel, null);
		
		JPanel orderPanel = new JPanel();
		tabbedPane.addTab("주문하기", null, orderPanel, null);
		
		JPanel noticePanel = new JPanel();
		tabbedPane.addTab("공지사항", null, noticePanel, null);
	}

}