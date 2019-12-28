//** Not in OCP guide book.

// Convert int array to IntStream


package p205_create_primitive_stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test2 {

	public static void main(String[] args) {
		int[] numbers = {2, 3, 5, 7, 11, 13};
		IntStream s = Arrays.stream(numbers);
		System.out.println(s.limit(3).sum());

	}

}
