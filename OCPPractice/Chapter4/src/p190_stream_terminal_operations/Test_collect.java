// stream.collect() is intended to return a collection. Two ways :

// stream.collect(Supplier, BiConsumer, BiConsumer) 
// It's commonly used on mutable objects such as StringBuilder and ArrayList, or
// commonly used to create a collection. 

// Java provides some common collectors. So we can use short signature -
// stream.collect(Collector)


package p190_stream_terminal_operations;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class Test_collect {

	public static void main(String[] args) {
		// collect(Supplier, BiConsumer, BiConsumer)   The 2nd BiConsumer is used by parallel stream.
		Stream<String> s = Stream.of("w", "o", "l", "f");
		StringBuilder word = s.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
		System.out.println(word.toString());	// wolf
		
		Stream<String> s2 = Stream.of("w", "o", "l", "f");
		TreeSet<String> set = s2.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
		System.out.println(set);	// [f, l, o, w]
		
		// collect(Collector)
		Stream<String> s3 = Stream.of("w", "o", "l", "f");
		TreeSet<String> set2 = s3.collect(Collectors.toCollection(TreeSet::new));
		System.out.println(set2);	// [f, l, o, w]
		
		Stream<String> s4 = Stream.of("w", "o", "l", "f");
		Set<String> set3 = s4.collect(Collectors.toSet());		// Set doesn't require ordering.
		System.out.println(set3);	// [f, w, l, o]

	}

}
