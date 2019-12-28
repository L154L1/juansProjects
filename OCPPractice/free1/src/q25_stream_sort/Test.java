// Passquestion q42

// What is the result?
// A. 100, Robin, HR
//    101, Peter, HR
// B. A compilation error occurs at line n1.
// C. 100, Robin, HR
//    101, Peter, HR
//    200, Mary, AdminServices
// D. 100, Robin, HR
//    200, Mary, AdminServices
//    101, Peter, HR

// Correct Answer: A

package q25_stream_sort;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		List<String> empDetails = Arrays.asList("100, Robin, HR",
				"200, Mary, AdminServices",
				"101, Peter, HR");
				empDetails.stream()
				.filter(s-> s.contains("1"))
				.sorted()
				.forEach(System.out::println); //line n1

	}

}

//100, Robin, HR
//101, Peter, HR
