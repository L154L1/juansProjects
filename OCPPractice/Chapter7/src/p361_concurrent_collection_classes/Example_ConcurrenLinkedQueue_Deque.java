// You should use a concurrent collection class anytime that you are going to have multiple threads modify a collection object outside a synchronized block or method.

// It is considered a good practice to instantiate a concurrent collection but pass it around using a non-concurrent interface whenever possible.

package p361_concurrent_collection_classes;

import java.util.*;
import java.util.concurrent.*;

public class Example_ConcurrenLinkedQueue_Deque {

	public static void main(String[] args) {
		Queue<Integer> queue = new ConcurrentLinkedQueue<>();
		queue.offer(31);
		System.out.println(queue.peek());	// 31
		System.out.println(queue.poll());	// 31
		
		Deque<Integer> deque = new ConcurrentLinkedDeque<>();
		deque.offer(10);
		deque.push(4);
		System.out.println(deque.peek());	// 4
		System.out.println(deque.pop());	// 4		same result as - System.out.println(deque.poll());

	}

}
