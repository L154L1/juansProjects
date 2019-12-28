// reduce(V identity, BiFunction<V,T,V> accumulator)
// identity is initial value with type V. BiFunction will accumulate from initial value. Returns type V.


// This example will print the total length of all strings in the list.

package p190_stream_terminal_operations;

import java.util.*;

public class Test2_reduce {

	public static void main(String[] args) {
		System.out.println(Arrays.asList("duck","chicken","flamingo","pelican")
				.parallelStream()
				.reduce(0,						// initial value is a int
				(c1, c2) -> c1 + c2.length(), 	// accumulator - c1 is Integer, c2 is String
				(s1, s2) -> s1 + s2)); 			// accumulator for parallel results - s1 and s2 are Integer

	}
	
	
	

}


// 26