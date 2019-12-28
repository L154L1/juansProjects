// What is the result?
// A. A compilation error occurs at line n1.
// B. Checking...
// C. Checking...Checking...
// D. A compilation error occurs at line n2.

// Answer: D

package q119_filter_count;

import java.util.*;
import java.util.function.*;

public class Test {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("win", "try", "best", "luck", "do");
		Predicate<String> test1 = w -> {
			System.out.println("Checking...");
			return w.equals("do");							//line n1
		};
		Predicate test2 = (String w) -> w.length() > 3;		//line n2   - Does not compile because raw Predicate expects Object type.
		
		words.stream()
		.filter(test2)
		.filter(test1)
		.count();

	}

}
