package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
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
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Color;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

public class AdminFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	private JTable table_1;
	JPanel panel_1;
	private int x,y;
	private final JPanel panel_4 = new JPanel();

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
		this.setUndecorated(true);
		setTitle("\u7BA1\u7406\u5458");
		AdminSystem adminSystem=AdminSystem.getInstance();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		setBounds(100, 100, 786, 569);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 255, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
//		contentPane.setVisible(false);
		
		int windowWidth = this.getWidth();
        int windowHeight = this.getHeight();
        Toolkit kit = Toolkit.getDefaultToolkit(); 
        Dimension screenSize = kit.getScreenSize(); 
        int screenWidth = screenSize.width; 
        int screenHeight = screenSize.height; 
        this.setLocation(screenWidth/2-windowWidth/2, screenHeight/2-windowHeight/2);
		contentPane.setLayout(null);
		
		JButton button_1 = new JButton("");
		button_1.setFocusPainted(false);
		button_1.setBorderPainted(false);
		button_1.setContentAreaFilled(false);
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		button_1.setBounds(737, 0, 45, 45);
		ImageIcon ii1 = new ImageIcon("C:/Users/gcommit/Downloads/close.png");
		Image temp1 = ii1.getImage().getScaledInstance(button_1.getWidth(),button_1.getHeight(), ii1.getImage().SCALE_DEFAULT);  
		ii1 = new ImageIcon(temp1);
		panel_4.setBounds(0, 567, 819, 3);
		contentPane.add(panel_4);
		panel_4.setBackground(new Color(135, 206, 250));
		button_1.setIcon(ii1);
		button_1.setToolTipText("image");
		contentPane.add(button_1);
		
		JButton btnNewButton = new JButton();
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setExtendedState(JFrame.ICONIFIED);
			}
		});
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBounds(689, 0, 45, 45);
		ImageIcon ii2 = new ImageIcon("C:/Users/gcommit/Downloads/减.png");
		Image temp2 = ii2.getImage().getScaledInstance(btnNewButton.getWidth(), btnNewButton.getHeight(), ii2.getImage().SCALE_DEFAULT);  
		ii2 = new ImageIcon(temp2);
		btnNewButton.setIcon(ii2);
		btnNewButton.setToolTipText("image");
		contentPane.add(btnNewButton);

		JPanel panel = new JPanel();
		panel.setBounds(0, 49, 765, 538);
		panel.setBackground(new Color(245, 255, 250));
//		panel.setVisible(false);
		contentPane.add(panel);
		
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
		menuBar.setBounds(0, 0, 786, 48);
		menuBar.setBackground(new Color(135, 206, 250));
		menuBar.setFont(new Font("华文宋体", Font.PLAIN, 20));
		contentPane.add(menuBar);
						
		JMenu menu = new JMenu("");
		ImageIcon ii3 = new ImageIcon("C:/Users/gcommit/Downloads/菜单.png");
		Image temp3 = ii3.getImage().getScaledInstance(45, 45, ii3.getImage().SCALE_DEFAULT);
		ii3 = new ImageIcon(temp3);
		menu.setIcon(ii3);
		menu.setToolTipText("image");
		menu.setFont(new Font("华文宋体", Font.PLAIN, 20));
		menuBar.add(menu);
						
	    JMenu menu_1 = new JMenu("");
	    menu_1.addMouseListener(new MouseAdapter() {
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
		menu_1.setIcon(ii4);
		menu_1.setToolTipText("image");
	    menu_1.setFont(new Font("华文宋体", Font.PLAIN, 20));
		menuBar.add(menu_1);
						
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(240, 248, 250));
		comboBox.setFont(new Font("华文宋体", Font.PLAIN, 20));
		comboBox.setBounds(39, 23, 138, 33);
		comboBox.addItem("请选择科室");
		ArrayList<String> officeNames=adminSystem.getOfficeNames();
		for(String officeName:officeNames) {
			comboBox.addItem(officeName);
		}
		panel.setLayout(null);
		panel.add(comboBox);
						
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(new Color(240, 248, 250));
		comboBox_1.setFont(new Font("华文宋体", Font.PLAIN, 20));
		comboBox_1.setBounds(211, 23, 138, 33);
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
		textField.setFont(new Font("华文宋体", Font.PLAIN, 20));
		textField.setBounds(381, 23, 164, 33);
		textField.setOpaque(true);
		textField.setBackground(new Color(224, 255, 255));
		textField.setBorder(BorderFactory.createLoweredBevelBorder());
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
		textField_1.setFont(new Font("华文宋体", Font.PLAIN, 20));
		textField_1.setBounds(586, 23, 164, 33);
		textField_1.setOpaque(true);
		textField_1.setBackground(new Color(224, 255, 255));
		textField_1.setBorder(BorderFactory.createLoweredBevelBorder());
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
		lblyy.setFont(new Font("华文宋体", Font.PLAIN, 20));
		lblyy.setBounds(377, 81, 188, 21);
		panel.add(lblyy);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground((new Color(224, 255, 255)));
		scrollPane.setBorder(BorderFactory.createLoweredBevelBorder());
		scrollPane.setBounds(31, 121, 719, 329);
		JScrollBar bar=scrollPane.getVerticalScrollBar();
		bar.setBackground((new Color(224, 255, 255)));
		panel.add(scrollPane);
		
		Object[] schedulHead= {"科室","姓名","开始时间","结束时间"};
		Object[][] schedulBody= adminSystem.displaySchedul();
		DefaultTableModel tableModel=new DefaultTableModel(schedulBody,schedulHead);
		table = new JTable(tableModel);
		table.getTableHeader().setBackground(new Color(224, 255, 255));
		table.setBackground(new Color(224, 255, 255));
		table.setRowHeight(40);
		table.getTableHeader().setPreferredSize((new Dimension(table.getTableHeader().getWidth(), 40)));
		table.getTableHeader().setFont(new Font("宋体",Font.PLAIN,20));
		table.setRowHeight(40);
		table.setFont(new Font("宋体",Font.PLAIN,20));
		scrollPane.setViewportView(table);
		
		JButton button = new JButton("\u6392\u73ED");
		button.setBackground(new Color(240, 255, 255));
		button.setFont(new Font("华文宋体", Font.PLAIN, 20));
		button.setBounds(643, 77, 87, 29);
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String doctor=(String)comboBox_1.getSelectedItem();
				String startDate=textField.getText();
				String endDate=textField_1.getText();
				if(doctor.equals("请选择医生")) {
					ErrorFrame frame=new ErrorFrame("请选择医生");
					frame.setVisible(true);
				}else {
					if(adminSystem.setSchedul(doctor, startDate, endDate).equals("done")){
						Object[][] schedulBody= adminSystem.displaySchedul();
						DefaultTableModel tableModel=new DefaultTableModel(schedulBody,schedulHead);
						table.setModel(tableModel);
					}else {
						ErrorFrame frame1=new ErrorFrame("时间格式错误");
						frame1.setVisible(true);
					}
				}
			}
		});
		panel.add(button);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, -13, 3, 550);
		panel.add(panel_3);
		panel_3.setBackground(new Color(135, 206, 250));
		
		JMenuItem menuItem = new JMenuItem("\u6392\u73ED");
		menuItem.setBackground(new Color(224, 255, 255));
		menuItem.setFont(new Font("华文宋体", Font.PLAIN, 20));
		menuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				panel_1.setVisible(false);
				panel.setVisible(true);
			}
		});
		menu.add(menuItem);
						
		JMenuItem menuItem_1 = new JMenuItem("\u67E5\u770B\u6302\u53F7");
		menuItem_1.setBackground(new Color(224, 255, 255));
		menuItem_1.setFont(new Font("华文宋体", Font.PLAIN, 20));
		menuItem_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				panel.setVisible(false);
				panel_1.setVisible(true);
			}
		});
		menu.add(menuItem_1);
		
		panel_1 = new JPanel();
		panel_1.setBounds(0, 49, 765, 524);
		panel_1.setBackground(new Color(245, 255, 250));
		panel_1.setVisible(false);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(15, 5, 750, 445);
		scrollPane_1.getViewport().setBackground((new Color(224, 255, 255)));
		JScrollBar bar1=scrollPane_1.getVerticalScrollBar();
		bar1.setBackground((new Color(224, 255, 255)));
		panel_1.add(scrollPane_1);
		
		Object[] schedulHead_1= {"病历号","姓名","年龄","医师","是否开药","是否缴费"};
		Object[][] schedulBody_1= adminSystem.displayRegistration();
		DefaultTableModel tableModel_1=new DefaultTableModel(schedulBody_1,schedulHead_1);
		table_1 = new JTable(tableModel_1);
		table_1.getTableHeader().setBackground(new Color(224, 255, 255));
		table_1.setBackground(new Color(224, 255, 255));
		table_1.setRowHeight(40);
		table_1.getTableHeader().setPreferredSize((new Dimension(table.getTableHeader().getWidth(), 40)));
		table_1.getTableHeader().setFont(new Font("宋体",Font.PLAIN,20));
		table_1.setRowHeight(40);
		table_1.setFont(new Font("宋体",Font.PLAIN,20));
		scrollPane_1.setViewportView(table_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(135, 206, 250));
		panel_2.setBounds(782, 26, 4, 572);
		contentPane.add(panel_2);
	}
}
