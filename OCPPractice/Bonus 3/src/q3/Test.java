// Q. 3  	Assume that today is June 1, 2016. What is the result of the following?

// A UnaryOperator returns the same type as it takes as a parameter. The one in this question takes a LocalDate, but it attempts to return an int. Since the types are different, the code doesn’t compile.

package q3;

import java.util.stream.*;
import java.util.function.*;
import java.time.*;

public class Test {

	public static void main(String[] args) {
		
		Stream<LocalDate> s = Stream.of(LocalDate.now());
		UnaryOperator<LocalDate> u = l -> l.getDayOfMonth();
		long result = s.filter(l -> l != null).map(u).count();
		System.out.println(result);

	}

}
