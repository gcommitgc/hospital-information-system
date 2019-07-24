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
	JPanel panel_2_1;
	JPanel panel_3_1;
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
		menuBar.setBounds(0, 0, 535, 31);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("\u529F\u80FD");
		menuBar.add(mnNewMenu);
		
		JMenuItem menuItem_1 = new JMenuItem("\u9000\u8D39");
		menuItem_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				panel_3_1.setVisible(false);
				panel_2_1.setVisible(true);
			}
		});
		mnNewMenu.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("\u7F34\u8D39");
		menuItem_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
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
	}

}
