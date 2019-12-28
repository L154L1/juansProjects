// If we omit setter in encapsulated class, it becomes immutable. 
// But we still want the caller to be able to specify the initial value - we just don't want it to change after the object is created - use constructor.

package p207_immutable_class;

public class ImmutableSwan {
	private int numberEggs;
	
	public ImmutableSwan(int numberEggs) {
		this.numberEggs = numberEggs;
	}
	
	public int getNumberEggs() {
		return numberEggs;
	}	
}
