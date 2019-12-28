// Q. 10  	What statements about the following code are true? (Choose all that apply.)

// Answer : 	The code will not compile because of line q2.

// The problem here is that c2 is a String but c1 is an int, so the code fails to combine on line q2,


package q10;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		System.out.println(Arrays.asList("duck","chicken","flamingo","pelican")
				.parallelStream().parallel() // q1
				.reduce(0,
				(c1, c2) -> c1.length() + c2.length(), // q2
				(s1, s2) -> s1 + s2)); // q3

	}

}
