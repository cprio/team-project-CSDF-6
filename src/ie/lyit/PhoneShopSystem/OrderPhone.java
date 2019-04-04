/*	This page allows the user to order phones. This is added to the order table in the database.
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

import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class OrderPhone extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private Border whiteBorder = new LineBorder(Color.WHITE, 2);
	private Font font = new Font("Arial", Font.BOLD, 16);
	private Color bluey = new Color(2, 22, 49);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderPhone frame = new OrderPhone();
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
	public OrderPhone() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 750);
		contentPane = new JPanel(){  
			public void paintComponent(Graphics g) {  
			Image img = Toolkit.getDefaultToolkit().getImage(  
			LoginPage.class.getResource("/images/orderPhone.jpg"));  
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);  
            }  
	    };
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMake = new JLabel("Make");
		lblMake.setBounds(400, 250, 100, 20);
		lblMake.setFont(font);
		lblMake.setForeground(Color.WHITE);
		contentPane.add(lblMake);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(500, 250, 270, 20);
		contentPane.add(comboBox);
		
		JLabel lblModel = new JLabel("Model");
		lblModel.setBounds(400, 300, 100, 20);
		lblModel.setFont(font);
		lblModel.setForeground(Color.WHITE);
		contentPane.add(lblModel);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(500, 300, 270, 20);
		contentPane.add(comboBox_1);
		
		JLabel lblQuantity = new JLabel("Quantity:");
		lblQuantity.setBounds(400, 350, 75, 20);
		lblQuantity.setFont(font);
		lblQuantity.setForeground(Color.WHITE);
		contentPane.add(lblQuantity);
		
		textField = new JTextField();
		textField.setBounds(500, 350, 270, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(400, 400, 50, 20);
		lblEmail.setFont(font);
		lblEmail.setForeground(Color.WHITE);
		contentPane.add(lblEmail);
		
		textField_1 = new JTextField();
		textField_1.setBounds(500, 400, 270, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(100, 600, 80, 50);
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
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(850, 375, 100, 50);
		btnSubmit.setBorder(whiteBorder);
		btnSubmit.setFont(font);
		btnSubmit.setBackground(bluey);
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setOpaque(true);
		contentPane.add(btnSubmit);
		
		JButton btnViewOrders = new JButton("View Orders");
		btnViewOrders.setBounds(600, 600, 150, 50);
		btnViewOrders.setBorder(whiteBorder);
		btnViewOrders.setFont(font);
		btnViewOrders.setBackground(bluey);
		btnViewOrders.setForeground(Color.WHITE);
		btnViewOrders.setOpaque(true);
		contentPane.add(btnViewOrders);
		
		
	}

}
