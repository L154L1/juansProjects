// What is the result?
// A. Java EEJava EESE
// B. Java EESE
// C. The program prints either:
//	Java EEJava SE
//	or
//	Java SEJava EE
// D. Java EEJava SE

//Correct Answer: D

package q75_parallelStream;

import java.util.*;
import java.util.stream.*;

public class Test {

	public static void main(String[] args) {
		List<String> nums = Arrays.asList("EE", "SE");
		String ans = nums
				.parallelStream()
				//.stream()			// result is : Java EESE
				.reduce("Java ", (a, b) -> a.concat(b));
		System.out.print(ans);		// Java EEJava SE

	}

}
