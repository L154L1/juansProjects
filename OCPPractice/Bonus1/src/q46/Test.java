package q46;

import java.util.*;
import java.util.stream.*;
public class Test {

	public static void main(String[] args) {
		List<Integer> l = IntStream.rangeClosed(1, 5)
				.mapToObj(i -> i).collect(Collectors.toList());
				l.forEach(System.out::print);

	}

}
