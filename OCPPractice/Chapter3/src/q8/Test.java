package q8;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<String>();
		tree.add("one");
		tree.add("One");
		tree.add("ONE");
		System.out.println(tree.ceiling("On"));		// One
		
		//tree.add("On");
		System.out.println(tree);	// [ONE, One, one]

	}

}
