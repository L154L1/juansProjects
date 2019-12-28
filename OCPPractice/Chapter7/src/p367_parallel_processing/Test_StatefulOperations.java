// Below stateful lambda expression modifies the data list in parallel, produces unpredictable results with parallel stream at runtime.
// We should avoid stateful lambda operation for parallel stream.

package p367_parallel_processing;

import java.util.*;

public class Test_StatefulOperations {

	public static void main(String[] args) {
		List<Integer> data = Collections.synchronizedList(new ArrayList<>());
		
		Arrays.asList(1,2,3,4,5,6).parallelStream()
		.map(i -> {data.add(i); return i;})		// Stateful lambda operation. 
		.forEachOrdered(i -> System.out.print(i+" "));	// 1 2 3 4 5 6 
		
		System.out.println();
		for(Integer e: data)
			System.out.print(e+" ");	// 1 2 6 4 5 3		unpredictable results

	}

}
