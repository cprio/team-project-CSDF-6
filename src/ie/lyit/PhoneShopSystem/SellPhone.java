package ie.lyit.PhoneShopSystem;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class SellPhone extends JFrame {

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
	private Border whiteBorder = new LineBorder(Color.WHITE, 2);
	private Font font = new Font("Arial", Font.BOLD, 16);
	private Color bluey = new Color(2, 22, 49);
	private String [] makes = {"Samsung", "Apple", "Huawei", "Google", "OnePlus"};
	private String [] models = {"Galaxy S10", "Galaxy S10e", "Galaxy Note 9", "iPhone XS", "iPhone 6", "iPhone 7", "Mate 20", "P20 Pro", "Pixel 3", "6T"};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SellPhone frame = new SellPhone();
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
	public SellPhone() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 750);
		contentPane = new JPanel(){  
			public void paintComponent(Graphics g) {  
			Image img = Toolkit.getDefaultToolkit().getImage(  
			HomePage.class.getResource("/images/sell.jpg"));  
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);  
            }  
	    };
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSerialNo = new JLabel("Serial No.");
		lblSerialNo.setBounds(375, 200, 100, 20);
		lblSerialNo.setFont(font);
		lblSerialNo.setForeground(Color.WHITE);
		contentPane.add(lblSerialNo);
		
		textField = new JTextField();
		textField.setBounds(500, 200, 118, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblMake = new JLabel("Make");
		lblMake.setBounds(700, 200, 100, 20);
		lblMake.setFont(font);
		lblMake.setForeground(Color.WHITE);
		contentPane.add(lblMake);
		
		JComboBox makeComboBox = new JComboBox(makes);
		makeComboBox.setBounds(850, 200, 145, 20);
		contentPane.add(makeComboBox);
		makeComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
			}
		});
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(375, 250, 100, 20);
		lblEmail.setFont(font);
		lblEmail.setForeground(Color.WHITE);
		contentPane.add(lblEmail);
		
		textField_1 = new JTextField();
		textField_1.setBounds(500, 250, 118, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblModel = new JLabel("Model");
		lblModel.setBounds(700, 250, 100, 20);
		lblModel.setFont(font);
		lblModel.setForeground(Color.WHITE);
		contentPane.add(lblModel);
		
		JComboBox modelComboBox = new JComboBox(models);
		modelComboBox.setBounds(850, 250, 145, 20);
		contentPane.add(modelComboBox);
		modelComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
			}
		});
		
		textField_2 = new JTextField("First Name");
		textField_2.setBounds(550, 350, 118, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		textField_2.addFocusListener(new FocusListener() {
		    public void focusGained(FocusEvent e) {
		    	textField_2.setText("");
		    }
		    public void focusLost(FocusEvent e) {
		        // nothing
		    }
		});
		
		textField_5 = new JTextField("Address Line 1");
		textField_5.setBounds(700, 350, 145, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		textField_5.addFocusListener(new FocusListener() {
		    public void focusGained(FocusEvent e) {
		    	textField_5.setText("");
		    }
		    public void focusLost(FocusEvent e) {
		        // nothing
		    }
		});
		
		textField_3 = new JTextField("Surname");
		textField_3.setBounds(550, 380, 118, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		textField_3.addFocusListener(new FocusListener() {
		    public void focusGained(FocusEvent e) {
		    	textField_3.setText("");
		    }
		    public void focusLost(FocusEvent e) {
		        // nothing
		    }
		});
		
		textField_6 = new JTextField("Address Line 2");
		textField_6.setBounds(700, 380, 145, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		textField_6.addFocusListener(new FocusListener() {
		    public void focusGained(FocusEvent e) {
		    	textField_6.setText("");
		    }
		    public void focusLost(FocusEvent e) {
		        // nothing
		    }
		});
		
		textField_4 = new JTextField("Email Address");
		textField_4.setBounds(550, 410, 118, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		textField_4.addFocusListener(new FocusListener() {
		    public void focusGained(FocusEvent e) {
		    	textField_4.setText("");
		    }
		    public void focusLost(FocusEvent e) {
		        // nothing
		    }
		});
		
		textField_7 = new JTextField("County");
		textField_7.setBounds(700, 410, 145, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		textField_7.addFocusListener(new FocusListener() {
		    public void focusGained(FocusEvent e) {
		    	textField_7.setText("");
		    }
		    public void focusLost(FocusEvent e) {
		        // nothing
		    }
		});
		
		textField_8 = new JTextField("Date of Birth");
		textField_8.setBounds(550, 440, 118, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		textField_8.addFocusListener(new FocusListener() {
		    public void focusGained(FocusEvent e) {
		    	textField_8.setText("");
		    }
		    public void focusLost(FocusEvent e) {
		        // nothing
		    }
		});
		
		JCheckBox chckbxAddressForOver = new JCheckBox("Address for over 3 years");
		chckbxAddressForOver.setBounds(700, 464, 220, 25);
		chckbxAddressForOver.setBorder(whiteBorder);
		chckbxAddressForOver.setFont(font);
		chckbxAddressForOver.setBackground(bluey);
		chckbxAddressForOver.setForeground(Color.WHITE);
		chckbxAddressForOver.setOpaque(true);
		contentPane.add(chckbxAddressForOver);
		
		JCheckBox chckbxEmployed = new JCheckBox("Employed");
		chckbxEmployed.setBounds(700, 500, 220, 25);
		chckbxEmployed.setBorder(whiteBorder);
		chckbxEmployed.setFont(font);
		chckbxEmployed.setBackground(bluey);
		chckbxEmployed.setForeground(Color.WHITE);
		chckbxEmployed.setOpaque(true);
		contentPane.add(chckbxEmployed);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(850, 300, 120, 40);
		btnSearch.setBorder(whiteBorder);
		btnSearch.setFont(font);
		btnSearch.setBackground(bluey);
		btnSearch.setForeground(Color.WHITE);
		btnSearch.setOpaque(true);
		contentPane.add(btnSearch);
		
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
			}
		});
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(200, 600, 120, 40);
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
		btnSubmit.setBounds(800, 600, 120, 40);
		btnSubmit.setBorder(whiteBorder);
		btnSubmit.setFont(font);
		btnSubmit.setBackground(bluey);
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setOpaque(true);
		contentPane.add(btnSubmit);
		
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//write to db
			}
		});
	}
}