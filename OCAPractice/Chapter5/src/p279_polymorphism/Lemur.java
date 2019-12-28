// A Java object can be accessed using a reference of the same type as the object, 
// a reference that is a superclass of the object, 
// or a reference that is an interface the object implements. 
// A cast is not required if the object is being reassigned to a super type or interface of the object.


package p279_polymorphism;

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
	public static void main(String args[]) {
		Lemur lemur = new Lemur();
		System.out.println(lemur.age);
		
		HasTail hasTail = lemur;
		System.out.println(hasTail.isTailStripped());
		
		Primate primate = lemur;
		System.out.println(primate.hasHair());
	}

}
