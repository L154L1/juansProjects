// The collect() operation groups the animals into those that do and do not start with the letter p.
// The stream created by flatMap() is a new stream that is not parallel by default, even though its elements are parallel streams. 
// Therefore, the performance will be single-threaded.

package q13;

import java.util.stream.*;
import java.util.concurrent.*;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		Stream<String> cats = Stream.of("leopard","lynx","ocelot","puma").parallel();

		Stream<String> bears = Stream.of("panda","grizzly","polar").parallel();

		ConcurrentMap<Boolean, List<String>> data = Stream.of(cats,bears)

		.flatMap(s -> s)

		.collect(Collectors.groupingByConcurrent(s -> !s.startsWith("p")));

		System.out.println(data.get(false).size()+" "+data.get(true).size());

	}

}
