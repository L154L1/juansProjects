// p178 - protect access
package pond.swan;

import pond.shore.Bird;

public class Swan extends Bird {
	public void swim() {
		floatInWater();				// inherits superclass member without referring to a variable
		System.out.println(text);	// inherits superclass member without referring to a variable
	}
	
	public void helpOtherSwanSwim() {
		Swan other = new Swan();
		other.floatInWater();			// a member is used thru a variable
		System.out.println(other.text);	// a member is used thru a variable
	}
	
	// Bird is in different package. Using Bird reference isn't inherting from Bird, 
	// so it doesn't get to use protected members.
	public void helpOtherBirdSwim() {
		Bird other = new Bird();
		other.floatInWater();			// does not compile			
		System.out.println(other.text);	// does not compile
	}
}
