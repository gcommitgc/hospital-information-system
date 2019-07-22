package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logic.AdminSystem;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;

public class AdminFrame extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;

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
//		AdminSystem adminSystem=AdminSystem.getInstance();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 712, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Object[] schedulHead= {"科室","姓名","开始时间","结束时间"};
		Object[][] schedulBody= {
				{1,1,1,1},
				{2,2,2,2},
				{3,3,3,3},
				{4,4,4,4}
		};
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(15, 80, 642, 334);
				contentPane.add(scrollPane);
				//		Object[][] schedulBody=adminSystem.displaySchedul();
						table = new JTable(schedulBody,schedulHead);
						scrollPane.setViewportView(table);
						
						JComboBox comboBox = new JComboBox();
						comboBox.setBounds(30, 15, 137, 27);
						comboBox.addItem("请选择科室");
						comboBox.addItem("心脑科室");
						contentPane.add(comboBox);
						
						JComboBox comboBox_1 = new JComboBox();
						comboBox_1.setBounds(182, 15, 137, 27);
						comboBox_1.addItem("请选择医生");
						contentPane.add(comboBox_1);
						
						textField = new JTextField();
						textField.setText("(\u8BF7\u8F93\u5165\u4E0A\u73ED\u65F6\u95F4)");
						textField.setBounds(334, 15, 157, 27);
						contentPane.add(textField);
						textField.setColumns(10);
						
						textField_1 = new JTextField();
						textField_1.setText("(\u8BF7\u8F93\u5165\u4E0B\u73ED\u65F6\u95F4)");
						textField_1.setBounds(500, 15, 149, 27);
						contentPane.add(textField_1);
						textField_1.setColumns(10);
						
						JLabel label = new JLabel("\u65F6\u95F4\u683C\u5F0F");
						label.setBounds(344, 46, 147, 32);
						contentPane.add(label);
						
						JButton button = new JButton("\u6392\u73ED");
						button.setBounds(510, 48, 123, 29);
						contentPane.add(button);
	}
}
