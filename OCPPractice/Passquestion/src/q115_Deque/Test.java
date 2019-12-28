// What is the result?
// A. David
//    David
//    [Susan, Allen]
// B. Susan
//    Susan
//    [Susan, Allen]
// C. Susan
//    Allen
//    [David]
// D. David
//    Allen
//    [Susan]
// E. Susan
//    Allen
//    [Susan, David]

// Answer: C. Susan Allen [David]

package q115_Deque;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		Deque<String> queue = new ArrayDeque<>();
		queue.add("Susan");
		queue.add("Allen");
		queue.add("David");
		System.out.println(queue.pop());
		System.out.println(queue.remove());
		System.out.println(queue);

	}

}

//Susan
//Allen
//[David]
