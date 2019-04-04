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

import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AddStock extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JLabel lblMake;
	private JLabel lblModel;
	private JComboBox comboBoxMake;
	private JComboBox comboBoxModel;
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
					AddStock frame = new AddStock();
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
	public AddStock() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 750);
		//set background
		contentPane = new JPanel(){  
			public void paintComponent(Graphics g) {  
			Image img = Toolkit.getDefaultToolkit().getImage(  
			LoginPage.class.getResource("/images/addStock.jpg"));  
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);  
	        }  
	    };
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblMake = new JLabel("Make");
		lblMake.setBounds(300, 200, 100, 20);
		lblMake.setFont(font);
		lblMake.setForeground(Color.WHITE);
		contentPane.add(lblMake);
		
		comboBoxMake = new JComboBox();
		comboBoxMake.setBounds(400, 200, 150, 20);
		contentPane.add(comboBoxMake);
		
		lblModel = new JLabel("Model");
		lblModel.setBounds(800, 200, 100, 20);
		lblModel.setFont(font);
		lblModel.setForeground(Color.WHITE);
		contentPane.add(lblModel);
		
		comboBoxModel = new JComboBox();
		comboBoxModel.setBounds(900, 200, 150, 20);
		contentPane.add(comboBoxModel);
		
		JLabel lblEnterSerialNumbers = new JLabel("Enter Serial Number(s)");
		lblEnterSerialNumbers.setBounds(500, 360, 180, 20);
		lblEnterSerialNumbers.setFont(font);
		lblEnterSerialNumbers.setForeground(Color.WHITE);
		contentPane.add(lblEnterSerialNumbers);
		
		textField = new JTextField();
		textField.setBounds(500, 400, 110, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(750, 400, 110, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(500, 440, 110, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(750, 440, 110, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(500, 480, 110, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(750, 480, 110, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(500, 520, 110, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(750, 520, 110, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(500, 560, 110, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(750, 560, 110, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JButton btnAddNewPhone = new JButton("Add New Phone");
		btnAddNewPhone.setBounds(750, 650, 160, 40);
		btnAddNewPhone.setBorder(whiteBorder);
		btnAddNewPhone.setFont(font);
		btnAddNewPhone.setBackground(bluey);
		btnAddNewPhone.setForeground(Color.WHITE);
		btnAddNewPhone.setOpaque(true);
		contentPane.add(btnAddNewPhone);
		
		btnAddNewPhone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame addPhone = new AddPhone();
				addPhone.setVisible(true);
				addPhone.setExtendedState(Frame.MAXIMIZED_BOTH);
				contentPane.setVisible(false);
			}
		});
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(900, 540, 90, 40);
		btnSubmit.setBorder(whiteBorder);
		btnSubmit.setFont(font);
		btnSubmit.setBackground(bluey);
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setOpaque(true);
		contentPane.add(btnSubmit);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(500, 650, 80, 40);
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
