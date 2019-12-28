package p218_stream_collectors;

import java.util.stream.*;
import static java.util.stream.Collectors.*;
import java.util.*;

public class Mapping_use_static_import {
	
	public static void main(String[] args) {
		Stream<String> s = Stream.of("lions", "tigers", "bears");
		Map<Integer, Long> map = s.collect(groupingBy(String::length, counting()));
		System.out.println(map);	// {5=2, 6=1}
		
		Stream<String> s2 = Stream.of("lions", "tigers", "bears");
		Map<Integer, Optional<Character>> map2 = s2.collect(groupingBy(String::length, mapping(str -> str.charAt(0), minBy(Comparator.naturalOrder()))));
		System.out.println(map2);	// {5=Optional[b], 6=Optional[t]}

	}

}
