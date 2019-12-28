package q15;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Test {

	public static void main(String[] args) {
		String m1 = Duration.of(1, ChronoUnit.MINUTES).toString();	// PT1M

		String m2 = Duration.ofMinutes(1).toString();				// PT1M

		String s = Duration.of(60, ChronoUnit.SECONDS).toString();	// PT1M



		String d = Duration.ofDays(1).toString();	// PT24H

		String p = Period.ofDays(1).toString();		// P1D


		System.out.println(m1);
		System.out.println(s);
		System.out.println(m1.equals(s));
		
//		System.out.println(Duration.of(1, ChronoUnit.MINUTES));		// PT1M
//		System.out.println(Duration.ofMinutes(1));					// PT1M
//		System.out.println(Duration.of(60, ChronoUnit.SECONDS));	// PT1M
//		System.out.println(Duration.ofDays(1));						// PT24H
//		System.out.println(Period.ofDays(1));						// P1D
		
	}

}
