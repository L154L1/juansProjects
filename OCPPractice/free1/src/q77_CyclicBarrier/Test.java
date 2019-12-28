// What is the result ?
// A. [X]
//    [X, X]
//    [X, X, X]
//    [X, X, X, X]
// B. [X, X]
// C. [X]
//    [X, X]
//    [X, X, X]
// D. [X, X]
//    [X, X, X, X]

//Correct Answer: D

package q77_CyclicBarrier;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		final List<String> list = new CopyOnWriteArrayList<>();
		final AtomicInteger ai = new AtomicInteger(0);
		final CyclicBarrier barrier = new CyclicBarrier(2, new Runnable() {
			public void run() {System.out.println(list);}
		});
		Runnable r = new Runnable() {
			public void run() {
				try {
					Thread.sleep(1000 * ai.incrementAndGet());
					list.add("X");
					barrier.await();
				}catch(Exception ex) {}
				
			}
		};
		
		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();

	}

}

//[X, X]
//[X, X, X, X]