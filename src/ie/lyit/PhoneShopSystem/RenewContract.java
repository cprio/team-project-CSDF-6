/*	This page allows the user to renew a customers contract.
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
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class RenewContract extends JFrame {

	private JPanel contentPane;
	private Border whiteBorder = new LineBorder(Color.WHITE, 2);
	private Font font = new Font("Arial", Font.BOLD, 16);
	private Color bluey = new Color(2, 22, 49);
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RenewContract frame = new RenewContract();
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
	public RenewContract() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 800);
		contentPane = new JPanel(){  
			public void paintComponent(Graphics g) {  
			Image img = Toolkit.getDefaultToolkit().getImage(  
			LoginPage.class.getResource("/images/renew.jpg"));  
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);  
            }  
	    };
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmailcustomerId = new JLabel("Email/Customer ID");
		lblEmailcustomerId.setBounds(300, 150, 150, 20);
		lblEmailcustomerId.setFont(font);
		lblEmailcustomerId.setForeground(Color.WHITE);
		contentPane.add(lblEmailcustomerId);
		
		JLabel lblMake = new JLabel("Make");
		lblMake.setBounds(300, 200, 150, 20);
		lblMake.setFont(font);
		lblMake.setForeground(Color.WHITE);
		contentPane.add(lblMake);
		
		JLabel lblModel = new JLabel("Model");
		lblModel.setBounds(300, 250, 150, 20);
		lblModel.setFont(font);
		lblModel.setForeground(Color.WHITE);
		contentPane.add(lblModel);
		
		textField = new JTextField();
		textField.setBounds(470, 150, 150, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(470, 200, 150, 20);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(470, 250, 150, 20);
		contentPane.add(comboBox_1);
		
		JCheckBox chckbxTermsConditions = new JCheckBox("Terms & Conditions");
		chckbxTermsConditions.setBounds(470, 300, 200, 25);
		chckbxTermsConditions.setBackground(bluey);
		chckbxTermsConditions.setFont(font);
		chckbxTermsConditions.setForeground(Color.WHITE);
		contentPane.add(chckbxTermsConditions);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(700, 285, 90, 40);
		btnSubmit.setBorder(whiteBorder);
		btnSubmit.setFont(font);
		btnSubmit.setBackground(bluey);
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setOpaque(true);
		contentPane.add(btnSubmit);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(700, 130, 90, 40);
		btnSearch.setBorder(whiteBorder);
		btnSearch.setFont(font);
		btnSearch.setBackground(bluey);
		btnSearch.setForeground(Color.WHITE);
		btnSearch.setOpaque(true);
		contentPane.add(btnSearch);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(100, 500, 90, 40);
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
