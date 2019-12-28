// MissingResourceException will be thrown if no resource bundle can be found.

package p259_propery_file_ResourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

public class Test_rb_keySet2 {

	public static void main(String[] args) {
		Locale newLocale = new Locale("de");
		Locale.setDefault(newLocale);
		Locale de = new Locale("de", "DE");
		ResourceBundle rb = ResourceBundle.getBundle("p259_propery_file_ResourceBundle.Zoo", de); // throws java.util.MissingResourceException
		
		Set<String> keys = rb.keySet();
		keys.stream().map(k -> k + " - " + rb.getString(k)).forEach(System.out::println);

	}

}
