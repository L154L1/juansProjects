// BlockingQueue and BlockingDeque are just like a regular queue or deque, 
// except that it includes methods that will wait a specific amount of time (timeout timer) for the object to be available to complete an operation.


// InterruptedException must be handled for offer(value, int, TimeUnit) or poll(value, int, TimeUnit) method on blocking queue.

package p361_concurrent_collection_classes;

import java.util.concurrent.*;

public class Example_blocking_queues {

	public static void main(String[] args) {
		try {
			BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();
			blockingQueue.offer(39);
			blockingQueue.offer(3, 4, TimeUnit.SECONDS);
			
			System.out.println(blockingQueue.poll());								// 39
			System.out.println(blockingQueue.poll(1000, TimeUnit.MILLISECONDS));	// 3
			
		} catch(InterruptedException e) {
			// Handle interruption
		}
		
		try {
			BlockingDeque<Integer> blockingDeque = new LinkedBlockingDeque<>();
			blockingDeque.offer(91);			
			blockingDeque.offerFirst(5, 2, TimeUnit.MINUTES);
			blockingDeque.offerLast(47, 100, TimeUnit.MICROSECONDS);
			blockingDeque.offer(3, 4, TimeUnit.SECONDS);
			
			System.out.println(blockingDeque.poll());								// 5
			System.out.println(blockingDeque.poll(950, TimeUnit.MILLISECONDS));		// 91
			System.out.println(blockingDeque.pollFirst(200, TimeUnit.NANOSECONDS));	// 47
			System.out.println(blockingDeque.pollLast(100, TimeUnit.SECONDS));		// 3
			
		} catch(InterruptedException e) {
			
		}
		

	}

}
