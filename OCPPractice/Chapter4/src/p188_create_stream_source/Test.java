package p188_create_stream_source;

import java.util.*;
import java.util.stream.*;

public class Test {

	public static void main(String[] args) {
		
		// create finite stream
		Stream<String> empty = Stream.empty();
		Stream<Integer> singleElement = Stream.of(1);
		Stream<Integer> fromArray = Stream.of(1, 2, 3);
		
		List<String> list = Arrays.asList("a", "b", "c");
		Stream<String> fromList = list.stream();
		Stream<String> fromListParallel = list.parallelStream();
		
		// create infinite stream
		Stream<Double> randoms = Stream.generate(Math::random);			// Stream.generate(Supplier)
		Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);		// Stream.iterate(seed, Function)
		

	}

}
