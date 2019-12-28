// The methods offerFirst()/offerLast() and pollFirst()/pollLast() throw InterruptedException, which is a checked exception; 
// therefore the method does not compile. If the method signature was updated to include throws InterruptedException, then the answer would be F - 	The output cannot be determined ahead of time. 
// because the deque may be blocked at runtime when the offerFirst(), offerLast(), pollFirst(), and pollLast() operations are called. 
// Finally, if they were not blocked and there were no other operations on the deque, then the output would be 20 85, and the answer would be A.


package q14;
import java.util.concurrent.*;
public class Test {

	public void addAndPrintItems(BlockingDeque<Integer> deque) {
		deque.offer(103);
		deque.offerFirst(20, 1, TimeUnit.SECONDS);
		deque.offerLast(85, 7, TimeUnit.HOURS);
		System.out.print(deque.pollFirst(200, TimeUnit.NANOSECONDS));
		System.out.print(" "+deque.pollLast(1, TimeUnit.MINUTES));
		}

}
