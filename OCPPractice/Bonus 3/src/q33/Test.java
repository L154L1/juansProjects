package q33;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		List letters = Arrays.asList('a', 'b', 'c');
		letters.stream() // c1
		.sorted() // c2
		.distinct() // c3
		.forEach(System.out::println); // c4
		//.sorted();

	}

}
