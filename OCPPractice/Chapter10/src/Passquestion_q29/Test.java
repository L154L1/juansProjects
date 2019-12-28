package Passquestion_q29;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	static Connection newConnection = null;
	
	public static Connection getDBconnection() throws SQLException {
		try(Connection con = DriverManager.getConnection("jdbc:derby:zoo")){
			newConnection = con;
		}
		return newConnection;
	}

	public static void main(String[] args) throws SQLException {
		
		try {
		
		getDBconnection();		// newConnection is closed in try-with-resource block.
		Statement st = newConnection.createStatement();
		st.executeUpdate("insert into species values(10, 'Deer', 3)");
		
		} catch(SQLException e) { System.out.print("SQLException caught!");}
	}

}
