// Q. 58  	What is true of the following code? 

// The code compiles. Line c1 uses an unbounded wildcard, which means that we cannot add any objects to the list. 
// Line c2 infers the type to be Object based on the diamond operator. So we can add objects to exceptions.

package q58;

import java.util.*;

public class School {
	private List<Object> exceptions;
	private List<?> names = new ArrayList<Object>();	// c1
	public School() {
		exceptions = new LinkedList<>();				// c2
	}
}
