package q17;

import java.util.function.Predicate;

public class Q17 {

	public static void main(String[] args) {
		System.out.println(test(i -> i == 5));
		System.out.println(test((i) -> i == 5));
		System.out.println(test((i) -> {return i == 5;}));
		
//		System.out.println(test((int i) -> i == 5));	// incorrect type
		System.out.println(test((Integer i) -> i == 5));

	}
	private static boolean test(Predicate<Integer> p) {
		return p.test(5);
	}
}
