/*	This page allows the user to search for a customer in the database. Customer details are then displayed on screen.
 *	By Declan McGinley
*/
package ie.lyit.PhoneShopSystem;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class SearchCustomer extends JFrame {

	private JPanel contentPane;
	private Border whiteBorder = new LineBorder(Color.WHITE, 2);
	private Font font = new Font("Arial", Font.BOLD, 16);
	private Color bluey = new Color(2, 22, 49);
	private JTextField textField;
	private JButton btnSearch;
	private JLabel lblFirstName;
	private JLabel lblSurname;
	private JLabel lblCustomerId;
	private JLabel lblAddressLine1;
	private JLabel lblAddressLine2;
	private JLabel lblCounty;
	private JLabel lblCreationDate;
	private JLabel lblModifiedDate;
	private JLabel lblEmail;
	private JLabel lblEmployed;
	private JTextField textFieldFirstName;
	private JTextField textFieldSurname;
	private JTextField textFieldCustomerId;
	private JTextField textFieldAddressLine1;
	private JTextField textFieldAddressLine2;
	private JTextField textFieldCounty;
	private JTextField textFieldCreationDate;
	private JTextField textFieldModifiedDate;
	private JTextField textFieldEmail;
	private JTextField textFieldEmployed;
	private JButton btnBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchCustomer frame = new SearchCustomer();
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
	public SearchCustomer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 800);
		contentPane = new JPanel(){  
			public void paintComponent(Graphics g) {  
			Image img = Toolkit.getDefaultToolkit().getImage(  
			LoginPage.class.getResource("/images/searchCustomer.jpg"));  
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);  
            }  
	    };
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmailcustomerId = new JLabel("Enter Email/Customer ID:");
		lblEmailcustomerId.setBounds(340, 162, 200, 20);
		lblEmailcustomerId.setFont(font);
		lblEmailcustomerId.setForeground(Color.WHITE);
		contentPane.add(lblEmailcustomerId);
		
		textField = new JTextField();
		textField.setBounds(550, 162, 200, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnSearch = new JButton("Search");
		btnSearch.setBounds(800, 150, 100, 50);
		btnSearch.setBorder(whiteBorder);
		btnSearch.setFont(font);
		btnSearch.setBackground(bluey);
		btnSearch.setForeground(Color.WHITE);
		btnSearch.setOpaque(true);
		contentPane.add(btnSearch);
		
		lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(400, 250, 120, 20);
		lblFirstName.setFont(font);
		lblFirstName.setForeground(Color.WHITE);
		contentPane.add(lblFirstName);
		
		lblSurname = new JLabel("Surname:");
		lblSurname.setBounds(400, 300, 120, 20);
		lblSurname.setFont(font);
		lblSurname.setForeground(Color.WHITE);
		contentPane.add(lblSurname);
		
		lblCustomerId = new JLabel("Customer ID:");
		lblCustomerId.setBounds(400, 350, 120, 20);
		lblCustomerId.setFont(font);
		lblCustomerId.setForeground(Color.WHITE);
		contentPane.add(lblCustomerId);
		
		lblAddressLine1 = new JLabel("Address Line 1:");
		lblAddressLine1.setBounds(400, 400, 120, 20);
		lblAddressLine1.setFont(font);
		lblAddressLine1.setForeground(Color.WHITE);
		contentPane.add(lblAddressLine1);
		
		lblAddressLine2 = new JLabel("Address Line 2:");
		lblAddressLine2.setBounds(400, 450, 120, 20);
		lblAddressLine2.setFont(font);
		lblAddressLine2.setForeground(Color.WHITE);
		contentPane.add(lblAddressLine2);
		
		lblCounty = new JLabel("County:");
		lblCounty.setBounds(400, 500, 120, 20);
		lblCounty.setFont(font);
		lblCounty.setForeground(Color.WHITE);
		contentPane.add(lblCounty);
		
		lblCreationDate = new JLabel("Creation Date:");
		lblCreationDate.setBounds(400, 550, 120, 20);
		lblCreationDate.setFont(font);
		lblCreationDate.setForeground(Color.WHITE);
		contentPane.add(lblCreationDate);
		
		lblModifiedDate = new JLabel("Modified Date:");
		lblModifiedDate.setBounds(400, 600, 120, 20);
		lblModifiedDate.setFont(font);
		lblModifiedDate.setForeground(Color.WHITE);
		contentPane.add(lblModifiedDate);
		
		lblEmail = new JLabel("Email:");
		lblEmail.setBounds(400, 650, 120, 20);
		lblEmail.setFont(font);
		lblEmail.setForeground(Color.WHITE);
		contentPane.add(lblEmail);
		
		lblEmployed = new JLabel("Employed:");
		lblEmployed.setBounds(400, 700, 120, 20);
		lblEmployed.setFont(font);
		lblEmployed.setForeground(Color.WHITE);
		contentPane.add(lblEmployed);
		
		textFieldFirstName = new JTextField();
		textFieldFirstName.setBounds(550, 250, 200, 20);
		contentPane.add(textFieldFirstName);
		textFieldFirstName.setColumns(10);
		
		textFieldSurname = new JTextField();
		textFieldSurname.setBounds(550, 300, 200, 20);
		contentPane.add(textFieldSurname);
		textFieldSurname.setColumns(10);
		
		textFieldCustomerId = new JTextField();
		textFieldCustomerId.setBounds(550, 350, 200, 20);
		contentPane.add(textFieldCustomerId);
		textFieldCustomerId.setColumns(10);
		
		textFieldAddressLine1 = new JTextField();
		textFieldAddressLine1.setBounds(550, 400, 200, 20);
		contentPane.add(textFieldAddressLine1);
		textFieldAddressLine1.setColumns(10);
		
		textFieldAddressLine2 = new JTextField();
		textFieldAddressLine2.setBounds(550, 450, 200, 20);
		contentPane.add(textFieldAddressLine2);
		textFieldAddressLine2.setColumns(10);
		
		textFieldCounty = new JTextField();
		textFieldCounty.setBounds(550, 500, 200, 20);
		contentPane.add(textFieldCounty);
		textFieldCounty.setColumns(10);
		
		textFieldCreationDate = new JTextField();
		textFieldCreationDate.setBounds(550, 550, 200, 20);
		contentPane.add(textFieldCreationDate);
		textFieldCreationDate.setColumns(10);
		
		textFieldModifiedDate = new JTextField();
		textFieldModifiedDate.setBounds(550, 600, 200, 20);
		contentPane.add(textFieldModifiedDate);
		textFieldModifiedDate.setColumns(10);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(550, 650, 200, 20);
		contentPane.add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		textFieldEmployed = new JTextField();
		textFieldEmployed.setBounds(550, 700, 200, 20);
		contentPane.add(textFieldEmployed);
		textFieldEmployed.setColumns(10);
		
		btnBack = new JButton("Back");
		btnBack.setBounds(100, 650, 80, 50);
		btnBack.setBorder(whiteBorder);
		btnBack.setFont(font);
		btnBack.setBackground(bluey);
		btnBack.setForeground(Color.WHITE);
		btnBack.setOpaque(true);
		contentPane.add(btnBack);
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame homePage = new HomePage();
				homePage.setVisible(true);
				homePage.setExtendedState(Frame.MAXIMIZED_BOTH);
				contentPane.setVisible(false);
			}
		});
	}
}
