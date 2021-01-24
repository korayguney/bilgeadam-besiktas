package com.bilgeadam.loginexamplewithgui.view;

import com.bilgeadam.loginexamplewithgui.controller.LoginController;
import com.bilgeadam.loginexamplewithgui.exception.UsernameOrPasswordIsNullException;
import com.bilgeadam.loginexamplewithgui.model.LoginModel;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginUI {

	private JFrame frame;
	private JTextField usernameField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUI window = new LoginUI();
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
	public LoginUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 745, 541);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel usernameLabel = new JLabel("Username :");
		usernameLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		usernameLabel.setBounds(133, 192, 183, 57);
		frame.getContentPane().add(usernameLabel);
		
		JLabel passwordLabel = new JLabel("Password :");
		passwordLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		passwordLabel.setBounds(133, 285, 183, 57);
		frame.getContentPane().add(passwordLabel);
		
		usernameField = new JTextField();
		usernameField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		usernameField.setBounds(303, 195, 275, 54);
		frame.getContentPane().add(usernameField);
		usernameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		passwordField.setBounds(303, 291, 275, 57);
		frame.getContentPane().add(passwordField);
		
		JButton loginButton = new JButton("Login");
		loginButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String username = usernameField.getText();
				String password = new String(passwordField.getPassword());
				check_login_credentials(username, password);
			}
		});
		loginButton.setFont(new Font("Tahoma", Font.BOLD, 22));
		loginButton.setBounds(303, 385, 154, 57);
		frame.getContentPane().add(loginButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\BilgeAdam\\BE\u015E\u0130KTA\u015E-GRUP\\login-icon-3055.png"));
		lblNewLabel.setBounds(289, 7, 275, 175);
		frame.getContentPane().add(lblNewLabel);
	}

	public void check_login_credentials(String username, String password) {
		LoginModel login = new LoginModel(username, password);
		LoginController loginController = new LoginController();
		boolean result = false;
		try {
			result = loginController.control_login_credentials(login);
		} catch (UsernameOrPasswordIsNullException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(),"WARNING",JOptionPane.WARNING_MESSAGE);
			System.exit(1);
		}

		if(result){
			JOptionPane.showMessageDialog(null, "Welcome " + username);
		} else {
			JOptionPane.showMessageDialog(null, "Your username or password is wrong","WARNING",JOptionPane.WARNING_MESSAGE);
		}

	}



}
