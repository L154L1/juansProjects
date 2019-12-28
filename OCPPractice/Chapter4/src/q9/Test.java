package q9;

import java.util.stream.*;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		LongStream ls = LongStream.of(1, 2, 3);
		OptionalLong opt = ls.map(n -> n * 10).filter(n -> n < 5).findFirst();
		
		//if (opt.isPresent()) System.out.println(opt.getAsLong());
		
		opt.ifPresent(System.out::println);

	}

}
