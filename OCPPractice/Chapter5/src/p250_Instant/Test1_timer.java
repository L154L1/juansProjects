// Instant class represents a specific moment in time in the GMT time zone.
// Instant can be used to run timer in a program.

package p250_Instant;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Test1_timer {

	public static void main(String[] args) {
		Instant now = Instant.now();
		
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			
		}
		
		Instant later = Instant.now();
		
		Duration duration = Duration.between(now, later);
		System.out.println(duration);	// PT2S
		
		System.out.println(ChronoUnit.SECONDS.between(now, later));	// 2

	}

}
