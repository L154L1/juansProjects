// ResourceBundle.getBundle("property filename", locale), property filename must specify the name of the package before the name of the property file.

// keys in property files are case sensitive.
// getString(key) - nonexistent key will result in MissingResourceException.

package p259_propery_file_ResourceBundle;

import java.util.*;

public class Test_rb_keySet {

	public static void main(String[] args) {
		
		Locale us = new Locale("en", "US");
		ResourceBundle rb = ResourceBundle.getBundle("p259_propery_file_ResourceBundle.Zoo", us);
		
		Set<String> keys = rb.keySet();
		keys.stream().map(k -> k + " - " + rb.getString(k)).forEach(System.out::println);

	}

}
