// What is the result?
// A. {1007 = A, 1002 = C, 1001 = B, 1003 = B}
// B. {1001 = B, 1002 = C, 1003 = B, 1007 = A}
// C. {1002 = C, 1003 = B, 1007 = A}
// D. {1007 = A, 1001 = B, 1003 = B, 1002 = C}

// Answer: B

package q5_TreeMap;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		Map<Integer, String> books = new TreeMap<>();
		books.put(1007, "A");
		books.put(1002, "C");
		books.put(1001, "B");
		books.put(1003, "B");
		System.out.println(books);	// {1001=B, 1002=C, 1003=B, 1007=A}
	}

}
