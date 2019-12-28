// Passquestion q26

// Which code fragment, when inserted at line n1, sorts the employees list in descending order of fName and then ascending order of lName?
// A. .sorted (Comparator.comparing(Emp::getfName).reserved().thenComparing(Emp::getlName))
// B. .sorted (Comparator.comparing(Emp::getfName).thenComparing(Emp::getlName))
// C. .map(Emp::getfName).sorted(Comparator.reserveOrder())
// D. .map(Emp::getfName).sorted(Comparator.reserveOrder().map(Emp::getlName).reserved

// Correct Answer: A

package q13_stream_sort;

import java.util.*;
import java.util.stream.*;

public class Emp {
	
	String fName;
	String lName;
	public Emp (String fn, String ln) {
	fName = fn;
	lName = ln;
	}
	
	public String toString() {return fName + " " + lName;}
	public String getfName() { return fName; }
	public String getlName() { return lName; }

	public static void main(String[] args) {
		List<Emp> emp = Arrays.asList (
				new Emp ("John", "Smith"),
				new Emp ("Peter", "Sam"),
				new Emp ("Thomas", "Wale"));
				emp.stream()
				.sorted (Comparator.comparing(Emp::getfName).reversed().thenComparing(Emp::getlName)) //line n1
				//.sorted (Comparator.comparing(Emp::getfName).thenComparing(Emp::getlName))
				.collect(Collectors.toList());
				
		System.out.println(emp);		

	}

}
