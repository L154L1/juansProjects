// It is important to close resources when you finished with them for IO. This is true for JDBC resources as well. We can use try-with-resource syntax.
// try-with-resources statement closes the resources in the reverse order from which they were opened.

package p533_close_database_resources;

import java.sql.*;
public class Test {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:derby:zoo";
		
		try(Connection conn = DriverManager.getConnection(url);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select name from animal")) {
			while(rs.next())
				System.out.println(rs.getString(1));
			
		}

	}

}
