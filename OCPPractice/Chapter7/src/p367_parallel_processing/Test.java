// The results of a serial stream are ordered and predictable.
// The results of a parallel stream are unordered and unpredictable. But parallel threads gain performance.
// forEachOrdered() can force to order the results of parallel stream at cost of performance.


package p367_parallel_processing;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		Arrays.asList(1,2,3,4,5,6)
		.stream()
		.forEach(s -> System.out.print(s + " "));	// 1 2 3 4 5 6 
		
		System.out.println();
		
		Arrays.asList(1,2,3,4,5,6)
		.parallelStream()
		.forEach(s -> System.out.print(s + " "));	// 4 6 5 1 2 3 
		
		System.out.println();
		
		Arrays.asList(1,2,3,4,5,6)
		.parallelStream()
		.forEachOrdered(s -> System.out.print(s + " "));	// 1 2 3 4 5 6 
		

	}

}
