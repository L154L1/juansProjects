package q18;
import java.sql.*;
public class Test {

public static void main(String[] args) throws SQLException {
		
		String sql = "select name from animal order by id";
		try (Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql)) {
		rs.absolute(0);		// throws SQLException - because the statement is not scrollable
		rs.next();
		System.out.println(rs.getString(1));
		}
		

	}

}
