// Passquestion q96

//What is the result?
//A. A ClassNotFoundException is thrown at runtime.
//B. The program prints nothing.
//C. The program prints Connection Established.
//D. A SQLException is thrown at runtime.

//Correct Answer: C

package q58_getConnection_Properties;

import java.sql.*;
import java.util.*;

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
