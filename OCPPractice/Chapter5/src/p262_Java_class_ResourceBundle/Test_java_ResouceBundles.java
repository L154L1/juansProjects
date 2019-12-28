// ResourceBundle.getBundle("class name", locale), like with property file, class name must specify the name of the package before the name of the class name.

package p262_Java_class_ResourceBundle;

import java.util.*;

public class Test_java_ResouceBundles {

	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("p262_Java_class_ResourceBundle.Zoo", Locale.US);
		System.out.println(rb.getObject("tax"));
		//System.out.println(rb.getString("tax"));	// throws ClassCastException
		
		ResourceBundle rb2 = ResourceBundle.getBundle("p262_Java_class_ResourceBundle.Zoo", Locale.ENGLISH);
		System.out.println(rb.getObject("hello"));
		System.out.println(rb.getObject("open"));
		
//		System.out.println(rb.getString("hello"));	// also works
//		System.out.println(rb.getString("open"));	// also works
	}

}
