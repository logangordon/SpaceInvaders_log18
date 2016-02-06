package edu.pitt.is1017.spaceinvaders;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class RegistrationGUI {

	private JFrame frmRegister;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtEmail;
	private JPasswordField txtPassword;
	private JPasswordField txtConfirmPassword;
	private JLabel lblFirstName;
	private JLabel lblLastName;
	private JLabel lblEmail;
	private JLabel lblPassword;
	private JLabel lblConfirmPassword;
	private JButton btnRegister;
	private JButton btnCancel;
	/**
	 * Create the application.
	 */
	public RegistrationGUI() {
		initialize();
		// moved to constructor so that calling code doesn't need access to frmRegister
		this.frmRegister.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegister = new JFrame();
		frmRegister.setTitle("SpaceInvaders - Registration");
		frmRegister.setBounds(100, 100, 375, 275);
		frmRegister.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegister.getContentPane().setLayout(null);
		
		lblFirstName = new JLabel("First Name:");
		lblFirstName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFirstName.setBounds(10, 30, 100, 20);
		frmRegister.getContentPane().add(lblFirstName);
		
		lblLastName = new JLabel("Last Name:");
		lblLastName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLastName.setBounds(10, 60, 100, 20);
		frmRegister.getContentPane().add(lblLastName);
		
		lblEmail = new JLabel("Email:");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setBounds(10, 90, 100, 20);
		frmRegister.getContentPane().add(lblEmail);
		
		lblPassword = new JLabel("Password:");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setBounds(10, 120, 100, 20);
		frmRegister.getContentPane().add(lblPassword);
		
		lblConfirmPassword = new JLabel("Confirm Password:");
		lblConfirmPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblConfirmPassword.setBounds(10, 150, 100, 20);
		frmRegister.getContentPane().add(lblConfirmPassword);
		
		txtFirstName = new JTextField();
		txtFirstName.setBounds(125, 30, 200, 20);
		frmRegister.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setColumns(10);
		txtLastName.setBounds(125, 60, 200, 20);
		frmRegister.getContentPane().add(txtLastName);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(125, 90, 200, 20);
		frmRegister.getContentPane().add(txtEmail);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(125, 120, 200, 20);
		frmRegister.getContentPane().add(txtPassword);
		
		txtConfirmPassword = new JPasswordField();
		txtConfirmPassword.setBounds(125, 150, 200, 20);
		frmRegister.getContentPane().add(txtConfirmPassword);
		
		btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password = String.valueOf(txtPassword.getPassword());
				String confPswd = String.valueOf(txtConfirmPassword.getPassword());
				if(password.equals(confPswd)){
					User user = new User(txtLastName.getText(), txtFirstName.getText(),
					txtEmail.getText(), password);
					JOptionPane.showMessageDialog(null, "Account created: " + Integer.toString(user.getUserID()));
				} else {
					JOptionPane.showMessageDialog(null, "Passwords must match.");
				}
			}
		});
		btnRegister.setBounds(75, 190, 100, 25);
		frmRegister.getContentPane().add(btnRegister);
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmRegister.dispatchEvent(new WindowEvent(frmRegister, WindowEvent.WINDOW_CLOSING));
			}
		});
		btnCancel.setBounds(200, 190, 100, 25);
		frmRegister.getContentPane().add(btnCancel);
	}
}
