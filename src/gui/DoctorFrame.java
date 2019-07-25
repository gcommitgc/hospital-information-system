package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import logic.DoctorSystem;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseMotionAdapter;

public class DoctorFrame extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	JLabel label_5;
	JLabel lblNewLabel_1;
	JLabel lblNewLabel_2;
	JLabel lblNewLabel_3;
    private int x, y;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoctorFrame frame = new DoctorFrame("小缘");
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
	public DoctorFrame(String doctorName) {
		setResizable(false);
		DoctorSystem doctorSystem=new DoctorSystem(doctorName);
		
		this.setUndecorated(true);
		setTitle(doctorName);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(Color.CYAN);
		setBounds(100, 100, 1106, 689);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 255, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(15, 81, 387, 254);
		scrollPane.getViewport().setBackground(new Color(224, 255, 255));
		scrollPane.setBorder(BorderFactory.createLoweredBevelBorder());
		contentPane.add(scrollPane);
		
		Object[] schedulHead= {"病历号","姓名","年龄","性别"};
		Object[][] schedulBody= doctorSystem.displayUnfinishedRegistration();
		DefaultTableModel tableModel=new DefaultTableModel(schedulBody,schedulHead);
		table = new JTable(tableModel);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(table.getValueAt(table.getSelectedRow(),0)!=null) {
					String recordid = String.valueOf(table.getValueAt(table.getSelectedRow(),0));
					label_5.setText(recordid);
					String name =String.valueOf(table.getValueAt(table.getSelectedRow(),2));
					lblNewLabel_1.setText(name);
					String age = (String)table.getValueAt(table.getSelectedRow(),1);
					lblNewLabel_2.setText(age);
					String sex = (String) table.getValueAt(table.getSelectedRow(),3);
					lblNewLabel_3.setText(sex);
				}
			}
		});
		table.getTableHeader().setBackground(new Color(224, 255, 255));
		table.setBackground(new Color(224, 255, 255));
		table.getTableHeader().setPreferredSize((new Dimension(table.getTableHeader().getWidth(), 40)));
		table.getTableHeader().setFont(new Font("宋体",Font.PLAIN,20));
		table.setRowHeight(40);
		table.setFont(new Font("宋体",Font.PLAIN,20));
		scrollPane.setViewportView(table);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(15, 380, 387, 254);
		scrollPane_1.getViewport().setBackground(new Color(224, 255, 255));
		scrollPane_1.setBorder(BorderFactory.createLoweredBevelBorder());
		contentPane.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setBackground(new Color(224, 255, 255));
		scrollPane_1.setViewportView(table_1);
		
		JLabel label = new JLabel("\u672A\u8BCA\u60A3\u8005\uFF1A");
		label.setFont(new Font("华文宋体", Font.PLAIN, 19));
		label.setBounds(15, 50, 101, 21);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u5DF2\u8BCA\u60A3\u8005\uFF1A");
		label_1.setFont(new Font("宋体", Font.PLAIN, 19));
		label_1.setBounds(15, 344, 101, 21);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u75C5\u5386\u53F7\uFF1A");
		label_2.setFont(new Font("华文宋体", Font.PLAIN, 20));
		label_2.setBounds(453, 50, 81, 21);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u59D3\u540D\uFF1A");
		label_3.setFont(new Font("华文宋体", Font.PLAIN, 20));
		label_3.setBounds(623, 50, 81, 21);
		contentPane.add(label_3);
		
		JLabel lblNewLabel = new JLabel("\u5E74\u9F84\uFF1A");
		lblNewLabel.setFont(new Font("华文宋体", Font.PLAIN, 20));
		lblNewLabel.setBounds(783, 50, 81, 21);
		contentPane.add(lblNewLabel);
		
		JLabel label_4 = new JLabel("\u6027\u522B\uFF1A");
		label_4.setFont(new Font("华文宋体", Font.PLAIN, 20));
		label_4.setBounds(938, 50, 81, 21);
		contentPane.add(label_4);
		
		label_5 = new JLabel("");
		label_5.setFont(new Font("宋体", Font.PLAIN, 20));
		label_5.setBounds(536, 50, 72, 24);
		label_5.setOpaque(true);
		label_5.setBackground(new Color(224, 255, 255));
		label_5.setBorder(BorderFactory.createLoweredBevelBorder());
		contentPane.add(label_5);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(851, 50, 72, 24);
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(new Color(224, 255, 255));
		lblNewLabel_1.setBorder(BorderFactory.createLoweredBevelBorder());
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(695, 50, 81, 24);
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBackground(new Color(224, 255, 255));
		lblNewLabel_2.setBorder(BorderFactory.createLoweredBevelBorder());
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(1000, 50, 80, 24);
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setBackground(new Color(224, 255, 255));
		lblNewLabel_3.setBorder(BorderFactory.createLoweredBevelBorder());
		contentPane.add(lblNewLabel_3);
		
		JLabel label_6 = new JLabel("\u8BCA\u65AD\u7ED3\u679C\uFF1A");
		label_6.setFont(new Font("华文宋体", Font.PLAIN, 20));
		label_6.setBounds(453, 84, 106, 32);
		contentPane.add(label_6);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("宋体", Font.PLAIN, 20));
		comboBox.setBackground(new Color(240, 248, 255));
		comboBox.setBounds(766, 87, 134, 32);
		comboBox.addItem("请选择药物");
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("宋体", Font.PLAIN, 20));
		comboBox_1.setBackground(new Color(240, 255, 255));
		comboBox_1.setBounds(915, 87, 72, 32);
		comboBox_1.addItem("数量");
		contentPane.add(comboBox_1);
		
		JButton btnNewButton = new JButton("\u6DFB\u52A0");
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 20));
		btnNewButton.setBackground(new Color(240, 255, 255));
		btnNewButton.setBounds(1000, 87, 79, 32);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(766, 133, 314, 461);
		scrollPane_2.getViewport().setBackground(new Color(224, 255, 255));
		scrollPane_2.setBorder(BorderFactory.createLoweredBevelBorder());
		contentPane.add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.setBackground(new Color(224, 255, 255));
		scrollPane_2.setViewportView(table_2);
		
		JButton button = new JButton("\u786E\u8BCA");
		button.setFont(new Font("宋体", Font.PLAIN, 20));
		button.setBackground(new Color(240, 255, 255));
		button.setBounds(999, 605, 81, 29);
		contentPane.add(button);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(224, 255, 255));
		textArea.setFont(new Font("华文宋体", Font.PLAIN, 15));
		textArea.setLineWrap(true);
		textArea.setBounds(453, 133, 298, 501);
		textArea.setBorder(BorderFactory.createLoweredBevelBorder());
		contentPane.add(textArea);
		
		JPanel panel = new JPanel();
		panel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int left = getLocation().x;
                int top = getLocation().y;
                setLocation(left + e.getX() - x, top + e.getY() - y);
			}
		});
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				x = e.getX();
                y = e.getY();
			}
		});
		
		panel.setBackground(new Color(135, 206, 250));
		panel.setBounds(0, 0, 1116, 35);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_1 = new JButton();
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(1069, 0, 35, 35);
		ImageIcon ii1 = new ImageIcon("C:/Users/gcommit/Downloads/close.png");
		Image temp1 = ii1.getImage().getScaledInstance(btnNewButton_1.getWidth(), btnNewButton_1.getHeight(), ii1.getImage().SCALE_DEFAULT);  
		ii1 = new ImageIcon(temp1);
		btnNewButton_1.setIcon(ii1);
		btnNewButton_1.setToolTipText("image");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
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
		btnNewButton_2.setBounds(1029, 0, 35, 35);
		ImageIcon ii2 = new ImageIcon("C:/Users/gcommit/Downloads/减.png");
		Image temp2 = ii2.getImage().getScaledInstance(btnNewButton_2.getWidth(), btnNewButton_2.getHeight(), ii2.getImage().SCALE_DEFAULT);  
		ii2 = new ImageIcon(temp2);
		btnNewButton_2.setIcon(ii2);
		btnNewButton_2.setToolTipText("image");
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LoginFrame frame = new LoginFrame();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setFocusPainted(false);
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setBounds(991, 0, 35, 35);
		ImageIcon ii3 = new ImageIcon("C:/Users/gcommit/Downloads/person.png");
		Image temp3 = ii3.getImage().getScaledInstance(btnNewButton_3.getWidth(), btnNewButton_3.getHeight(), ii3.getImage().SCALE_DEFAULT);  
		ii3 = new ImageIcon(temp3);
		btnNewButton_3.setIcon(ii3);
		btnNewButton_3.setToolTipText("image");
		panel.add(btnNewButton_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(0, 0, 35, 35);
		ImageIcon ii4 = new ImageIcon("C:/Users/gcommit/Downloads/医生.png");
		Image temp4 = ii4.getImage().getScaledInstance(lblNewLabel_4.getWidth(), lblNewLabel_4.getHeight(), ii4.getImage().SCALE_DEFAULT);  
		ii4 = new ImageIcon(temp4);
		lblNewLabel_4.setIcon(ii4);
		lblNewLabel_4.setToolTipText("image");
		panel.add(lblNewLabel_4);
		
		JLabel label_7 = new JLabel(doctorName);
		label_7.setFont(new Font("宋体", Font.PLAIN, 20));
		label_7.setBounds(38, 0, 81, 35);
		panel.add(label_7);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(135, 206, 250));
		panel_1.setBounds(0, 33, 5, 656);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(135, 206, 250));
		panel_2.setBounds(1100, 33, 23, 656);
		contentPane.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(135, 206, 250));
		panel_3.setBounds(0, 685, 1106, 10);
		contentPane.add(panel_3);
		
		int windowWidth = this.getWidth();
        int windowHeight = this.getHeight();
        Toolkit kit = Toolkit.getDefaultToolkit(); 
        Dimension screenSize = kit.getScreenSize(); 
        int screenWidth = screenSize.width; 
        int screenHeight = screenSize.height; 
        this.setLocation(screenWidth/2-windowWidth/2, screenHeight/2-windowHeight/2);
	}
}
