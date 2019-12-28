package p134_wrapper_classes;

import java.util.List;
import java.util.ArrayList;

public class AutoBoxing {

	public static void main(String[] args) {
		List<Double> weights = new ArrayList<>();
		weights.add(50.5);			// boxed to Double
		weights.add(new Double(60));
		weights.remove(50.5);		// boxed to Double
		System.out.println(weights);		// [60.0]
		double first = weights.get(0);	// unboxed to double
		System.out.println(first);			// 60.0
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);			// boxed to Integer
		numbers.add(2);			// boxed to Integer
		numbers.remove(1);		// will not auto box, instead, 1 is passed as index parameter to remove an element.
		System.out.println(numbers);		// [1]
		
		List<Integer> numbers2 = new ArrayList<>();
		numbers2.add(1);			// boxed to Integer
		numbers2.add(2);			// boxed to Integer
		numbers2.remove(new Integer(1));		
		System.out.println(numbers2);		// [2]
		
		
		List<Integer> heights = new ArrayList<>();
		heights.add(null);
		Integer h2 = heights.get(0);
		System.out.println(h2);
		
		int h = heights.get(0);		// throws NullPointerException when autoboxing Integer to int.
	}
}
