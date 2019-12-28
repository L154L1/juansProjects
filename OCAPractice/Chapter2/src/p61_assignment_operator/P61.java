// Smaller data types, namely byte, short, and char, are first promoted to int any time they are used with binary arithmetic operator.
// Assign larger data type to smaller data type - needs to explicitly cast

package p61_assignment_operator;

public class P61 {

	public static void main(String[] args) {
		short x = 10;
		short y = 3;
		short z = x * y;
		
		short z2 = (short)(x * y);
	}
}
