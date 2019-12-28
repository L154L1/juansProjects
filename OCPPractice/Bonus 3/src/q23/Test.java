// Q. 23  	Which option fills in the blank to make this code compile?

// The groupingBy() method groups by whatever type the mapping function returns. In this case, that is an int, which is autoboxed to an Integer.

package q23;

import java.util.*;
import java.util.stream.*;

public class Test {

	public static void main(String[] args) {
		Stream<String> s = Stream.of("bull", "cow");
		Map<Integer, List<String>> r= s.collect(Collectors.groupingBy(String::length));

	}

}
