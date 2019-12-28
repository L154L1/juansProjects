// In 2015, daylight saving time in New York, USA, begins on March 8th at 2:00 AM. As a result, 2:00 AM becomes 3:00 AM.

// What is the result?
// A. 3:00 -difference: 2
// B. 2:00 -difference: 1
// C. 4:00 -difference: 3
// D. 4:00 -difference: 2

// Answer: D

package q97_daylight_saving;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Test {

	public static void main(String[] args) {
		ZoneId zone = ZoneId.of("America/New_York");
		ZonedDateTime dt = ZonedDateTime.of(LocalDate.of(2015, 3, 8), LocalTime.of(1, 0), zone);
		ZonedDateTime dt2 = dt.plusHours(2);
		System.out.print(DateTimeFormatter.ofPattern("H:mm -").format(dt2));
		System.out.println("difference: " + ChronoUnit.HOURS.between(dt, dt2));

	}

}

// 4:00 -difference: 2