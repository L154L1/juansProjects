// p534 Closing JDBC resources should close all three resources, although it's not strictly necessary. The following is true :
// - Closing a connection also closes the Statement and ResultSet.
// - Closing a Statement also closes the ResultSet.
// - JDBC automatically closes the previous ResultSet object when you run another sql statement from the same Statement.

// In below example, four resource are closed.

package p533_close_database_resources;

import java.sql.*;

public class Test2 {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:derby:zoo";
		
		try(Connection conn = DriverManager.getConnection(url);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select count(*) from animal")) {
			if (rs.next()) System.out.println(rs.getInt(1));
			
			ResultSet rs2 = stmt.executeQuery("select count(*) from animal");
			int num = stmt.executeUpdate("update animal set name = 'clear' where name = 'other'");
			
		}

	}

}
