// Passquestion q109

// What is the result?
// A. text1text2
// B. text1text2text2text3
// C. text1
// D. [text1, text2]

// Correct Answer: A

package q69_stream_flatMap;

import java.util.*;
import java.util.stream.*;

public class Test {

	public static void main(String[] args) {
		Stream<List<String>> strs = Stream.of(
				Arrays.asList("text1", "text2"),
				Arrays.asList("text2", "text3"));
		Stream<String> bs2 = strs
				.filter(b -> b.contains("text1"))
				.flatMap(rs -> rs.stream());		// a new stream bs2 is returned. (will not execute till the following terminal operation forEach)
		
		bs2.forEach(b -> System.out.print(b));	// text1text2
				
	}

}
