//Java handles the logic of picking the best available resource bundle for a given key. It tries to find the most specific value. When there is a tie, Java class resource bundles are given preference. p264 - Table 5.7
//- Always look for the property file after the matching Java class.
//- Drop one thing at a time if there are no matches. First drop the country and then the language.
//- Look at the default locale and the default resource bundle last.
//- p265 Java isn't required to get all the keys from the same resource bundle. It can get them from any parent of the matching resource bundle. A parent resource bundle in the hierarchy just removes components of the name until it gets to the top.

package p265_pick_resource_bundles;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		Locale locale = new Locale("en", "CA");
		ResourceBundle rb = ResourceBundle.getBundle("p265_pick_resource_bundles.Zoo", locale);
		System.out.print(rb.getString("hello"));
		System.out.print(". ");
		System.out.print(rb.getString("name"));
		System.out.print(". ");
		System.out.print(rb.getString("open"));
		System.out.print(". ");
		System.out.print(rb.getString("visitor"));
	}

}
