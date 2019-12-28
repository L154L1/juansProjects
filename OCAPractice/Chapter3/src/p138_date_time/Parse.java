// parse() method uses a formatter to convert a formatted string to date or/and time object. 
// The formatter can be custom formatter or a default value.
// If the string passed doesn't match the format, Java throws a runtime exception.

package p138_date_time;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Parse {

	public static void main(String[] args) {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
		LocalDate date = LocalDate.parse("01 02 2015", f);
		LocalTime time = LocalTime.parse("11:22");	// use default formatter
		System.out.println(date);	// 2015-01-02
		System.out.println(time);	// 11:22
	}
}
