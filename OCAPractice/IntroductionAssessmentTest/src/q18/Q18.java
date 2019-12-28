package q18;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

public class Q18 {

	public static void main(String[] args) {
		System.out.println(LocalDate.of(2015, Month.APRIL, 1));		// 2015-04-01	
		System.out.println(LocalDate.of(2015, 4, 1));				// 2015-04-01
		
		System.out.println(LocalDate.of(2015, Calendar.APRIL, 1));	// 2015-03-01
//		System.out.println(new LocalDate(2015, 4, 1));				// no such constructor
	}

}
