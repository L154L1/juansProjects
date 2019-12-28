//Q. 26  	What is the result of executing the following application? 

// Even though the stream is parallel, the forEachOrdered() forces the methods to execute in order. 
// Since the thread executor is single threaded, the results are guaranteed to be executed in order. 
// Therefore, it will output the numbers in the order of the original stream followed by Complete!,

package q26;

import java.util.concurrent.*;
import java.util.stream.*;

public class PerfectSquares {

	public static void main(String[] args) {
		ExecutorService service = Executors.newSingleThreadExecutor();
		IntStream.of(1,4,9,16,25).parallel() // z1
		.forEachOrdered(c -> service.submit( // z2
		() -> System.out.println(10*c))); // z3
		service.submit(() -> System.out.println("Complete!")); // z4
		service.shutdown();
		
		

	}

}


//10
//40
//90
//160
//250
//Complete!