package p248_Duration;

import java.time.*;

public class Test2 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2015, 1, 20);
		LocalTime time = LocalTime.of(6, 15);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		
		Duration duration = Duration.ofHours(6);
		System.out.println(dateTime.plus(duration));	// 2015-01-20T12:15
		System.out.println(time.plus(duration));		// 12:15
		//System.out.println(date.plus(duration));		// java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Seconds
		
		Duration duration2 = Duration.ofHours(23);
		System.out.println(dateTime.plus(duration2));	// 2015-01-21T05:15
		System.out.println(time.plus(duration2));		// 05:15
		System.out.println(date.plus(duration2));		// java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Seconds

	}

}
