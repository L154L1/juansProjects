// What is the result?
// A. 2 : 30
// B. 4 : 0
// C. 4 : 70
// D. 4 : 60
//	  2 : 30
//    3 : 20
//    1 : 10
// E. The program prints nothing.

//Answer: C

package q19_stream_reduce;

import java.util.*;

public class Product {
	
	int id; int price;
	public Product (int id, int price) {
	this.id = id;
	this.price = price;
	}
	public String toString() { return id + ":" + price; }

	public static void main(String[] args) {
		
		/* Arrays.asList(...) causes UnsupportedOperationException to products.add(p); */
//		List<Product> products = Arrays.asList(new Product(1, 10),
//				new Product (2, 30),
//				new Product (2, 30));
	
		List<Product> products = new ArrayList<>();
		products.add(new Product(1, 10));
		products.add(new Product(2, 30));
		products.add(new Product(2, 30));
		
		
				Product p = products.stream().reduce(new Product (4, 0), (p1, p2) -> {
					p1.price += p2.price;
					return new Product (p1.id, p1.price);});
				
				//System.out.println(p);	// 4:70
				
				products.add(p);
				products.stream().parallel()
				.reduce((p1, p2) -> p1.price > p2.price ? p1 : p2)
				.ifPresent(System.out::println);	// 4:70

	}

}
