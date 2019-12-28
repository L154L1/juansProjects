// First, we shut down the thread executor using shutdown() method.
// Next, we use awaitTermination(long timeout, TimeUnit unit) method to wait for the results.

package p344_wait_tasks_to_finish;

import java.util.concurrent.*;
public class Test {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			// Add tasks to the thread executor
			
		}finally {
			if(service != null) service.shutdown();		// first shut down the thread executor
		}
		
		if(service != null) {
			service.awaitTermination(1, TimeUnit.MINUTES);	// then wait up to one minute for the results
			if(service.isTerminated())
				System.out.println("All tasks finished");
			else
				System.out.println("At least one task is still running");
		}

	}

}
