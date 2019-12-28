// Which modification enables the code fragment to compile?
// A. Replace line n1with:
//   IntFunction<UnaryOperator> inFu = x -> y -> x*y;
// B. Replace line n1with:
//   IntFunction<IntUnaryOperator> inFu = x -> y -> x*y;
// C. Replace line n1with:
//   BiFunction<IntUnaryOperator> inFu = x -> y -> x*y;
// D. Replace line n2with:
//   IntStream newStream = stream.map(inFu.applyAsInt (10));

//Answer: B

// In line n1, IntFunction<IntUnaryOperator> means the return type of the IntFunction is IntUnaryOperator.
// In line n2, inFu.apply(10) returns a IntUnaryOperator y -> 10*y which is used as mapper for map().

package q2_IntFunction;

import java.util.stream.*;
import java.util.function.*;

public class Test {

	public static void main(String[] args) {
		IntStream stream = IntStream.of(1, 2, 3);
		//IntFunction<Integer> inFu = x -> y -> x*y;			//line n1
		IntFunction<IntUnaryOperator> inFu = x -> y -> x*y;
		IntStream newStream = stream.map(inFu.apply(10));  	//line n2		 equivalent to -   stream.map(y -> 10*y)
		newStream.forEach(System.out::print);

	}

}


// 102030