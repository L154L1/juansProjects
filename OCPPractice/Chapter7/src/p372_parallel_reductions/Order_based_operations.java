// findAny() is not reduction operation. It also has different result with stream and parallel stream.

package p372_parallel_reductions;

import java.util.*;

public class Order_based_operations {

	public static void main(String[] args) {
		System.out.println(Arrays.asList(1,2,3,4,5,6).stream().findAny().get());			// 1		always the first element
		
		System.out.println(Arrays.asList(1,2,3,4,5,6).parallelStream().findAny().get());	// 4		unpredictable

	}

}
