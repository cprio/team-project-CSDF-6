package ie.lyit.PhoneShopSystem;

import java.awt.Frame;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		MySQLAccess dao = new MySQLAccess();
		//dao.readDataBase();
		//dao.searchDevice();
		dao.loginUser();
		//LoginPage home = new LoginPage();
		//home.setVisible(true);
		//home.setExtendedState(Frame.MAXIMIZED_BOTH);
	}

}