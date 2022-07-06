package com.itwill.marketcoli.ui;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.List;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTabbedPane;

import com.itwill.marketcoli.dto.Product;
import com.itwill.marketcoli.service.ProductService;

import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class ProductListPanel extends JPanel {
	
	private ProductService productService;

	private JPanel pItemPanel;
	private JPanel pItemListPanel;
	private JPanel pListPanel;
	private JTabbedPane productTabbedPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JScrollPane pScrollPane;

	/**
	 * Create the panel.
	 */
	public ProductListPanel() {
		setLayout(new BorderLayout(390, 680));

		productTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		add(productTabbedPane, BorderLayout.CENTER);

		pListPanel = new JPanel();
		productTabbedPane.addTab("전체상품보기", null, pListPanel, null);
		pListPanel.setLayout(new BorderLayout(0, 0));

		pScrollPane = new JScrollPane();
		pListPanel.add(pScrollPane, BorderLayout.CENTER);
		
		pItemListPanel = new JPanel();
		pItemListPanel.setPreferredSize(new Dimension(10, 1000));
		pScrollPane.setViewportView(pItemListPanel);
		pItemListPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		/**********************************************************/
		pItemPanel = new JPanel();
		pItemPanel.setBackground(new Color(230, 230, 250));
		pItemPanel.setPreferredSize(new Dimension(390, 155));
		pItemListPanel.add(pItemPanel);
		pItemPanel.setLayout(null);

		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ProductListPanel.class.getResource("/images/listProduct/사과.jpg")));
		lblNewLabel.setBounds(12, 10, 135, 135);
		pItemPanel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("사과");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 13));
		lblNewLabel_1.setBounds(173, 27, 57, 15);
		pItemPanel.add(lblNewLabel_1);
				
		lblNewLabel_2 = new JLabel("가격");
		lblNewLabel_2.setBounds(173, 52, 57, 15);
		pItemPanel.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("설명");
		lblNewLabel_3.setBounds(173, 77, 205, 68);
		pItemPanel.add(lblNewLabel_3);
		/**********************************************************/

		productService = new ProductService();
		try {
			productListDisplay();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	/**************** productListDisplay 메소드 ******************/
	public void productListDisplay() throws Exception {
		List<Product> productList = productService.productList();
		pItemListPanel.removeAll();
		for (int i = 0; i < productList.size(); i++) {
			Product product = productList.get(i);

			pItemPanel = new JPanel();
			pItemPanel.setBackground(new Color(230, 230, 250));
			pItemPanel.setPreferredSize(new Dimension(390, 155));
			pItemListPanel.add(pItemPanel);
			pItemPanel.setLayout(null);

			lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(ProductListPanel.class.getResource("/images/listProduct/"+product.getP_name()+".jpg")));
			lblNewLabel.setBounds(12, 10, 135, 135);
			pItemPanel.add(lblNewLabel);
			
			lblNewLabel_1 = new JLabel(product.getP_name());
			lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 13));
			lblNewLabel_1.setBounds(173, 27, 57, 15);
			pItemPanel.add(lblNewLabel_1);
					
			lblNewLabel_2 = new JLabel(product.getP_price()+"");
			lblNewLabel_2.setBounds(173, 52, 57, 15);
			pItemPanel.add(lblNewLabel_2);
			
			lblNewLabel_3 = new JLabel(product.getP_exp());
			lblNewLabel_3.setBounds(173, 77, 205, 68);
			pItemPanel.add(lblNewLabel_3);

		}
	}
}
