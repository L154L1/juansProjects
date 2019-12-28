// Which class definition compiles?

// Answer : B

package q55_inner_class;


// A.
class Vehicle {
	int id;
	public void start() {
		public class Engine { int eNo = id; }
	}
}

// B.
class Computer {
	private Card sCard = new SoundCard();
	private abstract class Card {}
	private class SoundCard extends Card {}
}

// C.
class Block {
	int bno;
	static class Counter {
		int locator;
		Counter() { locator = bno;}
	}
}

// D.
class Product {
	interface Moveable { void move();}
	Moveable mProduct = new Moveable() {
		void move() {}
	};
}
