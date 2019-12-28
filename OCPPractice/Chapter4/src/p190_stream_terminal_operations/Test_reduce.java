// T reduce(T identity, BinaryOperator<T> accumulator)
// Optional<T> reduce(BinaryOperator<T> accumulator)
// use two BinaryOperators for parallel stream

package p190_stream_terminal_operations;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Test_reduce {

	public static void main(String[] args) {
		// T reduce(T identity, BinaryOperator<T> accumulator)   - identity is initial value. With a initial value of T, reduce() returns T.
		Stream<String> s6 = Stream.of("w", "o", "l", "f");
		String word = s6.reduce("", (ss1, ss2) -> ss1 + ss2);
		Stream<String> s7 = Stream.of("w", "o", "l", "f");
		String word2 = s7.reduce("", String::concat);
		System.out.println(word);		// wolf
		System.out.println(word2);		// wolf
		
		Stream<Integer> s8 = Stream.of(3, 5, 6);
		System.out.println(s8.reduce(1, (a, b) -> a * b));		// 90
		
		// Optional<T> reduce(BinaryOperator<T> accumulator)		- without identity, reduce() returns Optional type
		BinaryOperator<Integer> op = (a, b) -> a * b;
		Stream<Integer> empty = Stream.empty();
		Stream<Integer> oneElement = Stream.of(3);
		Stream<Integer> threeElements = Stream.of(3, 5, 6);
		
		empty.reduce(op).ifPresent(System.out::println);			// no output
		oneElement.reduce(op).ifPresent(System.out::println);		// 3
		threeElements.reduce(op).ifPresent(System.out::println);	// 90
		
		Stream<Integer> empty2 = Stream.empty();
		Stream<Integer> oneElement2 = Stream.of(3);
		Stream<Integer> threeElements2 = Stream.of(3, 5, 6);
		
		System.out.println(empty2.reduce(op));			// Optional.empty
		System.out.println(oneElement2.reduce(op));		// Optional[3]
		System.out.println(threeElements2.reduce(op));	// Optional[90]	
		
		// use two BinaryOperators for parallel stream
		Stream<Integer> s = Stream.of(3, 5, 6);
		System.out.println(s.reduce(1, op, op));		// 90

	}

}
