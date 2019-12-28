// Which statement can be inserted into line n1 to print 1,2; 1,10; 2,20;?
// A. BiConsumer<Integer, Integer> c = (i, j) -> {System.out.print (i + “,” + j+ “; “);};
// B. BiFunction<Integer, Integer, String> c = (i, j) –> {System.out.print (i + “,” + j+ “; “)};
// C. BiConsumer<Integer, Integer, String> c = (i, j) –> {System.out.print (i + “,” + j+ “; “)};
// D. BiConsumer<Integer, Integer, Integer> c = (i, j) –> {System.out.print (i + “,” + j+ “; “);};

// Correct Answer: A

package q49_Map_BiConsumer;

import java.util.*;
import java.util.function.*;

public class Test {

	public static void main(String[] args) {
		Map<Integer, Integer> mVal = new HashMap<>();
		mVal.put(1, 10);
		mVal.put(2, 20);
		BiConsumer<Integer,Integer> c = (i, j) -> {System.out.print (i + "," + j+ "; ");};
		c.accept(1, 2);
		mVal.forEach(c);

	}

}

//1,2; 1,10; 2,20;
