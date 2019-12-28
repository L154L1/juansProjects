package p246_Period;

import java.time.*;

public class Test {

	public static void main(String[] args) {
		Period annual = Period.ofYears(1);
		Period quarter = Period.ofMonths(3);
		Period _3weeks = Period.ofWeeks(3);
		Period everyOtherDay = Period.ofDays(2);
		Period everyYearAndAWeek = Period.of(1, 0, 7);
		
		// You cannot chain methods to create a Period
		Period wrong = Period.ofYears(1).ofWeeks(1); 	// same as Period wrong = Period.ofYears(1); wrong = Period.ofWeeks(1)
		
		System.out.println(Period.of(1, 2, 3));		// P1Y2M3D
		System.out.println(Period.ofMonths(3));		// P3M
		System.out.println(Period.of(0, 20, 47));	// P20M47D		- It's ok to have more days than are in a year. Also ok to have more months than are in a year.
		System.out.println(Period.ofWeeks(3));		// P21D
		
		LocalDate date = LocalDate.of(2015, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(6, 15);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		Period period = Period.ofMonths(1);
		System.out.println(date.plus(period));		// 2015-02-20
		System.out.println(dateTime.plus(period));	// 2015-02-20T06:15
		System.out.println(time.plus(period));		// throws java.time.temporal.UnsupportedTemporalTypeException

	}

}
