// Q10 : What is the result of executing the following application?

// The key to solving this question is to notice that the stream allocated by iterate() is not a parallel stream by default. 
// Therefore, the forEach() operation is single threaded, with the first task waiting indefinitely and the cyclic barrier never being reached. 
// Therefore, the correct answer is G : It compiles but waits forever at runtime.

// If .parallel() is added to IntStream.iterate(1, i -> 1), it will print "Pen is Full" once. 

package q10;
import java.util.concurrent.*;
import java.util.stream.*;
public class RabbitPenManager {
	
	public static void await(CyclicBarrier cb) { // k1
		try { cb.await(); } catch (InterruptedException | BrokenBarrierException e) {
		// Handle exception
		}
		}
		public static void main(String[] args) {
		CyclicBarrier cb = new CyclicBarrier(2,
		() -> System.out.println("Pen is Full")); // k2
		IntStream.iterate(1, i -> 1)
		//IntStream.iterate(1, i -> 1).parallel()		// This will print "Pen is Full" once
		.limit(2).forEach(i -> await(cb)); // k3
		}

}
