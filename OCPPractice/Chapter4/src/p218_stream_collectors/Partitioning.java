// Partitioning is special case of grouping. With partitioning, there are only two possible groups - true and false.
// When the result of Collector.partitioningBy() is passed to collect(), it returns a Map<Boolean, List<T>>.

// Partitioning is like splitting a list into two parts.
// Unlike groupingBy(), we cannot change the type of Map that gets returned by partitioningBy().

package p218_stream_collectors;

import java.util.stream.*;
import java.util.*;

public class Partitioning {

	public static void main(String[] args) {
		Stream<String> s = Stream.of("lions", "tigers", "bears");
		Map<Boolean, List<String>> map = s.collect(Collectors.partitioningBy(str -> str.length() <= 5));
		System.out.println(map);	// {false=[tigers], true=[lions, bears]}
		
		Stream<String> s2 = Stream.of("lions", "tigers", "bears");
		Map<Boolean, List<String>> map2 = s2.collect(Collectors.partitioningBy(str -> str.length() <= 7));
		System.out.println(map2);	// {false=[], true=[lions, tigers, bears]}
		
		Stream<String> s3 = Stream.of("lions", "tigers", "bears");
		// By default, partitioningBy() group elements of the stream to lists. We can change it to sets.
		Map<Boolean, Set<String>> map3 = s3.collect(Collectors.partitioningBy(str -> str.length() <= 7, Collectors.toSet()));
		System.out.println(map3);	// {false=[], true=[lions, bears, tigers]}

	}

}
