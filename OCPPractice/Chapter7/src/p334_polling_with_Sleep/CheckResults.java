// Polling is the process of intermittently checking data at some fixed interval.
// In below example, we delay 1000 milliseconds at the end of each loop. This prevents possibly infinite loop from executing and locking up our main program.

package p334_polling_with_Sleep;

public class CheckResults {
	
	private static int counter = 0;
	
	public static void main(String[] args) throws InterruptedException {
		new Thread(() -> { 
			for(int i=0; i<500; i++) counter++;
		}).start();
		
		while(counter<100) {
			System.out.println("Not reached yet");
			Thread.sleep(1000);	// use sleep() to prevent possibly infinite loop
		}
		
		System.out.println("Reached!");

	}

}
