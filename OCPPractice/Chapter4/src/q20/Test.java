// Both List and Stream have forEach() method. 	

package q20;

import java.util.stream.*;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		List<Integer> l = IntStream.range(1, 6).mapToObj(i -> i).collect(Collectors.toList());
		l.forEach(System.out::println);
		
		// same as :
		IntStream.range(1, 6)
		.forEach(System.out::println);

	}

}
