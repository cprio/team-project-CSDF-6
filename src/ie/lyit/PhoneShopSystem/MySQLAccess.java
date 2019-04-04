package ie.lyit.PhoneShopSystem;

import java.awt.Frame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;

import java.time.*;

public class MySQLAccess {
	
private Connection connect = null;
private Statement statement = null;
private PreparedStatement preparedStatement = null;
private ResultSet resultSet = null;

private String password = "password1f";
private String name = "admin";

final private String host = "localhost";
final private String user = "root";
final private String passwd = "password";

java.util.Date dt = new java.util.Date();
java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
String currentTime = sdf.format(dt);

public void readDataBase() throws Exception {
 try {
   // This will load the MySQL driver, each DB has its own driver
   Class.forName("com.mysql.cj.jdbc.Driver");
   
   // Setup the connection with the DB
   connect = DriverManager.getConnection("jdbc:mysql://" + host + "/phoneshop?" + "user=" + user + "&password=" + passwd );

   // Statements allow to issue SQL queries to the database
   statement = connect.createStatement();
   // Result set get the result of the SQL query
   resultSet = statement.executeQuery("select * from phoneshop.customer");
   writeResultSet(resultSet);

   /*// PreparedStatements can use variables and are more efficient
   preparedStatement = connect.prepareStatement("insert into phoneshop.customer values (default, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
   // "myuser, webpage, datum, summary, COMMENTS from phoneshop.customer");
   // Parameters start with 1
   preparedStatement.setString(1, "fNameTest");
   preparedStatement.setString(2, "lnameTest");
   preparedStatement.setString(3, "Address1test");
   preparedStatement.setString(4, "Address2test");
   preparedStatement.setString(5, "Countytest");
   preparedStatement.setBoolean(6, true);
   preparedStatement.setBoolean(7, false);
   preparedStatement.setString(8, "testytesty@gmail.com");
   preparedStatement.setString(9, currentTime);
   preparedStatement.setString(10, currentTime);
   preparedStatement.setString(11, "00011");
   preparedStatement.executeUpdate();

   preparedStatement = connect.prepareStatement("SELECT * from phoneshop.customer");
   resultSet = preparedStatement.executeQuery();
   writeResultSet(resultSet);

   // Remove again the insert comment
   preparedStatement = connect.prepareStatement("delete from phoneshop.customer where fname= ? ; ");
   preparedStatement.setString(1, "fNameTest");
   preparedStatement.executeUpdate();*/
   
   resultSet = statement.executeQuery("select * from phoneshop.customer");
   writeMetaData(resultSet);
   
 } catch (Exception e) {
   throw e;
 } finally {
   close();
 }

}

public void searchDevice() throws Exception{
	try {
	// This will load the MySQL driver, each DB has its own driver
	   Class.forName("com.mysql.cj.jdbc.Driver");
	   
	   // Setup the connection with the DB
	   connect = DriverManager.getConnection("jdbc:mysql://" + host + "/phoneshop?" + "user=" + user + "&password=" + passwd );

	   // Statements allow to issue SQL queries to the database
	   statement = connect.createStatement();
	   // Result set get the result of the SQL query
	   resultSet = statement.executeQuery("select * from phoneshop.device");
	   writeDeviceResultSet(resultSet);
	   writeMetaData(resultSet);
	   
	   
	} catch (Exception e) {
		   throw e;
	} finally {
		   close();
    }
	   
	   
}

public void loginUser() throws Exception{
	try {
	// This will load the MySQL driver, each DB has its own driver
	   Class.forName("com.mysql.cj.jdbc.Driver");
	   
	   // Setup the connection with the DB
	   connect = DriverManager.getConnection("jdbc:mysql://" + host + "/phoneshop?" + "user=" + user + "&password=" + passwd );

	   // Statements allow to issue SQL queries to the database
	   statement = connect.createStatement();
	   // Result set get the result of the SQL query
	   resultSet = statement.executeQuery("select * from phoneshop.user");
	   writeUserResultSet(resultSet);
	   writeMetaData(resultSet);
	 
	   preparedStatement = connect.prepareStatement("SELECT * FROM user WHERE fname=? AND pwd=?");
	   preparedStatement.setString(1, name); 
	   preparedStatement.setString(2, password);
	   resultSet = preparedStatement.executeQuery();

	   if (resultSet.next()) {
	       // Match found!
		   System.out.println("Match found!");
		   JFrame homePage = new HomePage();
			homePage.setVisible(true);
			homePage.setExtendedState(Frame.MAXIMIZED_BOTH);
	   } else {
	       // No match!
		   System.out.println("No match!");
	   }
	   
	   
	} catch (Exception e) {
		   throw e;
	} finally {
		   close();
    }
	   
	   
}

private void writeMetaData(ResultSet resultSet) throws SQLException {
 //   Now get some metadata from the database
 // Result set get the result of the SQL query
 
 System.out.println("The columns in the table are: ");
 
 System.out.println("Table: " + resultSet.getMetaData().getTableName(1));
 for  (int i = 1; i<= resultSet.getMetaData().getColumnCount(); i++){
   System.out.println("Column " +i  + " "+ resultSet.getMetaData().getColumnName(i));
 }
}

private void writeResultSet(ResultSet resultSet) throws SQLException {
 // ResultSet is initially before the first data set
 while (resultSet.next()) {
   // It is possible to get the columns via name
   // also possible to get the columns via the column number
   // which starts at 1
   // e.g. resultSet.getString(2);
   String userfname = resultSet.getString("fname");
   String userlname = resultSet.getString("lname");
   String address1 = resultSet.getString("address1");
   String address2 = resultSet.getString(5);
   String county = resultSet.getString("county");
   Date date = resultSet.getDate("creationDate");
   String email = resultSet.getString("email");
   System.out.println("Customer: " + userfname + " " + userlname);
   System.out.println("e-mail: " + email);
   System.out.println("Address: " + address1 + ", " + address2 + ", " + county);
   System.out.println("Added: " + date);

 }
}

private void writeDeviceResultSet(ResultSet resultSet) throws SQLException {

	 while (resultSet.next()) {

	   String brand = resultSet.getString("brand");
	   String model = resultSet.getString("model");
	   String imei = resultSet.getString("imei");
	   double cost = resultSet.getDouble("cost");
	   String supplierAddress = resultSet.getString("supplierAddress");
	   String supplierContact = resultSet.getString("supplierContact");
	   boolean isSold = resultSet.getBoolean("isSold");
	   
	   System.out.println("Brand: " + brand);
	   System.out.println("Model: " + model);
	   System.out.println("Imei: " + imei);
	   System.out.println("Cost: " + cost);
	   System.out.println("Supplier Address: " + supplierAddress);
	   System.out.println("Supplier Contact: " + supplierContact);
	   System.out.println("Is Sold: " + isSold);

	 }
	}

private void writeUserResultSet(ResultSet resultSet) throws SQLException {

	 while (resultSet.next()) {

	   int employeeID = resultSet.getInt("employeeID");
	   String fname = resultSet.getString("fname");
	   String lname = resultSet.getString("lname");
	   Date dateOfBirth = resultSet.getDate("dateOfBirth");
	   String email = resultSet.getString("email");
	   String address = resultSet.getString("address");
	   boolean gender = resultSet.getBoolean("gender");
	   String pwd = resultSet.getString("pwd");
	   
	   System.out.println("EmployeeID: " + employeeID);
	   System.out.println("Name: " + fname + " " + lname);
	   System.out.println("Date Of Birth: " + dateOfBirth);
	   System.out.println("email: " + email);
	   System.out.println("Address: " + address);
	   System.out.println("Gender: " + gender);
	   System.out.println("Password: " + pwd);

	 }
	}

// You need to close the resultSet
private void close() {
 try {
   if (resultSet != null) {
     resultSet.close();
   }

   if (statement != null) {
     statement.close();
   }

   if (connect != null) {
     connect.close();
   }
 } catch (Exception e) {

 }
}

}