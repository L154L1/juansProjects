// Both min() and max() are terminal operations for stream which means anyone of them will destroy stream once called. 
// That's why we use summary statistics class. First convert stream to summary statistics object, so we can call getMin(), getMax() against the same object.

package p210_primitive_summary_statistics;

import java.util.stream.*;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		IntStream ints = IntStream.rangeClosed(1, 10);
		IntSummaryStatistics stats = ints.summaryStatistics();
		if(stats.getCount() == 0) throw new RuntimeException();
		System.out.println(stats.getMax() - stats.getMin());			//9


	}

}
