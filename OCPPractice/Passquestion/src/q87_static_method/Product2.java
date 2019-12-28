package q87_static_method;

import java.util.Arrays;
import java.util.List;

public class Product2 {

	String name;
	int qty;
	public String toString() {
		return name;
	}
	public Product2(String name, int qty) {
		this.name = name;
		this.qty = qty;
	}
	static class ProductFilter {
		public boolean isAvailable(Product2 p) {				//line n1
			return p.qty >= 10;
		}
	}

	public static void main(String[] args) {
		ProductFilter f = new ProductFilter();
		
		List<Product2> products = Arrays.asList(
				new Product2("MotherBoard", 5),
				new Product2("Speaker", 20)
				);
		products.stream()
		.filter(f::isAvailable)  //line n2
		//.filter(p -> f.isAvailable(p))
		.forEach(p -> System.out.println(p));

	}


}
