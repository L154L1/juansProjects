// Starting with Java 8, we use Optional type to express "we don't know" if a value is available. 
// Think of Optional as a box that might have something in it or might be empty. 
// Similar to C# nullable type, but Optional can have some methods such as ifPresent/isPresent/orElse/orElseGet/orElseThrow we can use to test its value 
// otherwise we need to use if or ternary operator instead. Another advantage is we can chain Optional calls in stream pipeline.

// static methods : 
// Optional.empty()
// Optional.of(value)  - wrap a value to Optional type
// Optional.ofNullable(value)

// instance methods :
// get()
// isPresent()
// ifPresent(Consumer<T> c)
// orElse(T other)
// orElseGet(Supplier<T> s)
// orElseThrow(Supplier<Exception> s)


package p182_Optional_type;

import java.util.Optional;

public class Test {

	public static Optional<Double> avarage(int... scores){
		if(scores.length == 0) return Optional.empty();
		int sum = 0;
		for (int score : scores) sum += score;
		return Optional.of((double)sum/scores.length);
	}
	
	public static void main(String[] args) {
		System.out.println(avarage(90, 100));	// Optional[95.0]
		System.out.println(avarage());			// Optional.empty
		
		//Optional.ofNullable() method is equivalent of a ternary operator expression
		Object value = new Object();
				// do something
		Optional o = Optional.ofNullable(value);	// equivalent to o2
		Optional o2 = value == null ? Optional.empty() : Optional.of(value);
		
		System.out.println();
		
		
		// get()
		// isPresent()
		// ifPresent(Consumer c)
		// orElse(T other)
		// orElseGet(Supplier s)
		// orElseThrow(Supplier s)
		
		Optional<Double> opt1 = avarage(90, 100);
		if(opt1.isPresent()) System.out.println(opt1.get());	// 95.0
		
		Optional<Double> opt2 = avarage();
		if(opt2.isPresent()) System.out.println(opt2.get());	// will not execute
		
		Optional<Double> opt3 = avarage();
		//System.out.println(opt3.get());		// throw NoSuchElementException
		
		Optional<Double> opt4 = avarage(90, 100);
		opt4.ifPresent(System.out::println);	// 95.0
		
		System.out.println();
		
		Optional<Double> opt5 = avarage();
		System.out.println(opt5.orElse(Double.NaN));	// NaN
		System.out.println(opt5.orElseGet(Math::random));	// prints a random double number
		//System.out.println(opt5.orElseThrow(IllegalStateException::new));	// throws IllegalStateException
		//System.out.println(opt5.orElseGet(IllegalStateException::new));  // doesn't compile
		
		System.out.println();
		
		Optional<Double> opt6 = avarage(90, 100);
		System.out.println(opt6.orElse(Double.NaN));						// 95.0
		System.out.println(opt6.orElseGet(Math::random));					// 95.0
		System.out.println(opt6.orElseThrow(IllegalStateException::new));	// 95.0
		
	}

}
