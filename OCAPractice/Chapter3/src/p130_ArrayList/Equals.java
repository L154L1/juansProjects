// ArrayList has a custom implementation of equals() 
// so you can compare two array lists to see if they contain the same elements in the same order.

package p130_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Equals {

	public static void main(String[] args) {
		List<String> one = new ArrayList<>();
		List<String> two = new ArrayList<>();
		System.out.println(one.equals(two));		// true
		one.add("a");
		System.out.println(one.equals(two));		// false
		two.add("a");
		System.out.println(one.equals(two));		// true
		one.add("b");
		System.out.println(one);	// [a, b]
		two.add(0, "b");
		System.out.println(two);	// [b, a]
		System.out.println(one.equals(two));		// false
	}
}
