// Unlike concurrent collections, synchronized collections throws a ConcurrencyModificationException if they are modified within an iterator by a thread, while the concurrent collection does not.
// Using ConcurrentHashMap will not throw exception.
// Other than iteration over the collection, the collections returned by synchronized wrapping method are safe to use among multiple threads.

package p365_synchronized_collections;

import java.util.*;

public class ModifiedWithinIteration {

	public static void main(String[] args) {
		Map<String, Object> data = new HashMap<>();
		data.put("penguin", 1);
		data.put("flamingo", 2);
		
		Map<String, Object> synchronizedData = Collections.synchronizedMap(data);
		for(String key : synchronizedData.keySet())
			synchronizedData.remove(key);				// throws java.util.ConcurrentModificationException

	}

}
