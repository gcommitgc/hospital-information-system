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
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;

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
		
		setTitle("��¼");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		setBounds(100, 100, 450, 300);
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
		
		textField = new JTextField();
		textField.setBounds(146, 39, 157, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("\u8D26\u53F7\uFF1A");
		label.setBounds(73, 42, 81, 21);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u5BC6\u7801\uFF1A");
		label_1.setBounds(73, 129, 81, 21);
		contentPane.add(label_1);
		
		JButton button = new JButton("\u767B\u5F55");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String account=textField.getText();
				String password=String.valueOf(passwordField.getPassword());
				String systemToOpen=loginSystem.logIn(account, password);
				if((account.equals("")||(password.equals("")))) {
					JOptionPane.showMessageDialog(null, "�������˺ź�����", "����", 0);
				}
				else {
					if (systemToOpen=="wrong") {
						JOptionPane.showMessageDialog(null, "�˺Ż��������", "����", 0);
					}else {
						switch(systemToOpen) {
						case "����Ա":
							AdminFrame adminFrame = new AdminFrame();
							adminFrame.setVisible(true);
							break;
						case "�Һ�Ա":
							RegisterFrame registerFrame = new RegisterFrame();
							registerFrame.setVisible(true);
							break;
						case "����Ա":
							CashierFrame cashierFrame=new CashierFrame();
							cashierFrame.setVisible(true);
							break;
						case "ҩ��":
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
		button.setBounds(161, 189, 123, 29);
		contentPane.add(button);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(146, 126, 157, 27);
		contentPane.add(passwordField);
	}
}
