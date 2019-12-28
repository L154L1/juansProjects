package q2;

class Mammal {
	public Mammal(int age) {
		System.out.println("Mammal");
	}
}

public class Platypus extends Mammal {

	public Platypus() {
//		super(5);
		System.out.println("Platypus");
	}
	public static void main(String[] args) {
		new Mammal(5);
	}
}
