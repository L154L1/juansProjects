package q32q33;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Q32Q33 {

	public static void main(String[] args) {
				
		// Q32
		LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
		Period p = Period.of(1, 2, 3);
		d = d.minus(p);
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		System.out.println(d.format(f));	// 11:22 AM
		System.out.println(f.format(d));	// 11:22 AM
		
		// Q33
		LocalDateTime d2 = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
		Period p2 = Period.ofDays(1).ofYears(2);	// Period methods shouldn't be chained. Only the last one will work.
		d2 = d2.minus(p2);
		DateTimeFormatter f2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println(f2.format(d2));	// 5/10/13 11:22 AM
	}
}
