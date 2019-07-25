package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import data.Doctor;
import data.Office;
import data.OfficeDataBase;
import data.RegistrationDataBase;
import logic.AdminSystem;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class AdminFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	private JTable table_1;
	JPanel panel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminFrame frame = new AdminFrame();
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
	public AdminFrame() {
		setTitle("\u7BA1\u7406\u5458");
		AdminSystem adminSystem=AdminSystem.getInstance();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		setBounds(100, 100, 712, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
//		contentPane.setVisible(false);
		
		int windowWidth = this.getWidth();
        int windowHeight = this.getHeight();
        Toolkit kit = Toolkit.getDefaultToolkit(); 
        Dimension screenSize = kit.getScreenSize(); 
        int screenWidth = screenSize.width; 
        int screenHeight = screenSize.height; 
        this.setLocation(screenWidth/2-windowWidth/2, screenHeight/2-windowHeight/2);

		JPanel panel = new JPanel();
		panel.setBounds(0, 49, 690, 406);
		panel.setVisible(false);
		contentPane.add(panel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 722, 48);
		contentPane.add(menuBar);
						
		JMenu menu = new JMenu("\u529F\u80FD");
		menu.setFont(new Font("华文宋体", Font.PLAIN, 20));
		menuBar.add(menu);
						
	    JMenu menu_1 = new JMenu("\u8D26\u6237");
	    menu_1.setFont(new Font("华文宋体", Font.PLAIN, 20));
		menuBar.add(menu_1);
						
		JMenuItem menuItem_2 = new JMenuItem("\u9000\u51FA\u767B\u5F55");
		menuItem_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				LoginFrame frame = new LoginFrame();
				frame.setVisible(true);
				dispose();
			}
		});
		menu_1.add(menuItem_2);
						
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(39, 23, 122, 27);
		comboBox.addItem("请选择科室");
		ArrayList<String> officeNames=adminSystem.getOfficeNames();
		for(String officeName:officeNames) {
			comboBox.addItem(officeName);
		}
		panel.setLayout(null);
		panel.add(comboBox);
						
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(192, 23, 122, 27);
		comboBox_1.addItem("请选择医生");
		panel.add(comboBox_1);
		
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String officeName=(String)e.getItem();
				if(officeName.equals("请选择科室")) {
				}else {
					comboBox_1.removeAllItems();
					comboBox_1.addItem("请选择医生");
					ArrayList<String> doctorNames=adminSystem.getDoctorNames(officeName);
					for(String doctorName:doctorNames) {
						comboBox_1.addItem(doctorName);
					}
				}
			}
		});
		
		textField = new JTextField();
		textField.setBounds(354, 23, 153, 27);
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(textField.getText().equals("(请输入上班时间)")) {
					textField.setText("");
				}
			}
		});
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if(textField.getText().equals("(请输入上班时间)")) {
					textField.setText("");
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(textField.getText().equals("")) {
					textField.setText("(请输入上班时间)");
				}
			}
		});
		textField.setText("(\u8BF7\u8F93\u5165\u4E0A\u73ED\u65F6\u95F4)");
		panel.add(textField);
		textField.setColumns(10);
						
		textField_1 = new JTextField();
		textField_1.setBounds(522, 23, 153, 27);
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(textField_1.getText().equals("(请输入下班时间)")) {
					textField_1.setText("");
				}
			}
		});
		textField_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if(textField_1.getText().equals("(请输入下班时间)")) {
					textField_1.setText("");
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(textField_1.getText().equals("")) {
					textField_1.setText("(请输入下班时间)");
				}
			}
		});
		textField_1.setText("(\u8BF7\u8F93\u5165\u4E0B\u73ED\u65F6\u95F4)");
		panel.add(textField_1);
		textField_1.setColumns(10);
						
		JLabel lblyy = new JLabel("\u65F6\u95F4\u683C\u5F0F:yyyy-MM-dd");
		lblyy.setBounds(346, 81, 188, 21);
		panel.add(lblyy);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 121, 644, 285);
		panel.add(scrollPane);
		
		Object[] schedulHead= {"科室","姓名","开始时间","结束时间"};
		Object[][] schedulBody= adminSystem.displaySchedul();
		DefaultTableModel tableModel=new DefaultTableModel(schedulBody,schedulHead);
		table = new JTable(tableModel);
		table.setRowHeight(40);
		table.setFont(new Font("宋体",Font.PLAIN,18));
		scrollPane.setViewportView(table);
		
		JButton button = new JButton("\u6392\u73ED");
		button.setBounds(586, 77, 69, 29);
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String doctor=(String)comboBox_1.getSelectedItem();
				String startDate=textField.getText();
				String endDate=textField_1.getText();
				if(doctor.equals("请选择医生")) {
					JOptionPane.showMessageDialog(null, "请选择医生", "错误", 0);
				}else {
					if(adminSystem.setSchedul(doctor, startDate, endDate).equals("done")){
						Object[][] schedulBody= adminSystem.displaySchedul();
						DefaultTableModel tableModel=new DefaultTableModel(schedulBody,schedulHead);
						table.setModel(tableModel);
					}else {
						JOptionPane.showMessageDialog(null, "请按格式输入时间", "错误", 0);
					}
				}
			}
		});
		panel.add(button);
		
		JMenuItem menuItem = new JMenuItem("\u6392\u73ED");
		menuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				panel_1.setVisible(false);
				panel.setVisible(true);
			}
		});
		menu.add(menuItem);
						
		JMenuItem menuItem_1 = new JMenuItem("\u67E5\u770B\u6302\u53F7");
		menuItem_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				panel.setVisible(false);
				panel_1.setVisible(true);
			}
		});
		menu.add(menuItem_1);
		
		panel_1 = new JPanel();
		panel_1.setBounds(0, 49, 690, 524);
		panel_1.setVisible(false);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(15, 5, 675, 429);
		panel_1.add(scrollPane_1);
		
		Object[] schedulHead_1= {"病历号","姓名","年龄","医师","是否开药","是否缴费"};
		Object[][] schedulBody_1= adminSystem.displayRegistration();
		DefaultTableModel tableModel_1=new DefaultTableModel(schedulBody_1,schedulHead_1);
		table_1 = new JTable(tableModel_1);
		table_1.setRowHeight(40);
		table_1.setFont(new Font("宋体",Font.PLAIN,18));
		scrollPane_1.setViewportView(table_1);
	}
}
