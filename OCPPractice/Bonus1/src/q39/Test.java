// Q39 : Which of the following can fill in the blank so that the code prints out false?

// allMatch / anyMatch / findAny / findFirst / noneMatch

package q39;

import java.util.stream.*;

public class Test {

	public static void main(String[] args) {
		Stream<String> s = Stream.generate(()->"");
		boolean match = s.noneMatch(String::isEmpty);
		System.out.println(match);		// false

	}

}
