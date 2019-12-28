// Passquestion q112

// Assume that the value of now is 6:30 in the morning.
// What is the result?
// A. An exception is thrown at run time.
// B. 0
// C. 60
// D. 1

// Correct Answer: C


package q71_now_until;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Test {

	public static void main(String[] args) {
		//LocalTime now = LocalTime.now();
		LocalTime now = LocalTime.of(6, 30);
		long timeToBreakfast = 0;
		LocalTime office_start = LocalTime.of(7, 30);
		if(office_start.isAfter(now)) {
			timeToBreakfast = now.until(office_start, ChronoUnit.MINUTES);
		} else {
			timeToBreakfast = now.until(office_start, ChronoUnit.HOURS);
		}
		System.out.println(timeToBreakfast);	// 60

	}

}
