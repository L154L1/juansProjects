// Q56 : Which option fills in the blank to make this code compile?

// The partitioningBy() method groups input into two parts of type Boolean.

package q56;

import java.util.*;
import java.util.stream.*;

public class Test {

	public static void main(String[] args) {
		Stream<String> s = Stream.of("bull", "cow");
		Map<Boolean, List<String>> r= s.collect(Collectors.partitioningBy(b -> b.startsWith("c")));

	}

}
