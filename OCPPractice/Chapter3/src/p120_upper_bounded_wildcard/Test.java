package p120_upper_bounded_wildcard;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		List<Number> list2 = new ArrayList<Integer>();	// does not compile
		
		List<? extends Number> list = new ArrayList<Integer>();

	}
	
	public static long total(List<? extends Number> list) {
		long count = 0;
		for (Number number: list) count += number.longValue();
		return count;
	}

}
