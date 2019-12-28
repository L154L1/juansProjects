// Before running below code, you need to add C:\Program Files\Java\jdk1.8.0_151\db\lib\derby.jar file to your classpath. 
// To add a jar file to your classpath in Eclipse, you just need to add it to the build path as referenced libraries.
// If you use command line, first - javac SetupDerbyDatabase.java , then run it with classpath - java -cp "C:\Program Files\Java\jdk1.8.0_151\db\lib\derby.jar;." SetupDerbyDatabase

package p509_setup_derby_database;

import java.sql.*;

public class SetupDerbyDatabase {

	public static void main(String[] args) throws Exception {
	      String url = "jdbc:derby:zoo;create=true";
	      try (Connection conn = DriverManager.getConnection(url); 
	           Statement stmt = conn.createStatement()) {
	             
	       // stmt.executeUpdate("DROP TABLE animal");
	       // stmt.executeUpdate("DROP TABLE species");
	             
	       stmt.executeUpdate("CREATE TABLE species ("
	            + "id INTEGER PRIMARY KEY, "
	        + "name VARCHAR(255), "
	        + "num_acres DECIMAL(4,1))");
	         
	       stmt.executeUpdate("CREATE TABLE animal ("
	        + "id INTEGER PRIMARY KEY, "
	        + "species_id integer REFERENCES species (id), "
	        + "name VARCHAR(255), "
	        + "date_born TIMESTAMP)");
	 
	       stmt.executeUpdate("INSERT INTO species VALUES (1, 'African Elephant', 7.5)");
	       stmt.executeUpdate("INSERT INTO species VALUES (2, 'Zebra', 1.2)");
	 
	       stmt.executeUpdate("INSERT INTO animal VALUES (1, 1, 'Elsa', '2001-05-06 02:15:00')");
	       stmt.executeUpdate("INSERT INTO animal VALUES (2, 2, 'Zelda', '2002-08-15 09:12:00')");
	       stmt.executeUpdate("INSERT INTO animal VALUES (3, 1, 'Ester', '2002-09-09 10:36:00')");
	       stmt.executeUpdate("INSERT INTO animal VALUES (4, 1, 'Eddie', '2010-06-08 01:24:00')");
	       stmt.executeUpdate("INSERT INTO animal VALUES (5, 2, 'Zoe', '2005-11-12 03:44:00')");
	             
	       ResultSet rs = stmt.executeQuery("select count(*) from animal");
	       rs.next();
	       System.out.println(rs.getInt(1));
	      }
	   }

}
