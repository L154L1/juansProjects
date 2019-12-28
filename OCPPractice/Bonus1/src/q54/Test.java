// Q54 : What is the result of executing the following code snippet?

// The code throws a ConcurrentModificationException at runtime on line f1, since list1 is a regular collection and not a concurrent one. 
// Note that if line f1 was removed, the rest of the code would run without throwing an exception, outputting 3 6 0.

package q54;

import java.util.*;
import java.util.concurrent.*;

public class Test {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3));
		List<Integer> list2 = new CopyOnWriteArrayList<>(list1);
		Map<Integer,Integer> map3 = new ConcurrentHashMap<>();
		map3.put(1, 2);
		map3.put(3, 3);

		//for(Integer item : list1) list1.add(10); // f1
		for(Integer item : list2) list2.add(item); // f2
		for(Integer key : map3.keySet()) map3.remove(key); // f2
		System.out.println(list1.size()+" "+list2.size()+" "+map3.size());

	}

}
