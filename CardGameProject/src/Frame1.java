import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextPane;


public class Frame1 {

	private JFrame frame;
	JLabel lblMessage;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
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
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnClickMe = new JButton("Click Me");
		btnClickMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblMessage.setText("Hi baby :) <3");
			}
		});
		btnClickMe.setForeground(new Color(0, 204, 0));
		btnClickMe.setBackground(new Color(102, 51, 0));
		btnClickMe.setBounds(90, 90, 89, 23);
		frame.getContentPane().add(btnClickMe);
		
		lblMessage = new JLabel("");
		lblMessage.setBounds(205, 76, 200, 50);
		frame.getContentPane().add(lblMessage);
		
		JTextPane txtpnHi = new JTextPane();
		txtpnHi.setText("Hi");
		txtpnHi.setBounds(120, 152, 200, 50);
		frame.getContentPane().add(txtpnHi);
	}
}
