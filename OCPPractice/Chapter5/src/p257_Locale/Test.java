package p257_Locale;

import java.util.Locale;

public class Test {

	public static void main(String[] args) {
		Locale locale = Locale.getDefault();
		System.out.println(locale);				// en_US
		
		// Locale class provides constants for some of the most commonly used locales.
		System.out.println(Locale.GERMAN);		// de
		System.out.println(Locale.GERMANY);		// de_DE
		
		// Use constructors to create locales
		System.out.println(new Locale("fr"));		// fr
		System.out.println(new Locale("hi", "IN"));	// hi_IN
		
		// Use Locale.Builder class to create locales
		Locale l1 = new Locale.Builder().setLanguage("en").setRegion("US").build();		// en_US
		Locale l2 = new Locale.Builder().setRegion("US").setLanguage("en").build();		// en_US
		Locale l3 = new Locale.Builder().setRegion("us").setLanguage("EN").build();		// en_US	bad code but Locale.Builder can correct it.
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		
		// Set new default locale. The change only affects that one Java program. It does not change any settings on your computer.
		System.out.println("Default locale: " + Locale.getDefault());		// en_US
		Locale newLocale = new Locale("fr");
		Locale.setDefault(newLocale);
		System.out.println("New default locale: " + Locale.getDefault());	// fr


	}

}
