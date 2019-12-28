// Which code fragment, when inserted at line n1, enables the code to print the count of string elements whose length is greater than three?
// A. listVal.stream().filter(x -> x.length()>3).count()
// B. listVal.stream().map(x -> x.length()>3).count()
// C. listVal.stream().peek(x -> x.length()>3).count().get()
// D. listVal.stream().filter(x -> x.length()>3).mapToInt(x -> x).count()

// Answer: A

package q38_filter;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		List<String> listVal = Arrays.asList("Joe", "Paul", "Alice", "Tom");
		System.out.println(
				listVal.stream().filter(x -> x.length()>3).count()	// A
				//listVal.stream().filter(x -> x.length()>3).mapToInt(x -> x).count()	// D doesn't compile
				);

	}

}

// 2
