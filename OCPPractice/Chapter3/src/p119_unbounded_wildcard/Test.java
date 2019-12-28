package p119_unbounded_wildcard;

import java.util.*;

public class Test {
	
	public static void printList(List<?> list) {
		for(Object x : list) System.out.println(x);
	}

	public static void main(String[] args) {
		List<String> keywords = new ArrayList<>();
		keywords.add("java");
		printList(keywords);	// List<String> can be assigned to List<?>
		
		//printList2(keywords);	// does not compile. List<String> cannot be assigned to List<Object>
	}
	
	public static void printList2(List<Object> list) {
		for(Object x : list) System.out.println(x);
	}

}
