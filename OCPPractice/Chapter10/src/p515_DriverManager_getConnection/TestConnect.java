package p515_DriverManager_getConnection;

import java.sql.*;

public class TestConnect {

	public static void main(String[] args) throws SQLException {
		Connection conn= DriverManager.getConnection("jdbc:derby:zoo");
		System.out.println(conn);		// org.apache.derby.impl.jdbc.EmbedConnection@1414147750 (XID = 209), (SESSIONID = 1), (DATABASE = zoo), (DRDAID = null) 

	}

}
