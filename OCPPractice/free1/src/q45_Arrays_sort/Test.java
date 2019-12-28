//Which code fragment should be inserted at line n1 to enable the code to print Rat Cat Lion Tiger?
//A. Arrays.sort(strArray, CheckClass::checkValue);
//B. Arrays.sort(strArray, (CheckClass::new) :: checkValue);
//C. Arrays.sort(strArray, (CheckClass::new).checkValue);
//D. Arrays.sort(strArray, CheckClass::new :: checkValue);

//Correct Answer: A

package q45_Arrays_sort;

import java.util.*;

//import static q45_Arrays_sort.CheckClass.*;

class CheckClass {
	public static int checkValue (String s1, String s2) {
		return s1.length() - s2.length();
	}

}

public class Test {

	public static void main(String[] args) {
		
		String[] strArray = new String [] {"Tiger", "Rat", "Cat", "Lion"};
		
		Arrays.sort(strArray, CheckClass::checkValue); //line n1
		//Arrays.sort(strArray, (s1, s2) -> CheckClass.checkValue(s1, s2));		// equivalent of above
		
		for (String s : strArray) {
			System.out.print (s + " ");		// Rat Cat Lion Tiger 
		}

	}
	
}
