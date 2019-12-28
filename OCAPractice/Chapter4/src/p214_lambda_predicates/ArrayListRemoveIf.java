package p214_lambda_predicates;

import java.util.*;

public class ArrayListRemoveIf {

	public static void main(String[] args) {
		List<String> bunnies = new ArrayList<>();
		bunnies.add("long ear");
		bunnies.add("floppy");
		bunnies.add("hoppy");
		System.out.println(bunnies);		// [long ear, floppy, hoppy]
		bunnies.removeIf(s -> s.charAt(0) != 'h');
		System.out.println(bunnies);		// [hoppy]
	}
}
