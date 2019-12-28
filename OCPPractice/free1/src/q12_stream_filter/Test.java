// Passquestion q25

// What is the result?
// A. 2
// B. 3
// C. A compilation error occurs at line n1.
// D. A compilation error occurs at line n2.

// Correct Answer: B

package q12_stream_filter;

import java.util.function.*;
import java.util.*;

//CourseFilter is not a functional interface because it doesn't have an abstract method. It overrides test() method from Predicate<String> as a default method.

//@FunctionalInterface	// doesn't compile
interface CourseFilter extends Predicate<String> {
	public default boolean test(String str) {
		return str.equals ("Java");
	}
}

public class Test {

	public static void main(String[] args) {
		List<String> strs = Arrays.asList("Java", "Java EE", "Java ME");
		Predicate<String> cf1 = s -> s.length() > 3;
		Predicate cf2 = new CourseFilter() { //line n1
			public boolean test (String s) {	// override default test() method in CourseFilter. Cannot use lamda because CourseFilter is not a functional interface.
				return s.contains ("Java");
			}
		};
		
		
		long c = strs.stream()
		.filter(cf1)
		.filter(cf2) //line n2
		.count();
		System.out.println(c);		// 3

	}

}
