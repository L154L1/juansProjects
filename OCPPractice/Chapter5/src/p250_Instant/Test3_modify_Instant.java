// Instant allows you to add any unit day or smaller, but not year and month, 
// although when you print Instant, it displays a year and month.

package p250_Instant;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Test3_modify_Instant {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2015, 5, 25);
		LocalTime time = LocalTime.of(11, 55, 00);
		ZoneId zone = ZoneId.of("US/Eastern");
		ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, zone);	
		Instant instant  = zonedDateTime.toInstant();
		
		Instant nextDay = instant.plus(1, ChronoUnit.DAYS);
		System.out.println(nextDay);								// 2015-05-26T15:55:00Z
		Instant nextHour = instant.plus(1, ChronoUnit.HOURS);
		System.out.println(nextHour);								// 2015-05-25T16:55:00Z
		
		Instant nextWeek = instant.plus(1, ChronoUnit.WEEKS);		// throws UnsupportedTemporalTypeException: Unsupported unit: Weeks

	}

}
