// From HayStorage example, we can also put instantiation in a static block.
// the static block allows additional steps to be taken to set up the singleton after it has been created. 
// Also allows us to handle exceptions thrown by the constructor.

package p77_singleton;

//Instantiation using a static block
public class StaffRegister {
	
	private static final StaffRegister instance;

	static {
		instance = new StaffRegister();
		// perform additional steps
	}
	
	private StaffRegister() {}
	
	public static StaffRegister getInstance() {
		return instance;
	}
	
	// Data access methods ...
}
