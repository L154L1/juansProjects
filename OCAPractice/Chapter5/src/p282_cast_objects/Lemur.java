// 1. Casting an object from a subclass to superclass does not require explicit cast.
// 2. Casting an object from a superclass to subclass requires explicit cast.


package p282_cast_objects;

class Primate {
	public boolean hasHair() {
		return true;
	}
}

interface HasTail {
	public boolean isTailStripped();
}

public class Lemur extends Primate implements HasTail {
	public boolean isTailStripped() {
		return false;
	}
	public int age = 10;
	public static void main(String[] args) {
		Lemur lemur = new Lemur();
		
		Primate primate = lemur;
		Lemur lemur2 = primate;		// does not compile
		
		Lemur lemur3 = (Lemur)primate;
		System.out.println(lemur3.age);
	}
}
