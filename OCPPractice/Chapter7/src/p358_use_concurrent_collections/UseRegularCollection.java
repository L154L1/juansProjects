// Since we can use the synchronized keyword on any method or block, we can do the same for our existing regular collection classes to make them thread safe.
// (But Java has concurrent version of these collection classes so you don't need to put on synchronized keyword yourself. And they have better performance.)

package p358_use_concurrent_collections;

import java.util.*;
public class UseRegularCollection {
	
	private Map<String, Object> foodData = new HashMap<>();

	public synchronized void put(String key, Object value) {
		foodData.put(key, value);
	}
	
	public synchronized Object get(String key) {
		return foodData.get(key);
	}

}
