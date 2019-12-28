// ArrayList overrides equals() method.

package q27;

import java.util.*;

public class Q27 {

	public static void main(String[] args) {
		List<String> one = new ArrayList<String>();
		one.add("abc");
		List<String> two = new ArrayList<>();
		two.add("abc");
		
		if (one == two) System.out.println("A");
		else if (one.equals(two)) System.out.println("B");
		else System.out.println("C");
		
	}
}

// B