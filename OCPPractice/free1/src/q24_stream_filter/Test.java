// Passquestion q41

//What is the result?
//A. 0 : 0 : pen
//B. 0 : 1 : pen
//C. 0 : 0 : 0 : 0 : 0 : pen
//D. 0 : 1 : 2 : 3 : 4 :
//E. A compilation error occurs.

//Correct Answer: A

package q24_stream_filter;

import java.util.*;
import java.util.function.*;

public class Test {

	public static void main(String[] args) {
		List<String> str = Arrays.asList ("my", "pen", "is", "your", "pen");
		Predicate<String> test = s -> {
			int i = 0;
			boolean result = s.contains ("pen");
			System.out.print(i++ + ":");
			return result;
		};
		str.stream()
		.filter(test)
		.findFirst()
		.ifPresent(System.out ::print);

	}

}

// 0:0:pen