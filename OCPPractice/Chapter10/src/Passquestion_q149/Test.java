// Given the records from the STUDENT table:
// sid	sname	semail
// 111	James	james@uni.com
// 112	Jane	jane@uni.com
// 114	John	john@uni.com

// Assume that the URL, username, and password are valid.
// What is the result?
// A. The STUDENT table is not updated and the program prints:114 : John : john@uni.com
// B. The STUDENT table is updated with the record:113 : Jannet : jannet@uni.comand the program
//	prints:114 : John : john@uni.com
// C. The STUDENT table is updated with the record:113 : Jannet : jannet@uni.comand the program
//	prints:113 : Jannet : jannet@uni.com
// D. A SQLException is thrown at run time.

// Answer: D


// Explanation : 
// updateRow() - Updates the underlying database with the new contents of the current row of this ResultSet object. This method cannot be called when the cursor is on the insert row.

package Passquestion_q149;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

public static void main(String[] args) throws SQLException {
		
		//createTable();
		
		Connection con = DriverManager.getConnection("jdbc:derby:zoo");
		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		st.execute("SELECT * FROM student");
		ResultSet rs = st.getResultSet();		
		rs.absolute(3);		
		rs.moveToInsertRow();
		rs.updateInt(1, 113);
		rs.updateString(2, "Jannet");
		rs.updateString(3, "jannet@uni.com");	    
		rs.updateRow();			// java.sql.SQLException: Invalid cursor state - no current row.
		rs.refreshRow();
		System.out.println(rs.getInt(1) + " : " + rs.getString(2) + " : " + rs.getString(3));

	}
	
	static void createTable() throws SQLException {
		String url = "jdbc:derby:zoo;create=true";
	    try (Connection conn = DriverManager.getConnection(url); 
	           Statement stmt = conn.createStatement()) {
	             
	       // stmt.executeUpdate("DROP TABLE STUDENT");
	             
	       stmt.executeUpdate("CREATE TABLE STUDENT ("
	            + "sid INTEGER, "
	        + "sname VARCHAR(255), "
	        + "semail VARCHAR(255))");
	       
	       stmt.executeUpdate("INSERT INTO STUDENT VALUES (111, 'James', 'james@uni.com')");
	       stmt.executeUpdate("INSERT INTO STUDENT VALUES (112, 'Jane', 'jane@uni.com')");
	       stmt.executeUpdate("INSERT INTO STUDENT VALUES (114, 'John', 'john@uni.com')");
	       
	       // check created table
	       ResultSet rs = stmt.executeQuery("SELECT * FROM student");
	       while(rs.next()) System.out.println(rs.getInt(1) + " : " + rs.getString(2) + " : " + rs.getString(3));
	       
	    }

	}

}
