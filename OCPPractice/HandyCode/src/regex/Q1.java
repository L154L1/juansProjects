// Can you write a regular expression to check if String is a number?

package regex;

import java.util.regex.*;
public class Q1 {

	public static void main(String[] args) {
		q1();
		q2();
	}
	
	// Regular expression in Java to check if String is number or not
	private static void q1() {
		Pattern pattern = Pattern.compile("[0-9]*.[0-9]*");
		
		String[] inputs = {"123", "-123" , "123.12", "abcd123"};
		
		for(String input : inputs) {
			System.out.println(input + " is number : " + pattern.matcher(input).matches());
		}
	}
	
	// Regular expression in java to check if String is 6 digit number or not
	private static void q2() {
		Pattern pattern = Pattern.compile("\\d{6}");
		String [] numbers = {"123", "1234" , "123.12", "abcd123", "123456"};
		
		for(String number : numbers) {
			System.out.println(number + " is 6 digit number : " + pattern.matcher(number).matches());
			
		}
	}

}
