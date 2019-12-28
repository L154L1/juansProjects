// Q. 42  	What is the output of the following?
// Answer : The code does not compile.

// The code b -> b.startsWith("c") can be passed directly to partitioningBy() or groupingBy(). Java will infer the right type and pass a Predicate to the former and a Function to the later. 
// However, that’s not what happens in this example. By actually creating a Predicate variable, the type has to match and the call to groupingBy() does not compile.

package q42;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Test {

	public static void main(String[] args) {
		Stream<String> s = Stream.empty();
		Stream<String> s2 = Stream.empty();
		Predicate<String> condition = b -> b.startsWith("c");
		Map<Boolean, List<String>> p = s.collect(
		Collectors.partitioningBy(condition));
		Map<Boolean, List<String>> g = s2.collect(
		Collectors.groupingBy(condition));
		System.out.println(p + " " + g);

	}

}
