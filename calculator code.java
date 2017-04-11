package calcpackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalcFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	public String number = Integer.toString(0);
	public int addNumber =0;
	public int temp = 0;
	public int pesho = 0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcFrame frame = new CalcFrame();
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
	public CalcFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 634);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		textField = new JTextField();
		textField.setBounds(34, 47, 366, 93);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		
		textField.setText(number);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				number += "1" ;
				temp += Integer.parseInt(number);
				textField.setText(number);
			}
				
		});
		btnNewButton.setBounds(34, 183, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("4");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number+="4";
				textField.setText(number);
			}
		});
		btnNewButton_1.setBounds(34, 217, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("7");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number+="7";
				
				textField.setText(number);
			}
		});
		btnNewButton_2.setBounds(34, 251, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("2");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				number+="2";
				
				textField.setText(number);
			}
		});
		btnNewButton_3.setBounds(167, 183, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number+="5";
				textField.setText(number);
			}
		});
		btnNewButton_4.setBounds(167, 217, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("8");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					number+="8";
				
				textField.setText(number);
			}
		});
		btnNewButton_5.setBounds(167, 251, 89, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("3");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				number+="3";
				textField.setText(number);
			}
		});
		btnNewButton_6.setBounds(311, 183, 89, 23);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("6");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number+="6";
				textField.setText(number);
			}
		});
		btnNewButton_7.setBounds(311, 217, 89, 23);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					number+="9";
				
				textField.setText(number);
			}
		});
		btnNewButton_8.setBounds(311, 251, 89, 23);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("0");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					number+="0";
				
				textField.setText(number);
			}
		});
		btnNewButton_9.setBounds(167, 285, 89, 23);
		contentPane.add(btnNewButton_9);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				pesho += Integer.parseInt(number);
				
				
			}
		});
		btnAdd.setBounds(83, 374, 89, 23);
		contentPane.add(btnAdd);
		
		JButton btnSubstract = new JButton("-");
		btnSubstract.setBounds(83, 423, 89, 23);
		contentPane.add(btnSubstract);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.setBounds(241, 374, 89, 23);
		contentPane.add(btnMultiply);
		
		JButton btnDivision = new JButton("/");
		btnDivision.setBounds(241, 423, 89, 23);
		contentPane.add(btnDivision);
		
		JButton btnClean = new JButton("C");
		btnClean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumber = 0;
				String strAddNumber = Integer.toString(addNumber);
				number = "0";
				textField.setText(number);
			}
		});
		btnClean.setBounds(167, 490, 89, 23);
		contentPane.add(btnClean);
		
		JButton button = new JButton("=");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField.setText(Integer.toString(pesho));
			}
		});
		button.setBounds(167, 524, 89, 23);
		contentPane.add(button);
	}
}
