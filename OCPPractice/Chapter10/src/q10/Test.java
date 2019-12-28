package q10;

import java.sql.*;

public class Test {

	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:derby:Zoo");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from animal");
		while(rs.next()) {
			System.out.println(rs.getString("name"));
		}
		
		int result = stmt.executeUpdate("update animal set name = name");
		System.out.println(result); 	// 5
		

	}

}
