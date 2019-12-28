// Q. 43  	What statements about the following code snippet are true? (Choose all that apply.)

package q43;

import java.util.stream.*;
import java.util.*;
import java.util.concurrent.*;

public class Test {

	public static void main(String[] args) {
		Stream<String> primates = Stream.of("gorilla","lemur","monkey","orangutan");
		Stream<String> turtles = Stream.of("leatherback","green","loggerhead");
		ConcurrentMap<Boolean, List<String>> data = Stream.of(primates,turtles)
		.flatMap(s -> s).parallel()
		.collect(Collectors.groupingByConcurrent(s -> s.endsWith("n")));
		System.out.println(data.get(false).size()+" "+data.get(true).size());		// 5 2

	}

}
