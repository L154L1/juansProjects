// static variable i takes default value null.
// At line of printing, try to invoke toString() method of the Integer.

package Test2Q23;

public class Program {
	static Integer i;	// initial value null
	public static void main(String[] args) {
		int i = 4;
		System.out.println(i + Program.i);

	}
}

// NullPointerException is thrown