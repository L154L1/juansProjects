// Q. 52  	What is the result of calling the following method?

// The deque may be blocked at runtime when the offerFirst(), offerLast(), pollFirst(), and pollLast() operations are called; therefore the answer is G. The output cannot be determined ahead of time.
// If it were not blocked and there were no other operations on the deque, then the output would be false true.

package q52;

import java.util.concurrent.*;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		BlockingDeque<Boolean> bd = new LinkedBlockingDeque<>();
		
		printData(bd);

	}
	
	public static void printData(BlockingDeque<Boolean> deque) throws InterruptedException {
		deque.offerLast(true, 4, TimeUnit.MICROSECONDS);
		deque.offer(true);
		deque.offerFirst(false, 25, TimeUnit.SECONDS);
		System.out.print(deque.pollFirst(5, TimeUnit.DAYS));
		System.out.print(" "+deque.pollLast(2, TimeUnit.NANOSECONDS));
		}

}
