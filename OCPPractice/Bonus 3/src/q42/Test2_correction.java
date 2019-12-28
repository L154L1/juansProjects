package q42;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Test2_correction {

	public static void main(String[] args) {
		Stream<String> s = Stream.empty();
		Stream<String> s2 = Stream.empty();
		Predicate<String> condition = b -> b.startsWith("c");
		Map<Boolean, List<String>> p = s.collect(
		Collectors.partitioningBy(condition));
		Map<Boolean, List<String>> g = s2.collect(
		Collectors.groupingBy(b -> b.startsWith("c"))); // Java infer the lambda passed as Function instead of Predicate
		System.out.println(p + " " + g);	// {false=[], true=[]} {}

	}

}
