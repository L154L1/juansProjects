package q20;

public abstract class Bird2 {

	void fly() { System.out.println("Bird is flying"); }
	public static void main(String[] args) {
		Bird2 bird = new Pelican2();
		bird.fly();		// Pelican is flying
						// with overridden methods, the method used depends on the object type.
	}
}

class Pelican2 extends Bird2 {
	protected void fly() { System.out.println("Pelican is flying"); }	// overridden
}
