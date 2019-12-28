package p239_ZonedDateTime;

import java.time.*;

public class Test {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
		LocalTime time1 = LocalTime.of(6, 15);
		LocalDateTime dateTime1 = LocalDateTime.of(date1, time1);
		
		ZoneId zone = ZoneId.of("US/Eastern");
		ZonedDateTime zoned1 = ZonedDateTime.of(2015, 1, 20, 6, 15, 30, 200, zone);
		ZonedDateTime zoned2 = ZonedDateTime.of(date1, time1, zone);
		ZonedDateTime zoned3 = ZonedDateTime.of(dateTime1, zone);
		
		System.out.println(zoned1);		// 2015-01-20T06:15:30.000000200-05:00[US/Eastern]
		System.out.println(zoned2);		// 2015-01-20T06:15-05:00[US/Eastern]	
		System.out.println(zoned3);		// 2015-01-20T06:15-05:00[US/Eastern]
		
		System.out.println();
		
		// Find out your time zone
		System.out.println(ZoneId.systemDefault());		// America/New_York
		
		System.out.println();
		
		// Print time zone list
		ZoneId.getAvailableZoneIds().stream()
		.filter(z -> z.contains("US") || z.contains("America"))
		.sorted().forEach(System.out::println);

	}

}
