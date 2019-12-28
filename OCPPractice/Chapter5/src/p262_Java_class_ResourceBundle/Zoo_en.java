// To implement a Java class resource bundle, you create a class with the same name that you would use for a property file. Only the extension is .java rather than .properties file. 
// And in the Java class, you must implement the getContents() method of ListResourceBundle abstract class.

package p262_Java_class_ResourceBundle;

import java.util.*;

public class Zoo_en extends ListResourceBundle {
	protected Object[][] getContents(){
		return new Object[][] {
			{"hello", "Hello"},
			{"open", "The zoo is open"}
		};
	}

}
