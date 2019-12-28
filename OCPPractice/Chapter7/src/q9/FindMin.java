// The code correctly finds the minimum value in the array.
// FindMin inherits RecursiveTask.
// The class produces single-threaded performance at runtime. Since the code calls join() immediately after fork(), causing the process to wait, it does not perform any faster if there are 100 threads versus 1 thread

package q9;

import java.util.concurrent.*;


public class FindMin extends RecursiveTask<Integer> {
	
	private Integer[] elements;

	private int a;

	private int b;

	public FindMin(Integer[] elements, int a, int b) {

	this.elements = elements;

	this.a = a;

	this.b = b;

	}



	public Integer compute() {

	if ((b-a) < 2)

	return Math.min(elements[a], elements[b]);

	else {

	int m = a + ((b-a) / 2);

	System.out.println(a + "," + m + "," + b);

	FindMin t1 = new FindMin(elements, a, m);

	int result = t1.fork().join();

	return Math.min(new FindMin(elements, m, b).compute(), result);

	}

	}

	public static void main(String[] args) {
		Integer[] elements = new Integer[] { 8, -3, 2, -54 };

		FindMin task = new FindMin(elements, 0, elements.length-1);

		ForkJoinPool pool = new ForkJoinPool(1);

		Integer sum = pool.invoke(task);

		System.out.println("Min: " + sum);

	}

}
