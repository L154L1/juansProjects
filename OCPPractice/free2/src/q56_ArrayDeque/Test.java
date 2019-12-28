// What is the result?
// A. 4000 : 2000
// B. 4000 : 1000
// C. 1000 : 4000
// D. 1000 : 2000

// Correct Answer: A

package q56_ArrayDeque;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		Deque<Integer> nums = new ArrayDeque<>();
		nums.add(1000);		// add to tail of deque
		nums.push(2000);	// add to head of deque
		nums.add(3000);		// add to tail of deque
		nums.push(4000);	// add to head of deque
		
		//System.out.println(nums); // [4000, 2000, 1000, 3000]
				
		Integer i1 = nums.remove();		// remove head
		Integer i2 = nums.pop();		// remove head
		System.out.println(i1 + " : " + i2);		// 4000 : 2000

	}

}
