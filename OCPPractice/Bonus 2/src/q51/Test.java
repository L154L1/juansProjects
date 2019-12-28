// Q. 51  	What is the result of the following statements?

// Line c1 gives a compiler error. Since the Set does not use generics, the for loop would need to use Object rather than Number. 
// If the for loop were corrected, the answer would be -4567.

package q51;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		Set points = new TreeSet();
		points.add(7);
		points.add(5);
		points.add(-4);
		points.add(6);
		for (Number point: points)		// c1
			System.out.print(point);

	}

}
