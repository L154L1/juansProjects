// Future<V> - type V is determined by the return type of the Runnable or Callable method. Since the return type of Runnable.run() is void, the get() method always returns null.

package p341_result_Future;

import java.util.concurrent.*;

public class CheckResults {

	private static int counter = 0;
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService service = null;
		
		try {
			service = Executors.newSingleThreadExecutor();
			Future<?> result = service.submit(() -> { 
				for(int i=0; i<500; i++) counter++;
			});
			
			result.get(10, TimeUnit.SECONDS);	// waits at most 10 seconds, throwing a TimeoutException if the task is not done.
			System.out.println("Reached!");
			
		} catch(TimeoutException e) {
			System.out.println("Not reached in time");
		} finally {
			if(service != null) service.shutdown();
		}

	}

}
