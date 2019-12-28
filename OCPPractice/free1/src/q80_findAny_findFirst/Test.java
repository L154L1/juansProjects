// Which two code fragments, when inserted at line n1 independently, result in the output PEEK: Unix?
// A. .anyMatch ();
// B. .allMatch ();
// C. .findAny ();
// D. .noneMatch ();
// E. .findFirst ();

//Correct Answer: C E

package q80_findAny_findFirst;

import java.util.stream.*;

public class Test {

	public static void main(String[] args) {
		Stream.of("Java", "Unix", "Linux")
		.filter(s -> s.contains("n"))
		.peek(s -> System.out.println("PEEK: " + s))
		.findAny();
		//.findFirst();

	}

}
