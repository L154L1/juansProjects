// Q. 5  	What is the result of the following statements?

// A queue can contain duplicate values. On line c1, Java uses autoboxing to convert the primitive to a Long object. 
// Since the object in the queue is an Integer and not a Long, a match is not found.

package q5;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(new Integer(6));
		q.add(new Integer(6));
		System.out.println(q.size() + " " + q.contains(6L));	// c1

	}

}


// 2 false