// Q. 16  	What is the result of executing the following application? (Choose all that apply.)

// The problem is that the left side of the lambda expressions on lines p2 and p3 is incorrect. 
// The forEach() method takes a Consumer<T>, so the lambda should have a generic argument on the left side on line p2; therefore line p2 does not compile. 
// Likewise, the submit() method, while accepting both Callable and Runnable lambda expressions, does not accept lambda expressions that take an input argument; therefore line p3 does not compile 

// Note that if the code were corrected to compile, it would also wait forever at runtime since the thread executor is never shut down. 

package q16;
import java.util.concurrent.*;
import java.util.stream.*;

public class PrintHolidays {

	public static void main(String[] args) {
		ExecutorService service = Executors.newScheduledThreadPool(10);
		LongStream.of(101,704,1126) // p1
		.forEach(() -> service.submit( // p2
		(c) -> System.out.println(2+c))); // p3
		service.submit(() -> System.out.println("Happy Holidays!")); // p4
		

	}

}
