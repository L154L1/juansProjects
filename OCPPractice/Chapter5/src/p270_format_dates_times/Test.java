// Same as OCA - use DateTimeFormatter. No need to use Locale.

package p270_format_dates_times;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Test {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(11, 12, 34);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		
		System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));				// 2020-01-20
		System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));				// 11:12:34
		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));		// 2020-01-20T11:12:34
		
		DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(shortF.format(dateTime));		// 1/20/20
		System.out.println(shortF.format(date));			// 1/20/20
		//System.out.println(shortF.format(time));			// throws UnsupportedTemporalTypeException
		
		DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println(mediumF.format(dateTime));
		//System.out.println(mediumF.format(date));		// throws UnsupportedTemporalTypeException
		//System.out.println(mediumF.format(time));		// throws UnsupportedTemporalTypeException
		
		// create your own format instead of using predefined formats
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
		System.out.println(dateTime.format(f));		// January 20, 2020, 11:12
		
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("hh:mm");
		System.out.println(f2.format(dateTime));	// 11:12
		//System.out.println(f2.format(date));		// throws UnsupportedTemporalTypeException
		System.out.println(f2.format(time));		// 11:12
		
		
		// parse() according to formatter
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MM dd yyyy");
		LocalDate date2 = LocalDate.parse("01 02 2015", fmt);
		LocalTime time2 = LocalTime.parse("11:22");		// use default formatter to parse
		System.out.println(date2);		// 2015-01-02
		System.out.println(time2);		// 11:22
		
	}

}
