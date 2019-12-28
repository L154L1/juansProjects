// When rethrowing exception, we prefer catch(Exception e) to multi-catch statement because it avoids duplicated code.

// In below example, rethrowing() is better than multiCatch().

package p306_rethrow_exception;

import java.sql.*;
import java.time.format.*;

public class Test {
	
	public void parseData() throws SQLException, DateTimeParseException {}
	
	public void multiCatch() throws SQLException, DateTimeParseException {
		try {
			parseData();
		}catch(SQLException | DateTimeParseException e) {
			System.err.println(e);
			throw e;
		}
	}
	
	public void rethrowing() throws SQLException, DateTimeParseException {
		try {
			parseData();
		} catch(Exception e) {		// This is allowed even the declared exception SQLException, DateTimeParseException are subclass of Exception.
			System.err.println(e);
			throw e;
		}
	}
}
