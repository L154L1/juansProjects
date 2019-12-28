//What is the result?
//A. 1John2null
//B. 12
//C. A NullPointerExceptionis thrown at run time.
//D. A compilation error occurs.

//Answer: D

package q11_flatMapToInt;

import java.util.*;
import java.util.stream.*;

public class Test {

	public static void main(String[] args) {
		Stream<List<String>> iStr = Stream.of (
				Arrays.asList("1", "John"),
				Arrays.asList("2", null));
		Stream<String> nInSt = iStr.flatMapToInt(x -> x.stream());
		//Stream<String> nInSt = iStr.flatMap(x -> x.stream());		// this is correct.
		nInSt.forEach(System.out::print);
	}

}
