// Below for loop throws java.util.ConcurrentModificationException, because the keySet() is not properly updated after the first element is removed.
// changing it to use ConcurrentHashMap will prevent such exception.


package p359_memory_consistency_errors;

import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		Map<String, Object> foodData = new HashMap<>();
		foodData.put("penguin", 1);
		foodData.put("flamingo", 2);
		
		for(String key : foodData.keySet())
			foodData.remove(key);			// throws java.util.ConcurrentModificationException, because the iterator keySet() is not properly updated after the first element is removed.

	}

}
