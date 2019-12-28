// In addition to ResourceBundle, Java supports a class named Properties. It is like a Map. 
// It has methods : 
	// put(key, value)
	// getProperty(key)
	// getProperty(key, defaultValue) - if the key/property doesn't exist, use default value.
	// get(key)


package p259_propery_file_ResourceBundle;

import java.util.*;

public class Test_Properties {

	public static void main(String[] args) {
		Locale us = new Locale("en", "US");
		ResourceBundle rb = ResourceBundle.getBundle("p259_propery_file_ResourceBundle.Zoo", us);
		
		Properties props = new Properties();
		rb.keySet().stream().forEach(k -> props.put(k, rb.getString(k)));
		
		System.out.println(props.getProperty("name"));					// Vancouver Zoo
		System.out.println(props.getProperty("notAProperty"));			// null
		System.out.println(props.getProperty("notAProperty", "123"));	// 123
		
		//System.out.println(props.get("notAProperty"));		// null
		
		// print out all values
		props.keySet().stream().map(k -> props.get(k)) .forEach(System.out::println);

	}

}
