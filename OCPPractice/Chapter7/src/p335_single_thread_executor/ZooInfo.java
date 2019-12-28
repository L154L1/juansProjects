// With Concurrency API, Java introduced the ExecutorService, which creates and manages threads for you. 
// You first obtain an instance of ExecutorService interface, then you send the tasks to be processed. 
// The framework also includes many useful features such as thread pooling and scheduling. 
// It is recommended that you use this framework anytime you need to create and execute a separate task, even you only need a single thread.

// service.execute(Runnable task)

// In below example, there is only one thread so 3 tasks will be executed in order.

package p335_single_thread_executor;

import java.util.concurrent.*;

public class ZooInfo {

	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			
			System.out.println("begin");
			service.execute(() -> System.out.println("Printing zoo inventory"));
			service.execute(() -> {
				for(int i = 0; i < 3; i++)
					System.out.println("Printing record: " + i);
			});
			service.execute(() -> System.out.println("Printing zoo inventory"));
			System.out.println("end");
		} finally {
			if(service !=null) service.shutdown();
		}

	}

}


// with a single-thread executor, results are guaranteed to be executed in the order in which they are added to the executor service.
// The single-thread executor will queue the tasks ant wait till the previous task completes before executing the next task.
// But you should avoid relying on this behavior to order you tasks because when we increase the number of threads in the executor service, this guarantee will disappear.