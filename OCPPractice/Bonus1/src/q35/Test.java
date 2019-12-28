// Q35 : Which of following is the best way to convert a stream of String objects to a stream of int primitives?

package q35;

import java.util.stream.*;

public class Test {

	public static void main(String[] args) {
		
		Stream<String> stream = Stream.of("12","14","21");
		IntStream is = stream.mapToInt(Integer::parseInt);
		
		is.forEach(System.out::println);

	}

}
