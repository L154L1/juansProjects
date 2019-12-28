// A LinkedList implements both List and Queue. The List interface has a method to remove by index. Since this method exists, Java does not autobox to call the other method. 
// Queue has only the remove by object method, so Java does autobox there. Since the number 1 is not in the list, Java does not remove anything for the Queue.

package q19;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		List<Integer> q = new LinkedList<>();

		q.add(10);

		q.add(12);

		q.remove(1);

		System.out.print(q); // [10]
		
		
		Queue<Integer> q2 = new LinkedList<>();

		q2.add(10);

		q2.add(12);

		q2.remove(1);

		System.out.print(q2); // [10, 12]

	}

}
