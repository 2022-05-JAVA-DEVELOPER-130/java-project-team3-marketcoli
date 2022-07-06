package com.itwill.marketcoli.ui_test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Scrollbar;
import javax.swing.JScrollPane;
import com.itwill.marketcoli.ui.Join;
import com.itwill.marketcoli.ui.Login;
import java.awt.Dimension;
import com.itwill.marketcoli.ui.MyPage;
import com.itwill.marketcoli.ui.ProductListPanel;
import com.itwill.marketcoli.ui.FindIdPassword;
import com.itwill.marketcoli.dto.Notice;
import com.itwill.marketcoli.ui.NoticeUI;

public class testFrame_seo extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenu mnNewMenu_1;
	private JMenu mnNewMenu_2;
	private JMenu mnNewMenu_3;
	private JMenu mnNewMenu_4;
	private JTabbedPane tabbedPane;
	private JPanel productPanel;
	private JPanel cartPanel;
	private JPanel orderPanel;
	private JPanel userPanel;
	private JPanel mypagePanel;
	private JPanel noticePanel;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private Join join;
	private FindIdPassword findIdPassword;
	private JScrollPane scrollPane_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testFrame_seo frame = new testFrame_seo();
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
	public testFrame_seo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 650);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("New menu");
		menuBar.add(mnNewMenu);
		
		mnNewMenu_1 = new JMenu("New menu");
		menuBar.add(mnNewMenu_1);
		
		mnNewMenu_2 = new JMenu("New menu");
		menuBar.add(mnNewMenu_2);
		
		mnNewMenu_3 = new JMenu("New menu");
		menuBar.add(mnNewMenu_3);
		
		mnNewMenu_4 = new JMenu("New menu");
		menuBar.add(mnNewMenu_4);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		userPanel = new JPanel();
		tabbedPane.addTab("회원가입", null, userPanel, null);
		userPanel.setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		userPanel.add(scrollPane, BorderLayout.CENTER);
		
		join = new Join();
		scrollPane.setViewportView(join);
		
		mypagePanel = new JPanel();
		tabbedPane.addTab("마이페이지", null, mypagePanel, null);
		mypagePanel.setLayout(new BorderLayout(0, 0));
		
		scrollPane_1 = new JScrollPane();
		mypagePanel.add(scrollPane_1, BorderLayout.CENTER);
		
		findIdPassword = new FindIdPassword();
		scrollPane_1.setViewportView(findIdPassword);
		
		productPanel = new JPanel();
		tabbedPane.addTab("상품", null, productPanel, null);
		
		cartPanel = new JPanel();
		tabbedPane.addTab("카트", null, cartPanel, null);
		
		orderPanel = new JPanel();
		tabbedPane.addTab("주문", null, orderPanel, null);
		
		noticePanel = new JPanel();
		tabbedPane.addTab("공지사항", null, noticePanel, null);
		noticePanel.setLayout(new BorderLayout(0, 0));
		
		scrollPane_2 = new JScrollPane();
		noticePanel.add(scrollPane_2, BorderLayout.CENTER);
	}

}
