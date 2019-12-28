// What is the result?
// A. A compilation error occurs.
// B. [Java, J2EE, J2ME, JSTL, JSP]
// C. null
// D. [Java, J2EE, J2ME, JSTL]

// Answer : D

package q93_stream_filter;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Test {

	public static void main(String[] args) {
		List<String> li = Arrays.asList("Java", "J2EE", "J2ME", "JSTL", "JSP", "Oracle DB");
		Predicate<String> val = p -> p.contains("J");
		List<String> neLi = li.stream().filter(x -> x.length() > 3)
				.filter(val).collect(Collectors.toList());
		System.out.println(neLi);

	}

}

// [Java, J2EE, J2ME, JSTL]
