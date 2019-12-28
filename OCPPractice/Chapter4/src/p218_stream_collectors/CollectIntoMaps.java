// create a Map with stream.collect(Collectors.toMap(keyMapper, valueMapper, ...)

package p218_stream_collectors;

import java.util.stream.*;
import java.util.*;

public class CollectIntoMaps {
		
	public static void main(String[] args) {
		
		// Collectors.toMap(keyMapper, valueMapper)
		Stream<String> s = Stream.of("lions", "tigers", "bears");
		Map<String, Integer> map = s.collect(Collectors.toMap(x -> x, String::length));
		System.out.println(map);	// {lions=5, bears=5, tigers=6}
		
		/*	Below will throw IllegalStateException due to duplicated key.
		 	Stream<String> s = Stream.of("lions", "lions", "bears");
			Map<String, Integer> map = s.collect(Collectors.toMap(x -> x, String::length));
			System.out.println(map);
		 */
		
		// Collectors.toMap(keyMapper, valueMapper, BinaryOperator)
		// BinaryOperator merges values when duplicate keys arise.
		// without 4th parameter which is a supplier, toMap() creates a HashMap.
		Stream<String> s2 = Stream.of("lions", "tigers", "bears");
		Map<Integer, String> map2 = s2.collect(Collectors.toMap(String::length, k -> k, (str1, str2) -> str1 + "," + str2)); // the 3rd parameter tells collector what to do when keys are duplicate.
		System.out.println(map2);				// {5=lions,bears, 6=tigers}
		System.out.println(map2.getClass());	// class java.util.HashMap
		
		// Collectors.toMap(keyMapper, valueMapper, BinaryOperator, supplier)
		// with a supplier as the 4th parameter, it specifies the type of Map to create.
		Stream<String> s3 = Stream.of("lions", "tigers", "bears");
		TreeMap<Integer, String> map3 = s3.collect(Collectors.toMap(String::length, k -> k, (str1, str2) -> str1 + "," + str2, TreeMap::new)); // the 4th parameter tells collector to return a TreeMap instead.
		System.out.println(map3);				// {5=lions,bears, 6=tigers}
		System.out.println(map3.getClass());	// class java.util.TreeMap

	}

}
