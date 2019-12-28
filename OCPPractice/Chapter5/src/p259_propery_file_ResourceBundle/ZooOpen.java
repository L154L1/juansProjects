// ResourceBundle.getBundle("property filename", locale), property filename must specify the name of the package before the name of the property file.

package p259_propery_file_ResourceBundle;

import java.util.*;
public class ZooOpen {

	public static void main(String[] args) {
		Locale us = new Locale("en", "US");
		Locale france = new Locale("fr", "FR");
		
		printProperties(us);
		printProperties(france);

	}
	
	public static void printProperties(Locale locale) {
		ResourceBundle rb = ResourceBundle.getBundle("p259_propery_file_ResourceBundle.Zoo", locale);
		System.out.println(rb.getString("hello"));
		System.out.println(rb.getString("open"));
	}

}
