// Adding an object that does not implement Comparable to a TreeSet will throw an exception at runtime.

package p151_TreeSet_Comparable;

import java.util.*;
import p147_implement_Comparator.Duck;

public class UseTreeSet {
	
	static class Rabbit{ int id; }

	public static void main(String[] args) {
		Set<Duck> ducks = new TreeSet<>();
		ducks.add(new Duck("Puddles", 5));		// Duck implemented Comparable so it can be added to a TreeSet
		Set<Rabbit> rabbits = new TreeSet<>();
		rabbits.add(new Rabbit());  // throws an exception - because Rabbit does not implement Comparable so its object cannot be added to a TreeSet.

	}

}
