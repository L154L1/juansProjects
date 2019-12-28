package p20_initialization_order;

public class Egg {
	public Egg() {
		number = 5;
	}
	public static void main(String[] args) {
		Egg egg = new Egg();
		System.out.println(egg.number);		// 5
	}
	private int number = 3;
	{ number = 4; }
}
