// Q18 : What is the result of the following code?

package q18;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);
		list.add("2");
		list.add(.3);
		print(list);
		}
		private static void print(List<String> list) {
		for (Object object: list)
		System.out.print(object);	// 120.3
		}

}
