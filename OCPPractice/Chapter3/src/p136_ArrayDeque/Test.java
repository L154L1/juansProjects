package p136_ArrayDeque;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<>();
		//ArrayDeque<Integer> queue = new ArrayDeque<>();		// also works with queue methods.
		System.out.println(queue.offer(10));	// true
		System.out.println(queue.offer(4));		// true
		System.out.println(queue.peek());		// 10
		System.out.println(queue.poll());		// 10
		System.out.println(queue.poll());		// 4
		System.out.println(queue.peek());		// null
		System.out.println(queue.poll());		// null
		
		System.out.println();
		
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		stack.push(10);
		stack.push(4);	
		System.out.println(stack.peek());		// 4
		System.out.println(stack.poll());		// 4
		System.out.println(stack.poll());		// 10
		System.out.println(stack.peek());		// null
		
		System.out.println();
		
		// can also use pop() for stack
		ArrayDeque<Integer> stack2 = new ArrayDeque<>();
		//Queue<Integer> stack2 = new ArrayDeque<>();		// doesn't work with push() and pop()
		stack2.push(10);
		stack2.push(4);	
		System.out.println(stack2.peek());		// 4
		System.out.println(stack2.pop());		// 4
		System.out.println(stack2.pop());		// 10
		System.out.println(stack2.peek());		// null

	}

}
