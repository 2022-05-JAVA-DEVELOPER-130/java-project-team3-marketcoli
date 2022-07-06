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

public class ProductListPanel extends JPanel {
	
	private ProductService productService;

	private JPanel pItemPanel;
	private JPanel pItemListPanel;
	private JScrollPane pScrollPane;
	private JPanel pListPanel;
	private JTabbedPane productTabbedPane;
	private JLabel pLabel_3;
	private JLabel pLabel_2;
	private JLabel pLabel;
	private JLabel pLabel_4;

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
		/**********************************************************/
		pItemListPanel = new JPanel();
		pItemListPanel.setPreferredSize(new Dimension(10, 800));
		pScrollPane.setViewportView(pItemListPanel);
		pItemListPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		pItemPanel = new JPanel();
		pItemPanel.setBackground(new Color(230, 230, 250));
		pItemPanel.setPreferredSize(new Dimension(390, 155));
		pItemListPanel.add(pItemPanel);
		pItemPanel.setLayout(null);

		pLabel = new JLabel("그림");
		pLabel.setIcon(new ImageIcon(ProductListPanel.class.getResource("/images/listProduct/체리.jpg")));
		pLabel.setBounds(12, 10, 135, 135);
		pItemPanel.add(pLabel);

		pLabel_4 = new JLabel("상품명");
		pLabel_4.setBounds(159, 20, 219, 15);
		pItemPanel.add(pLabel_4);

		pLabel_2 = new JLabel("가격");
		pLabel_2.setBounds(159, 50, 219, 15);
		pItemPanel.add(pLabel_2);

		pLabel_3 = new JLabel("설명");
		pLabel_3.setBounds(159, 75, 219, 60);
		pItemPanel.add(pLabel_3);
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
		pItemListPanel.removeAll();
		List<Product> productList = productService.productList();
		
		
		for (int i = 0; i < productList.size(); i++) {
			Product product = productList.get(i);

			pItemListPanel = new JPanel();
			pItemListPanel.setPreferredSize(new Dimension(10, 800));
			pScrollPane.setViewportView(pItemListPanel);
			pItemListPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

			pItemPanel = new JPanel();
			pItemPanel.setBackground(new Color(230, 230, 250));
			pItemPanel.setPreferredSize(new Dimension(390, 155));
			pItemListPanel.add(pItemPanel);
			pItemPanel.setLayout(null);

			//System.out.println(ProductListPanel.class.getResource("/images/listProduct/"+product.getP_name()+".jpg")));
	
			
			pLabel = new JLabel("");
			pLabel.setIcon(new ImageIcon(ProductListPanel.class.getResource("/images/listProduct/"+product.getP_name()+".jpg")));
			pLabel.setBounds(12, 10, 135, 135);
			pItemPanel.add(pLabel);

			pLabel_4 = new JLabel(product.getP_name());
			pLabel_4.setBounds(159, 20, 219, 15);
			pItemPanel.add(pLabel_4);

			pLabel_2 = new JLabel(product.getP_price()+"");
			pLabel_2.setBounds(159, 50, 219, 15);
			pItemPanel.add(pLabel_2);

			pLabel_3 = new JLabel(product.getP_exp());
			pLabel_3.setBounds(159, 75, 219, 60);
			pItemPanel.add(pLabel_3);

		}
	}
}
