package q16;

import java.time.*;

public class Test {

	public static void main(String[] args) {
		String d = Duration.ofDays(1).toString();
		String p = Period.ofDays(1).toString();
		
		System.out.println(d);		// PT24H
		System.out.println(p);		// P1D

		boolean b1 = d == p;
		boolean b2 = d.equals(p);
		System.out.println(b1 + " " + b2);	// false false

	}

}
