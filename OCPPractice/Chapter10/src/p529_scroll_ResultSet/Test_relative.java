package p529_scroll_ResultSet;

import java.sql.*;

public class Test_relative {

	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
		Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		
		ResultSet rs = stmt.executeQuery("select id from animal order by id");
		System.out.println(rs.next());
		System.out.println(rs.getString("id"));
		System.out.println(rs.relative(2));
		System.out.println(rs.getString("id"));
		System.out.println(rs.relative(-1));
		System.out.println(rs.getString("id"));
		System.out.println(rs.relative(4));

	}

}


//true
//1
//true
//3
//true
//2
//false
