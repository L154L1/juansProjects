package q22;

class Order {
	static String result = "";
	{result += "c";}
	static
	{result += "u";}
	{result += "r";}
}

public class OrderDrive {
	public static void main(String[] args) {
		System.out.print(Order.result + " ");	// static variable and static initializer run before new/instantiation, and only run once
		System.out.print(Order.result + " ");
		new Order();							// instance initializers run with new/instantiation
		new Order();							// instance initializers run again with new/instantiation for new object
		System.out.print(Order.result + " ");
	}
}

// u u ucrcr
