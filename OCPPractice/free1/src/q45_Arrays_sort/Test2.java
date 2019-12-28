package q45_Arrays_sort;

import java.util.Arrays;

class CheckClass2 {
	
	public int checkValue (String s1, String s2) {
		return s1.length() - s2.length();
	}
}

public class Test2 {

	public static void main(String[] args) {
				
		String[] strArray = new String [] {"Tiger", "Rat", "Cat", "Lion"};
		
		CheckClass2 chk = new CheckClass2();
		Arrays.sort(strArray, chk::checkValue); //line n1
		
		for (String s : strArray) {
			System.out.print (s + " ");		// Rat Cat Lion Tiger 
		}

	}

}
