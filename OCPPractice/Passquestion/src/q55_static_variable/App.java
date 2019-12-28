// What is the result?

// Answer: D. 4

package q55_static_variable;

class Customer {
	private String fName;
	private String lName;
	private static int count;
	public Customer(String first, String last) {
		fName = first;
		lName = last;
		++count;
	}
	static { count = 0;}
	public static int getCount() { return count; }
}

public class App {

	public static void main(String[] args) {
		Customer c1 = new Customer("Larry", "Smith");
		Customer c2 = new Customer("Pedro", "Gonzales");
		Customer c3 = new Customer("Penny", "Jones");
		Customer c4 = new Customer("Lars", "Svenson");
		c4 = null;
		c3 = c2;
		System.out.println(Customer.getCount());	// 4
	}

}
