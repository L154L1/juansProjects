// Once the object has been assigned to a new reference type, 
// only the methods and variables available to that reference type are callable on the object.

package p279_polymorphism;

public class Lemur2 extends Primate implements HasTail {
	public boolean isTailStripped() {
		return false;
	}
	public int age = 10;
	public static void main(String[] args) {
		Lemur lemur = new Lemur();
		
		HasTail hasTail = lemur;
		System.out.println(hasTail.age);
		
		Primate primate = lemur;
		System.out.println(primate.isTailStripped());
	}
}

