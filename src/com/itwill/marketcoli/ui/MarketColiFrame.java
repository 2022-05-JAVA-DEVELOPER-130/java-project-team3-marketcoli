package com.itwill.marketcoli.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Scrollbar;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import java.awt.Dimension;

public class MarketColiFrame extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu cartMenu;
	private JMenu nothing1;
	private JMenu titleMenu;
	private JMenu noting2;
	private JMenu userMenu;
	private JTabbedPane tabbedPane;
	private JPanel productPanel;
	private JPanel cartPanel;
	private JPanel orderPanel;
	private JPanel userPanel;
	private JPanel mypagePanel;
	private JPanel noticePanel;
	private JMenuItem joinMenuItem;
	private JMenuItem loginMenuItem;
	private JMenuItem mypageMenuItem;
	private JMenuItem logoutMenuItem;
	private JSeparator separator1;
	private JScrollPane userScrollPane;
	private JPanel loginPanel;
	private JPanel idpwFindpanel;
	private JScrollPane loginScrollPane;
	private JScrollPane idpwFindScrollPane;
	private JScrollPane noitceScrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MarketColiFrame frame = new MarketColiFrame();
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
	public MarketColiFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 650);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		cartMenu = new JMenu("");
		menuBar.add(cartMenu);
		
		nothing1 = new JMenu("");
		menuBar.add(nothing1);
		
		titleMenu = new JMenu("Market Coli");
		titleMenu.setForeground(new Color(148, 0, 211));
		titleMenu.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		menuBar.add(titleMenu);
		
		noting2 = new JMenu("");
		menuBar.add(noting2);
		
		userMenu = new JMenu("");
		menuBar.add(userMenu);
		
		joinMenuItem = new JMenuItem("회원가입");
		userMenu.add(joinMenuItem);
		
		separator1 = new JSeparator();
		userMenu.add(separator1);
		
		loginMenuItem = new JMenuItem("로그인");
		userMenu.add(loginMenuItem);
		
		mypageMenuItem = new JMenuItem("마이페이지");
		userMenu.add(mypageMenuItem);
		
		logoutMenuItem = new JMenuItem("로그아웃");
		userMenu.add(logoutMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		userPanel = new JPanel();
		userPanel.setPreferredSize(new Dimension(10, 800));
		tabbedPane.addTab("회원가입", null, userPanel, null);
		userPanel.setLayout(new BorderLayout(0, 0));
		
		userScrollPane = new JScrollPane();
		userPanel.add(userScrollPane, BorderLayout.CENTER);
		
		loginPanel = new JPanel();
		tabbedPane.addTab("로그인", null, loginPanel, null);
		loginPanel.setLayout(new BorderLayout(0, 0));
		
		loginScrollPane = new JScrollPane();
		loginPanel.add(loginScrollPane, BorderLayout.CENTER);
		
		idpwFindpanel = new JPanel();
		tabbedPane.addTab("아이디/비밀번호찾기", null, idpwFindpanel, null);
		idpwFindpanel.setLayout(new BorderLayout(0, 0));
		
		idpwFindScrollPane = new JScrollPane();
		idpwFindpanel.add(idpwFindScrollPane, BorderLayout.CENTER);
		
		mypagePanel = new JPanel();
		tabbedPane.addTab("마이페이지", null, mypagePanel, null);
		
		productPanel = new JPanel();
		tabbedPane.addTab("상품", null, productPanel, null);
		
		cartPanel = new JPanel();
		tabbedPane.addTab("카트", null, cartPanel, null);
		
		orderPanel = new JPanel();
		tabbedPane.addTab("주문", null, orderPanel, null);
		
		noticePanel = new JPanel();
		tabbedPane.addTab("공지사항", null, noticePanel, null);
		noticePanel.setLayout(new BorderLayout(0, 0));
		
		noitceScrollPane = new JScrollPane();
		noticePanel.add(noitceScrollPane, BorderLayout.CENTER);
	}

}
