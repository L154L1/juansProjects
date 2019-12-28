// Two ways to create a parallel stream :
// - call parallel() intermediate operation that converts a stream to parallel stream.
// - call parallelStream on any collection to return a parallel stream.

package p367_create_parallel_stream;

import java.util.*;
import java.util.stream.*;

public class Test {

	public static void main(String[] args) {
		Stream<Integer> s = Arrays.asList(1,2,3,4,5,6).stream();
		Stream<Integer> ps = s.parallel();		// parallel() is an intermediate operation that converts a stream to parallel stream. (doesn't need a terminal operation to execute here.)
												// after calling parallel(), either ps or s can be used as a parallel stream.
		ps.forEach(System.out::print);		// 465132 - order unpredictable 
		
		System.out.println();
		Stream<Integer> ps2 = Arrays.asList(1,2,3,4,5,6).parallelStream();	// call parallelStream on any collection to return a parallel stream.
		ps2.forEach(System.out::print);		// 412635 - order unpredictable

	}

}
