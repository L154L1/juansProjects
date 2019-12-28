// Once you have the NumberFormat instance, you can call parse() to turn a String into a number.
// format.parse() returns Number object. Number is the parent class of all the java.lang wrapper classes.
// format.parse() throws checked exception ParseException which must be handled or declared.

package p268_format_parse_numbers_currency;

import java.util.*;
import java.text.*;

public class Parse {

	public static void main(String[] args) {
		NumberFormat en = NumberFormat.getInstance(Locale.US);
		NumberFormat fr = NumberFormat.getInstance(Locale.FRANCE);
		
		String s = "40.45";
		try {
			System.out.println(en.parse(s));		// 40.45
			System.out.println(fr.parse(s));		// 40		// Java cannot parse . with Locale.FRANCE, so returns 40
		} catch(ParseException e) {
			System.out.println("Cannot parse!");
		}
		
		// The parse method parses only the beginning of a string. After it reaches a character that cannot be parsed, the parsing stops and the value is returned.
		NumberFormat nf = NumberFormat.getInstance();
		String one = "456abc";
		String two = "-2.5165x10";
		String three = "x85.3";
		try {
			System.out.println(nf.parse(one));		// 456
			System.out.println(nf.parse(two));		// -2.5165
			System.out.println(nf.parse(three));	// throws ParseException
		} catch (ParseException e) {
			System.out.println("Cannot parse!");
		}
		
		// getCurrencyInstance()
		String amt = "$92,807.99";
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		try {
			double value = (Double)cf.parse(amt);		// cast Number to Double, then automatically unboxed to double.
			System.out.println(value);				// 92807.99
		} catch (ParseException e) {
			System.out.println("Cannot parse!");
		}
		
	}

}
