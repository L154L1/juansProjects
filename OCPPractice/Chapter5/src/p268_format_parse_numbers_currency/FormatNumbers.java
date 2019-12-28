package p268_format_parse_numbers_currency;

import java.util.*;
import java.text.*;

public class FormatNumbers {

	public static void main(String[] args) {
		int attendeesPerYear = 3_200_000;
		int attendeesPerMonth = attendeesPerYear/12;
		
		NumberFormat us = NumberFormat.getInstance(Locale.US);					
		System.out.println(us.format(attendeesPerMonth));						// 266,666
		NumberFormat g = NumberFormat.getInstance(Locale.GERMANY);				
		System.out.println(g.format(attendeesPerMonth));						// 266.666
		NumberFormat ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);		
		System.out.println(ca.format(attendeesPerMonth));						// 266 666
		
		double price = 48;
		NumberFormat usd = NumberFormat.getCurrencyInstance(Locale.US);			
		System.out.println(usd.format(price));									// $48.00
		NumberFormat gd = NumberFormat.getCurrencyInstance(Locale.GERMANY);		
		System.out.println(gd.format(price));									// 48,00 €
		NumberFormat fr = NumberFormat.getCurrencyInstance(Locale.UK);			
		System.out.println(fr.format(price));									// £48.00

	}

}
