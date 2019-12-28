// Which modification enables the code fragment to print Speaker?
// A. Implement Predicate in the Product.ProductFilterclass and replace line n2 with .filter (p ->
//    p.ProductFilter.test (p))
// B. Replace line n1 with:
//    public static boolean isAvailable (Product p) {
// C. Replace line n2with:
//    .filter (p -> p.ProductFilter: :isAvailable (p))
// D. Replace line n2with:
//    .filter (p -> Product: :ProductFilter: :isAvailable ())

// Answer: B

package q87_static_method;

import java.util.*;

public class Product {
	
	String name;
	int qty;
	public String toString() {
		return name;
	}
	public Product(String name, int qty) {
		this.name = name;
		this.qty = qty;
	}
	static class ProductFilter {
		//public boolean isAvailable(Product p) {				//line n1
		public static boolean isAvailable(Product p) {	// replacement
			return p.qty >= 10;
		}
	}

	public static void main(String[] args) {
		List<Product> products = Arrays.asList(
				new Product("MotherBoard", 5),
				new Product("Speaker", 20)
				);
		products.stream()
		.filter(Product.ProductFilter::isAvailable)  //line n2
		.forEach(p -> System.out.println(p));

	}

}
