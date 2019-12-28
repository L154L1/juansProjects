package p248_Duration;

import java.time.*;
import java.time.temporal.ChronoUnit;
public class Test {

	public static void main(String[] args) {
		Duration daily = Duration.ofDays(1);
		Duration hourly = Duration.ofHours(1);
		Duration everyMinute = Duration.ofMinutes(1);
		Duration every10Seconds = Duration.ofSeconds(10);
		Duration everyMilli = Duration.ofMillis(1);
		Duration everyNano = Duration.ofNanos(1);
		
		// use ChronoUnit to do the same as above
		Duration daily2 = Duration.of(1, ChronoUnit.DAYS);
		Duration hourly2 = Duration.of(1, ChronoUnit.HOURS);
		Duration everyMinute2 = Duration.of(1, ChronoUnit.MINUTES);
		Duration every10Seconds2 = Duration.of(10, ChronoUnit.SECONDS);
		Duration everyMilli2 = Duration.of(1, ChronoUnit.MILLIS);
		Duration everyNano2 = Duration.of(1, ChronoUnit.NANOS);
		
		// ChronoUnit for differences
		LocalTime one = LocalTime.of(5, 15);
		LocalTime two = LocalTime.of(6, 30);
		LocalDate date = LocalDate.of(2016, 1, 20);
		System.out.println(ChronoUnit.HOURS.between(one, two));		// 1
		System.out.println(ChronoUnit.MINUTES.between(one, two));	// 75
		//System.out.println(ChronoUnit.MINUTES.between(one, date));	// DateTimeException
		
		LocalDate date1 = LocalDate.of(2016, 1, 20);
		LocalDate date2 = LocalDate.of(2018, 1, 20);
		System.out.println(ChronoUnit.DAYS.between(date1, date2));	// 731
		

	}

}
