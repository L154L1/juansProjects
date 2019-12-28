// With upper bound or unbounded wildcards, the list becomes logically immutable which means that the object cannot be modified.

package p121_lower_bounded_wildcard;

import java.io.*;
import java.util.*;

public class Test {
	
	// List<? super String> can be List<String>, List<Object> or any other list of parent type of String. It's safe to add a String element to the list.
	public static void addSound(List<? super String> list) {	// lower bound
		list.add("quack");
	}
	
	// List<? extends Object> can be List<anytype> as long as anytype is child type of Object. You cannot add a String element to List<anytype>
	public static void addSound2(List<? extends Object> list) {		// upper bound
		list.add("quack");
	}
	
	// // List<?> can be List<anytype>. You cannot add a String element to List<anytype>
	public static void addSoun3(List<?> list) {		// unbounded
		list.add("quack");
	}
	
	
	
	// Another lower bound example
	public static void test() {
		
		// List<? super IOException> can be List<IOException>, List<Exception>, List<Object>
		List<? super IOException> exceptions = new ArrayList<Exception>();
		exceptions.add(new Exception());	// does not compile. new Exception() cannot fit List<IOException>
		exceptions.add(new IOException());
		exceptions.add(new FileNotFoundException());
	}
	
}
