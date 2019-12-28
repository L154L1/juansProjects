// Your design requires that:
// - fuelLevel of Engine must be greater than zero when the start () method is invoked.
// - The code must terminate if fuelLevel of Engine is less than or equal to zero.

// Which code fragment should be added at line n1to express this invariant condition?
// A. assert (fuelLevel) : “Terminating…”;
// B. assert (fuelLevel > 0) : System.out.println (“Impossible fuel”);
// C. assert fuelLevel < 0: System.exit(0);
// D. assert fuelLevel > 0: “Impossible fuel” ;

// Answer: D

package q102_assert;

public class Engine {
	double fuelLevel;
	Engine(int fuelLevel) { this.fuelLevel = fuelLevel; }
	public void start() {
		
		//line n1
		
		//assert (fuelLevel) : "Terminating…";		// A - doesn't compile
		//assert (fuelLevel > 0) : System.out.println ("Impossible fuel");		// B - doesn't compile
		//assert fuelLevel < 0: System.exit(0);		// C - doesn't compile
		
		assert fuelLevel > 0: "Impossible fuel" ;	// D - correct answer
		
		System.out.println("Started");
	}
	public void stop() { System.out.println("Stopped"); }

}
