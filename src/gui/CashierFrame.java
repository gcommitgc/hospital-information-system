package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CashierFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_7;
	JPanel panel;
	JPanel panel_1_1;
	JPanel panel_2_1;
	JPanel panel_3_1;
	private JTextField textField_2;
	private JTextField textField_6;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CashierFrame frame = new CashierFrame();
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
	public CashierFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		setBounds(100, 100, 541, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		int windowWidth = this.getWidth();
        int windowHeight = this.getHeight();
        Toolkit kit = Toolkit.getDefaultToolkit(); 
        Dimension screenSize = kit.getScreenSize(); 
        int screenWidth = screenSize.width; 
        int screenHeight = screenSize.height; 
        this.setLocation(screenWidth/2-windowWidth/2, screenHeight/2-windowHeight/2);
        
        panel_3_1 = new JPanel();
		panel_3_1.setBounds(0, 34, 519, 324);
		panel_3_1.setVisible(false);
		contentPane.add(panel_3_1);
		panel_3_1.setLayout(null);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(227, 86, 211, 53);
		panel_3_1.add(textField_8);
		
		JLabel label_12 = new JLabel("\u75C5\u5386\u53F7\uFF1A");
		label_12.setFont(new Font("宋体", Font.PLAIN, 22));
		label_12.setBounds(89, 86, 123, 53);
		panel_3_1.add(label_12);
		
		JButton button_1 = new JButton("\u7F34\u8D39");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setFont(new Font("宋体", Font.PLAIN, 22));
		button_1.setBounds(172, 215, 150, 58);
		panel_3_1.add(button_1);
		
		panel_2_1 = new JPanel();
		panel_2_1.setBounds(0, 34, 519, 324);
		panel_2_1.setVisible(false);
		contentPane.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		textField_6 = new JTextField();
		textField_6.setBounds(227, 86, 211, 53);
		panel_2_1.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel label_11 = new JLabel("\u75C5\u5386\u53F7\uFF1A");
		label_11.setFont(new Font("宋体", Font.PLAIN, 22));
		label_11.setBounds(89, 86, 123, 53);
		panel_2_1.add(label_11);
		
		JButton btnNewButton_1 = new JButton("\u9000\u8D39");
		btnNewButton_1.setFont(new Font("宋体", Font.PLAIN, 22));
		btnNewButton_1.setBounds(172, 215, 150, 58);
		panel_2_1.add(btnNewButton_1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 519, 31);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("\u529F\u80FD");
		menuBar.add(mnNewMenu);
		
//		JMenuItem menuItem = new JMenuItem("\u6302\u53F7");
//		menuItem.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mousePressed(MouseEvent e) {
//				panel_1_1.setVisible(false);
//				panel_2_1.setVisible(false);
//				panel_3_1.setVisible(false);
////				panel.setVisible(true);
//			}
//		});
//		mnNewMenu.add(menuItem);
		
//		JMenuItem mntmNewMenuItem = new JMenuItem("\u9000\u53F7");
//		mntmNewMenuItem.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mousePressed(MouseEvent e) {
//				panel_2_1.setVisible(false);
//				panel_3_1.setVisible(false);
////				panel.setVisible(false);
//				panel_1_1.setVisible(true);
//			}
//		});
//		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("\u9000\u8D39");
		menuItem_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				panel_3_1.setVisible(false);
//				panel.setVisible(false);
				panel_1_1.setVisible(false);
				panel_2_1.setVisible(true);
			}
		});
		mnNewMenu.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("\u7F34\u8D39");
		menuItem_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
//				panel.setVisible(false);
				panel_1_1.setVisible(false);
				panel_2_1.setVisible(false);
				panel_3_1.setVisible(true);
			}
		});
		mnNewMenu.add(menuItem_2);
		
		JMenu mnNewMenu_1 = new JMenu("\u8D26\u6237");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem menuItem_3 = new JMenuItem("\u9000\u51FA\u767B\u5F55");
		menuItem_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				LoginFrame frame = new LoginFrame();
				frame.setVisible(true);
				dispose();
			}
		});
		mnNewMenu_1.add(menuItem_3);
		
		panel = new JPanel();
		panel.setBounds(0, 34, 519, 324);
		panel.setVisible(false);
		
		panel_1_1 = new JPanel();
		panel_1_1.setBounds(0, 34, 519, 324);
		panel_1_1.setVisible(false);
		contentPane.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("\u75C5\u5386\u53F7\uFF1A");
		lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 22));
		lblNewLabel_2.setBounds(89, 86, 123, 53);
		panel_1_1.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("宋体", Font.PLAIN, 22));
		textField_2.setBounds(227, 86, 211, 53);
		panel_1_1.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("\u9000\u53F7");
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 22));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(172, 215, 150, 58);
		panel_1_1.add(btnNewButton);
//		contentPane.add(panel);
//		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(95, 31, 96, 27);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(349, 31, 96, 27);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(303, 73, 201, 27);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(303, 115, 201, 27);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(95, 115, 96, 27);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(303, 157, 201, 27);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u75C5\u5386\u53F7\uFF1A");
		lblNewLabel.setBounds(15, 34, 81, 21);
		panel.add(lblNewLabel);
		
		JLabel label = new JLabel("\u59D3\u540D\uFF1A");
		label.setBounds(281, 34, 81, 21);
		panel.add(label);
		
		JLabel label_1 = new JLabel("\u6027\u522B\uFF1A");
		label_1.setBounds(25, 76, 81, 21);
		panel.add(label_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(95, 73, 96, 27);
		panel.add(comboBox);
		
		JLabel label_2 = new JLabel("\u51FA\u751F\u65E5\u671F\uFF1A");
		label_2.setBounds(199, 118, 96, 21);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("\u5E74\u9F84\uFF1A");
		label_3.setBounds(25, 118, 81, 21);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("\u8EAB\u4EFD\u8BC1\u53F7\uFF1A");
		label_4.setBounds(199, 76, 109, 21);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("\u7ED3\u7B97\u7C7B\u522B\uFF1A");
		label_5.setBounds(0, 160, 91, 21);
		panel.add(label_5);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(95, 157, 96, 27);
		panel.add(comboBox_1);
		
		JLabel label_6 = new JLabel("\u5BB6\u5EAD\u4F4F\u5740\uFF1A");
		label_6.setBounds(202, 160, 96, 21);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("\u6302\u53F7\u7EA7\u522B\uFF1A");
		label_7.setBounds(0, 207, 96, 21);
		panel.add(label_7);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(95, 204, 96, 27);
		panel.add(comboBox_2);
		
		JLabel label_8 = new JLabel("\u6302\u53F7\u79D1\u5BA4\uFF1A");
		label_8.setBounds(246, 207, 96, 21);
		panel.add(label_8);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(349, 204, 96, 27);
		panel.add(comboBox_3);
		
		JLabel lblNewLabel_1 = new JLabel("\u770B\u8BCA\u533B\u751F\uFF1A");
		lblNewLabel_1.setBounds(0, 255, 96, 21);
		panel.add(lblNewLabel_1);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(95, 252, 96, 27);
		panel.add(comboBox_4);
		
		JRadioButton radioButton = new JRadioButton("\u75C5\u5386\u672C");
		radioButton.setBounds(359, 251, 177, 29);
		panel.add(radioButton);
		
		JLabel label_9 = new JLabel("\u5E94\u6536\u91D1\u989D\uFF1A");
		label_9.setBounds(0, 294, 96, 21);
		panel.add(label_9);
		
		JLabel label_10 = new JLabel("");
		label_10.setBounds(95, 294, 91, 21);
		panel.add(label_10);
		
		JButton button = new JButton("\u6302\u53F7");
		button.setBounds(334, 290, 123, 29);
		panel.add(button);
	}

}
