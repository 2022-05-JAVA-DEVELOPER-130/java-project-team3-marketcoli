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
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Insets;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.Font;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.FlowLayout;

import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;



// 사이즈 setBounds(100, 100, 390, 844);  
// Jpanel 로 만들어주세요

public class JFrame extends javax.swing.JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTabbedPane noticeTabbedPane;
	private JPanel notice1;
	private JTextField notice1Date;
	private JTextField notice1Title;
	private JTextField notice2Date;
	private JTextField notice2Title;

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
		setBounds(100, 100, 390, 680);
		
		JMenuBar menuBar = new JMenuBar();
		
		menuBar.setBounds(new Rectangle(100, 0, 0, 0));
		menuBar.setSize(new Dimension(100, 0));
		menuBar.setAlignmentY(Component.CENTER_ALIGNMENT);
		menuBar.setAlignmentX(Component.LEFT_ALIGNMENT);
		setJMenuBar(menuBar);
		
		
		JMenu cartMenu = new JMenu("");
		cartMenu.setHorizontalAlignment(SwingConstants.RIGHT);
		cartMenu.setIcon(new ImageIcon(JFrame.class.getResource("/images/cart 25.png")));
		menuBar.add(cartMenu);
		
		JMenuItem nothing1 = new JMenuItem("");
		nothing1.setEnabled(false);
		menuBar.add(nothing1);
		
		JMenu titleMenu = new JMenu("Market Coli");
		titleMenu.setForeground(new Color(128, 0, 128));
		titleMenu.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		titleMenu.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(titleMenu);
		menuBar.setSize(300, 20);
		
		JMenuItem nothing2 = new JMenuItem("");
		nothing2.setEnabled(false);
		menuBar.add(nothing2);
		
		JMenu userMenu = new JMenu("");
		userMenu.setHorizontalAlignment(SwingConstants.CENTER);
		userMenu.setIcon(new ImageIcon(JFrame.class.getResource("/images/door25.png")));
		menuBar.add(userMenu);
		
		JMenuItem joinMenuItem = new JMenuItem("회원가입");
		userMenu.add(joinMenuItem);
		
		join join_ = new join();
		userMenu.add(join_);
		
		JMenuItem loginMenuItem = new JMenuItem("로그인");
		userMenu.add(loginMenuItem);
		
		JMenuItem mypageMenuItem_4 = new JMenuItem("마이페이지");
		userMenu.add(mypageMenuItem_4);
		
		JMenuItem logoutMenuItem_5 = new JMenuItem("로그아웃");
		userMenu.add(logoutMenuItem_5);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane mainTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(mainTabbedPane);
		
		JPanel productPanel = new JPanel();
		mainTabbedPane.addTab("상품", null, productPanel, null);
		productPanel.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane productTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		productPanel.add(productTabbedPane, BorderLayout.CENTER);
		
		JPanel productMainPanel = new JPanel();
		productTabbedPane.addTab("상품전체보기", null, productMainPanel, null);
		productMainPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane productMainScrollPane = new JScrollPane();
		productMainPanel.add(productMainScrollPane, BorderLayout.CENTER);
		
		JPanel productAllPanel = new JPanel();
		productAllPanel.setPreferredSize(new Dimension(10, 800));
		productMainScrollPane.setViewportView(productAllPanel);
		productAllPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
	
		JPanel productItemPanel = new JPanel();
		productItemPanel.setPreferredSize(new Dimension(300, 155));
		productItemPanel.setBackground(new Color(230, 230, 250));
		productAllPanel.add(productItemPanel);
		productItemPanel.setLayout(null);
		
		JLabel productMainLabel1 = new JLabel("");
		productMainLabel1.setIcon(new ImageIcon(JFrame.class.getResource("/images/과일/석류135.jpg")));
		productMainLabel1.setBounds(12, 10, 135, 135);
		productItemPanel.add(productMainLabel1);
		
		JLabel productMainLabel2 = new JLabel("상품명");
		productMainLabel2.setBounds(159, 21, 140, 15);
		productItemPanel.add(productMainLabel2);
		
		JLabel productMainLabel3 = new JLabel("상품가격");
		productMainLabel3.setBounds(159, 46, 140, 15);
		productItemPanel.add(productMainLabel3);
		
		JLabel productMainLabel4 = new JLabel("상품설명");
		productMainLabel4.setBounds(159, 65, 140, 51);
		productItemPanel.add(productMainLabel4);
		
		JComboBox productComboBox = new JComboBox();
		productComboBox.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		productComboBox.setBounds(214, 120, 39, 25);
		productItemPanel.add(productComboBox);

		JButton productCartBtn = new JButton("");
		productCartBtn.setIcon(new ImageIcon(JFrame.class.getResource("/images/cart 25.png")));
		productCartBtn.setBounds(256, 120, 32, 25);
		productItemPanel.add(productCartBtn);

		JPanel productServePanel = new JPanel();
		productTabbedPane.addTab("상품상세보기", null, productServePanel, null);
		productServePanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane productServelScrollPane = new JScrollPane();
		productServePanel.add(productServelScrollPane, BorderLayout.CENTER);
		
		JPanel productDetailpanel = new JPanel();
		productDetailpanel.setPreferredSize(new Dimension(10, 550));
		productServelScrollPane.setViewportView(productDetailpanel);
		productDetailpanel.setLayout(null);
		
		JLabel productDetailImegeLabel = new JLabel("");
		productDetailImegeLabel.setIcon(new ImageIcon(JFrame.class.getResource("/images/과일/석류310.jpg")));
		productDetailImegeLabel.setBounds(12, 10, 310, 310);
		productDetailpanel.add(productDetailImegeLabel);
		
		JComboBox productDetailComboBox = new JComboBox();
		productDetailComboBox.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		productDetailComboBox.setBounds(205, 500, 39, 25);
		productDetailpanel.add(productDetailComboBox);
		
		JButton productDetailCartBtn = new JButton("");
		productDetailCartBtn.setIcon(new ImageIcon(JFrame.class.getResource("/images/cart 25.png")));
		productDetailCartBtn.setBounds(255, 500, 67, 25);
		productDetailpanel.add(productDetailCartBtn);
		
		JLabel productDetailTitleLabel = new JLabel("상품명");
		productDetailTitleLabel.setFont(new Font("굴림", Font.BOLD, 15));
		productDetailTitleLabel.setBounds(12, 330, 310, 32);
		productDetailpanel.add(productDetailTitleLabel);
		
		JLabel productDetailExpLabel = new JLabel("상품설명");
		productDetailExpLabel.setBounds(12, 372, 311, 116);
		productDetailpanel.add(productDetailExpLabel);
		
		JLabel productDetailPriceLabel = new JLabel("상품가격");
		productDetailPriceLabel.setBounds(12, 500, 181, 25);
		productDetailpanel.add(productDetailPriceLabel);
		
		JPanel cartPanel = new JPanel();
		cartPanel.setBackground(new Color(255, 255, 255));
		mainTabbedPane.addTab("\uC7A5\uBC14\uAD6C\uB2C8", null, cartPanel, null);
		cartPanel.setLayout(null);
		
		JCheckBox savingAddressCheckbox = new JCheckBox("기존주소지");
		savingAddressCheckbox.setFont(new Font("굴림", Font.BOLD, 13));
		savingAddressCheckbox.setBounds(8, 31, 115, 23);
		cartPanel.add(savingAddressCheckbox);
		
		JLabel savingAddress = new JLabel("서울특별시 강남구 ");
		savingAddress.setFont(new Font("굴림", Font.PLAIN, 12));
		savingAddress.setBounds(131, 35, 152, 15);
		cartPanel.add(savingAddress);
		
		JCheckBox productAllCheckBox = new JCheckBox("상품 전체선택");
		productAllCheckBox.setFont(new Font("굴림", Font.BOLD, 12));
		productAllCheckBox.setBounds(8, 108, 115, 23);
		cartPanel.add(productAllCheckBox);
		
		JCheckBox product1CheckBox = new JCheckBox("");
		product1CheckBox.setBounds(36, 187, 21, 23);
		cartPanel.add(product1CheckBox);
		
		JCheckBox product2CheckBox = new JCheckBox("");
		product2CheckBox.setBounds(36, 345, 21, 23);
		cartPanel.add(product2CheckBox);
		
		JLabel productName1 = new JLabel("빨가면 사과,사과는 맛있어! ");
		productName1.setFont(new Font("굴림", Font.BOLD, 12));
		productName1.setBounds(65, 130, 127, 23);
		cartPanel.add(productName1);
		
		JLabel productName2 = new JLabel("나는 신비복숭아");
		productName2.setFont(new Font("굴림", Font.BOLD, 12));
		productName2.setBounds(65, 296, 131, 15);
		cartPanel.add(productName2);
		
		JLabel product2Image2 = new JLabel("");
		product2Image2.setIcon(new ImageIcon(JFrame.class.getResource("/images/과일/복숭아7090.jpg")));
		product2Image2.setBounds(65, 321, 70, 90);
		cartPanel.add(product2Image2);
		
		JLabel productPrice1 = new JLabel("금액:");
		productPrice1.setBounds(161, 187, 57, 15);
		cartPanel.add(productPrice1);
		
		JLabel productPrice2 = new JLabel("금액:");
		productPrice2.setBounds(161, 345, 57, 15);
		cartPanel.add(productPrice2);
		
		JLabel product1Image1 = new JLabel("");
		product1Image1.setIcon(new ImageIcon(JFrame.class.getResource("/images/과일/사과7090.jpg")));
		product1Image1.setBounds(65, 163, 70, 90);
		cartPanel.add(product1Image1);
		
		JButton orderBTn = new JButton("주문하기");
		orderBTn.setForeground(new Color(255, 255, 255));
		orderBTn.setBackground(new Color(204, 0, 255));
		orderBTn.setFont(new Font("굴림", Font.BOLD, 25));
		orderBTn.setBounds(36, 497, 290, 52);
		cartPanel.add(orderBTn);
		
		JPanel orderPanel = new JPanel();
		mainTabbedPane.addTab("주문하기", null, orderPanel, null);
		
		JPanel noticePanel = new JPanel();
		mainTabbedPane.addTab("공지사항", null, noticePanel, null);
		noticePanel.setLayout(new BorderLayout(0, 0));
		
		noticeTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		noticePanel.add(noticeTabbedPane);
		
		notice1 = new JPanel();
		noticeTabbedPane.addTab("배송 안내", null, notice1, null);
		notice1.setLayout(null);
		
		notice1Date = new JTextField();
		notice1Date.setText("작성일자");
		notice1Date.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		notice1Date.setBounds(245, 3, 116, 30);
		notice1.add(notice1Date);
		notice1Date.setColumns(10);
		
		JTextPane notice1Content = new JTextPane();
		notice1Content.setText("안녕하세요! 마켓콜리 입니다. 마켓콜리를 사랑해주시고 아껴주신 고객님께 진심으로 감사드립니다. 오전에 주문 시 당일 출고되어 배송됩니다.");
		notice1Content.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
		notice1Content.setBounds(0, 42, 354, 500);
		notice1.add(notice1Content);
		
		notice1Title = new JTextField();
		notice1Title.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		notice1Title.setText("배송 안내");
		notice1Title.setBounds(0, 3, 233, 30);
		notice1.add(notice1Title);
		notice1Title.setColumns(10);
		
		JPanel notice2 = new JPanel();
		notice2.setLayout(null);
		noticeTabbedPane.addTab("긴급공지", null, notice2, null);
		
		notice2Date = new JTextField();
		notice2Date.setText("작성일자");
		notice2Date.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		notice2Date.setColumns(10);
		notice2Date.setBounds(245, 3, 116, 30);
		notice2.add(notice2Date);
		
		JTextPane notice2content = new JTextPane();
		notice2content.setText("안녕하세요! 마켓콜리 입니다. 마켓콜리를 사랑해주시고 아껴주신 고객님께 진심으로 감사드립니다. 현재 코로나 사태로 인한 배송량이 급증하여 당일출고가 어려운점 안내드립니다. 회원님들의 양해 부탁드립니다. 항상 최선을 다하는 마켓콜리가 되겠습니다. ");
		notice2content.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
		notice2content.setBounds(0, 42, 354, 500);
		notice2.add(notice2content);
		
		notice2Title = new JTextField();
		notice2Title.setText("긴급공지");
		notice2Title.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		notice2Title.setColumns(10);
		notice2Title.setBounds(0, 3, 233, 30);
		notice2.add(notice2Title);
	}
	
	
}//