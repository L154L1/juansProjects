package p203_initialization_order;

public class YetMoreInitializationOrder {
	static { add(2);}
	static void add(int num) { System.out.print(num + " ");}
	YetMoreInitializationOrder() { add(5); }
	static { add(4); }
	{ add(6); }
	static { new YetMoreInitializationOrder(); }	// calls new to instantiate the object which means we can look at 
													// the instance variables and instance initializers, then constructor.
	{ add(8); }
	
	public static void main(String[] args) {}
}
