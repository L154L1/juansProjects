// Q. 37  	Which of the following changes must be made in order for the following code to print out 2? (Choose all that apply.)

// Answer : 
// E.	Override equals()
// F.	Override hashCode()

// HashSet groups elements into buckets using the hash code. If elements have the same hash code, it then calls equals().

package q37;

import java.util.*;

public class Panda {

	String name;
	Panda(String name) { this.name = name; }

	public static void main(String[] args) {
	Set s = new HashSet<>();
	s.add(new Panda("Bao Bao"));
	s.add(new Panda("Mei Xiang"));
	s.add(new Panda("Bao Bao"));
	System.out.println(s.size());
	}

}
