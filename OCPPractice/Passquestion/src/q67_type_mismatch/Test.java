// What is the result ?

// Answer : C. A compilation error occurs at line n1.

package q67_type_mismatch;

import java.util.function.*;

public class Test {

	public static void main(String[] args) {
		BiFunction<Integer, Double, Integer> val = (t1, t2) -> t1 + t2; 	//line n1
		//BiFunction<Integer, Double, Double> val = (t1, t2) -> t1 + t2;  // this works!
		
		System.out.println(val.apply(10, 10.5));		//line n2					

	}

}
