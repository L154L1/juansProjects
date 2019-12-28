package p138_date_time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Formatter {

	public static void main(String[] args) {
		
		// Java predefined format
		
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		System.out.println(date.getDayOfWeek());		// MONDAY
		System.out.println(date.getMonth());			// JANUARY
		System.out.println(date.getYear());				// 2020
		System.out.println(date.getDayOfMonth());		// 20
		
		LocalTime time = LocalTime.of(11, 12, 34);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));			// 2020-01-20
		System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));			// 11:12:34
		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));	// 2020-01-20T11:12:34
		
		// The format method is declared on both the formatter objects and the date/time objects.
		// (1) and (2) get exactly the same result.
		DateTimeFormatter shortf = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		// (1)
		System.out.println(shortf.format(dateTime));		// 1/20/20
		System.out.println(shortf.format(date));			// 1/20/20
		//System.out.println(shortf.format(time));			// throws UnsupportedTemporalTypeException
		// (2)
		System.out.println(dateTime.format(shortf));		// 1/20/20
		System.out.println(date.format(shortf));			// 1/20/20
		//System.out.println(time.format(shortf));			// throws UnsupportedTemporalTypeException
		
		// SHORT and MEDIUM
		DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println(dateTime.format(shortF));		// 1/20/20 11:12 AM
		System.out.println(dateTime.format(mediumF));		// Jan 20, 2020 11:12:34 AM
		
		
		// Custom formatter
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
		System.out.println(dateTime.format(f));		// January 20, 2020, 11:12	
		
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("hh:mm");
		System.out.println(dateTime.format(f2));	// 11:12		
		System.out.println(time.format(f2));		// 11:12
		System.out.println(date.format(f2));		// throws UnsupportedTemporalTypeException
	}
}
