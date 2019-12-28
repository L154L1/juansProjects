// The key to solving this question is to remember that the execute() method returns void, not a Future object. And it can only take Runnable parameter.
// Therefore, line n1 does not compile and F is the correct answer. If the submit() method had been used instead of execute(), 
// then A would have been the correct answer - 0 1 2 3 4 

package q22;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;

public class PrintCounter {

	static int counter = 0;
	public static void main(String[] args) throws InterruptedException, ExecutionException {
	ExecutorService service = Executors.newSingleThreadExecutor();
	List<Future<?>> results = new ArrayList<>();
	IntStream.iterate(0,i -> i+1).limit(5).forEach(
	//i -> results.add(service.execute(() -> counter++)) // n1	- doesn't compile.
	i -> results.add(service.submit(() -> counter++)) // n1
	);
	for(Future<?> result : results) {
	System.out.print(result.get()+" "); // n2
	}
	service.shutdown();
	}

}
