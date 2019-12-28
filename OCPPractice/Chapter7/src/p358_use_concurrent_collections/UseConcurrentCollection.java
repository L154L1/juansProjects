// Because accessing collections from across multiple threads is so common that for convenience, 
// Java thought it would be good idea to have alternate versions of of many regular collections classes just for multi-threaded access, 
// such that you don't need to use the synchronized keyword on regular collection classes but just use concurrent collection classes.

package p358_use_concurrent_collections;

import java.util.Map;
import java.util.concurrent.*;

public class UseConcurrentCollection {
	
	private Map<String, Object> foodData = new ConcurrentHashMap<>();

	public void put(String key, Object value) {
		foodData.put(key, value);
	}
	
	public Object get(String key) {
		return foodData.get(key);
	}

}
