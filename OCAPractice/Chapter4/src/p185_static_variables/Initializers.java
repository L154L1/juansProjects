package p185_static_variables;
import java.util.*;
public class Initializers {
	
	private static final int NUM_BUCKETS = 45;
	private static final ArrayList<String> values = new ArrayList<>();
	
	public static void main(String[] args) {
		NUM_BUCKETS = 5;		// try to change static final variable (constant)
		
		values.add("changed");	// values is a reference variable. We are allowed to call methods on reference variables. 
								// The compiler just checks that we don't try to reassign the final values to point to a different object.
	}

}
