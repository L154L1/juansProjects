// stream.collect(Collector) is mainly used to create a collection. But it can also creates some other types.

package p218_stream_collectors;

import java.util.stream.*;
import java.util.*;

public class BasicCollectors {

	public static void main(String[] args) {
		
		// Collectors.joining(", ") creates a String
		Stream<String> s = Stream.of("lions", "tigers", "bears");
		String result = s.collect(Collectors.joining(", "));
		System.out.println(result);		// lions, tigers, bears
		
		// Collectors.averagingInt() creates a Double
		Stream<String> s2 = Stream.of("lions", "tigers", "bears");
		Double result2 = s2.collect(Collectors.averagingInt(String::length));
		System.out.println(result2);	// 5.333333333333333
		
		// Collectors.toCollection(TreeSet::new) creates a TreeSet
		Stream<String> s3 = Stream.of("lions", "tigers", "bears");
		TreeSet<String> result3 = s3.filter(x -> x.startsWith("t"))
				.collect(Collectors.toCollection(TreeSet::new));
		System.out.println(result3);	// [tigers]

	}

}
