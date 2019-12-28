// keys in property files are case sensitive.
// getString(key) - nonexistent key will result in MissingResourceException.

package q5;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		 Locale fr = new Locale("fr");
		 Locale.setDefault(new Locale("en", "US"));
		 ResourceBundle b = ResourceBundle.getBundle("q5.Dolphins", fr);
		 System.out.println(b.getString("name"));		// from Dolphins_fr.properties
		 System.out.println(b.getString("age"));		// from Dolphins.properties

	}

}
