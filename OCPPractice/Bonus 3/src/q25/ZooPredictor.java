// Q. 25  	Assuming an implementation of the calculateFuture() method is provided prior to runtime, which of the following are possible results of executing the following application? (Choose all that apply.)
// Answer -
// C.	It outputs a null value five times.
// D.	It outputs Problem five times.

// The return type of calculateFuture() is void, so the submit() is interpreted as being applied to a Runnable value. In this manner, the Future<?> can only return null or throw an exception; therefore C and D are correct.
// The get() method we used takes a parameter that will wait up to 100 days for a result. While this may seem like a lot of time, it is not the same as hanging indefinitely. 
// Finally, any exception thrown in calculateFuture() will appear as an exception in the get() operation. Since the get() operations are caught in a try/catch block in seeFuture(), none of them will be unhandled.

package q25;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;

public class ZooPredictor {
	
	public static void calculateFuture(int seed) {
		// IMPLEMENTATION OMITTED
		}

		public static void seeFuture(Future<?> f) {
		try {
		System.out.println(f.get(100, TimeUnit.DAYS)); // i1
		} catch (Exception e) {
		System.out.println("Problem");
		}
		}

	public static void main(String[] args) {
		ExecutorService service = Executors.newSingleThreadExecutor();
		final List<Future<?>> results = new ArrayList<>();
		IntStream.range(10, 15)
		.forEach(i -> results.add(
		service.submit(() -> calculateFuture(i)))); // i2
		results.stream().forEach(f -> seeFuture(f));
		service.shutdown();

	}

}


//null
//null
//null
//null
//null
