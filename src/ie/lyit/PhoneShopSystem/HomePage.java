/*	Home page with buttons taking you to other areas of the application.
 *	By Declan McGinley
*/
package ie.lyit.PhoneShopSystem;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.border.LineBorder;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

public class HomePage extends JFrame {

	private JPanel contentPane;
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
					HomePage frame = new HomePage();
					frame.setExtendedState(Frame.MAXIMIZED_BOTH);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Sets the background image by overriding the paintComponent method
		contentPane = new JPanel(){  
			public void paintComponent(Graphics g) {  
			Image img = Toolkit.getDefaultToolkit().getImage(  
			HomePage.class.getResource("/images/Menu.jpg"));  
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);  
            }  
	    };
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSellPhone = new JButton("Sell Phone");
		btnSellPhone.setBounds(400, 200, 200, 75);
		btnSellPhone.setBorder(whiteBorder);
		btnSellPhone.setFont(font);
		btnSellPhone.setBackground(bluey);
		btnSellPhone.setForeground(Color.WHITE);
		btnSellPhone.setOpaque(true);
		contentPane.add(btnSellPhone);
		
		btnSellPhone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame sellPhone = new SellPhone();
				sellPhone.setVisible(true);
				sellPhone.setExtendedState(Frame.MAXIMIZED_BOTH);
				contentPane.setVisible(false);
			}
		});
		
		JButton btnOrderPhone = new JButton("Order Phone");
		btnOrderPhone.setBounds(800, 200, 200, 75);
		btnOrderPhone.setBorder(whiteBorder);
		btnOrderPhone.setFont(font);
		btnOrderPhone.setBackground(bluey);
		btnOrderPhone.setForeground(Color.WHITE);
		btnOrderPhone.setOpaque(true);
		contentPane.add(btnOrderPhone);
		
		btnOrderPhone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame orderPhone = new OrderPhone();
				orderPhone.setVisible(true);
				orderPhone.setExtendedState(Frame.MAXIMIZED_BOTH);
				contentPane.setVisible(false);
			}
		});
		
		JButton btnAddStock = new JButton("Add Stock");
		btnAddStock.setBounds(400, 300, 200, 75);
		btnAddStock.setBorder(whiteBorder);
		btnAddStock.setFont(font);
		btnAddStock.setBackground(bluey);
		btnAddStock.setForeground(Color.WHITE);
		btnAddStock.setOpaque(true);
		contentPane.add(btnAddStock);
		
		btnAddStock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame addStock = new AddStock();
				addStock.setVisible(true);
				addStock.setExtendedState(Frame.MAXIMIZED_BOTH);
				contentPane.setVisible(false);
			}
		});
		
		JButton btnRenewContract = new JButton("Renew Contract");
		btnRenewContract.setBounds(800, 300, 200, 75);
		btnRenewContract.setBorder(whiteBorder);
		btnRenewContract.setFont(font);
		btnRenewContract.setBackground(bluey);
		btnRenewContract.setForeground(Color.WHITE);
		btnRenewContract.setOpaque(true);
		contentPane.add(btnRenewContract);
		
		btnRenewContract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame renewContract = new RenewContract();
				renewContract.setVisible(true);
				renewContract.setExtendedState(Frame.MAXIMIZED_BOTH);
				contentPane.setVisible(false);
			}
		});
		
		JButton btnSearchCustomer = new JButton("Search Customer");
		btnSearchCustomer.setBounds(400, 400, 200, 75);
		btnSearchCustomer.setBorder(whiteBorder);
		btnSearchCustomer.setFont(font);
		btnSearchCustomer.setBackground(bluey);
		btnSearchCustomer.setForeground(Color.WHITE);
		btnSearchCustomer.setOpaque(true);
		contentPane.add(btnSearchCustomer);
		
		btnSearchCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame searchCustomer = new SearchCustomer();
				searchCustomer.setVisible(true);
				searchCustomer.setExtendedState(Frame.MAXIMIZED_BOTH);
				contentPane.setVisible(false);
			}
		});
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(800, 400, 200, 75);
		btnLogout.setBorder(whiteBorder);
		btnLogout.setFont(font);
		btnLogout.setBackground(bluey);
		btnLogout.setForeground(Color.WHITE);
		btnLogout.setOpaque(true);
		contentPane.add(btnLogout);
		
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame logout = new LoginPage();
				logout.setVisible(true);
				logout.setExtendedState(Frame.MAXIMIZED_BOTH);
				contentPane.setVisible(false);
			}
		});
	}

}
