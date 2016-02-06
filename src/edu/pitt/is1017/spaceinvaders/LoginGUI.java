package edu.pitt.is1017.spaceinvaders;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LoginGUI {

	private JFrame frame;
	private JTextField txtEmail;
	private JTextField txtPswd;
	private JLabel lblEmail;
	private JLabel lblPswd;
	private JButton btnRegister;
	private JButton btnLogin;
	private JButton btnCancel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGUI window = new LoginGUI();
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
	public LoginGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 280, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblEmail = new JLabel("Email:");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setBounds(25, 35, 50, 20);
		frame.getContentPane().add(lblEmail);
		
		lblPswd = new JLabel("Password:");
		lblPswd.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPswd.setBounds(25, 75, 50, 20);
		frame.getContentPane().add(lblPswd);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(85, 35, 150, 20);
		frame.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		txtPswd = new JTextField();
		txtPswd.setColumns(10);
		txtPswd.setBounds(85, 75, 150, 20);
		frame.getContentPane().add(txtPswd);
		
		btnRegister = new JButton("Register");
		btnRegister.setBounds(10, 110, 75, 20);
		frame.getContentPane().add(btnRegister);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				User user = new User(txtEmail.getText(), txtPswd.getText());
			}
		});
		btnLogin.setBounds(95, 110, 75, 20);
		frame.getContentPane().add(btnLogin);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setBounds(180, 110, 75, 20);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
			}
		});
		frame.getContentPane().add(btnCancel);

	}
}
