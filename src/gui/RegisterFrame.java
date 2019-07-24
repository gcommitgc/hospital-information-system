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
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;

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
	JPanel panel_2_1;
	JPanel panel_3_1;
	private JTextField textField_2;
	private JTextField textField_6;
	private JTextField textField_8;
	JComboBox comboBox_4;
	JLabel label_10;
	JComboBox comboBox_3;

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
		
		JMenuItem menuItem = new JMenuItem("\u6302\u53F7");
		menuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				panel_1_1.setVisible(false);
				panel_2_1.setVisible(false);
				panel_3_1.setVisible(false);
				panel.setVisible(true);
			}
		});
		mnNewMenu.add(menuItem);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("\u9000\u53F7");
		mntmNewMenuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				panel_2_1.setVisible(false);
				panel_3_1.setVisible(false);
				panel.setVisible(false);
				panel_1_1.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
//		JMenuItem menuItem_1 = new JMenuItem("\u9000\u8D39");
//		menuItem_1.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mousePressed(MouseEvent e) {
//				panel_3_1.setVisible(false);
//				panel.setVisible(false);
//				panel_1_1.setVisible(false);
//				panel_2_1.setVisible(true);
//			}
//		});
//		mnNewMenu.add(menuItem_1);
		
//		JMenuItem menuItem_2 = new JMenuItem("\u7F34\u8D39");
//		menuItem_2.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mousePressed(MouseEvent e) {
//				panel.setVisible(false);
//				panel_1_1.setVisible(false);
//				panel_2_1.setVisible(false);
//				panel_3_1.setVisible(true);
//			}
//		});
//		mnNewMenu.add(menuItem_2);
		
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
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String recordidString=textField_2.getText();
				String messege=registerSystem.withdraw(recordidString);
				switch(messege) {
				case"wrong":
					JOptionPane.showMessageDialog(null, "请按格式输入", "错误", 0);
					break;
				case"lack":
					JOptionPane.showMessageDialog(null, "无此病历号", "错误", 0);
					break;
				case"done":
					JOptionPane.showMessageDialog(null, "退号成功", "提示",JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 22));
		btnNewButton.setBounds(172, 215, 150, 58);
		panel_1_1.add(btnNewButton);
		contentPane.add(panel);
		panel.setLayout(null);
		
		String displayid=String.valueOf(registerSystem.getRecordid());
		textField = new JLabel(displayid);
		textField.setBounds(95, 31, 96, 27);
		panel.add(textField);
//		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(349, 31, 96, 27);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(303, 73, 201, 27);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField("（格式：yyyy-MM-dd）");
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
		comboBox.addItem("男");
		comboBox.addItem("女");
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
		comboBox_1.addItem("自费");
		comboBox_1.addItem("医保");
		panel.add(comboBox_1);
		
		JLabel label_6 = new JLabel("\u5BB6\u5EAD\u4F4F\u5740\uFF1A");
		label_6.setBounds(202, 160, 96, 21);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("\u6302\u53F7\u7EA7\u522B\uFF1A");
		label_7.setBounds(0, 207, 96, 21);
		panel.add(label_7);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(95, 204, 96, 27);
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
		label_8.setBounds(246, 207, 96, 21);
		panel.add(label_8);
		
		comboBox_3 = new JComboBox();
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
		comboBox_3.setBounds(349, 204, 96, 27);
		comboBox_3.addItem("请选择科室");
		ArrayList<String> officeNames=registerSystem.getOfficeNames();
		for(String officeName:officeNames) {
			comboBox_3.addItem(officeName);
		}
		panel.add(comboBox_3);
		
		JLabel lblNewLabel_1 = new JLabel("\u770B\u8BCA\u533B\u751F\uFF1A");
		lblNewLabel_1.setBounds(0, 255, 96, 21);
		panel.add(lblNewLabel_1);
		
		comboBox_4 = new JComboBox();
		comboBox_4.setBounds(95, 252, 96, 27);
		comboBox_4.addItem("请选择医生");
		panel.add(comboBox_4);
		
		JRadioButton radioButton = new JRadioButton("\u75C5\u5386\u672C");
		radioButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(radioButton.isSelected()) {
					label_10.setText(String.valueOf(Integer.parseInt(label_10.getText())+1));
				}else {
					label_10.setText(String.valueOf(Integer.parseInt(label_10.getText())-1));
				}
			}
		});
		radioButton.setBounds(359, 251, 177, 29);
		panel.add(radioButton);
		
		JLabel label_9 = new JLabel("\u5E94\u6536\u91D1\u989D\uFF1A");
		label_9.setBounds(0, 294, 96, 21);
		panel.add(label_9);
		
		label_10 = new JLabel("50");
		label_10.setBounds(95, 294, 91, 21);
		panel.add(label_10);
		
		JButton button = new JButton("\u6302\u53F7");
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
						JOptionPane.showMessageDialog(null, "挂号成功", "提示",JOptionPane.PLAIN_MESSAGE);
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
						JOptionPane.showMessageDialog(null, "请按格式输入时间", "错误", 0);
						break;
					case "lack":
						JOptionPane.showMessageDialog(null, "请输入所有信息", "错误", 0);
						break;
				}
			}
		});
		button.setBounds(334, 290, 123, 29);
		panel.add(button);
	}
}
