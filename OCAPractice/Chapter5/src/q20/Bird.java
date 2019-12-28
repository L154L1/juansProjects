package q20;

public abstract class Bird {
	private void fly() { System.out.println("Bird is flying"); }
	public static void main(String args[]) {
		Bird bird = new Pelican();
		bird.fly();		// Bird is flying
						// with hidden methods, the method used depends on where it is referenced.
	}
}

class Pelican extends Bird {
	protected void fly() { System.out.println("Pelican is flying"); }	// hidden because fly() in superclass is private
}
