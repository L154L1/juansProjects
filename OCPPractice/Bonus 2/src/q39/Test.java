// Q. 39  	Suppose that you have a table animal with three rows. The names in those rows are Anna, Betty, and Cat. What does the following output?

// Answer : A SQLException is thrown. Because when creating the Statement, the parameters are reversed. The ResultSet type is supposed to be the first parameter, and the concurrency mode is supposed to be the second type.

package q39;

import java.sql.*;
public class Test {

	public static void main(String[] args) throws SQLException {
		String sql = "select name from animal order by name";
		try (Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
		Statement stmt = conn.createStatement(
		ResultSet.CONCUR_READ_ONLY, ResultSet.TYPE_SCROLL_INSENSITIVE);

		ResultSet rs = stmt.executeQuery(sql)) {
		rs.next();
		rs.previous();
		rs.previous();
		rs.next();
		rs.next();
		rs.absolute(2);
		System.out.println(rs.getString(1));

	}

}
	
}