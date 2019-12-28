// When the result of Collector.groupingBy() is passed to collect(), it returns a Map<K, List<T>>.

package p218_stream_collectors;

import java.util.stream.*;
import java.util.*;

public class Grouping {

	public static void main(String[] args) {
		Stream<String> s = Stream.of("lions", "tigers", "bears");
		// By default, groupingBy() tells collect() it should group all elements of the stream into lists.
		Map<Integer, List<String>> map = s.collect(Collectors.groupingBy(String::length));
		System.out.println(map);	// {5=[lions, bears], 6=[tigers]}
		
		Stream<String> s2 = Stream.of("lions", "tigers", "bears");
		// the 2nd parameter in groupingBy() tells collect() it should group all elements of the stream into sets.
		Map<Integer, Set<String>> map2 = s2.collect(Collectors.groupingBy(String::length, Collectors.toSet()));
		System.out.println(map2);	// {5=[lions, bears], 6=[tigers]}
		
		Stream<String> s3 = Stream.of("lions", "tigers", "bears");
		// the 2nd parameter in groupingBy() tells collect() it should return a TreeMap.
		TreeMap<Integer, Set<String>> map3 = s3.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toSet()));
		System.out.println(map3);	// {5=[lions, bears], 6=[tigers]}
		
		Stream<String> s4 = Stream.of("lions", "tigers", "bears");
		// the 3nd parameter in groupingBy() tells collect() it should group all elements of the stream into lists.
		TreeMap<Integer, List<String>> map4 = s4.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));
		System.out.println(map4);	// {5=[lions, bears], 6=[tigers]}
		

	}

}
