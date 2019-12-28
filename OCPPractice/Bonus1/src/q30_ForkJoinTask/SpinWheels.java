// Q30 : What is the result of executing the following application? 

// Answer : A. It compiles and runs without issue.

// Although this program is a generics mess, with the compiler warning about numerous generics problems it does compile and run without issue. 
// The class declaration should include a generic type, but since it does not, Object is assumed as the return type of the compute() method. 
// The key here is that the compute() method is called only once, exiting on the very first iteration since a <= 0, returning a value of 10. 
// Since an int can be autoboxed to an Integer value, the cast on line k4 does not throw an exception at runtime. 
// Therefore, A is the only correct answer.

package q30_ForkJoinTask;

import java.util.concurrent.*;

public class SpinWheels extends RecursiveTask {  // k1
	
	private int a;
	private int c;
	public SpinWheels(int a, int c) {
	this.a = a;
	this.c = c;
	}
	protected Object compute() { // k2
	if (a <= 0) return 10;
	else {
	int b = a + ((c - a) / 2);
	invokeAll(new SpinWheels(a, b), new SpinWheels(b, c)); // k3
	return ""; // k4
	}
	}

	public static void main(String[] args) {
		ForkJoinTask task = new SpinWheels(0, 100);
		ForkJoinPool pool = new ForkJoinPool();
		int x = (Integer)pool.invoke(task); // k4
		
		System.out.println(x);

	}

}
