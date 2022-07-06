package com.itwill.marketcoli.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class ordersCheckB extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JButton orderCheckBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ordersCheckB dialog = new ordersCheckB();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ordersCheckB() {
		setBounds(100, 100, 375, 175);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("요청하신 주문이 완료 되었습니다.");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(48, 10, 263, 83);
		contentPanel.add(lblNewLabel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				orderCheckBtn = new JButton("확인");
				orderCheckBtn.setActionCommand("OK");
				buttonPane.add(orderCheckBtn);
				getRootPane().setDefaultButton(orderCheckBtn);
			}
		}
	}
}
