package ie.lyit.PhoneShopSystem;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;

public class OrderTable extends JFrame {

	private JPanel contentPane;
	private Border whiteBorder = new LineBorder(Color.WHITE, 2);
	private Font font = new Font("Arial", Font.BOLD, 16);
	private Color bluey = new Color(2, 22, 49);
	private JTextField textField;
	private JButton btnSearch;
	private JLabel lblMake;
	private JLabel lblModel;
	private JLabel lblDateOrdered;
	private JLabel lblQuantity;
	private JLabel lblEmail;
	private JLabel lblCustomerContacted;
	private JTextField makeTF_1;
	private JTextField modelTF_1;
	private JTextField dateTF_1;
	private JTextField quantityTF_1;
	private JTextField emailTF_1;
	private JTextField custTF_1;
	private JTextField makeTF_2;
	private JTextField modelTF_2;
	private JTextField dateTF_2;
	private JTextField quantityTF_2;
	private JTextField emailTF_2;
	private JTextField custTF_2;
	private JTextField makeTF_3;
	private JTextField modelTF_3;
	private JTextField dateTF_3;
	private JTextField quantityTF_3;
	private JTextField emailTF_3;
	private JTextField custTF_3;
	private JTextField makeTF_4;
	private JTextField modelTF_4;
	private JTextField dateTF_4;
	private JTextField quantityTF_4;
	private JTextField emailTF_4;
	private JTextField custTF_4;
	private JTextField makeTF_5;
	private JTextField modelTF_5;
	private JTextField dateTF_5;
	private JTextField quantityTF_5;
	private JTextField emailTF_5;
	private JTextField custTF_5;
	private JTextField makeTF_6;
	private JTextField modelTF_6;
	private JTextField dateTF_6;
	private JTextField quantityTF_6;
	private JTextField emailTF_6;
	private JTextField custTF_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderTable frame = new OrderTable();
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
	public OrderTable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 800);
		contentPane = new JPanel(){  
			public void paintComponent(Graphics g) {  
			Image img = Toolkit.getDefaultToolkit().getImage(  
			HomePage.class.getResource("/images/orderTable.jpg"));  
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);  
            }  
	    };
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmailcustomerid = new JLabel("Email/CustomerID:");
		lblEmailcustomerid.setBounds(380, 150, 175, 20);
		lblEmailcustomerid.setFont(font);
		lblEmailcustomerid.setForeground(Color.WHITE);
		contentPane.add(lblEmailcustomerid);
		
		textField = new JTextField();
		textField.setBounds(575, 150, 200, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnSearch = new JButton("Search");
		btnSearch.setBounds(800, 135, 100, 50);
		btnSearch.setBorder(whiteBorder);
		btnSearch.setFont(font);
		btnSearch.setBackground(bluey);
		btnSearch.setForeground(Color.WHITE);
		btnSearch.setOpaque(true);
		contentPane.add(btnSearch);
		
		lblMake = new JLabel("Make");
		lblMake.setBounds(200, 200, 100, 20);
		lblMake.setFont(font);
		lblMake.setForeground(Color.WHITE);
		contentPane.add(lblMake);
		
		lblModel = new JLabel("Model");
		lblModel.setBounds(350, 200, 100, 20);
		lblModel.setFont(font);
		lblModel.setForeground(Color.WHITE);
		contentPane.add(lblModel);
		
		lblDateOrdered = new JLabel("Date Ordered");
		lblDateOrdered.setBounds(500, 200, 110, 20);
		lblDateOrdered.setFont(font);
		lblDateOrdered.setForeground(Color.WHITE);
		contentPane.add(lblDateOrdered);
		
		lblQuantity = new JLabel("Quantity");
		lblQuantity.setBounds(650, 200, 100, 20);
		lblQuantity.setFont(font);
		lblQuantity.setForeground(Color.WHITE);
		contentPane.add(lblQuantity);
		
		lblEmail = new JLabel("Email");
		lblEmail.setBounds(800, 200, 100, 20);
		lblEmail.setFont(font);
		lblEmail.setForeground(Color.WHITE);
		contentPane.add(lblEmail);
		
		lblCustomerContacted = new JLabel("Customer Contacted");
		lblCustomerContacted.setBounds(950, 200, 160, 20);
		lblCustomerContacted.setFont(font);
		lblCustomerContacted.setForeground(Color.WHITE);
		contentPane.add(lblCustomerContacted);
		
		makeTF_1 = new JTextField();
		makeTF_1.setBounds(200, 250, 100, 20);
		contentPane.add(makeTF_1);
		makeTF_1.setColumns(10);
		
		modelTF_1 = new JTextField();
		modelTF_1.setBounds(350, 250, 100, 20);
		contentPane.add(modelTF_1);
		modelTF_1.setColumns(10);
		
		dateTF_1 = new JTextField();
		dateTF_1.setBounds(500, 250, 100, 20);
		contentPane.add(dateTF_1);
		dateTF_1.setColumns(10);
		
		quantityTF_1 = new JTextField();
		quantityTF_1.setBounds(650, 250, 100, 20);
		contentPane.add(quantityTF_1);
		quantityTF_1.setColumns(10);
		
		emailTF_1 = new JTextField();
		emailTF_1.setBounds(800, 250, 100, 20);
		contentPane.add(emailTF_1);
		emailTF_1.setColumns(10);
		
		custTF_1 = new JTextField();
		custTF_1.setBounds(950, 250, 100, 20);
		contentPane.add(custTF_1);
		custTF_1.setColumns(10);
		
		makeTF_2 = new JTextField();
		makeTF_2.setBounds(200, 300, 100, 20);
		contentPane.add(makeTF_2);
		makeTF_2.setColumns(10);
		
		modelTF_2 = new JTextField();
		modelTF_2.setBounds(350, 300, 100, 20);
		contentPane.add(modelTF_2);
		modelTF_2.setColumns(10);
		
		dateTF_2 = new JTextField();
		dateTF_2.setBounds(500, 300, 100, 20);
		contentPane.add(dateTF_2);
		dateTF_2.setColumns(10);
		
		quantityTF_2 = new JTextField();
		quantityTF_2.setBounds(650, 300, 100, 20);
		contentPane.add(quantityTF_2);
		quantityTF_2.setColumns(10);
		
		emailTF_2 = new JTextField();
		emailTF_2.setBounds(800, 300, 100, 20);
		contentPane.add(emailTF_2);
		emailTF_2.setColumns(10);
		
		custTF_2 = new JTextField();
		custTF_2.setBounds(950, 300, 100, 20);
		contentPane.add(custTF_2);
		custTF_2.setColumns(10);
		
		makeTF_3 = new JTextField();
		makeTF_3.setBounds(200, 350, 100, 20);
		contentPane.add(makeTF_3);
		makeTF_3.setColumns(10);
		
		modelTF_3 = new JTextField();
		modelTF_3.setBounds(350, 350, 100, 20);
		contentPane.add(modelTF_3);
		modelTF_3.setColumns(10);
		
		dateTF_3 = new JTextField();
		dateTF_3.setBounds(500, 350, 100, 20);
		contentPane.add(dateTF_3);
		dateTF_3.setColumns(10);
		
		quantityTF_3 = new JTextField();
		quantityTF_3.setBounds(650, 350, 100, 20);
		contentPane.add(quantityTF_3);
		quantityTF_3.setColumns(10);
		
		emailTF_3 = new JTextField();
		emailTF_3.setBounds(800, 350, 100, 20);
		contentPane.add(emailTF_3);
		emailTF_3.setColumns(10);
		
		custTF_3 = new JTextField();
		custTF_3.setBounds(950, 350, 100, 20);
		contentPane.add(custTF_3);
		custTF_3.setColumns(10);
		
		makeTF_4 = new JTextField();
		makeTF_4.setBounds(200, 400, 100, 20);
		contentPane.add(makeTF_4);
		makeTF_4.setColumns(10);
		
		modelTF_4 = new JTextField();
		modelTF_4.setBounds(350, 400, 100, 20);
		contentPane.add(modelTF_4);
		modelTF_4.setColumns(10);
		
		dateTF_4 = new JTextField();
		dateTF_4.setBounds(500, 400, 100, 20);
		contentPane.add(dateTF_4);
		dateTF_4.setColumns(10);
		
		quantityTF_4 = new JTextField();
		quantityTF_4.setBounds(650, 400, 100, 20);
		contentPane.add(quantityTF_4);
		quantityTF_4.setColumns(10);
		
		emailTF_4 = new JTextField();
		emailTF_4.setBounds(800, 400, 100, 20);
		contentPane.add(emailTF_4);
		emailTF_4.setColumns(10);
		
		custTF_4 = new JTextField();
		custTF_4.setBounds(950, 400, 100, 20);
		contentPane.add(custTF_4);
		custTF_4.setColumns(10);
		
		makeTF_5 = new JTextField();
		makeTF_5.setBounds(200, 450, 100, 20);
		contentPane.add(makeTF_5);
		makeTF_5.setColumns(10);
		
		modelTF_5 = new JTextField();
		modelTF_5.setBounds(350, 450, 100, 20);
		contentPane.add(modelTF_5);
		modelTF_5.setColumns(10);
		
		dateTF_5 = new JTextField();
		dateTF_5.setBounds(500, 450, 100, 20);
		contentPane.add(dateTF_5);
		dateTF_5.setColumns(10);
		
		quantityTF_5 = new JTextField();
		quantityTF_5.setBounds(650, 450, 100, 20);
		contentPane.add(quantityTF_5);
		quantityTF_5.setColumns(10);
		
		emailTF_5 = new JTextField();
		emailTF_5.setBounds(800, 450, 100, 20);
		contentPane.add(emailTF_5);
		emailTF_5.setColumns(10);
		
		custTF_5 = new JTextField();
		custTF_5.setBounds(950, 450, 100, 20);
		contentPane.add(custTF_5);
		custTF_5.setColumns(10);
		
		makeTF_6 = new JTextField();
		makeTF_6.setBounds(200, 500, 100, 20);
		contentPane.add(makeTF_6);
		makeTF_6.setColumns(10);
		
		modelTF_6 = new JTextField();
		modelTF_6.setBounds(350, 500, 100, 20);
		contentPane.add(modelTF_6);
		modelTF_6.setColumns(10);
		
		dateTF_6 = new JTextField();
		dateTF_6.setBounds(500, 500, 100, 20);
		contentPane.add(dateTF_6);
		dateTF_6.setColumns(10);
		
		quantityTF_6 = new JTextField();
		quantityTF_6.setBounds(650, 500, 100, 20);
		contentPane.add(quantityTF_6);
		quantityTF_6.setColumns(10);
		
		emailTF_6 = new JTextField();
		emailTF_6.setBounds(800, 500, 100, 20);
		contentPane.add(emailTF_6);
		emailTF_6.setColumns(10);
		
		custTF_6 = new JTextField();
		custTF_6.setBounds(950, 500, 100, 20);
		contentPane.add(custTF_6);
		custTF_6.setColumns(10);
	}
}
