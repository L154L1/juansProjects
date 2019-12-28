// Passquestion 71

//Given the records from the Employee table:
// eid	ename
// 111	Tom
// 112	Jerry
// 113	Donald

//What is the result?
//A. The Employee table is updated with the row:
//112 Jack
//and the program prints:
//112 Jerry
//B. The Employee table is updated with the row:
//112 Jack
//and the program prints:
//112 Jack
//C. The Employee table is not updated and the program prints:
//112 Jerry
//D. The program prints Exception is raised.

// Answer : C


package q41_jdbc;

import java.sql.*;

public class Test {

	public static void main(String[] args) {
		String URL = "something";
		String userName = "something";
		String passWord = "something";
		
		try {
			Connection conn = DriverManager.getConnection (URL, userName, passWord);
			Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
					ResultSet.CONCUR_UPDATABLE);
			st.execute("SELECT * FROM Employee");

	
			ResultSet rs = st.getResultSet();
			while (rs.next()) {
				if (rs.getInt(1) ==112) {
				rs.updateString(2, "Jack");
			}
			}
			rs.absolute(2);
			System.out.println(rs.getInt(1) + " " + rs.getString(2));	// although row 112 is updated, rs is not changed because ResultSet type is TYPE_SCROLL_INSENSITIVE
		} catch (SQLException ex) {
			System.out.println("Exception is raised");
		}

	}
	
}
