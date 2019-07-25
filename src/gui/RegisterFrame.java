package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import data.Doctor;
import data.Office;
import data.OfficeDataBase;
import logic.RegisterSystem;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.Color;

public class RegisterFrame extends JFrame {

	private JPanel contentPane;
	private JLabel textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_7;
	JPanel panel;
	JPanel panel_1_1;
	private JTextField textField_2;
	JComboBox comboBox_4;
	JLabel label_10;
	JComboBox comboBox_3;
	private int x,y;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterFrame frame = new RegisterFrame();
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
	public RegisterFrame() {
		RegisterSystem registerSystem=RegisterSystem.getInstance();
		String displayid=String.valueOf(registerSystem.getRecordid());

		this.setUndecorated(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		setBounds(100, 100, 595, 462);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 255, 250));
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
		
		JButton button_1 = new JButton("");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setExtendedState(JFrame.ICONIFIED);
			}
		});
		button_1.setFocusPainted(false);
		button_1.setBorderPainted(false);
		button_1.setContentAreaFilled(false);
		button_1.setBounds(497, 0, 45, 45);
		ImageIcon ii2 = new ImageIcon("C:/Users/gcommit/Downloads/减.png");
		Image temp2 = ii2.getImage().getScaledInstance(button_1.getWidth(), button_1.getHeight(), ii2.getImage().SCALE_DEFAULT);  
		ii2 = new ImageIcon(temp2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(135, 206, 250));
		panel_2.setBounds(591, 0, 4, 492);
		contentPane.add(panel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 4, 492);
		contentPane.add(panel_1);
		panel_1.setBackground(new Color(135, 206, 250));
		button_1.setIcon(ii2);
		button_1.setToolTipText("image");
		contentPane.add(button_1);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(545, 0, 45, 45);
		ImageIcon ii1 = new ImageIcon("C:/Users/gcommit/Downloads/close.png");
		Image temp1 = ii1.getImage().getScaledInstance(btnNewButton_1.getWidth(), btnNewButton_1.getHeight(), ii1.getImage().SCALE_DEFAULT);  
		ii1 = new ImageIcon(temp1);
		btnNewButton_1.setIcon(ii1);
		btnNewButton_1.setToolTipText("image");
		contentPane.add(btnNewButton_1);
		
		panel = new JPanel();
		panel.setBackground(new Color(245, 255, 250));
		panel.setBounds(4, 43, 588, 383);
		contentPane.add(panel);
		panel.setLayout(null);
		textField = new JLabel(displayid);
		textField.setFont(new Font("华文宋体", Font.PLAIN, 20));
		textField.setBounds(122, 15, 96, 35);
		panel.add(textField);
				
				textField_1 = new JTextField();
				textField_1.setFont(new Font("华文宋体", Font.PLAIN, 20));
				textField_1.setBounds(418, 15, 96, 35);
				panel.add(textField_1);
				textField_1.setColumns(10);
				
				textField_3 = new JTextField();
				textField_3.setFont(new Font("华文宋体", Font.PLAIN, 20));
				textField_3.setBounds(372, 64, 201, 35);
				panel.add(textField_3);
				textField_3.setColumns(10);
				
				textField_4 = new JTextField("（格式：yyyy-MM-dd）");
				textField_4.setFont(new Font("华文宋体", Font.PLAIN, 20));
				textField_4.addInputMethodListener(new InputMethodListener() {
					public void caretPositionChanged(InputMethodEvent arg0) {
					}
					public void inputMethodTextChanged(InputMethodEvent arg0) {
						String age=registerSystem.getAge(textField_4.getText());
						if(age.equals("")) {
							
						}else {
							textField_5.setText(age);
						}
					}
				});
				textField_4.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						textField_4.setText("");
					}
				});
				textField_4.setBounds(372, 114, 201, 35);
				panel.add(textField_4);
				textField_4.setColumns(10);
				
				textField_5 = new JTextField();
				textField_5.setFont(new Font("华文宋体", Font.PLAIN, 20));
				textField_5.setBounds(120, 114, 126, 35);
				panel.add(textField_5);
				textField_5.setColumns(10);
				
				textField_7 = new JTextField();
				textField_7.setFont(new Font("华文宋体", Font.PLAIN, 20));
				textField_7.setBounds(372, 164, 201, 35);
				panel.add(textField_7);
				textField_7.setColumns(10);
				
				JLabel lblNewLabel = new JLabel("\u75C5\u5386\u53F7\uFF1A");
				lblNewLabel.setFont(new Font("华文宋体", Font.PLAIN, 20));
				lblNewLabel.setBounds(30, 18, 91, 24);
				panel.add(lblNewLabel);
				
				JLabel label = new JLabel("\u59D3\u540D\uFF1A");
				label.setFont(new Font("华文宋体", Font.PLAIN, 20));
				label.setBounds(296, 18, 81, 24);
				panel.add(label);
				
				JLabel label_1 = new JLabel("\u6027\u522B\uFF1A");
				label_1.setFont(new Font("华文宋体", Font.PLAIN, 20));
				label_1.setBounds(50, 65, 81, 34);
				panel.add(label_1);
				
				JComboBox comboBox = new JComboBox();
				comboBox.setBackground(new Color(240, 248, 255));
				comboBox.setFont(new Font("华文宋体", Font.PLAIN, 20));
				comboBox.setBounds(120, 65, 126, 34);
				comboBox.addItem("男");
				comboBox.addItem("女");
				panel.add(comboBox);
				
				JLabel label_2 = new JLabel("\u51FA\u751F\u65E5\u671F\uFF1A");
				label_2.setFont(new Font("华文宋体", Font.PLAIN, 20));
				label_2.setBounds(261, 113, 109, 32);
				panel.add(label_2);
				
				JLabel label_3 = new JLabel("\u5E74\u9F84\uFF1A");
				label_3.setFont(new Font("华文宋体", Font.PLAIN, 20));
				label_3.setBounds(50, 121, 81, 21);
				panel.add(label_3);
				
				JLabel label_4 = new JLabel("\u8EAB\u4EFD\u8BC1\u53F7\uFF1A");
				label_4.setFont(new Font("华文宋体", Font.PLAIN, 20));
				label_4.setBounds(261, 67, 109, 32);
				panel.add(label_4);
				
				JLabel label_5 = new JLabel("\u7ED3\u7B97\u7C7B\u522B\uFF1A");
				label_5.setFont(new Font("华文宋体", Font.PLAIN, 20));
				label_5.setBounds(15, 162, 106, 35);
				panel.add(label_5);
				
				JComboBox comboBox_1 = new JComboBox();
				comboBox_1.setBackground(new Color(240, 248, 255));
				comboBox_1.setFont(new Font("华文宋体", Font.PLAIN, 20));
				comboBox_1.setBounds(122, 162, 128, 35);
				comboBox_1.addItem("自费");
				comboBox_1.addItem("医保");
				panel.add(comboBox_1);
				
				JLabel label_6 = new JLabel("\u5BB6\u5EAD\u4F4F\u5740\uFF1A");
				label_6.setFont(new Font("华文宋体", Font.PLAIN, 20));
				label_6.setBounds(261, 165, 106, 32);
				panel.add(label_6);
				
				JLabel label_7 = new JLabel("\u6302\u53F7\u7EA7\u522B\uFF1A");
				label_7.setFont(new Font("华文宋体", Font.PLAIN, 20));
				label_7.setBounds(15, 218, 106, 28);
				panel.add(label_7);
				
				JComboBox comboBox_2 = new JComboBox();
				comboBox_2.setBackground(new Color(240, 248, 255));
				comboBox_2.setFont(new Font("华文宋体", Font.PLAIN, 20));
				comboBox_2.setBounds(122, 214, 128, 35);
				comboBox_2.addItem("普通");
				comboBox_2.addItem("专家");
				comboBox_2.addItemListener(new ItemListener() {
					public void itemStateChanged(ItemEvent arg0) {
						if(comboBox_3.getSelectedItem().equals("请选择科室")) {
							
						}else {
							String officeName=(String)comboBox_3.getSelectedItem();
							comboBox_4.removeAllItems();
							comboBox_4.addItem("请选择医生");
							Boolean level;
							if(((String)comboBox_2.getSelectedItem()).equals("专家")) {
								level=true;
							}else {
								level=false;
							}
							ArrayList<String> doctorNames=registerSystem.getDoctorNames(officeName,level);
							for(String doctorName:doctorNames) {
								comboBox_4.addItem(doctorName);
							}
						}
						if(comboBox_2.getSelectedItem().equals("普通")) {
							label_10.setText(String.valueOf(Integer.parseInt(label_10.getText())-25));
						}else {
							label_10.setText(String.valueOf(Integer.parseInt(label_10.getText())+25));
						}
					}
				});
				panel.add(comboBox_2);
				
				JLabel label_8 = new JLabel("\u6302\u53F7\u79D1\u5BA4\uFF1A");
				label_8.setFont(new Font("华文宋体", Font.PLAIN, 20));
				label_8.setBounds(261, 214, 116, 32);
				panel.add(label_8);
				
				comboBox_3 = new JComboBox();
				comboBox_3.setBackground(new Color(240, 248, 255));
				comboBox_3.setFont(new Font("华文宋体", Font.PLAIN, 20));
				comboBox_3.addItemListener(new ItemListener() {
					public void itemStateChanged(ItemEvent e) {
						String officeName=(String)e.getItem();
						if(officeName.equals("请选择科室")) {
						}else {
							comboBox_4.removeAllItems();
							comboBox_4.addItem("请选择医生");
							Boolean level;
							if(((String)comboBox_2.getSelectedItem()).equals("专家")) {
								level=true;
							}else {
								level=false;
							}
							ArrayList<String> doctorNames=registerSystem.getDoctorNames(officeName,level);
							for(String doctorName:doctorNames) {
								comboBox_4.addItem(doctorName);
							}
						}
					}
				});
				comboBox_3.setBounds(403, 213, 134, 35);
				comboBox_3.addItem("请选择科室");
				ArrayList<String> officeNames=registerSystem.getOfficeNames();
				for(String officeName:officeNames) {
					comboBox_3.addItem(officeName);
				}
				panel.add(comboBox_3);
				
				JLabel lblNewLabel_1 = new JLabel("\u770B\u8BCA\u533B\u751F\uFF1A");
				lblNewLabel_1.setFont(new Font("华文宋体", Font.PLAIN, 20));
				lblNewLabel_1.setBounds(15, 273, 106, 35);
				panel.add(lblNewLabel_1);
				
				comboBox_4 = new JComboBox();
				comboBox_4.setBackground(new Color(240, 248, 255));
				comboBox_4.setFont(new Font("华文宋体", Font.PLAIN, 20));
				comboBox_4.setBounds(122, 273, 128, 35);
				comboBox_4.addItem("请选择医生");
				panel.add(comboBox_4);
				
				JRadioButton radioButton = new JRadioButton("\u75C5\u5386\u672C");
				radioButton.setBackground(new Color(245, 255, 250));
				radioButton.setFont(new Font("华文宋体", Font.PLAIN, 20));
				radioButton.addItemListener(new ItemListener() {
					public void itemStateChanged(ItemEvent e) {
						if(radioButton.isSelected()) {
							label_10.setText(String.valueOf(Integer.parseInt(label_10.getText())+1));
						}else {
							label_10.setText(String.valueOf(Integer.parseInt(label_10.getText())-1));
						}
					}
				});
				radioButton.setBounds(413, 259, 139, 51);
				panel.add(radioButton);
				
				JLabel label_9 = new JLabel("\u5E94\u6536\u91D1\u989D\uFF1A");
				label_9.setFont(new Font("华文宋体", Font.PLAIN, 20));
				label_9.setBounds(15, 326, 109, 35);
				panel.add(label_9);
				
				label_10 = new JLabel("50");
				label_10.setFont(new Font("华文宋体", Font.PLAIN, 20));
				label_10.setBounds(122, 326, 96, 35);
				panel.add(label_10);
				
				JButton button = new JButton("\u6302\u53F7");
				button.setBackground(new Color(224, 255, 255));
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					}
				});
				button.setFont(new Font("华文宋体", Font.PLAIN, 20));
				button.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						String recordidString=textField.getText();
						String name=textField_1.getText();
						String sex=(String)comboBox.getSelectedItem();
						String idString=textField_3.getText();
						String ageString=textField_5.getText();
						String date=textField_4.getText();
						String wayToPay=(String)comboBox_1.getSelectedItem();
						String address=textField_7.getText();
						Boolean level;
						double money=Integer.parseInt(label_10.getText());
						if(((String)comboBox_2.getSelectedItem()).equals("专家")) {
							level=true;
						}else {
							level=false;
						}
						String officeName=(String)comboBox_3.getSelectedItem();
						String doctorName=(String)comboBox_4.getSelectedItem();
						Boolean needRecordBook=radioButton.isSelected();
						String messege=registerSystem.register(recordidString,name,sex,idString,ageString,date,wayToPay,address,level,officeName,doctorName,needRecordBook,money);
						switch(messege){
							case "done":
								ErrorFrame frame1=new ErrorFrame("挂号成功");
								frame1.setVisible(true);
								textField.setText(String.valueOf(registerSystem.getRecordid()));
								textField_1.setText("");
								comboBox.setSelectedItem("男");
								textField_3.setText("");
								textField_5.setText("");
								textField_4.setText("");
								comboBox_1.setSelectedItem("自费");
								textField_7.setText("");
								comboBox_2.setSelectedItem("普通");
								comboBox_3.setSelectedItem("请先选择科室");
								comboBox_4.setSelectedItem("请选择医生");
								radioButton.setSelected(false);
								label_10.setText("50");
								break;
							case "wrong date":
								ErrorFrame frame=new ErrorFrame("时间格式错误");
								frame.setVisible(true);
								break;
							case "lack":
								ErrorFrame frame2=new ErrorFrame("请输入所有信息");
								frame2.setVisible(true);
								break;
						}
					}
				});
				button.setBounds(403, 321, 128, 40);
				panel.add(button);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int left = getLocation().x;
                int top = getLocation().y;
                setLocation(left + e.getX() - x, top + e.getY() - y);
			}
		});
		menuBar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				x = e.getX();
                y = e.getY();
			}
		});
		menuBar.setBackground(new Color(135, 206, 250));
		menuBar.setFont(new Font("华文宋体", Font.PLAIN, 20));
		menuBar.setBounds(0, 0, 595, 45);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu();
		ImageIcon ii3 = new ImageIcon("C:/Users/gcommit/Downloads/菜单.png");
		Image temp3 = ii3.getImage().getScaledInstance(45, 45, ii3.getImage().SCALE_DEFAULT);
		ii3 = new ImageIcon(temp3);
		mnNewMenu.setIcon(ii3);
		mnNewMenu.setToolTipText("image");
		mnNewMenu.setFont(new Font("华文宋体", Font.PLAIN, 20));
		menuBar.add(mnNewMenu);
		
		JMenuItem menuItem = new JMenuItem("\u6302\u53F7");
		menuItem.setBackground(new Color(224, 255, 255));
		menuItem.setFont(new Font("华文宋体", Font.PLAIN, 20));
		menuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				panel_1_1.setVisible(false);
				panel.setVisible(true);
			}
		});
		mnNewMenu.add(menuItem);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("\u9000\u53F7");
		mntmNewMenuItem.setBackground(new Color(224, 255, 255));
		mntmNewMenuItem.setFont(new Font("华文宋体", Font.PLAIN, 20));
		mntmNewMenuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {

				panel.setVisible(false);
				panel_1_1.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu();
		mnNewMenu_1.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		LoginFrame frame=new LoginFrame();
	    		frame.setVisible(true);
	    		dispose();
	    	}
	    });
	    ImageIcon ii4 = new ImageIcon("C:/Users/gcommit/Downloads/用户.png");
		Image temp4 = ii4.getImage().getScaledInstance(45, 45, ii4.getImage().SCALE_DEFAULT);
		ii4 = new ImageIcon(temp4);
		mnNewMenu_1.setIcon(ii4);
		mnNewMenu_1.setToolTipText("image");
		mnNewMenu_1.setFont(new Font("华文宋体", Font.PLAIN, 20));
		menuBar.add(mnNewMenu_1);
		
		panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(245, 255, 250));
		panel_1_1.setBounds(0, 34, 519, 324);
		panel_1_1.setVisible(false);
		contentPane.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("\u75C5\u5386\u53F7\uFF1A");
		lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 22));
		lblNewLabel_2.setBounds(100, 86, 123, 53);
		panel_1_1.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("宋体", Font.PLAIN, 22));
		textField_2.setBounds(250, 86, 211, 53);
		panel_1_1.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("\u9000\u53F7");
		btnNewButton.setBackground(new Color(224, 255, 255));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String recordidString=textField_2.getText();
				String messege=registerSystem.withdraw(recordidString);
				switch(messege) {
				case"wrong":
					ErrorFrame frame1=new ErrorFrame("请按格式输入");
					frame1.setVisible(true);
					break;
				case"lack":
					ErrorFrame frame2=new ErrorFrame("无此病历号");
					frame2.setVisible(true);
					break;
				case"done":
					ErrorFrame frame3=new ErrorFrame("退号成功");
					frame3.setVisible(true);
					break;
				case"finished":
					ErrorFrame frame4=new ErrorFrame("已看诊");
					frame4.setVisible(true);
					break;
				}
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 22));
		btnNewButton.setBounds(200, 215, 150, 58);
		panel_1_1.add(btnNewButton);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(135, 206, 250));
		panel_3.setBounds(0, 458, 595, 4);
		contentPane.add(panel_3);
		
	}
}
