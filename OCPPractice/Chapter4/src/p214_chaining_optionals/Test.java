// Optionals can be chained using map(), filter() intermediate operations.
// Every time it returns a Optional of some type. Type can change by a mapper.
// ifPresent(Consumer) is terminal operation.

package p214_chaining_optionals;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		Optional<Integer> optional = Optional.of(10);		
		optional.map(n -> "" + n)
			.filter(s -> s.length() == 3)
			.ifPresent(System.out::println);
		
		Optional<Integer> optional2 = Optional.of(123);		
		optional2.map(n -> "" + n)
			.filter(s -> s.length() == 3)
			.ifPresent(System.out::println);	//123
		
	}

}
