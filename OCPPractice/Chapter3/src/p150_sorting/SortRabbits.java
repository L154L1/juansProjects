// The sort method uses the compareTo() method to sort. It expects the objects to be sorted to be comparable, otherwise it will not compile when calling Collections.sort(list). 

package p150_sorting;

import java.util.*;

public class SortRabbits {
	
	static class Rabbit{ int id; }

	public static void main(String[] args) {
		List<Rabbit> rabbits = new ArrayList<>();
		rabbits.add(new Rabbit());
		Collections.sort(rabbits);  // does not compile because Rabbit is not comparable. It doesn't implement compareTo() method.

	}

}
