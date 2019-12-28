package q45;

public class FruitStore {
	
	enum Fruit {
		APPLE("red"), BANANA("yellow"), ORANGE("orange"), PLUM("purple");
		private Fruit(String color) { this.color = color; }
		public String color;
		}

	public static void main(String[] args) {
		Fruit one = Fruit.PLUM;
		
		System.out.println("a " + one + " is " + one.color);	// a PLUM is purple

	}

}
