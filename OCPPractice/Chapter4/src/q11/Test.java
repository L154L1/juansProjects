package q11;

import java.util.stream.*;

public class Test {

	public static void main(String[] args) {
		
		//What changes need to be made for this code to print the string 12345? (Choose all that apply.)
		// Stream.iterate(1, x -> x++).limit(5).map(x -> x).collect(Collectors.joining());
		
		
		// Correction :
		System.out.println(Stream.iterate(1, x -> ++x).limit(5).map(x -> ""+x).collect(Collectors.joining()));

	}

}
