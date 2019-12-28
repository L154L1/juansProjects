// Q. 8  	What statements about the following code are true? (Choose all that apply.)

// Answer : the output of i1 is 1, but the output of i2 cannot be determined ahead of time.

// Sorting on a parallel stream does not mean that findAny() will return the first record.
// Synchronizing on the first output doesn’t actually impact the results of the code.

package q8;

import java.util.concurrent.*;
import java.util.*;

public class Test {

	public static void main(String[] args) {		
		Integer i1 = Arrays.asList(1,2,3,4,5).stream().findAny().get();
		synchronized(i1) { // y1
			Integer i2 = Arrays.asList(6,7,8,9,10)
			.parallelStream()
			.sorted() // y2
			.findAny().get(); // y3
			System.out.println(i1+" "+i2);
		}

	}

}
