// What is the result?
// A. A compilation error occurs at line n1.
// B. Logged out at: 2015-01-12T21:58:19.880Z
// C. Can’t logout
// D. Logged out at: 2015-01-12T21:58:00Z

// Correct Answer: C

package q43_instant;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		// Login time:2019-08-30T16:12:31.001Z
		Instant loginTime = Instant.now();
		Thread.sleep(1000);
		
		// Logout time:2019-08-30T16:12:32.012Z
		Instant logoutTime = Instant.now();
		
		System.out.println(loginTime);
		System.out.println(logoutTime);
		
		loginTime = loginTime.truncatedTo(ChronoUnit.MINUTES);
		logoutTime = logoutTime.truncatedTo(ChronoUnit.MINUTES);
		
		// after truncate, two times become the same in minutes.
		System.out.println(loginTime);
		System.out.println(logoutTime);
		
		if(logoutTime.isAfter(loginTime))
			System.out.println("Logged out at: " + logoutTime);
		else
			System.out.println("Can't logout");
			

	}

}
