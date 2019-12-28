package p138_date_time;

import java.time.*;

public class PeriodTest {

	public static void main(String[] args) {
		LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
		Period period = Period.ofMonths(1);
		performAnimalErichment(start, end, period);
	}
	
	private static void performAnimalErichment(LocalDate start, LocalDate end, Period period) {
		LocalDate upTo = start;
		while (upTo.isBefore(end)) {
			System.out.println("give new toy: " + upTo);
			upTo = upTo.plus(period);
		}
	}
}
