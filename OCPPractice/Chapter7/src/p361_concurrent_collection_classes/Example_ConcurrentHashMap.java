// You should use a concurrent collection class anytime that you are going to have multiple threads modify a collection object outside a synchronized block or method.

// It is considered a good practice to instantiate a concurrent collection but pass it around using a non-concurrent interface whenever possible.

package p361_concurrent_collection_classes;

import java.util.*;
import java.util.concurrent.*;
public class Example_ConcurrentHashMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new ConcurrentHashMap<>();
		map.put("zebra", 52);
		map.put("elephant", 10);
		System.out.println(map.get("elephant"));

	}

}
