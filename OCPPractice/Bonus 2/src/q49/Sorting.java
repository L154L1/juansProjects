// Q. 49  	What is the result of the following code?

// Answer : The code does not compile.

// Lizard implements Comparator, not Comparable. In order to sort a List, it needs to be Comparable.

package q49;

import java.util.*;

public class Sorting {
	static class Lizard implements Comparator<Lizard> {
		int weight;
		Lizard(int w) { weight = w; }
		public int compare(Lizard l, Lizard m) {
		return l.weight-m.weight;
		}
		public String toString() { return "" + weight; }
		}

	public static void main(String[] args) {
		List<Lizard> list = new ArrayList<>();
		list.add(new Lizard(5));
		list.add(new Lizard(4));
		list.add(new Lizard(7));
		Collections.sort(list);
		System.out.println(list);

	}

}
