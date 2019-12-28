// public List[E] subList(int fromIndex, int toIndex) 
// Above method returns a view of the portion of a list between the specified fromIndex inclusive and toIndex exclusive.
// subList method will not change the list.


package Test3Q74;

import java.util.*;

public class Program {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> rem = new ArrayList<>();
		rem.add(0);rem.add(3);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(5);
		list.add(4);
		list.add(0);
		
		list.subList(0, 2);
		//list = list.subList(0, 2);
		list.removeAll(rem);
		
		System.out.println(list);	//[2, 1, 5, 4]
	}

}
