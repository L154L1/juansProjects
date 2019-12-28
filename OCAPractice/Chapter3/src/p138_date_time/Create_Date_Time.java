package p138_date_time;

import java.time.*;

public class Create_Date_Time {

	public static void main(String[] args) {
//		LocalDate d = new LocalDate();		// does not compile
		
		// create current date and time
		System.out.println(LocalDate.now());		// 2018-09-17
		System.out.println(LocalTime.now());		// 23:24:22.651
		System.out.println(LocalDateTime.now());	// 2018-09-17T23:24:22.651
		
		LocalDate date1 = LocalDate.of(2018, Month.SEPTEMBER, 5);	
		LocalDate date2 = LocalDate.of(2018, 9, 5);				
		System.out.println("date1 : " + date1);			// 2018-09-05
		System.out.println("date2 : " + date2);			// 2018-09-05
		
		LocalTime time1 = LocalTime.of(6, 15);			
		LocalTime time2 = LocalTime.of(6, 15, 30);
		LocalTime time3 = LocalTime.of(6, 15, 30, 200);
		System.out.println("time1 : " + time1);			// 06:15
		System.out.println("time2 : " + time2);			// 06:15:30
		System.out.println("time3 : " + time3);			// 06:15:30.000000200
		
		LocalDateTime datetime1 = LocalDateTime.of(2018, Month.SEPTEMBER, 5, 6, 15, 30);
		LocalDateTime datetime2 = LocalDateTime.of(date1, time1);
		LocalDateTime datetime3 = LocalDateTime.of(date1, time2);
		System.out.println("datetime1 : " + datetime1);		// 2018-09-05T06:15:30
		System.out.println("datetime2 : " + datetime2);		// 2018-09-05T06:15
		System.out.println("datetime3 : " + datetime3);		// 2018-09-05T06:15:30
		
		LocalDate.of(2015, Month.JANUARY, 32);		// invalid day of month, throws DateTimeException

	}

}
