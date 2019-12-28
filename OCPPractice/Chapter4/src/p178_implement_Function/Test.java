// Function is responsible for turning one parameter into a value of a possibly different type and return it. Often used as a mapper. (BiFunction takes two parameters)
// UnaryOperator and BinaryOperator are a special case of a function. They require all type parameters to be the same type. 
// (UnaryOperator<T> extends Function<T, T> and BinaryOperator<T> extends BiFunction<T, T, T>)

package p178_implement_Function;

import java.util.function.*;

public class Test {

	public static void main(String[] args) {
		Function<String, Integer> f1 = String::length;
		Function<String, Integer> f2 = s -> s.length();
		
		System.out.println(f1.apply("cluck"));		// 5
		System.out.println(f2.apply("cluck"));		// 5
		
		BiFunction<String, String, String> b1 = String::concat;
		BiFunction<String, String, String> b2 = (s1, s2) -> s1.concat(s2);
		
		System.out.println(b1.apply("baby ", "chick"));		// baby chick
		System.out.println(b2.apply("baby ", "chick"));		// baby chick
		
		
		// UnaryOperator and BinaryOperator are a special case of a function. They require all type parameters to be the same type.
		UnaryOperator<String> u1 = String::toUpperCase;
		UnaryOperator<String> u2 = s -> s.toUpperCase();
		
		System.out.println(u1.apply("chirp"));		// CHIRP
		System.out.println(u2.apply("chirp"));		// CHIRP
		
		BinaryOperator<String> bo1 = String::concat;
		BinaryOperator<String> bo2 = (s1, s2) -> s1.concat(s2);
		
		System.out.println(bo1.apply("baby ", "chick"));		// baby chick
		System.out.println(bo2.apply("baby ", "chick"));		// baby chick
	}

}
