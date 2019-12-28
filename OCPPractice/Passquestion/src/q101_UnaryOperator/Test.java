// What is the result?
// A. A compilation error occurs at line n1.
// B. courseJava
// C. Javacourse
// D. A compilation error occurs at line n2

// Answer: D

package q101_UnaryOperator;

import java.util.function.*;

public class Test {

	public static void main(String[] args) {
		final String str1 = "Java";
		StringBuffer strBuf = new StringBuffer("Course");
		UnaryOperator<String> u = (str2) -> str1.concat(str2); //line n1
		UnaryOperator<String> c = (str3) -> str3.toLowerCase();
		System.out.println(u.apply(c.apply(strBuf)));	//line n2

	}

}
