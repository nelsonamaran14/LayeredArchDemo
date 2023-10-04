package in.mindcraft.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	
	 private static Connection cn;
	 public static Connection openConnection() throws SQLException, ClassNotFoundException {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 String url="jdbc:mysql://localhost/test";
		 return cn = DriverManager.getConnection(url,"root","root");
	 }
	 
	 public static void closeConnection() throws SQLException {
		 if(cn!=null)
			 cn.close();
	 }
}