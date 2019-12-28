package pond.duck;

import pond.goose.Goose;

public class GooseWatcher {
	public void watch() {
		Goose goose = new Goose();
		goose.floatInWater();	// GooseWatcher is no in the same package as Bird, 
								// nor does it extends Bird 		
	}
}
