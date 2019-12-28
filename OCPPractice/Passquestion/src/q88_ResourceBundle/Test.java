// What is the result?

// Answer: A

package q88_ResourceBundle;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		Locale currentLocale = new Locale.Builder().setRegion("FR").setLanguage("fr").build();
		ResourceBundle messages = ResourceBundle.getBundle("q88_ResourceBundle.MessagesBundle", currentLocale);
		Enumeration<String> names = messages.getKeys();
		while(names.hasMoreElements()) {
			String key = names.nextElement();
			String name = messages.getString(key);
			System.out.println(key + " = " + name);
		}

	}

}


//password = Entrez le nom de passe
//username = Entrez le nom d'utilisateur