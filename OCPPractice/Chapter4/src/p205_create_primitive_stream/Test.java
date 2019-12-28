package p205_create_primitive_stream;

import java.util.stream.*;
public class Test {

	public static void main(String[] args) {
		
		// create finite primitive streams
		DoubleStream empty = DoubleStream.empty();
		DoubleStream oneValue = DoubleStream.of(3.14);
		DoubleStream varargs = DoubleStream.of(1.0, 1.1, 1.2);
		oneValue.forEach(System.out::println);
		System.out.println();
		varargs.forEach(System.out::println);
		
		System.out.println();
		
		// create infinite primitive streams
		DoubleStream random = DoubleStream.generate(Math::random);
		DoubleStream fractions = DoubleStream.iterate(.5, d -> d/2);
		random.limit(3).forEach(System.out::println);
		System.out.println();
		fractions.limit(3).forEach(System.out::println);
		
		System.out.println();
		
		IntStream count = IntStream.iterate(1, n -> n + 1).limit(5);
		count.forEach(System.out::println);
		
		System.out.println();
		
		// equivalent of above range
		IntStream range = IntStream.range(1, 6);	// start is inclusive, end is exclusive
		range.forEach(System.out::println);
		
		System.out.println();
		
		IntStream rangeClosed = IntStream.rangeClosed(1, 5);  // both start and end inclusive
		rangeClosed.forEach(System.out::println);
		
		// mapping methods between stream types
		Stream<String> objStream = Stream.of("penguin", "fish");
		IntStream intStream = objStream.mapToInt(s -> s.length());		//or - IntStream intStream = objStream.mapToInt(String::length);

	}

}
