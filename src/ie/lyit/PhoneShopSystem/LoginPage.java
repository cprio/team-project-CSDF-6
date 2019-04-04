/*	Main Login page with fields for username and password.
 *	By Declan McGinley
*/
package ie.lyit.PhoneShopSystem;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginPage extends JFrame {

	private JPanel contentPane;
	private Font font1 = new Font("Arial", Font.BOLD, 20);
	private Border whiteBorder = new LineBorder(Color.WHITE, 2);
	private Font font = new Font("Arial", Font.BOLD, 16);
	private Color bluey = new Color(2, 22, 49);
	private JTextField textField;
	private JPasswordField passwordField;
	private String userName = "root";
	private String inputUserName = "";
	private char[] inputPassword;
	private LoginPage frame;
	
	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
	final private String host = "localhost";
	final private String user = "root";
	final private String passwd = "password";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
					frame.setVisible(true);
					frame.setExtendedState(Frame.MAXIMIZED_BOTH);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 940, 562);
		//set background
		contentPane = new JPanel(){  
			public void paintComponent(Graphics g) {  
			Image img = Toolkit.getDefaultToolkit().getImage(  
			LoginPage.class.getResource("/images/login.jpg"));  
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);  
            }  
	    };
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(300, 200, 125, 25);
		lblUsername.setFont(font1);
		lblUsername.setForeground(Color.WHITE);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(300, 300, 125, 25);
		lblPassword.setFont(font1);
		lblPassword.setForeground(Color.WHITE);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(500, 200, 125, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(500, 300, 125, 25);
		contentPane.add(passwordField);
		passwordField.addKeyListener
	      (new KeyAdapter() {
	          public void keyPressed(KeyEvent e) {
	            int key = e.getKeyCode();
	            if (key == KeyEvent.VK_ENTER) { 
	            	inputPassword = passwordField.getPassword();
					if(isPasswordCorrect(inputPassword)) {
						JFrame homePage = new HomePage();
						homePage.setVisible(true);
						homePage.setExtendedState(Frame.MAXIMIZED_BOTH);
						frame.setVisible(false);
					} else {
			            JOptionPane.showMessageDialog(null,
			                    "Invalid password or username. Try again.",
			                    "Error Message",
			                    JOptionPane.ERROR_MESSAGE);
					}
	               }
	            }
	          }
	       );
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(800, 400, 200, 75);
		btnLogin.setBorder(whiteBorder);
		btnLogin.setFont(font);
		btnLogin.setBackground(bluey);
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setOpaque(true);
		contentPane.add(btnLogin);
		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputPassword = passwordField.getPassword();
				if(isPasswordCorrect(inputPassword)) {
					JFrame homePage = new HomePage();
					homePage.setVisible(true);
					homePage.setExtendedState(Frame.MAXIMIZED_BOTH);
					frame.setVisible(false);
				} else {
		            JOptionPane.showMessageDialog(null,
		                    "Invalid password or username. Try again.",
		                    "Error Message",
		                    JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		
		
	}
	//method to validate password
		private static boolean isPasswordCorrect(char[] input) {
			boolean isCorrect = true;
			char[] correctPassword = {'p','a','s','s','w','o','r','d'};
			
			if(input.length != correctPassword.length) {
				isCorrect = false;
			}else {
				isCorrect = Arrays.equals(input,  correctPassword);
			}
			//zero out password
			Arrays.fill(correctPassword,  '0');
			
			return isCorrect;
		}
}
