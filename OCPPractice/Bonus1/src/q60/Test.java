// Q. 60  	Which statements about the following code snippet are true? (Choose all that apply.)

// Since both tasks are submitted to the same single-thread executor, the tasks are processed sequentially based on insertion order. 
// Since a single-thread executor is used, the second task will be queued and will wait for the first task to complete. 
// The result is that the first task outputs Fox, and afterward the second task outputs Hound;

// Answer: A.	The code will always output Fox followed by Hound.

package q60;

import java.util.concurrent.*;

public class Test {

	public static void main(String[] args) throws ExecutionException, InterruptedException {
		Object o1 = new Object();
		Object o2 = new Object();
		ExecutorService service = Executors.newSingleThreadExecutor();
		Future<?> f1 = service.submit(() -> {
		synchronized (o1) {
		synchronized (o2) { System.out.println("Fox"); } // g1
		}
		});
		Future<?> f2 = service.submit(() -> {
		synchronized (o2) {
		synchronized (o1) { System.out.println("Hound"); } // g2
		}
		});
		
		f1.get();
		f2.get();
		
//		System.out.println(f1.get());	// null
//		System.out.println(f2.get());	// null
		

	}

}
