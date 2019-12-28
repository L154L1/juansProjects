package q24;


import java.util.stream.*;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		Stream<String> s = Stream.empty();
		Stream<String> s2 = Stream.empty();
		Map<Boolean, List<String>> p = s.collect(
		Collectors.partitioningBy(b -> b.startsWith("c")));
		Map<Boolean, List<String>> g = s2.collect(
		Collectors.groupingBy(b -> b.startsWith("c")));
		System.out.println(p + " " + g);	// {false=[], true=[]} {}

	}

}
