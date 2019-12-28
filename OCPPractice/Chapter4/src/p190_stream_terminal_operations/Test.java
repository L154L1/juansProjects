package p190_stream_terminal_operations;

import java.util.stream.*;
import java.util.function.*;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
		System.out.println(s.count());		// 3
		
		Stream<String> s2 = Stream.of("monkey", "ape", "bonobo");
		Optional<String> min = s2.min((str1, str2) -> str1.length() - str2.length());	// pass min() method an comparator
		min.ifPresent(System.out::println);		// ape
		
		Optional<?> min2 = Stream.empty().min((str1, str2) -> 0);
		System.out.println(min2.isPresent());	// false
		
		// findAny(), findFirst()
		Stream<String> s3 = Stream.of("monkey", "gorilla", "bonobo");
		Stream<String> infinite = Stream.generate(() -> "chimp");
		s3.findAny().ifPresent(System.out::println);		// monkey
		infinite.findAny().ifPresent(System.out::println);	// chimp
		
		Stream<String> s4 = Stream.of("monkey", "gorilla", "bonobo");
		Stream<String> infinite2 = Stream.generate(() -> "chimp");
		s4.findFirst().ifPresent(System.out::println);		// monkey
		infinite2.findFirst().ifPresent(System.out::println);	// chimp
		
		// allMatch(Predicate), anyMatch(Predicate), noneMatch(Predicate)
		List<String> list = Arrays.asList("monkey", "2", "chimp");
		Stream infinite3 = Stream.generate(() -> "chimp");
		Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
		System.out.println(list.stream().anyMatch(pred));	// true
		System.out.println(list.stream().allMatch(pred));	// false
		System.out.println(list.stream().noneMatch(pred));	// false
		System.out.println(infinite3.anyMatch(pred));		// true	
		
		Stream infinite4 = Stream.generate(() -> "chimp");
		Stream infinite5 = Stream.generate(() -> "chimp");
		System.out.println(infinite4.noneMatch(pred));		// false
		//System.out.println(infinite5.allMatch(pred));		// call allMatch on infinite stream will hang.
		
		// forEach(Consumer)
		Stream<String> s5 = Stream.of("monkey", "gorilla", "bonobo");
		s5.forEach(System.out::print);	// monkeygorillabonobo
			 

	}

}
