// What is the result?

// A.	The code compiles successfully.Your selection is incorrect
// B.	The output is 8675null309.Your selection is incorrect
// C.	The output is 867586null309.
// D.	The output is indeterminate.
// E.	There is a compiler error on line 3.
// F.	There is a compiler error on line 9.
// G.	An exception is thrown.

// Answer: A D

package q7;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		Set<Number> numbers = new HashSet<>();
		numbers.add(new Integer(86));
		numbers.add(75);
		numbers.add(new Integer(86));
		numbers.add(null);
		numbers.add(309L);
		
		Iterator iter = numbers.iterator();
		while(iter.hasNext())
			System.out.print(iter.next());

	}

}
