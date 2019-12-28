// There's a third method called execute() that can run either a query or an update. It returns a boolean to indicate whether there is a ResultSet.

package p520_execute_statement;

import java.sql.*;

public class Test_execute {

	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
		Statement stmt = conn.createStatement();
		
		//String sql = "<some sql statement>";
		String sql = "select * from species";
		boolean isResultSet = stmt.execute(sql);
		
		if(isResultSet) {
			ResultSet rs = stmt.getResultSet();
			System.out.println("ran a query");
		} else {
			int result = stmt.getUpdateCount();
			System.out.println("ran an update");
		}

	}

}
