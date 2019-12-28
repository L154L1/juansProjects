// https://docs.oracle.com/javase/8/docs/api/java/sql/ResultSet.html
// to update a column value in the current row. In a scrollable ResultSet object, the cursor can be moved backwards and forwards, to an absolute position, or to a position relative to the current row. 
// The following code fragment updates the NAME column in the fifth row of the ResultSet object rs and then uses the method updateRow to update the data source table from which rs was derived.
//       rs.absolute(5); // moves the cursor to the fifth row of rs
//       rs.updateString("NAME", "AINSWORTH"); // updates the
//          // NAME column of row 5 to be AINSWORTH
//       rs.updateRow(); // updates the row in the data source


// Given the records from the Employee table:
// eid	ename
// 111  Tom
// 112  Jerry
// 113  Donald

// What is the result?
// A. The Employee table is updated with the row:112 Jackand the program prints:112 Jerry
// B. The Employee table is updated with the row:112 Jackand the program prints:112 Jack
// C. The Employee table is not updated and the program prints:112 Jerry
// D. The program prints Exception is raised.

// Answer: C


package Passquestion_q71;

// eid	ename
// 111  Tom
// 112  Jerry
// 113  Donald

import java.sql.*;

public class Test {

	public static void main(String[] args) throws SQLException {
		//createTable();
		
		//checkRows();
		
		try {
			Connection con = DriverManager.getConnection("jdbc:derby:zoo");
			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			st.execute("SELECT * FROM Employee");
			ResultSet rs = st.getResultSet();
			while(rs.next()) {
				if(rs.getInt(1) == 112) {
					rs.updateString(2, "Jack");
					rs.updateRow();				// Will print 112  Jack
				}
			}
			rs.absolute(2);
			System.out.println(rs.getInt(1) + "  " + rs.getString(2));			// without rs.updateRow(), it prints 112  Jerry
		} catch(SQLException ex) {
			System.out.println("Exception is raised");
		}
		
	}
	
		
	static void createTable() throws SQLException {
		String url = "jdbc:derby:zoo;create=true";
	    try (Connection conn = DriverManager.getConnection(url); 
	           Statement stmt = conn.createStatement()) {
	             
	       stmt.executeUpdate("DROP TABLE Employee");
	             
	       stmt.executeUpdate("CREATE TABLE Employee ("
	            + "eid INTEGER, "
	            + "ename VARCHAR(255))");
	       
	       stmt.executeUpdate("INSERT INTO Employee VALUES (111, 'Tom')");
	       stmt.executeUpdate("INSERT INTO Employee VALUES (112, 'Jerry')");
	       stmt.executeUpdate("INSERT INTO Employee VALUES (113, 'Donald')");
	       
	       // check created table
	       ResultSet rs = stmt.executeQuery("SELECT * FROM Employee");
	       while(rs.next()) System.out.println(rs.getInt(1) + " : " + rs.getString(2));
	       
	    }

	}
	
	
	static void checkRows() throws SQLException {
	    try (Connection conn = DriverManager.getConnection("jdbc:derby:zoo"); 
	           Statement stmt = conn.createStatement()) {	             
	       ResultSet rs = stmt.executeQuery("SELECT * FROM Employee");
	       while(rs.next()) System.out.println(rs.getInt(1) + "  " + rs.getString(2));
	       
	    }

	}

}
