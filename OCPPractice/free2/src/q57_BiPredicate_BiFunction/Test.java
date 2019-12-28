// What is the result?
// A. A compilation error occurs at line 7.
// B. 100
// C. A compilation error occurs at line 8.
// D. A compilation error occurs at line 15.

// Correct Answer: B

package q57_BiPredicate_BiFunction;

import java.util.function.*;

public class Test {

	public static void main(String[] args) {
		BiPredicate<String, String> bp = (String s1, String s2) -> s1.contains("SG") && s2.contains("Java"); 
		BiFunction<String, String, Integer> bf = (String s1, String s2) -> {
			int fee = 0;
			if(bp.test(s1, s2)) {
				fee = 100;
			}
			return fee;
		};
		int fee1 = bf.apply("D101SG", "Java Programming");
		System.out.println(fee1);	// 100

	}

}
