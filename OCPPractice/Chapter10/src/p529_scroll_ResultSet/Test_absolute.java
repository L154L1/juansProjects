// conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
// The first parameter is the ResultSet type. The second parameter is the ResultSet concurrency mode.

package p529_scroll_ResultSet;

import java.sql.*;
public class Test_absolute {

	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
		Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		
		//Statement stmt = conn.createStatement(); // absolute() will throw SQLException using non scrollable ResultSet type.
				
		ResultSet rs = stmt.executeQuery("select id from animal order by id");
		
		System.out.println(rs.absolute(2));
		System.out.println(rs.getString("id"));
		System.out.println(rs.absolute(0));		// false  //Zero moves the cursor to a location immediately before the first row. rs.absolute(0) returns false
		System.out.println(rs.absolute(5));
		System.out.println(rs.getString("id"));
		System.out.println(rs.absolute(-2));
		System.out.println(rs.getString("id"));

	}

}

//true
//2
//false
//true
//5
//true
//4
