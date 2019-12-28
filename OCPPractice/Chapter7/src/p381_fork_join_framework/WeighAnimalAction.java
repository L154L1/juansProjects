//p382 Applying the fork/join framework requires us to perform three steps:
//1. Create a ForkJoinTask.
//2. Create the ForkJoinPool.
//3. Start the ForkJoinTask.
//
//There are two ways to define our ForkJoinTask. One is to extend RecursiveAction, the other is to extend RecursiveTask. 
//The difference is starting a RecursiveAction doesn't return a result, while starting a RecursiveTask returns a result.
//
//p386 tips for Fork/Join class
//- The class used as ForkJoinTask should extend RecursiveAction or RecursiveTask.
//- If the class extends RecursiveAction, then it should override a protected compute() method that takes no arguments and returns void.
//- If the class extends RecursiveTask, then it should override a protected compute() method that takes no arguments and returns a generic type listed in the class definition.
//- The invokeAll() method takes two instances of the fork/join class and does not return a result.
//- The fork() method causes a new task to be submitted to the pool and is similar to the thread executor submit() method.
//- The join() method is called after the fork() method and causes the current thread to wait for the result of a subtask.
//- The fork() method should be called before the current thread performs a compute() operation, with join() called to read the results afterward.
//- Since compute() takes no arguments, the constructor of the class is often used to pass instructions to the task.

package p381_fork_join_framework;

import java.util.*;
import java.util.concurrent.*;

public class WeighAnimalAction extends RecursiveAction {
	
	private int start;
	private int end;
	private Double[] weights;
	
	public WeighAnimalAction(Double[] weights, int start, int end) {
		this.start = start;
		this.end = end;
		this.weights = weights;
	}
	
	protected void compute() {
		if(end-start <= 3)
			for(int i=start; i<end; i++) {
				weights[i] = (double)new Random().nextInt(100);
				System.out.println("Animal Weighed: " + i);
			}
		else {
			int middle = start + (end-start)/2;
			System.out.println("[start="+start+" ,middle="+middle+" ,end="+end+"]");
			invokeAll(new WeighAnimalAction(weights, start, middle), new WeighAnimalAction(weights, middle, end));
		}
	}

	public static void main(String[] args) {
		Double[] weights = new Double[10];
		
		ForkJoinTask<?> task = new WeighAnimalAction(weights, 0, weights.length);
		ForkJoinPool pool = new ForkJoinPool();
		pool.invoke(task);
		// Object result = pool.invoke(task);  // This does compile.
		
		// print results
		System.out.println();
		System.out.print("Weights: ");
		//Arrays.asList(weights).stream().forEach(d -> System.out.print(d.intValue()+" "));  // or do the same as below -
		Arrays.asList(weights).forEach(d -> System.out.print(d.intValue()+" "));

	}

}



//[start=0 ,middle=5 ,end=10]
//[start=0 ,middle=2 ,end=5]
//Animal Weighed: 0
//Animal Weighed: 1
//[start=5 ,middle=7 ,end=10]
//Animal Weighed: 2
//Animal Weighed: 5
//Animal Weighed: 7
//Animal Weighed: 3
//Animal Weighed: 4
//Animal Weighed: 8
//Animal Weighed: 9
//Animal Weighed: 6
//
//Weights: 81 70 14 58 18 89 0 32 97 56 
