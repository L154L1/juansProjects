// What is the result?

// Answer: D. true false

package q94_equals;

public class Product {
	String pname;
	public Product(String pname) {
		this.pname = pname;
	}

	public static void main(String[] args) {
		Product p1 = new Product("PowerCharger");
		Product p2 = p1;
		System.out.println(p1.equals(p2));			//true
		Product p3 = new Product("PowerCharger");
		System.out.println(p1.equals(p3));			//false
	}

}
