// Q. 11  	What is the output of the following code if the default system time is US/Eastern?

// Duration uses units of hours/minutes/seconds. It is not valid to add a week unit, so the code throws an exception.

package q11;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class Test {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of (2100, 5, 14);
		LocalTime time = LocalTime.of(9, 15);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		Duration d = Duration.of(1, ChronoUnit.WEEKS);
		System.out.println(dateTime.plus(d));		// throws java.time.temporal.UnsupportedTemporalTypeException

	}

}
