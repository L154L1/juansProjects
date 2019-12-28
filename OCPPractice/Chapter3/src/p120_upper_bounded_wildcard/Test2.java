// When working with upper bound or unbounded wildcards, the list becomes logically immutable which means that the object cannot be modified.
// In below example, List<? extends Bird> could be List<Bird> or List<Sparrow> or some other child types of Bird that haven't been written yet.
// You cannot add a Bird to List<Sparrow>. And you cannot add a Sparrow to List<Bird>. Hence they don't compile.

package p120_upper_bounded_wildcard;

import java.util.*;
public class Test2 {
	
	static class Sparrow extends Bird {}
	static class Bird {}

	public static void main(String[] args) {
		List<? extends Bird> birds = new ArrayList<Bird>();
		birds.add(new Bird());
		birds.add(new Sparrow());
		
		List<?> keywords = new ArrayList<String>();
		keywords.add("java");
		
		
		// only compile with specified type
		List<Bird> birds2 = new ArrayList<Bird>();
		birds2.add(new Bird());
		
		List<String> keywords2 = new ArrayList<String>();
		keywords2.add("java");
	}

}
