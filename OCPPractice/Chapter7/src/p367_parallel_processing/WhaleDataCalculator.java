// Parallel streams tend to achieve the most improvement when the number of elements in the stream is significantly large. 
// For small streams, the improvement is often limited, as there are some overhead costs to allocating and setting up the parallel processing.

package p367_parallel_processing;

import java.util.*;

public class WhaleDataCalculator {
	
	public int processRecord(int input) {
		try {
			Thread.sleep(10);	// simulating each record taking 10 milliseconds to complete
		} catch(InterruptedException e) {
			// Handle exception
		}
		
		return input + 1;
	}
	
	public void processAllData(List<Integer> data) {
		//data.stream().map(a -> processRecord(a)).count();		// Tasks completed in: 41.436 seconds
		data.parallelStream().map(a -> processRecord(a)).count();	// Tasks completed in: 10.359 seconds
	}

	public static void main(String[] args) {
		WhaleDataCalculator calculator = new WhaleDataCalculator();
		
		// Define the data
		List<Integer> data = new ArrayList<>();
		for(int i=0; i<4000; i++) data.add(i);
		
		// Process the data
		long start = System.currentTimeMillis();
		calculator.processAllData(data);
		double time = (System.currentTimeMillis() - start)/1000.0;
		
		// Report results
		System.out.println("\nTasks completed in: "+time+" seconds");

	}

}
