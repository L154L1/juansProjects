// Which should be inserted into line n1to print Average = 2.5?
// A. IntStream str = Stream.of (1, 2, 3, 4);
// B. IntStream str = IntStream.of (1, 2, 3, 4);
// C. DoubleStream str = Stream.of (1.0, 2.0, 3.0, 4.0);
// D. Stream str = Stream.of (1, 2, 3, 4);

// Answer: B

package q153_stream_average;

import java.util.stream.*;

public class Test {

	public static void main(String[] args) {
		// B.
		IntStream str = IntStream.of(1,2,3,4);
		//Stream str = Stream.of (1, 2, 3, 4);	// doesn't compile. average() is only defined for primitive streams, not for Stream. It returns double.
		Double d = str.average().getAsDouble();
		System.out.println("Average = " + d);	// Average = 2.5
		
		//IntStream str2 = Stream.of(1,2,3,4);  // doesn't compile
		
	}

}
