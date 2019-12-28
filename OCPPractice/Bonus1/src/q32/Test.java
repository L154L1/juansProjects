// Q32 : Assume that today is June 1, 2016. What is the result of the following?

// There is no terminal operation, which means that map() returns a Stream object. 
// The output is something like java.util.stream.ReferencePipeline$3@6d03e736.

package q32;

import java.util.stream.*;
import java.util.function.*;
import java.time.*;

public class Test {

	public static void main(String[] args) {
		Stream<LocalDate> s = Stream.of(LocalDate.now());
		UnaryOperator<LocalDate> u = l -> l;
		System.out.println(s.filter(l -> l != null).map(u));

	}

}
