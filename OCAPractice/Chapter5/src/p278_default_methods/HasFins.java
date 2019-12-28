// when a interface extends another interface, it may :
// - it may ignore the default method, in which case the default implementation for the method will be used.
// - it may override the definition of the default method using the standard rules of method overriding. 
// - it may redeclare the method as abstract requiring classes that implement the new interface to explicitly provide the method body.


package p278_default_methods;

interface HasFins {
	public default int getNumberOfFins() {
		return 4;
	}
	public default double getLongestFinLength() {
		return 20.0;
	}
	public default boolean doFinsHaveScales() {
		return true;
	}
}

interface SharkFamily extends HasFins {
	public default int getNumberOfFins() {
		return 8;
	}
	public double getLongestFinLength();
	
	public boolean doFinsHaveScales() {		// abstract method cannot have a body
		return false;
	}
}
