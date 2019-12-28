// Immutable classes in Java are final. 
// Final classes cannot have subclasses.

package p104_final_immutable;

final class Immutable {
	private String s = "name";
	public String getS() { return s; }
}

class Mutable extends Immutable {}
