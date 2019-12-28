// Q17 : What is the result of executing the following program? 
// Answer : C.	The output cannot be determined ahead of time.

// The key here is that the tasks are submitted but the output is retrieved, possibly before the results are finished. 
// It may output 100 100, but it may also output 10 40, 37 4, and so on. 

package q17;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
public class MonkeyCounter {

	private static AtomicInteger monkey1 = new AtomicInteger(0); // m1
	private static AtomicLong monkey2 = new AtomicLong(0);

	public static void main(String[] args) {
	ExecutorService service = null;
	try {
	service = Executors.newSingleThreadExecutor(); // m2

	for(int i=0; i<100; i++)
	service.submit(() -> monkey1.getAndIncrement()); // m3
	for(int i=0; i<100; i++)
	service.submit(() -> monkey2.incrementAndGet());
	
//	try {									// with this pause before the print, it will print 100 100
//		Thread.sleep(1000);
//	} catch(InterruptedException e) {}
	
	System.out.println(monkey1+" "+monkey2); // m4
	} finally {
	if(service != null) service.shutdown();
	}
	}

}
