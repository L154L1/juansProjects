// Q. 52  	What is the result of executing the following application? 

// Answer : 	The code will not compile because of j2.

// The program extends RecursiveTask, not RescursiveAction; therefore the compute() method must return a value. 
// Since the compute() method has a return type of void, line j2 does not compile

package q52;

import java.util.concurrent.*;

public class CheckWeather extends RecursiveTask { // j1
	
	private int start;
	private int end;
	public CheckWeather(int start, int end) {
	this.start = start;
	this.end = end;
	}
	protected void compute() { // j2
	if ((end-start)<2)
	return;
	else {
	int middle = start + ((end-start) / 2);
	invokeAll(new CheckWeather(start, middle), new CheckWeather(middle, end)); // j3
	}
	}

	public static void main(String[] args) {
		ForkJoinTask task = new CheckWeather(0, 4);
		ForkJoinPool pool = new ForkJoinPool();
		pool.invoke(task);

	}

}
