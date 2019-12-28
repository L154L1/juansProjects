// If an object does not implement Comparable or we want to use different sorting when we instantiate a TreeSet, 
// we can pass a Comparator as argument when instantiating the TreeSet.

package p152_TreeSet_Comparator;

import java.util.*;

public class UseTreeSet {

	static class Rabbit{ int id; }

	public static void main(String[] args) {

		Set<Rabbit> rabbits = new TreeSet<>(new Comparator<Rabbit>() {
			public int compare(Rabbit r1, Rabbit r2) {
				return r1.id - r2.id;
			}
		});
		rabbits.add(new Rabbit());  
		
		// or use lambda equivalent
		Set<Rabbit> rabbits2 = new TreeSet<>((r1, r2) -> r1.id - r2.id);
		rabbits2.add(new Rabbit());
		
	}

}
