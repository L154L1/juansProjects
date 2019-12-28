// Create a Map with stream.collect(Collectors.groupingBy(classifierMapper, Collector)

package p218_stream_collectors;

import java.util.stream.*;
import java.util.*;

public class Mapping {

	public static void main(String[] args) {
		Stream<String> s = Stream.of("lions", "tigers", "bears");
		Map<Integer, Long> map = s.collect(Collectors.groupingBy(String::length, Collectors.counting()));
		System.out.println(map);	// {5=2, 6=1}
		
		Stream<String> s2 = Stream.of("lions", "tigers", "bears");
		Map<Integer, Optional<Character>> map2 = s2.collect(Collectors.groupingBy(String::length, Collectors.mapping(str -> str.charAt(0), Collectors.minBy(Comparator.naturalOrder()))));
		System.out.println(map2);	// {5=Optional[b], 6=Optional[t]}

	}

}
