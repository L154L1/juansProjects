// Q. 43  	What is the result of the following code?
// Lizard correctly implements Comparable. The Lizard objects are sorted by their numeric field.

package q43;

import java.util.*;

public class Sorting {
	
	static class Lizard implements Comparable<Lizard> {
		int weight;
		Lizard(int w) { weight = w; }
		public int compareTo(Lizard l) {
		return weight-l.weight;
		}
		public String toString() { return "" + weight; }
		}

	public static void main(String[] args) {
		List<Lizard> list = new ArrayList<>();
		list.add(new Lizard(5));
		list.add(new Lizard(4));
		list.add(new Lizard(7));
		Collections.sort(list);
		System.out.println(list);	// [4, 5, 7]

	}

}
