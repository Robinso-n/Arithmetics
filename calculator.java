package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class calculator {

	private JFrame frame;
	private JTextField textFieldFirstNumber;
	private JTextField textFieldSecondNumber;
	private JTextField textFieldResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 255, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADDITION");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(154, 11, 117, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Number");
		lblNewLabel_1.setBounds(28, 63, 117, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Second Number");
		lblNewLabel_2.setBounds(28, 106, 117, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Result");
		lblNewLabel_3.setBounds(34, 180, 111, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int firstNo, secondNo,result;
				firstNo=Integer.valueOf(textFieldFirstNumber.getText());
				secondNo=Integer.valueOf(textFieldSecondNumber.getText());
				result=firstNo+secondNo;
				textFieldResult.setText(String.valueOf(result));
				 
			}
		});
		btnNewButton.setBounds(166, 133, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		textFieldFirstNumber = new JTextField();
		textFieldFirstNumber.setBounds(159, 60, 96, 20);
		frame.getContentPane().add(textFieldFirstNumber);
		textFieldFirstNumber.setColumns(10);
		
		textFieldSecondNumber = new JTextField();
		textFieldSecondNumber.setBounds(159, 103, 96, 20);
		frame.getContentPane().add(textFieldSecondNumber);
		textFieldSecondNumber.setColumns(10);
		
		textFieldResult = new JTextField();
		textFieldResult.setEditable(false);
		textFieldResult.setBounds(159, 177, 96, 20);
		frame.getContentPane().add(textFieldResult);
		textFieldResult.setColumns(10);
	}
}
