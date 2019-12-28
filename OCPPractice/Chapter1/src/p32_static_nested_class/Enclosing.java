package p32_static_nested_class;

public class Enclosing {
	
	static class Nested{
		private int price = 6;
		private static int price2 = 10;
	}
	
	public static void main(String[] args) {
		Nested nested = new Nested();
		System.out.println(nested.price);
		System.out.println(Nested.price2);
	}

}
