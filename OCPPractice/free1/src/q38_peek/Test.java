// What is the result?
// A. Hello : Jim Hello : John Hello : Jeff
// B. Jim John Jeff
// C. The program prints nothing.
// D. A compilation error occurs.

// Correct Answer: C

package q38_peek;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Test {

	public static void main(String[] args) {
		List<String> nL = Arrays.asList("Jim", "John", "Jeff");
		Function<String, String> funVal = s -> "Hello : ".concat(s);
		nL.stream()
		.map(funVal)
		.peek(System.out::print);

	}

}
