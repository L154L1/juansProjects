// sort() and binarySearch() allow you to pass a comparator object when you don't want to use the natural order.
// you need to first sort the collection using the comparator, then binarySearch using the same comparator can produce an expected result.

package p151_sort_binarySearch_comparator;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Fluffy", "Hoppy");
		Comparator<String> c = Comparator.reverseOrder();
		int index = Collections.binarySearch(names, "Hoppy",  c);
		System.out.println(index);	// -1	undefined order because names was not sorted using the same comparator.
		
		Collections.sort(names, c);
		index = Collections.binarySearch(names, "Hoppy",  c);
		System.out.println(index);	// 0
	}

}
