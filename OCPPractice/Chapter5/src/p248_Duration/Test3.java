// p249 Period and Duration are not equivalent since Duration has time units in it, 
// even if we don't see them and they are meant only for objects with time.

package p248_Duration;
import java.time.*;
public class Test3 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2015, 5, 25);
		Period period = Period.ofDays(1);
		Duration days = Duration.ofDays(1);
		System.out.println(date.plus(period));	// 2015-05-26
		System.out.println(date.plus(days));	// java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Seconds

	}

}
