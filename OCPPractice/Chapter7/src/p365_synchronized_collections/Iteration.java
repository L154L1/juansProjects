// These wrapping method synchronize access to the data elements, such as the get() and set() method. 
// But they do not synchronize access on any iterators you may create from the synchronized collection. 
// Therefore, you must use a synchronized block if you need to iterate over any of the returned collection by a synchronized wrapping method.

package p365_synchronized_collections;

import java.util.*;
//import java.util.concurrent.*;

public class Iteration {

	public static void main(String[] args) {
		List<Integer> list = Collections.synchronizedList(new ArrayList<>(Arrays.asList(4,3,52)));
		
		list.set(0, 10);
		System.out.println(list.get(0));
		
		synchronized(list) {
			for (int data : list)
				System.out.print(data + " ");
		}

	}

}
