// executeQuery() is used when SQL statement is SELECT. It returns a result set of data.

// SQLException will be thrown if executeQuery() is used on sql update statement.

package p520_execute_statement;

import java.sql.*;

public class Test_executeQuery {

	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
		Statement stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery("select * from species");

	}

}
