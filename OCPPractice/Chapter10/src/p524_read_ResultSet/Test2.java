// Always use if statement or while loop when calling rs.next()
// Column indexes begin with 1

package p524_read_ResultSet;

import java.sql.*;

public class Test2 {

	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
		Statement stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery("select * from animal where name= 'not in table'");
//		rs.next();
//		rs.getInt(1);		// throws SQLException - rs.next() is not a valid position due to no records were returned from the query.
		
		rs = stmt.executeQuery("select count(*) from animal");
		rs.getInt(1);		// throws SQLException - rs.next() is not called to position the cursor to the first row.
		
//		rs = stmt.executeQuery("select count(*) from animal");
//		rs.next();
//		rs.getInt(0);		// throws SQLException - column index begins with 1
//		
//		rs = stmt.executeQuery("select id from animal");
//		rs.next();
//		rs.getInt("badColumn");		// throws SQLException - column name does not exist

	}

}
