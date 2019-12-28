// What is the result?

// A. A compilation error occurs at line n2.
// B. 200.12300.32
// C. 100.12200.32
// D. A compilation error occurs at line n1.

//Answer: D

package q110_DoubleFunction;

import java.util.*;
import java.util.function.DoubleFunction;

public class Test {

	public static void main(String[] args) {
		List<Double> doubles = Arrays.asList(100.12, 200.32);
		
		DoubleFunction funD = d-> d + 100.0;
		
		doubles.stream().forEach(funD); 	// line n1
		
		doubles.stream().forEach(e -> System.out.println(e));	// line n2

	}

}
