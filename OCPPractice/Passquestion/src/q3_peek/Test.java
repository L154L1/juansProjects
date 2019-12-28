// What is the result?
// A. 246
// B. The code produces no output.
// C. A compilation error occurs at line n1.
// D. A compilation error occurs at line n2.

// Answer: A

package q3_peek;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 2, 3);
		values.stream()
		.map(n -> n*2)
		.peek(System.out::print)
		.count();
	}
}

// 246