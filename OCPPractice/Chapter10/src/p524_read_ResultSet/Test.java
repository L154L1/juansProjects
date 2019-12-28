// To access columns of ResultSet, we can use column name or an index. The column index starts with 1 rather than 0.

package p524_read_ResultSet;

import java.sql.*;
import java.util.*;

public class Test {

	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
		Statement stmt = conn.createStatement();
		
		Map<Integer, String> idToNameMap = new HashMap<>();
		ResultSet rs = stmt.executeQuery("select id, name from species");
		while(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			idToNameMap.put(id, name);
		}
		System.out.println(idToNameMap);		// {1=African Elephant, 2=Zebra}
		
		// Access columns using index
		rs = stmt.executeQuery("select id, name from species");
		while(rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			idToNameMap.put(id, name);
		}
		System.out.println(idToNameMap);		// {1=African Elephant, 2=Zebra}
		
		rs = stmt.executeQuery("select count(*) from animal"); 
		if(rs.next()) System.out.println(rs.getInt(1));		// 5
		
		rs = stmt.executeQuery("select count(*) from animal"); 
		if(rs.next()) System.out.println(rs.getInt("count"));	// throws java.sql.SQLException: Column 'count' not found.
		
	}

}
