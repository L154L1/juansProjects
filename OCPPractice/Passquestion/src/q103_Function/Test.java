// What is the result?
// A. Val:20 Val:40 Val:60
// B. Val:10 Val:20 Val:30
// C. A compilation error occurs.
// D. Val: Val: Val:

// Answer: A

package q103_Function;

import java.util.*;
import java.util.function.*;

public class Test {

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(10, 20, 30);
		Function<Integer, Integer> fn = f1 -> f1 + f1;
		Consumer<Integer> conVal = s -> System.out.print("Val:" + s + " ");
		li.stream().map(fn).forEach(conVal);
		
	}

}

// Val:20 Val:40 Val:60 
