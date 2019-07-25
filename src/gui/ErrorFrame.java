package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class ErrorFrame extends JFrame {

	private JPanel contentPane;
	private int x,y;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ErrorFrame frame = new ErrorFrame("请选择医生");
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
	public ErrorFrame(String messege) {
		this.setUndecorated(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 235, 183);
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
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 235, 40);
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
		contentPane.setLayout(null);
		panel.setBackground(new Color(135, 206, 250));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton();
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBounds(195, -3, 40, 40);
		ImageIcon ii = new ImageIcon("C:/Users/gcommit/Downloads/close.png");
		Image temp = ii.getImage().getScaledInstance(btnNewButton.getWidth(), btnNewButton.getHeight(), ii.getImage().SCALE_DEFAULT);  
		ii = new ImageIcon(temp);
		btnNewButton.setIcon(ii);
		btnNewButton.setToolTipText("image");
		panel.add(btnNewButton);
		
		JLabel label = new JLabel("\u63D0\u793A");
		label.setFont(new Font("华文宋体", Font.PLAIN, 20));
		label.setBounds(40, 7, 99, 25);
		panel.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(2, 2, 35, 35);
		ImageIcon ii1 = new ImageIcon("C:/Users/gcommit/Downloads/提示.png");
		Image temp1 = ii1.getImage().getScaledInstance(label_1.getWidth(),label_1.getHeight(), ii1.getImage().SCALE_DEFAULT);  
		ii1 = new ImageIcon(temp1);
		label_1.setIcon(ii1);
		label_1.setToolTipText("image");
		panel.add(label_1);

		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(231, 36, 4, 270);
		panel_1.setBackground(new Color(135, 206, 250));
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 26, 4, 288);
		panel_2.setBackground(new Color(135, 206, 250));
		contentPane.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 179, 450, 4);
		panel_3.setBackground(new Color(135, 206, 250));
		contentPane.add(panel_3);
		
		JLabel lblNewLabel = new JLabel(messege);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("华文宋体", Font.PLAIN, 28));
		lblNewLabel.setBounds(15, 65, 205, 91);
		contentPane.add(lblNewLabel);
	}
}
