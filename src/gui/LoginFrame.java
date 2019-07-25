package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logic.LoginSystem;

import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
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
	public LoginFrame() {
		LoginSystem loginSystem=LoginSystem.getInstance();
		
		setTitle("登录");
		
		this.setUndecorated(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 255, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		int windowWidth = this.getWidth();
        int windowHeight = this.getHeight();
        Toolkit kit = Toolkit.getDefaultToolkit(); 
        Dimension screenSize = kit.getScreenSize(); 
        int screenWidth = screenSize.width; 
        int screenHeight = screenSize.height; 
        this.setLocation(screenWidth/2-windowWidth/2, screenHeight/2-windowHeight/2);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(new Color(224, 255, 255));
		textField.setBounds(172, 66, 157, 27);
		textField.setFont(new Font("华文宋体", Font.PLAIN, 20));
		textField.setBorder(BorderFactory.createLoweredBevelBorder());
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("\u8D26\u53F7\uFF1A");
		label.setBounds(99, 69, 81, 21);
		label.setFont(new Font("华文宋体", Font.PLAIN, 20));
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u5BC6\u7801\uFF1A");
		label_1.setBounds(99, 156, 81, 21);
		label_1.setFont(new Font("华文宋体", Font.PLAIN, 20));
		contentPane.add(label_1);
		
		JButton button = new JButton("\u767B\u5F55");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setBounds(172, 216, 123, 29);
		button.setBackground(new Color(240, 255, 255));
		button.setFont(new Font("华文宋体", Font.PLAIN, 20));
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String account=textField.getText();
				String password=String.valueOf(passwordField.getPassword());
				String systemToOpen=loginSystem.logIn(account, password);
				if((account.equals("")||(password.equals("")))) {
					ErrorFrame frame=new ErrorFrame("请输入账号密码");
					frame.setVisible(true);
				}
				else {
					if (systemToOpen=="wrong") {
						ErrorFrame frame=new ErrorFrame("账号密码错误");
						frame.setVisible(true);
					}else {
						switch(systemToOpen) {
						case "管理员":
							AdminFrame adminFrame = new AdminFrame();
							adminFrame.setVisible(true);
							break;
						case "挂号员":
							RegisterFrame registerFrame = new RegisterFrame();
							registerFrame.setVisible(true);
							break;
						case "收银员":
							CashierFrame cashierFrame=new CashierFrame();
							cashierFrame.setVisible(true);
							break;
						case "药房":
							PharmacyFrame pharmacyFrame=new PharmacyFrame();
							pharmacyFrame.setVisible(true);
							break;
						default:
							DoctorFrame doctorFrame=new DoctorFrame(systemToOpen);
							doctorFrame.setVisible(true);
							break;
						}
						dispose();
							
					}
				}
			}
		});
		contentPane.add(button);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(224, 255, 255));
		passwordField.setBounds(172, 153, 157, 27);
		passwordField.setBorder(BorderFactory.createLoweredBevelBorder());
		passwordField.setFont(new Font("华文宋体", Font.PLAIN, 20));
		contentPane.add(passwordField);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 450, 35);
		panel.setBackground(new Color(135, 206, 250));
		contentPane.add(panel);
		
		JButton button_1 = new JButton();
		button_1.setBounds(415, 0, 35, 35);
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		panel.setLayout(null);
		panel.add(button_1);
		button_1.setToolTipText("image");
		button_1.setFocusPainted(false);
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		ImageIcon ii1 = new ImageIcon("C:/Users/gcommit/Downloads/close.png");
		Image temp1 = ii1.getImage().getScaledInstance(button_1.getWidth(), button_1.getHeight(), ii1.getImage().SCALE_DEFAULT);  
		ii1 = new ImageIcon(temp1);
		button_1.setIcon(ii1);
		button_1.setToolTipText("image");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(135, 206, 250));
		panel_1.setBounds(446, 27, 4, 273);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(135, 206, 250));
		panel_2.setBounds(0, 27, 4, 273);
		contentPane.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(135, 206, 250));
		panel_3.setBounds(0, 296, 450, 4);
		contentPane.add(panel_3);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(380, 0, 35, 35);
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setExtendedState(JFrame.ICONIFIED);
			}
		});
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ImageIcon ii2 = new ImageIcon("C:/Users/gcommit/Downloads/减.png");
		Image temp2 = ii2.getImage().getScaledInstance(btnNewButton_2.getWidth(), btnNewButton_2.getHeight(), ii2.getImage().SCALE_DEFAULT);  
		ii2 = new ImageIcon(temp2);
		btnNewButton_2.setIcon(ii2);
		btnNewButton_2.setToolTipText("image");
		panel.add(btnNewButton_2);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(0, 0, 35, 35);
		ImageIcon ii4 = new ImageIcon("C:/Users/gcommit/Downloads/登录.png");
		Image temp4 = ii4.getImage().getScaledInstance(lblNewLabel_4.getWidth(), lblNewLabel_4.getHeight(), ii4.getImage().SCALE_DEFAULT);  
		ii4 = new ImageIcon(temp4);
		lblNewLabel_4.setIcon(ii4);
		lblNewLabel_4.setToolTipText("image");
		panel.add(lblNewLabel_4);
	}
}
