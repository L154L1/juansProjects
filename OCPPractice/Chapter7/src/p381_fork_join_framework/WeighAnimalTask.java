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

import java.util.Random;
import java.util.concurrent.*;

public class WeighAnimalTask extends RecursiveTask<Double> {
	
	private int start;
	private int end;
	private Double[] weights;
	
	public WeighAnimalTask(Double[] weights, int start, int end) {
		this.start = start;
		this.end = end;
		this.weights = weights;
	}
	
	protected Double compute() {
		if(end-start <= 3) {
			double sum = 0;
			for(int i=start; i<end; i++) {
				weights[i] = (double)new Random().nextInt(100);
				System.out.println("Animal Weighed: " + i);
				sum += weights[i];
			}
			return sum;
		}			
		else {
			int middle = start + (end-start)/2;
			System.out.println("[start="+start+" ,middle="+middle+" ,end="+end+"]");
			RecursiveTask<Double> otherTask = new WeighAnimalTask(weights, start, middle);
			otherTask.fork();
			return new WeighAnimalTask(weights, middle, end).compute() + otherTask.join();
		}
	}

	public static void main(String[] args) {
		Double[] weights = new Double[10];
		
		ForkJoinTask<Double> task = new WeighAnimalTask(weights, 0, weights.length);
		ForkJoinPool pool = new ForkJoinPool();
		Double sum = pool.invoke(task);
		System.out.println("Sum:" + sum);

	}

}
