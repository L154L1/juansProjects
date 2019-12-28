package p209_Optional_with_primitive_streams;

import java.util.*;
import java.util.stream.*;

public class Test {

	public static void main(String[] args) {
		IntStream s = IntStream.rangeClosed(1, 10);
		//IntStream s = IntStream.empty();
		OptionalDouble opt = s.average();
		opt.ifPresent(System.out::println);						// 5.5
		System.out.println(opt.getAsDouble());					// 5.5
		System.out.println(opt.orElseGet(() -> Double.NaN));	// 5.5
		
		LongStream longs = LongStream.of(5, 10);
		long sum = longs.sum();					// sum() method does not return an optional because if you try to add up an empty stream, you simply get zero.
		System.out.println(sum); 
		
		// Unlike object stream, min()/max() for primitive stream don't need to pass a comparator argument.
		IntStream s2 = IntStream.rangeClosed(1, 10);
		System.out.println(s2.min().getAsInt());		//1
		IntStream s3 = IntStream.rangeClosed(1, 10);
		System.out.println(s3.max().getAsInt());		//10
		
		DoubleStream doubles = DoubleStream.generate(() -> Math.PI);
		OptionalDouble min = doubles.min(); 	// runs infinitely


	}

}
