package p182_check_functional_interfaces;

import java.util.function.*;

public class Test {

	public static void main(String[] args) {
		Function<List<String>> ex1 = x -> x.get(0);		// missing return type in the parameter list of Function
		UnaryOperator<Long> ex2 = (Long l) -> 3.14;		// returned value 3.14 is not type Long. It's double
		Predicate ex3 = String::isEmpty;				// missing generic for Predicate

	}

}
