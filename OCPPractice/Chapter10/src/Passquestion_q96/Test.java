package Passquestion_q96;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Test {

	public static void main(String[] args) {
		String userName = "";
		String password = "";
		String dbURL = "jdbc:derby:zoo";
		
		try {
			Properties prop = new Properties();
			prop.put("user", userName);
			prop.put("password", password);
			Connection conn = DriverManager.getConnection(dbURL, prop);
			if(conn != null) {
				System.out.print("Connection Established");
			}
		}catch(Exception e) {
			System.out.print(e);
		}

	}

}
