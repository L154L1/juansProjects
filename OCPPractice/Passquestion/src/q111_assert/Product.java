// Give the command:
// java product 0
// What is the result?
// A. An AssertionError is thrown.
// B. A compilation error occurs at line n1
// C. New Price: 0.0
// D. A NumberFormatException is thrown at run time.

// Answer: C

package q111_assert;

public class Product {
	public double applyDiscount(double price) {
		assert (price > 0);		// line n1
		return price * 0.50;
	}

	public static void main(String[] args) {
		Product p = new Product();
		//double newPrice = p.applyDiscount(Double.parseDouble(args[0]));
		double newPrice = p.applyDiscount(Double.parseDouble("0"));
		System.out.println("New Price: " + newPrice);

	}

}

// New Price: 0.0