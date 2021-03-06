// Q. 42  	Which of the following are true? (Choose all that apply.)

// Answer -
// A.	Zero lines are generated by the line marked by peek 1.
// D.	Zero lines are generated by the line marked by peek 2.

// There isn�t one terminal operation. That means that the intermediate operations, including both peek() statements, never run.

package q42;

import java.util.*;
import java.util.stream.*;

public class Test {

	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList();
		List<Integer> l2 = Arrays.asList(1, 2, 3);
		List<Integer> l3 = Arrays.asList(4, 5, 6);

		Stream.of(l1, l2, l3)
		.limit(2)
		.peek(System.out::println) // peek 1
		.flatMap(x -> x.stream())
		.peek(System.out::println) // peek 2
		.map(x -> x + 1);
		//.map(x -> x + 1).forEach(System.out::println);

	}

}
