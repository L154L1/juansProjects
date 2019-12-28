// Predicate is often used when filtering or matching.	(BiPredicate takes two parameters)

package p177_implement_Predicate;

import java.util.function.*;

public class Test {

	public static void main(String[] args) {
		Predicate<String> p1 = String::isEmpty;
		Predicate<String> p2 = s -> s.isEmpty();
		
		System.out.println(p1.test(""));
		System.out.println(p2.test(""));
		
		BiPredicate<String, String> b1 = String::startsWith;
		BiPredicate<String, String> b2 = (s, prefix) -> s.startsWith(prefix); 
		
		System.out.println(b1.test("chicken", "chick"));
		System.out.println(b2.test("chicken", "chick"));

	}

}
