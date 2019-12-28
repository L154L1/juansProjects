// What is the result?
// A. 20.0
//	  30.0
// B. 10
//    20
// C. A compilation error occurs.
// D. A NumberFormatException is thrown at run time.

// Correct Answer: C

package q32_compilation_error;

import java.util.*;
import java.util.function.*;

public class Test {

	public static void main(String[] args) {
		List<Integer> codes = Arrays.asList (10, 20);
		UnaryOperator<Double> uo = s -> s +10.0;
		codes.replaceAll(uo);
		codes.forEach(c -> System.out.println(c));
		
		// Correction :
//		UnaryOperator<Integer> uo2 = s -> s +10;
//		codes.replaceAll(uo2);

	}

}
