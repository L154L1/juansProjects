package p200_stream_pipeline;

import java.util.stream.*;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
		list.stream().filter(s -> s.length() == 4)
					.sorted()	// sort by natural order
					.limit(2)	// first two
					.forEach(System.out::println);
		// Alex
		// Anna


		/*
		// this pipeline hangs till we kill the program
		Stream.generate(() -> "Elsa")
		.filter( n -> n.length() == 4)
		.sorted()
		.limit(2)
		.forEach(System.out::println);
		*/
		
		// this pipeline prints Elsa twice
		Stream.generate(() -> "Elsa")
		.filter( n -> n.length() == 4)
		.limit(2)
		.sorted()		
		.forEach(System.out::println);
		
	/*	
		// this pipeline hangs till we kill the program because the filter can never get any match.
		Stream.generate(() -> "Olaf Lazisson")
		.filter( n -> n.length() == 4)
		.limit(2)
		.sorted()		
		.forEach(System.out::println);
	*/	
		

	}

}

