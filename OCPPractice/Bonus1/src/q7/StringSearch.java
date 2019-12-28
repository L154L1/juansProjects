package q7;
import java.util.*;
public class StringSearch {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("ab"); list.add("ba");
		list.add("bd"); list.add("aa");

		Comparator<String> comparator = (a,b) -> b.compareToIgnoreCase(a);
		Collections.sort(list, comparator);
		int index = Collections.binarySearch(list, "ab", comparator);
		System.out.println(index);	// 2

	}

}
