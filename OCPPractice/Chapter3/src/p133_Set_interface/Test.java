// HashSet, TreeSet implement Set interface.
// HashSet uses hashCode() method of the objects to retrieve them more efficiently. But you lose the order you insert the element.
// TreeSet stores elements in a sorted tree structure.

// TreeSet also implements NavigableSet which provide some special methods.

package p133_Set_interface;

import java.util.*;
public class Test {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		boolean b1 = set.add(66);	// true
		boolean b2 = set.add(10);	// true
		boolean b3 = set.add(66);	// false
		boolean b4 = set.add(8);	// true
		for (Integer i: set) System.out.print(i + ",");
		
		System.out.println();
		
		Set<Integer> set2 = new TreeSet<>();
		boolean t1 = set2.add(66);	// true
		boolean t2 = set2.add(10);	// true
		boolean t3 = set2.add(66);	// false
		boolean t4 = set2.add(8);	// true
		for (Integer i: set2) System.out.print(i + ",");
		
		System.out.println();
		
		//TreeSet also implements NavigableSet which provide some special methods.
		NavigableSet<Integer> set3 = new TreeSet();
		for(int i = 1; i <= 20; i++) set3.add(i);
		System.out.println(set3.lower(10));		// 9
		System.out.println(set3.floor(10));		// 10
		System.out.println(set3.ceiling(20));	// 20
		System.out.println(set3.higher(20));	// null
		
	
	}

}
