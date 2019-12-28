// Which code fragment, when inserted at line n1, enables printing 100?
// A. Function<Integer> funRef = e –> e + 10;
//    Integer result = funRef.apply(value);
// B. IntFunction funRef = e –> e + 10;
//    Integer result = funRef.apply (10);
// C. ToIntFunction<Integer> funRef = e –> e + 10;
//    int result = funRef.applyAsInt (value);
// D. ToIntFunction funRef = e –> e + 10;
//    int result = funRef.apply (value);

// Answer: C

package q150_ToIntFunction;

import java.util.function.*;

public class Test {

	public static void main(String[] args) {
		IntConsumer consumer = e -> System.out.println(e);
		Integer value = 90;

		
		// A.
//		Function<Integer> funRef = e -> e + 10;		// does not compile because of incorrect number of arguments of Function.
//		Integer result = funRef.apply(value);
		
		// C.
		ToIntFunction<Integer> funRef = e -> e + 10;
		int result = funRef.applyAsInt(value);
				
		
//		Integer i = new Integer(9);
//		consumer.accept(i);		// IntConsumer can take Integer value. Integer will be unboxed to int.
		
		// B.
//		IntFunction funRef = e -> e + 10;
//		Integer result = funRef.apply(10);		// doesn't compile because funRef is raw IntFunction and returns Object.
		
		// D.
//		ToIntFunction funRef = e -> e + 10;		// doesn't compile
//		int result = funRef.apply(value);
		
		
		consumer.accept(result);		// 100
		

	}

}
