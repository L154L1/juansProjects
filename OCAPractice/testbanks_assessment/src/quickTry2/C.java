package quickTry2;

import java.util.*;

import quickTry.*;

public class C {

	public static void main(String[] args){
		
		String[] arr = {"Hi", "How", "Are", "You"};
		List<String> arrList = new ArrayList<>(Arrays.asList(arr));
		if(arrList.removeIf((String s)->{return s.length()<=2;})){
			//System.out.print(s + "removed");		// line n1
			System.out.print("removed");
		}
		
		System.out.print(arrList);
		

		
	
	}
}




