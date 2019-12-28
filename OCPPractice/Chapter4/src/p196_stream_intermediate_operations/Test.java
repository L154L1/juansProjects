package p196_stream_intermediate_operations;

import java.util.*;
import java.util.stream.*;
public class Test {

	public static void main(String[] args) {
		
		// filter()
		Stream<String> s1 = Stream.of("monkey", "gorilla", "bonobo");
		s1.filter(x -> x.startsWith("m")).forEach(System.out::print);	// monkey
		
		System.out.println();
		
		// distinct()
		Stream<String> s2 = Stream.of("duck", "duck", "duck", "goose");
		s2.distinct().forEach(System.out::print);	// duckgoose
		
		System.out.println();
		
		// limit() and skip()
		Stream<Integer> s3 = Stream.iterate(1, n -> n + 1);
		s3.skip(5).limit(2).forEach(System.out::print);
		
		System.out.println();	// 67
		
		// map() - creates a one-to-one mapping from the elements in the stream to the elements of the next step in the stream.
		// Below example converts a list of String to a list of Integer.
		Stream<String> s4 = Stream.of("monkey", "gorilla", "bonobo");
		s4.map(String::length).forEach(System.out::print); // 676
		
		System.out.println();
		
		// flatMap() - takes each element in the stream and makes any elements it contains top-level element in a single stream.
		List<String> l1 = Arrays.asList();
		List<String> l2 = Arrays.asList("Bonobo");
		List<String> l3 = Arrays.asList("Mama Gorilla", "Baby Gorilla");
		Stream<List<String>> animals = Stream.of(l1, l2, l3);
		animals.flatMap(l -> l.stream()).forEach(System.out::println);		// method reference equivalent - animals.flatMap(List::stream).forEach(System.out::println);
			// Bonobo
			// Mama Gorilla
			// Baby Gorilla
		
		System.out.println();
		
		// sorted() - returns a stream with the elements sorted. Java uses natural ordering unless we specify a comparator. (natural ordering means Comparable implementation of the object.)
		Stream<String> s5 = Stream.of("brown-", "bear-");
		s5.sorted().forEach(System.out::print);		// bear-brown-
		
		System.out.println();
		
		Stream<String> s6 = Stream.of("brown bear-", "grizzly-");
		s6.sorted(Comparator.reverseOrder()).forEach(System.out::print);	// grizzly-brown bear-
		
		System.out.println();
		
		// peek() - is useful for debugging because it allows us to perform a stream operation without actually changing the stream.
		Stream<String> s8 = Stream.of("black bear", "brown bear", "grizzly");
		long count = s8.filter(s -> s.startsWith("g")).peek(System.out::println).count();	// grizzly
		System.out.println(count);		// 1
		
	}

}
