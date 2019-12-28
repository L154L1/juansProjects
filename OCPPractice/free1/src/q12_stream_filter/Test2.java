package q12_stream_filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

@FunctionalInterface
interface CourseFilter2 extends Predicate<String> {
	public boolean test(String str);
}

public class Test2 {

	public static void main(String[] args) {
		List<String> strs = Arrays.asList("Java", "Java EE", "Java ME");
		Predicate<String> cf1 = s -> s.length() > 3;
		
//		Predicate cf2 = new CourseFilter2() { // implement interface using anonymous class. This compiles with raw Predicate.
//			public boolean test (String s) {	
//				return s.contains ("Java");
//			}
//		};
		
		Predicate cf2 = (String s) -> s.contains ("Java");		// doesn't compile
		//Predicate<String> cf2 = (String s) -> s.contains ("Java");		// this works.
		
		long c = strs.stream()
		.filter(cf1)
		.filter(cf2) //line n2
		.count();
		System.out.println(c);		// 3

	}

}
