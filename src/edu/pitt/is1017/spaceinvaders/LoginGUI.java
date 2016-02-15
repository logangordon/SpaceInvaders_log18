package edu.pitt.is1017.spaceinvaders;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LoginGUI {

	private JFrame frmSpaceinvadersLogin;
	private JTextField txtEmail;
	private JPasswordField txtPswd;
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
					window.frmSpaceinvadersLogin.setVisible(true);
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
		frmSpaceinvadersLogin = new JFrame();
		frmSpaceinvadersLogin.setTitle("SpaceInvaders - Login");
		frmSpaceinvadersLogin.setBounds(100, 100, 280, 200);
		frmSpaceinvadersLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSpaceinvadersLogin.getContentPane().setLayout(null);
		
		lblEmail = new JLabel("Email:");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setBounds(25, 35, 50, 20);
		frmSpaceinvadersLogin.getContentPane().add(lblEmail);
		
		lblPswd = new JLabel("Password:");
		lblPswd.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPswd.setBounds(25, 75, 50, 20);
		frmSpaceinvadersLogin.getContentPane().add(lblPswd);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(85, 35, 150, 20);
		frmSpaceinvadersLogin.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		txtPswd = new JPasswordField();
		txtPswd.setColumns(10);
		txtPswd.setBounds(85, 75, 150, 20);
		frmSpaceinvadersLogin.getContentPane().add(txtPswd);
		
		btnRegister = new JButton("Register");
		btnRegister.setBounds(10, 110, 75, 20);
		frmSpaceinvadersLogin.getContentPane().add(btnRegister);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				User user = new User(txtEmail.getText(), String.valueOf(txtPswd.getPassword()));
				if(user.isLoggedIn()){
					Game.startNewGame(user);
				} else {
					JOptionPane.showMessageDialog(null, "Invalid credentials");
				}
			}
		});
		btnLogin.setBounds(95, 110, 75, 20);
		frmSpaceinvadersLogin.getContentPane().add(btnLogin);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setBounds(180, 110, 75, 20);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmSpaceinvadersLogin.dispatchEvent(new WindowEvent(frmSpaceinvadersLogin, WindowEvent.WINDOW_CLOSING));
			}
		});
		frmSpaceinvadersLogin.getContentPane().add(btnCancel);

	}
}
