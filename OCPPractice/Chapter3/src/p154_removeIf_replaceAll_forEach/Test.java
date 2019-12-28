package p154_removeIf_replaceAll_forEach;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Magician");
		list.add("Assisstant");
		System.out.println(list);
		list.removeIf(s -> s.startsWith("A"));		// takes Predicate<String>
		System.out.println(list);
		
		List<Integer> list2 = Arrays.asList(1, 2, 3);
		list2.replaceAll(x -> x * 2);	// takes UnaryOperator<Integer>
		System.out.println(list2);	// [2, 4, 6]
		
		List<String> cats = Arrays.asList("Annie", "Repley");
		for(String cat : cats) System.out.println(cat);
		// equivalent
		cats.forEach(System.out::println);		// takes Consumer<String>
	}

}
