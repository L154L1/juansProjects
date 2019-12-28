// Passquestion 108

// What is the result?
// A. $15.00
// B. 15 $
// C. USD 15.00
// D. USD $15

// Answer: A

package q68_NumberFormat;

import java.text.NumberFormat;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		double d = 15;
		Locale l = new Locale("en", "US");
		NumberFormat formatter = NumberFormat.getCurrencyInstance(l);
		System.out.println(formatter.format(d));	// $15.00


	}

}
