// Q. 20  	Assume that today is June 1, 2016. What is the result of the following?

// Answer : C.	There is no output.

// There is no terminal operation. Since the intermediate operations use lazy evaluation, they wait for a terminal operation to run. 
// Since there is no terminal operation, peek() never runs.

package q20;

import java.time.*;
import java.util.stream.*;
import java.util.function.*;

public class Test {

	public static void main(String[] args) {
		Stream<LocalDate> s = Stream.of(LocalDate.now());
		UnaryOperator<LocalDate> u = l -> l;
		s.filter(l -> l != null).map(u).peek(System.out::println);

	}

}
