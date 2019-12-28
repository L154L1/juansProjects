// A Supplier is often used when constructing new objects.

package p174_implement_Supplier;

import java.util.*;
import java.util.function.*;
import java.time.*;

public class Test {

	public static void main(String[] args) {
		Supplier<LocalDate> s1 = LocalDate::now;			// use method reference
		Supplier<LocalDate> s2 = () -> LocalDate.now();		// equivalent lambda of above method reference
		
		LocalDate d1 = s1.get();
		LocalDate d2 = s2.get();
		
		System.out.println(d1);
		System.out.println(d2);
		
		Supplier<StringBuilder> s3 = StringBuilder::new;
		Supplier<StringBuilder> s4 = () -> new StringBuilder();
		System.out.println(s3.get());
		System.out.println(s4.get());
		
		Supplier<ArrayList<String>> s5 = ArrayList<String>::new;
		System.out.println(s5.get());
	}

}
