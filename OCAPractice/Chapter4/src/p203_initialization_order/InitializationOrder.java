package p203_initialization_order;

public class InitializationOrder {
	private String name = "Torchie";
	{System.out.println(name);}						// 3rd output, run with new keyword/instantiation
	private static int COUNT = 0;
	static  {System.out.println(COUNT);}			// first output, run before main()
	{COUNT++; System.out.println(COUNT);}			// 4th output, run with new keyword/instantiation
	public InitializationOrder() {
		System.out.println("constructor");			// 5th output, run with new keyword/instantiation
	}

	public static void main(String[] args) {
		System.out.println("read to construct");	// 2nd output
		new InitializationOrder();
	}
}
