// p210 Just as there are special streams and optional classes for primitives, there are also special functional interfaces for primitives.
// Table 4.9, Table 4.10 - functional interfaces for primitives

package p211_functional_interfaces_primitives;

import java.util.stream.*;
import java.util.function.*;

public class Test {

	public static void main(String[] args) {
		BooleanSupplier b1 = () -> true;
		BooleanSupplier b2 = () -> Math.random() > .5 ;
		System.out.println(b1.getAsBoolean());
		System.out.println(b2.getAsBoolean());
		
		double d = 1.0;
		DoubleToIntFunction f1 = x -> 1;
		System.out.println(f1.applyAsInt(d));

	}

}
