// What is the result?
// A. 4000.0
// B. 4000
// C. A compilation error occurs at line n1.
// D. A compilation error occurs at line n2.

// Answer : D


package q69_type_mismatch;

import java.util.*;
import java.util.function.*;

public class Test {

	public static void main(String[] args) {
		UnaryOperator<Integer> uol = s -> s*2;			//line n1
		List<Double> loanValues = Arrays.asList(1000.0, 2000.0);
		loanValues.stream()					//line n2
		.filter(lv -> lv >= 1500)
		.map(lv -> uol.apply(lv))			// uol.apply(lv) takes Integer parameter, cannot take Double.
		.forEach(s -> System.out.print(s + " "));

	}

}
