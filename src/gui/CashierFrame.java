package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import logic.CashierSystem;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class CashierFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private int x,y;

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
		CashierSystem cashierSystem=CashierSystem.getInstance();
		
		this.setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 440, 442);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 255, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		panel.setBounds(0, 0, 440, 40);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(0, 0, 40, 40);
		ImageIcon ii = new ImageIcon("C:/Users/gcommit/Downloads/缴费.png");
		Image temp = ii.getImage().getScaledInstance(btnNewButton.getWidth(), btnNewButton.getHeight(), ii.getImage().SCALE_DEFAULT);  
		ii = new ImageIcon(temp);
		btnNewButton.setIcon(ii);
		btnNewButton.setToolTipText("image");
		panel.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBounds(400, 0, 40, 40);
		ImageIcon ii1 = new ImageIcon("C:/Users/gcommit/Downloads/close.png");
		Image temp1 = ii1.getImage().getScaledInstance(btnNewButton_2.getWidth(), btnNewButton_2.getHeight(), ii1.getImage().SCALE_DEFAULT);  
		ii1 = new ImageIcon(temp1);
		btnNewButton_2.setIcon(ii1);
		btnNewButton_2.setToolTipText("image");
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setExtendedState(JFrame.ICONIFIED);
			}
		});
		btnNewButton_3.setFocusPainted(false);
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setBounds(356, 0, 40, 40);
		ImageIcon ii2 = new ImageIcon("C:/Users/gcommit/Downloads/减.png");
		Image temp2 = ii2.getImage().getScaledInstance(btnNewButton_3.getWidth(), btnNewButton_3.getHeight(), ii2.getImage().SCALE_DEFAULT);  
		ii2 = new ImageIcon(temp2);
		btnNewButton_3.setIcon(ii2);
		btnNewButton_3.setToolTipText("image");
		panel.add(btnNewButton_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.getViewport().setBackground(new Color(224, 255, 255));
		scrollPane.setBorder(BorderFactory.createLoweredBevelBorder());
		scrollPane.setBounds(32, 117, 372, 215);
		contentPane.add(scrollPane);
		
		Object[] infoHead= {"药名","单价","数量"};
		Object[][] infoBody=new Object[0][3];
		DefaultTableModel tableModel=new DefaultTableModel(infoBody,infoHead);
		table = new JTable(tableModel);
		table.getTableHeader().setBackground(new Color(224,255,255));
		table.getTableHeader().setPreferredSize((new Dimension(table.getTableHeader().getWidth(), 40)));
		table.getTableHeader().setFont(new Font("宋体",Font.PLAIN,20));
		table.setRowHeight(40);
		table.setFont(new Font("宋体",Font.PLAIN,20));
		table.setBackground(new Color(224, 255, 255));
		scrollPane.setViewportView(table);
		
		textField = new JTextField();
		textField.setFont(new Font("华文宋体", Font.PLAIN, 20));
		textField.setBounds(140, 65, 115, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("\u67E5\u8BE2");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnNewButton_1.setBackground(new Color(224, 255, 255));
		btnNewButton_1.setFont(new Font("华文宋体", Font.PLAIN, 20));
		btnNewButton_1.setBounds(289, 65, 115, 37);
		contentPane.add(btnNewButton_1);
		
		JLabel label = new JLabel("\u75C5\u5386\u53F7\uFF1A");
		label.setFont(new Font("华文宋体", Font.PLAIN, 20));
		label.setBounds(32, 65, 81, 37);
		contentPane.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(135, 206, 250));
		panel_1.setBounds(436, 38, 4, 404);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(135, 206, 250));
		panel_2.setBounds(0, 40, 4, 402);
		contentPane.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(135, 206, 250));
		panel_3.setBounds(0, 438, 440, 4);
		contentPane.add(panel_3);
		
		JButton btnNewButton_4 = new JButton("\u9000\u8D39");
		btnNewButton_4.setBackground(new Color(224, 255, 255));
		btnNewButton_4.setFont(new Font("宋体", Font.PLAIN, 22));
		btnNewButton_4.setBounds(32, 358, 135, 48);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("\u7F34\u8D39");
		btnNewButton_5.setBackground(new Color(224, 255, 255));
		btnNewButton_5.setFont(new Font("宋体", Font.PLAIN, 22));
		btnNewButton_5.setBounds(269, 358, 135, 48);
		contentPane.add(btnNewButton_5);
		
		this.setResizable(false);
		int windowWidth = this.getWidth();
        int windowHeight = this.getHeight();
        Toolkit kit = Toolkit.getDefaultToolkit(); 
        Dimension screenSize = kit.getScreenSize(); 
        int screenWidth = screenSize.width; 
        int screenHeight = screenSize.height; 
        this.setLocation(screenWidth/2-windowWidth/2, screenHeight/2-windowHeight/2);
	}
}
