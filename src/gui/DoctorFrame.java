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
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JTextArea;

public class DoctorFrame extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;

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
		
		setTitle(doctorName);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(Color.CYAN);
		setBounds(100, 100, 541, 414);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 255, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 25, 207, 161);
		scrollPane.getViewport().setBackground(new Color(224, 255, 255));
		scrollPane.setBorder(BorderFactory.createLoweredBevelBorder());
		contentPane.add(scrollPane);
		
		Object[] schedulHead= {"病历号","姓名","年龄"};
		Object[][] schedulBody= doctorSystem.displayUnfinishedRegistration();
		DefaultTableModel tableModel=new DefaultTableModel(schedulBody,schedulHead);
		table = new JTable(tableModel);
		table.getTableHeader().setBackground(new Color(224, 255, 255));
		table.setBackground(new Color(224, 255, 255));
		scrollPane.setViewportView(table);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 213, 207, 161);
		scrollPane_1.getViewport().setBackground(new Color(224, 255, 255));
		scrollPane_1.setBorder(BorderFactory.createLoweredBevelBorder());
		contentPane.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setBackground(new Color(224, 255, 255));
		scrollPane_1.setViewportView(table_1);
		
		JLabel label = new JLabel("\u672A\u8BCA\u60A3\u8005\uFF1A");
		label.setFont(new Font("华文宋体", Font.PLAIN, 19));
		label.setBounds(0, 0, 101, 21);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u5DF2\u8BCA\u60A3\u8005\uFF1A");
		label_1.setFont(new Font("宋体", Font.PLAIN, 19));
		label_1.setBounds(0, 187, 101, 21);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u75C5\u5386\u53F7\uFF1A");
		label_2.setFont(new Font("华文宋体", Font.PLAIN, 20));
		label_2.setBounds(230, 3, 81, 21);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u59D3\u540D\uFF1A");
		label_3.setFont(new Font("华文宋体", Font.PLAIN, 20));
		label_3.setBounds(387, 3, 81, 21);
		contentPane.add(label_3);
		
		JLabel lblNewLabel = new JLabel("\u5E74\u9F84\uFF1A");
		lblNewLabel.setFont(new Font("华文宋体", Font.PLAIN, 20));
		lblNewLabel.setBounds(250, 38, 81, 21);
		contentPane.add(lblNewLabel);
		
		JLabel label_4 = new JLabel("\u6027\u522B\uFF1A");
		label_4.setFont(new Font("华文宋体", Font.PLAIN, 20));
		label_4.setBounds(387, 38, 81, 21);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(300, 0, 72, 24);
		label_5.setOpaque(true);
		label_5.setBackground(new Color(224, 255, 255));
		label_5.setBorder(BorderFactory.createLoweredBevelBorder());
		contentPane.add(label_5);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(300, 36, 72, 24);
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(new Color(224, 255, 255));
		lblNewLabel_1.setBorder(BorderFactory.createLoweredBevelBorder());
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(440, 0, 81, 24);
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBackground(new Color(224, 255, 255));
		lblNewLabel_2.setBorder(BorderFactory.createLoweredBevelBorder());
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(440, 38, 80, 24);
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setBackground(new Color(224, 255, 255));
		lblNewLabel_3.setBorder(BorderFactory.createLoweredBevelBorder());
		contentPane.add(lblNewLabel_3);
		
		JLabel label_6 = new JLabel("\u8BCA\u65AD\u7ED3\u679C\uFF1A");
		label_6.setFont(new Font("华文宋体", Font.PLAIN, 20));
		label_6.setBounds(210, 72, 106, 32);
		contentPane.add(label_6);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(SystemColor.controlHighlight);
		comboBox.setBounds(222, 223, 101, 27);
		comboBox.addItem("请选择药物");
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(SystemColor.controlHighlight);
		comboBox_1.setBounds(341, 223, 72, 27);
		comboBox_1.addItem("数量");
		contentPane.add(comboBox_1);
		
		JButton btnNewButton = new JButton("\u6DFB\u52A0");
		btnNewButton.setBackground(SystemColor.controlHighlight);
		btnNewButton.setBounds(439, 222, 81, 29);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(222, 269, 299, 105);
		scrollPane_2.getViewport().setBackground(new Color(224, 255, 255));
		scrollPane_2.setBorder(BorderFactory.createLoweredBevelBorder());
		contentPane.add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.setBackground(new Color(224, 255, 255));
		scrollPane_2.setViewportView(table_2);
		
		JButton button = new JButton("\u786E\u8BCA");
		button.setBackground(SystemColor.controlHighlight);
		button.setBounds(439, 75, 81, 29);
		contentPane.add(button);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(224, 255, 255));
		textArea.setFont(new Font("华文宋体", Font.PLAIN, 15));
		textArea.setLineWrap(true);
		textArea.setBounds(222, 119, 298, 83);
		textArea.setBorder(BorderFactory.createLoweredBevelBorder());
		contentPane.add(textArea);
		
		int windowWidth = this.getWidth();
        int windowHeight = this.getHeight();
        Toolkit kit = Toolkit.getDefaultToolkit(); 
        Dimension screenSize = kit.getScreenSize(); 
        int screenWidth = screenSize.width; 
        int screenHeight = screenSize.height; 
        this.setLocation(screenWidth/2-windowWidth/2, screenHeight/2-windowHeight/2);
	}
}
