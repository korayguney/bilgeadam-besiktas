package com.bilgeadam.jpa3.view;

import com.bilgeadam.jpa3.controller.RegisterController;
import com.bilgeadam.jpa3.model.RegisterModel;
import com.bilgeadam.jpa3.model.ResponseModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SignupUI {

    private JFrame frame;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JPasswordField passwordField2;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SignupUI window = new SignupUI();
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
    public SignupUI() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 745, 690);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel usernameLabel = new JLabel("Username :");
        usernameLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
        usernameLabel.setBounds(133, 192, 183, 57);
        frame.getContentPane().add(usernameLabel);

        JLabel passwordLabel = new JLabel("Password :");
        passwordLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
        passwordLabel.setBounds(133, 292, 183, 57);
        frame.getContentPane().add(passwordLabel);

        JLabel passwordLabel2 = new JLabel("Password 2:");
        passwordLabel2.setFont(new Font("Tahoma", Font.BOLD, 24));
        passwordLabel2.setBounds(133, 392, 183, 57);
        frame.getContentPane().add(passwordLabel2);

        usernameField = new JTextField();
        usernameField.setFont(new Font("Tahoma", Font.PLAIN, 18));
        usernameField.setBounds(303, 191, 275, 54);
        frame.getContentPane().add(usernameField);
        usernameField.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 18));
        passwordField.setBounds(303, 291, 275, 54);
        frame.getContentPane().add(passwordField);

        passwordField2 = new JPasswordField();
        passwordField2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        passwordField2.setBounds(303, 391, 275, 54);
        frame.getContentPane().add(passwordField2);

        JButton signUpBtn = new JButton("Sign Up");
        signUpBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                String password2 = new String(passwordField2.getPassword());
                RegisterModel registerModel = new RegisterModel(username, password, password2);
				signUpNewUser(registerModel);
            }
        });
        signUpBtn.setFont(new Font("Tahoma", Font.BOLD, 22));
        signUpBtn.setBounds(303, 490, 154, 57);
        frame.getContentPane().add(signUpBtn);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("D:\\BilgeAdam\\BE\u015E\u0130KTA\u015E-GRUP\\login-icon-3055.png"));
        lblNewLabel.setBounds(289, 7, 275, 175);
        frame.getContentPane().add(lblNewLabel);
    }



    public void signUpNewUser(RegisterModel registerModel) {
    	ResponseModel response = new RegisterController().signUpNewUser(registerModel);
        if(response.isResult()){
            JOptionPane.showMessageDialog(null, "User is saved to DB ");
        } else {
            String message ="";

            switch (response.getCode()){
                case PASSWORDS_ARE_MISMATCHED:
                    message = "Passwords are mismatched";
                    break;
                case USERNAME_OR_PASSWORD_NULL:
                    message = "You have to enter all credentials";
                    break;
                case USERNAME_IS_ALREADY_REGISTERED:
                    message = "Username is already registered! Select different username!";
                    break;
                default:
                    message = "There is an exception";
            }

            JOptionPane.showMessageDialog(null, message,"WARNING",JOptionPane.WARNING_MESSAGE);
        }

    }


}
