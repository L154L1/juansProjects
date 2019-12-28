package p213_stream_linked_to_data;

import java.util.stream.*;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		List<String> cats = new ArrayList<>();
		cats.add("Annie");
		cats.add("Ripley");
		Stream<String> s = cats.stream();		// Because streams are lazily evaluated, it isn't actually created until the stream pipeline actually runs.
												// Here an object is created that knows where to look for the data when it is needed.
		cats.add("KC");
		System.out.println(s.count());		// 3

	}

}
