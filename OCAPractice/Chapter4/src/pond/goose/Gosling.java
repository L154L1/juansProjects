// p177 - protect access
package pond.goose;

import pond.shore.Bird;

public class Gosling extends Bird {
	public void swim() {
		floatInWater();				// calling protected member
		System.out.println(text);	// calling protected member
	}
}
