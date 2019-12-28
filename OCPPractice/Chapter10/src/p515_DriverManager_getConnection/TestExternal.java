package p515_DriverManager_getConnection;

import java.sql.*;

public class TestExternal {

	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ocp-book", "usename", "password");
		System.out.println(conn);

	}

}
