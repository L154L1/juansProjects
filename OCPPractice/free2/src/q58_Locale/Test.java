// Given :
// MessagesBundle.properties file :
// inquiry = How are you?

// MessagesBundle_de_DE.properties file :
// inquiry = Wie geht's

// Which two code fragments, when inserted at line 1 independently, enable the code to print “Wie geht’s?”
// A. currentLocale = new Locale (“de”, “DE”);
// B. currentLocale = new Locale.Builder ().setLanguage (“de”).setRegion (“DE”).build();
// C. currentLocale = Locale.GERMAN;
// D. currentlocale = new Locale();
//    currentLocale.setLanguage (“de”);
//    currentLocale.setRegion (“DE”);
// E. currentLocale = Locale.getInstance(Locale.GERMAN,Locale.GERMANY);

// Correct Answer: A B


package q58_Locale;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		Locale currentLocale;
		
		currentLocale = new Locale ("de", "DE");		// A.
		//currentLocale = new Locale.Builder ().setLanguage ("de").setRegion ("DE").build();	// B.
		
		//currentLocale = Locale.GERMAN;		// C. output - How are you?
		
		ResourceBundle messages = ResourceBundle.getBundle("q58_Locale.MessagesBundle", currentLocale);
		System.out.println(messages.getString("inquiry"));

	}

}
