// Interface variables are assumed to be public, static and final.
// compiler will automatically insert them if you miss any of them.
// The compiler will automatically convert CanSwim to the way of CanSwim2. They are equivalent.

package p275_interface_variables;

interface CanSwim {
	int MAXIMUM_DEPTH = 100;
	final static boolean UNDERWATER = true;
	public static final String TYPE = "Submersible";
}

interface CanSwim2 {
	public static final int MAXIMUM_DEPTH = 100;
	public static final boolean UNDERWATER = true;
	public static final String TYPE = "Submersible";
}
