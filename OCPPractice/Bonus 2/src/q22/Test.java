// Q. 22  	What is the result of the following?

// The first call to merge() removes the first key because the mapping function returns null. 
// The second call to merge() does not call the mapping function since the existing map value is null—it simply returns the value specified in the parameter. 
// Key 2 is never touched. Therefore, the answer is choice D - {2=20, 3=3}

package q22;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 10);
		map.put(2, 20);
		map.put(3, null);

		map.merge(1, 3, (a,b) -> null);
		map.merge(3, 3, (a,b) -> null);

		System.out.println(map);	// {2=20, 3=3}

	}

}
