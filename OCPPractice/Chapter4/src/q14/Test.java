package q14;

import java.util.stream.*;
public class Test {

	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(1);
		IntStream is = s.mapToInt(x -> x);
		
		Stream<Integer> s2 = Stream.of(1);
		DoubleStream ds = s2.mapToDouble(x -> x);
		//Stream<Integer> is2 = ds.mapToInt(x -> x);	// doesn't compile
		IntStream is2 = ds.mapToInt(x -> (int)x);
		is2.forEach(System.out::print);

	}

}
