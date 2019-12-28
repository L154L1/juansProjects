// By implementing Comparable interface, the objects become comparable which means Collections.sort() method can be called for sorting.

package p143_implement_Comparable;

import java.util.*;

public class Duck implements Comparable<Duck> {
	
	private String name;
	public Duck(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
	public int compareTo(Duck d) {
		return name.compareTo(d.name);		// call String's compareTo
	}
	
	public static void main(String[] args) {
		List<Duck> ducks = new ArrayList<>();
		ducks.add(new Duck("Quack"));
		ducks.add(new Duck("Puddles"));
		Collections.sort(ducks);		// sort by name
		System.out.println(ducks);		// [Puddles, Quack]
	}

}
