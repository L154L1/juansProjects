// Two wrappers will always be == when their primitive values are the same :
// - Boolean
// - Byte
// Char from \u0000 to \u007f
// Short and Integer from -128 to 127

// When == is used to compare a primitive to a wrapper, the wrapper will be unwrapped and the comparison will be primitive to primitive. 

package Test1Q27_wrapper_comparison;

public class OCAJP {

	public static void main(String[] args) {
		Integer i1 = 160;
		Integer i2 = 160;
		
		Integer i3 = 10;
		Integer i4 = 10;
		
		System.out.print((i3 == i4) + " " + (i1 == i2));

	}
}

// true false