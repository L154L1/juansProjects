package Test1Q11_inherit_interface_variables;

public class Program implements Face {

	public static void main(String[] args) {
		System.out.print(s);	// s is inherited from interface Face, so without interface name or reference variable will not cause problem.
		System.out.print(Face.value);
		
		byte b = -128;
		short t = 1280;
		
	}
}

interface Face{
	static int value = 11;
	String s = "Value is: ";
}