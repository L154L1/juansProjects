// In real program, it is common to substitute variables in the middle of a resource bundle string. The convention is to use a number inside brackets such as {0}
// Using MessageClass can substitute a value for the variable.

package p266_variables_in_resource_bundle;

import java.text.MessageFormat;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("p266_variables_in_resource_bundle.Zoo");
		String format = rb.getString("helloByName");
		String formatted = MessageFormat.format(format, "Tammy");
		System.out.print(formatted);

	}

}
