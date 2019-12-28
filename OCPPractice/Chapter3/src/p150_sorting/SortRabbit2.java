// The sort method uses the compareTo() method to sort. It expects the objects to be sorted to be comparable, otherwise it will not compile when calling sort(list). 
// But you can fix this by passing a comparator to sort() method - sort(list, comparator), meaning you can specify sort order without using compareTo() method if you pass a comparator.

package p150_sorting;

import java.util.*;

import p150_sorting.SortRabbits.Rabbit;

public class SortRabbit2 {

	static class Rabbit{ int id; }

	public static void main(String[] args) {
		List<Rabbit> rabbits = new ArrayList<>();
		rabbits.add(new Rabbit());
		Comparator<Rabbit> c = (r1, r2) -> r1.id - r2.id;	// declare a comparator
		Collections.sort(rabbits, c);  	// pass a comparator to sort() method

	}

}
