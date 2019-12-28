package q26;

import java.util.*;

public class Q26 {

	public static void main(String[] args) {
		List<Integer> ages = new ArrayList<>();
		ages.add(Integer.parseInt("5"));	// autoboxing
		ages.add(Integer.valueOf("6"));
		ages.add(7);						// autoboxing
		ages.add(null);
		for (int age : ages) System.out.print(age);		// throws NullPointerException when trying to unbox null to int.
		
	}
}
