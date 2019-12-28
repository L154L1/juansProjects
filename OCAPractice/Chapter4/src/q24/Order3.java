package q24;

public class Order3 {
	final String value1 = "1";
	static String value2 = "2";
	String value3 = "3";
	{							// Instance initializer can access both instance and static variables.
		value2 = "e";
		value3 = "f";
//		value1 = "d";		// doesn't compile
	}
	static {					// Static initializer can only access static variables.	
		value2 = "h";
	}
}
