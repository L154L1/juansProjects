// The created list is not normal list. It's array backed list 
// meaning it's fixed sized list and changed with array because they point to the same data store.
// Arrays.asList() method can take array or varargs.

package p136_converting_array_list;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ArrayToList {

	public static void main(String[] args) {
		String[] array = {"hawk", "robin"};
		List<String> list = Arrays.asList(array);
		
		// ArrayList<String> list2 = Arrays.asList(array);		// mismatch compile error
		
		System.out.println(list.size());			// 2
		
		list.set(1, "test");
		array[0] = "new";
		
		for(String s : array) System.out.print(s + " ");	// new test
		
		// Other than a regular array, asList() method can take varargs too.
		List<String> list2 = Arrays.asList("hawk", "robin");
		
		list.remove(1);	// throws UnsupportedOperationException because it's fixed-size list and we are not allowed to change the size.
	}
}
