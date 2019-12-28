// Q47 :	What is the result of the following code?

// When the same key is put into a Map, it overrides the original value. Therefore, there are only three key/value pairs in the map. TreeMap sorts its keys. This makes the output bac.

package q47;
import java.util.*;
public class Test {

	public static void main(String[] args) {

				TreeMap<Integer, String> treeMap = new TreeMap<>();
				treeMap.put(3, "a");
				treeMap.put(3, "a");
				treeMap.put(2, "b");
				treeMap.put(5, "c");
				for (Number number: treeMap.keySet())
				System.out.print(treeMap.get(number));		// bac

	}

}
