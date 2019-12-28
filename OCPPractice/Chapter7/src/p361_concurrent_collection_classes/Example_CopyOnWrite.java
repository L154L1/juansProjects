// CopyOnWriteArrayList and CopyOnWriteArraySet, These classes copy all of their elements to a new underlying structure anytime a element is added, modified or removed from the collection. 
// 'modified' means the reference in the collection is changed. Modifying the actual contents of the element will not cause a new structure to be allocated.
// This is particular useful in multi-threaded environment that needs to iterate the collection. Any iterator established prior to a modification will not see the changes, 
// but instead it will iterate over the original elements prior to the modification.


package p361_concurrent_collection_classes;

import java.util.concurrent.*;
import java.util.*;

public class Example_CopyOnWrite {

	public static void main(String[] args) {
		List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(4,3,52));
		
		for(Integer item : list) {
			System.out.print(item + " ");
			list.add(9);
		}					// 4 3 52
		
		System.out.println();
		System.out.println("Size: " + list.size());		// Size: 6
		
		for(Integer item : list) {
			System.out.print(item + " ");	
		}										// 4 3 52 9 9 9 

	}

}
