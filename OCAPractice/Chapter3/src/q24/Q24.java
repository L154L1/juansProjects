package q24;

import java.util.Arrays;
import java.util.List;

public class Q24 {

	public static void main(String[] args) {
		String[] names = {"Tom", "Dick", "Harry"};
//		List<String> list = names.asList();		// does not compile
		List<String> list2 = Arrays.asList(names);
		list2.set(0, "Sue");
		System.out.println(names[0]);
	}

}
