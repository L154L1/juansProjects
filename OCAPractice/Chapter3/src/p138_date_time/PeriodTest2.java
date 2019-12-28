package p138_date_time;

import java.time.*;

public class PeriodTest2 {

	public static void main(String[] args) {
		// There are 5 ways to create a Period object
		Period annually = Period.ofYears(1);
		Period quarterly = Period.ofMonths(3);
		Period everyThreeWeeks = Period.ofWeeks(3);
		Period everyOtherDay = Period.ofDays(2);
		Period everyYearAndAWeek = Period.of(1, 0, 7);
		
		// You cannot chain methods when creating a Period. Only the last method will be used.
		Period wrong = Period.ofYears(1).ofWeeks(1);	// every week
		
		// Period is used on date
		LocalDate date = LocalDate.of(2015, 1, 20);
		LocalTime time = LocalTime.of(6, 15);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		Period period = Period.ofMonths(1);
		System.out.println(date.plus(period));		// 2015-02-20
		System.out.println(dateTime.plus(period));	// 2015-02-20T06:15
		System.out.println(time.plus(period));		// throws UnsupportedTemporalTypeException
	}
}
