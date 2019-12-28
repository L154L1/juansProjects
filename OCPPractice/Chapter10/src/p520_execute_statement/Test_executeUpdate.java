// executeUpdate() method takes the SQL statement to run as a parameter. It returns the number  of rows that were inserted, updated, or deleted.

// SQLException will be thrown if executeUpdate() is used on sql SELECT statement.

package p520_execute_statement;

import java.sql.*;

public class Test_executeUpdate {

	public static void main(String[] args) throws SQLException {
		Connection conn= DriverManager.getConnection("jdbc:derby:zoo");
		Statement stmt = conn.createStatement();
		int result = stmt.executeUpdate(
				"insert into species values(10, 'Deer', 3)");
		System.out.println(result); 	// 1
		
		result = stmt.executeUpdate(
				"update species set name = '' where name = 'None'");		
		System.out.println(result);		// 0
		
		result = stmt.executeUpdate(
				"delete from species where id = 10");
		System.out.println(result);		// 1

	}

}
