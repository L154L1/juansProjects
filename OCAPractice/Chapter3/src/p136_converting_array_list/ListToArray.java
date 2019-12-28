package p136_converting_array_list;

import java.util.List;
import java.util.ArrayList;

public class ListToArray {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("hawk");
		list.add("robin");
		
		Object[] objects = list.toArray();
		System.out.println(objects.length);		// 2
		
		String[] strings = list.toArray(new String[0]);		// Specifying a size of 0 will make Java create a new array of the proper size to fit the list.
		System.out.println(objects.length);		// 2
		
		String[] strings2 = list.toArray(new String[list.size()]);		// you can also suggest a larger size such of the size of the list.
		System.out.println(objects.length);		// 2			
	}
}
