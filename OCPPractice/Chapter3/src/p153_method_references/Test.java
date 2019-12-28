// p153 Method References
// :: operator tells Java to pass the parameters into the method, even parameter list is empty. If the parameters is not passed from the left side of -> operator, you cannot use method reference.
// The right side of :: is method name. the left side of :: is class or instance.

// There are 4 formats for method references :
// - static method
// - instance method on a particular instance
// - instance method on an instance to be determined at runtime
// - constructors


package p153_method_references;

import java.util.*;
import java.util.function.*;

public class Test {

	public static void main(String[] args) {
		
		// static methods - the left side of :: is class
		Consumer<List<Integer>> methodRef1 = Collections::sort;
		Consumer<List<Integer>> lambda1 = l -> Collections.sort(l);
		
		// instance method on a particular instance - the left side of :: is instance
		String str = "abc";
		Predicate<String> methodRef2 = str::startsWith;
		Predicate<String> lambda2 = s -> str.startsWith(s);
		
		// instance method on an instance to be determined at runtime
		Predicate<String> methodRef3 = String::isEmpty;
		Predicate<String> lambda3 = s -> s.isEmpty();
		
		// constructors - the left side of :: is class
		Supplier<ArrayList> methodRef4 = ArrayList::new;
		Supplier<ArrayList> lambda4 = () -> new ArrayList();	
		
		// If the parameters used by method is not passed from the left side of -> operator, you cannot use method reference.
		List<String> list = new ArrayList<>();
		list.add("Magician");
		list.add("Assisstant");
		list.removeIf(s -> s.startsWith("A"));

	}

}
