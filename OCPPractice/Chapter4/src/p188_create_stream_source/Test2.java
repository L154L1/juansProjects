//** Not in OCP guide book.

// Convert array of T to Stream

package p188_create_stream_source;

import java.util.Arrays;
import java.util.stream.Stream;

public class Test2 {

	public static void main(String[] args) {
				
		String[] texts = {"apple", "orange", "pieapple"};
		Stream<String> s = Arrays.stream(texts);
		s.filter(t -> t.startsWith("o")).forEach(System.out::println);

	}

}
