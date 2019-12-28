package p343_submit_callable;

import java.util.concurrent.*;

public class AddData {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			Future<Integer> result = service.submit(() -> 30+11);			// submit Callable
			System.out.println(result.get());	// 41
			
			result.wait();	// 41
			
			
//			Future<?> result2 = service.submit(() -> System.out.println("hi"));		// submit Runnable
//			
//			service.execute(() -> System.out.println("hi"));						// execute Callable
//			
//			service.execute(() -> 30);		// doesn't compile
			
			
		}finally {
			if(service != null) service.shutdown();
		}

	}

}
