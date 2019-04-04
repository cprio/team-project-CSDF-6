/*	This page allows the user to add phones to the database.
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

public class AddPhone extends JFrame {

	private JPanel contentPane;
	private Border whiteBorder = new LineBorder(Color.WHITE, 2);
	private Font font = new Font("Arial", Font.BOLD, 16);
	private Color bluey = new Color(2, 22, 49);
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnSubmit;
	private JButton btnBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddPhone frame = new AddPhone();
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
	public AddPhone() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 750);
		contentPane = new JPanel(){  
			public void paintComponent(Graphics g) {  
			Image img = Toolkit.getDefaultToolkit().getImage(  
			LoginPage.class.getResource("/images/addPhone.jpg"));  
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);  
	        }  
	    };
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMake = new JLabel("Make");
		lblMake.setBounds(400, 300, 100, 20);
		lblMake.setFont(font);
		lblMake.setForeground(Color.WHITE);
		contentPane.add(lblMake);
		
		JLabel lblModel = new JLabel("Model");
		lblModel.setBounds(400, 350, 100, 20);
		lblModel.setFont(font);
		lblModel.setForeground(Color.WHITE);
		contentPane.add(lblModel);
		
		textField = new JTextField();
		textField.setBounds(510, 300, 150, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(510, 350, 150, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(750, 330, 90, 40);
		btnSubmit.setBorder(whiteBorder);
		btnSubmit.setFont(font);
		btnSubmit.setBackground(bluey);
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setOpaque(true);
		contentPane.add(btnSubmit);
		
		btnBack = new JButton("Back");
		btnBack.setBounds(650, 650, 80, 40);
		btnBack.setBorder(whiteBorder);
		btnBack.setFont(font);
		btnBack.setBackground(bluey);
		btnBack.setForeground(Color.WHITE);
		btnBack.setOpaque(true);
		contentPane.add(btnBack);
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame addStock = new AddStock();
				addStock.setVisible(true);
				addStock.setExtendedState(Frame.MAXIMIZED_BOTH);
				contentPane.setVisible(false);
			}
		});
	}

}
