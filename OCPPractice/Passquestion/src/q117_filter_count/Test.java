// What is the result?
// A. A compilation error occurs at line n2.
// B. 3
// C. 2
// D. A compilation error occurs at line n1.

// Answer: B

package q117_filter_count;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		List<String> valList = Arrays.asList("", "George", "", "John", "Jim");
		Long newVal = valList.stream()			//line n1
				.filter(x -> !x.isEmpty())
				.count();						//line n2
		System.out.print(newVal);		// 3

	}

}
