package p535_handle_SQLException;

import java.sql.*;

public class Test {

	public static void main(String[] args) {
		String url = "jdbc:derby:zoo";
		
		try(Connection conn = DriverManager.getConnection(url);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select not_a_column from animal")) {
			while (rs.next()) System.out.println(rs.getString(1));
			
		} catch(SQLException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getSQLState());
			System.out.println(e.getErrorCode());
		}

	}

}

//Column 'NOT_A_COLUMN' is either not in any table in the FROM list or appears within a join specification and is outside the scope of the join specification or appears in a HAVING clause and is not in the GROUP BY list. If this is a CREATE or ALTER TABLE  statement then 'NOT_A_COLUMN' is not a column in the target table.
//42X04
//30000
