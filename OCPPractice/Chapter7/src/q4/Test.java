// While the output of AtomicLong value1 will always be 100, the output of long value2[0] is nondeterministic. 
// It could output any value from 1 to 100, because the threads can overwrite each other’s work. 

package q4;

import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
import java.util.stream.*;
public class Test {

	public static void main(String[] args) {
		AtomicLong value1 = new AtomicLong(0);
		final long[] value2 = {0};
		IntStream.iterate(1, i -> 1).limit(100).parallel().forEach(i -> value1.incrementAndGet());
		IntStream.iterate(1, i -> 1).limit(100).parallel().forEach(i -> ++value2[0]);
		System.out.println(value1+" "+value2[0]);

	}

}
