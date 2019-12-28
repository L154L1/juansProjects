// What is the result?
// A. Word: why what when
// B. Word: why Word: why what Word: why what when
// C. Word: why Word: what Word: when
// D. Compilation fails at line n1.

// Correct Answer: A

// Compare to free1 q75 which uses parallelStream and have different result.

package q59_stream_reduce;

import java.util.*;
import java.util.function.*;

public class Test {

	public static void main(String[] args) {
		List<String> qwords = Arrays.asList("why ", "what ", "when ");
		BinaryOperator<String> operator = (s1, s2) -> s1.concat(s2);
		String sen = qwords.stream()
				.reduce("Word: ", operator);
		
//		String sen = qwords.parallelStream()		// output - Word: why Word: what Word: when 
//				.reduce("Word: ", operator);
		
		System.out.println(sen);		// Word: why what when 

	}

}
