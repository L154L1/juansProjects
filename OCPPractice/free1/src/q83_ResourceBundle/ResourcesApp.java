// What is the result?
// A. Compilation fails.
// B. GOODBY_MSG
// C. Hello, everyone!
// D. Goodbye everyone!
// E. HELLO_MSG

// Correct Answer: A

package q83_ResourceBundle;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourcesApp {
	
	public void loadResourceBundle() {
		ResourceBundle resource = ResourceBundle.getBundle("q83_ResourceBundle.Greetings", Locale.US);
		System.out.println(resource.getObject(1));		// needs to pass a string key
//		System.out.println(resource.getObject("HELLO_MSG"));		// works!
//		System.out.println(resource.getString("HELLO_MSG"));		// works!
	}

	public static void main(String[] args) {
		new ResourcesApp().loadResourceBundle();

	}

}
