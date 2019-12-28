package p130_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Others {

	public static void main(String[] args) {
		List<String> birds = new ArrayList<>();
		birds.add("hawk");
		birds.add("hawk");
		
		System.out.println(birds.contains("hawk"));		// true
		System.out.println(birds.contains("robin"));	// false
		
		System.out.println(birds.isEmpty());		// false
		System.out.println(birds.size());			// 2
		
		birds.clear();
		
		System.out.println(birds.isEmpty());		// true
		System.out.println(birds.size());			// 0
	}
}
