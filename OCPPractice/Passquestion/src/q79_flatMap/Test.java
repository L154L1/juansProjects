// Which code fragment, when inserted at line n1, prints 10 20 15 30?
// A. Stream.of(list1, list2)
//    .flatMap(list -> list.stream())
//    .forEach(s -> System.out.print(s + “ “));
// B. Stream.of(list1, list2)
//    .flatMap(list -> list.intStream())
//    .forEach(s -> System.out.print(s + “ “));
// C. list1.stream()
//    .flatMap(list2.stream().flatMap(e1 -> e1.stream())
//    .forEach(s -> System.out.println(s + “ “));
// D. Stream.of(list1, list2)
//    .flatMapToInt(list -> list.stream())
//    .forEach(s -> System.out.print(s + “ “));

// Answer: A

package q79_flatMap;

import java.util.*;
import java.util.stream.*;

public class Test {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(10, 20);
		List<Integer> list2 = Arrays.asList(15, 30);
		
		Stream.of(list1, list2).flatMap(list -> list.stream()).forEach(s -> System.out.print(s + " "));		//line n1
		// 10 20 15 30 

	}

}
