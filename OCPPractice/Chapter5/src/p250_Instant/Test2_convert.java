// ZonedDateTime can be converted to Instant using toInstant() method.
// LocalDateTime cannot be converted to Instant because an Instant is a point in time and has to be recognized universally, 
// and a LocalDateTime doesn't have time zone.

package p250_Instant;

import java.time.*;

public class Test2_convert {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2015, 5, 25);
		LocalTime time = LocalTime.of(11, 55, 00);
		ZoneId zone = ZoneId.of("US/Eastern");
		ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, zone);	
		
		// Convert ZonedDateTime to Instant
		Instant instant  = zonedDateTime.toInstant();		
		System.out.println(zonedDateTime);		// 2015-05-25T11:55-04:00[US/Eastern]
		System.out.println(instant);			// 2015-05-25T15:55:00Z
		
		long es = zonedDateTime.toEpochSecond();
		// Convert epoch seconds to Instant
		Instant instant2 = Instant.ofEpochSecond(es);
		System.out.println(instant2);			// 2015-05-25T15:55:00Z

	}

}
