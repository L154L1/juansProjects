// What is the result?
// A. TV Price :1100 Refrigerator Price :2100
// B. A compilation error occurs.
// C. TV Price :1000 Refrigerator Price :2000
// D. The program prints nothing.

// Correct Answer: A

package q76_Consumer;

import java.util.*;
import java.util.function.*;

public class Product {
	String name;
	Integer price;
	Product(String name, Integer price){
		this.name = name;
		this.price = price;
	}
	public void printVal() { System.out.print(name + " Price:" + price + " ");}
	public void setPrice(int price) { this.price = price; }
	public Integer getPrice() { return price; }

	public static void main(String[] args) {
		List<Product> li = Arrays.asList(new Product("TV", 1000), new Product("Refrigerator", 2000));
		Consumer<Product> raise = e -> e.setPrice(e.getPrice() + 100);
		li.forEach(raise);
		li.stream().forEach(Product::printVal);		
		//li.stream().forEach(e -> e.printVal());

	}

}

// TV Price:1100 Refrigerator Price:2100 