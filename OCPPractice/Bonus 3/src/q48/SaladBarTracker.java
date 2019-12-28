// Q. 48  	What is the result of executing the following application?

// Answer - B.	It outputs Salad bar empty 3 times.

package q48;

import java.util.concurrent.*;

public class SaladBarTracker {
	
	public static void await(CyclicBarrier cb) {
		try {
		cb.await();
		} catch (InterruptedException | BrokenBarrierException e) {
		// Handle exception
		}
		}

	public static void main(String[] args) {
		CyclicBarrier cb = new CyclicBarrier(4,
				() -> System.out.println("Salad bar empty")); // r1
				ExecutorService service = Executors.newFixedThreadPool(4); // r2
				for(int i=0; i<12; i++) {
				service.submit(() -> await(cb)); // r3
				}
				service.shutdown();

	}

}
