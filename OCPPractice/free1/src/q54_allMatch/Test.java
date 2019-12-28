//What is the result?
//A. Searching...
//B. Searching...
//Searching...
//C. Searching...
//Searching...
//Searching...
//D. A compilation error occurs.

// Correct Answer: A

package q54_allMatch;

import java.util.*;
import java.util.function.*;

public class Test {

	public static void main(String[] args) {
		List<String> colors = Arrays.asList("red", "green", "yellow");
		Predicate<String> test = n -> {
			System.out.println("Searching…");
			return n.contains("red");
		};
		colors.stream()
		.filter(c -> c.length() > 3)
		.allMatch(test);

	}

}
