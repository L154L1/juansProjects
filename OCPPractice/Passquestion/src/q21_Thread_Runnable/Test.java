// Which statement is true?
// A. The program prints 1 2 3 and the order is unpredictable.
// B. The program prints 1 2 3.
// C. The program prints 1 1 1.
// D. A compilation error occurs.

// Answer: A

package q21_Thread_Runnable;

import java.util.concurrent.atomic.AtomicInteger;

class MyThread implements Runnable {
	private static AtomicInteger count = new AtomicInteger(0);
	public void run() {
		int x = count.incrementAndGet();
		System.out.print(x + " ");
	}
}

public class Test {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new MyThread());
		Thread thread2 = new Thread(new MyThread());
		Thread thread3 = new Thread(new MyThread());
		
		Thread[] ta = {thread1, thread2, thread3};
		for(int x = 0; x < 3; x++) {				// will start 3 threads
			ta[x].start();
		}
	}

}


// 2 1 3  (order unpredictable)