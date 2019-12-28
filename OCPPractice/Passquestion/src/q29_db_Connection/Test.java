// What is the result ?

// Answer : C. SQLException thrown at runtime. 

package q29_db_Connection;

import java.sql.*;

public class Test {
	
	static Connection newConnection = null;
	
	public static Connection getDBconnection() throws SQLException {
		try(Connection con = DriverManager.getConnection("jdbc:derby:school")){
			newConnection = con;
		}
		return newConnection;
	}

	public static void main(String[] args) throws SQLException {
		getDBconnection();		// newConnection is closed in try-with-resource block.
		Statement st = newConnection.createStatement();
		st.executeUpdate("INSERT INTO student VALUES (102, 'Kelvin')");
	}

}
