package Test2Q75_timestamp;

import java.sql.Timestamp;
import java.time.*;
class Program {

	public static void main(String[] args) {
		Timestamp stamp = Timestamp.from(Instant.now());
		
		System.out.print(stamp);

	}

}
