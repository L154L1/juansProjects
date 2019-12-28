package Test2Q73_StringJoiner;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Program {

	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		strings.add("A");strings.add("B");strings.add("C");
		strings.add("D");strings.add("E");strings.add("F");
		StringJoiner joiner = new StringJoiner(":", "[", "]");
		for(String str : strings){
			joiner.add(str);
		}
		System.out.println(joiner);		// [A:B:C:D:E:F]
		System.out.print(joiner.toString());	// [A:B:C:D:E:F]
	}

}
