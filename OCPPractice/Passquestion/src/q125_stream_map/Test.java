// What modification enables the code to print Price 5New Price 4
// A. Replace line n2 with .map(n -> System.out.println("New Price " + n - 1)); and remove line n3
// B. Replace line n2 with .mapToInt(n -> n - 1)
// C. Replace line n1 with .forEach(e -> System.out.print("Price " + e))
// D. Replace line n3 with .forEach(n -> System.out.println("New Price " + n));

// Answer: D

package q125_stream_map;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		List<Integer> prices = Arrays.asList(3, 4, 5);
		prices.stream()
		.filter(e -> e > 4)
		.peek(e -> System.out.print("Price " + e))			//line n1
		.map(n -> n - 1)									//line n2
		//.map(n -> System.out.println("New Price " + n - 1));	// A - does not compile						
		//.peek(n -> System.out.println(" New Price " + n));	//line n3
		.forEach(n -> System.out.println("New Price " + n));	// D - prints Price 5New Price 4

	}

}
