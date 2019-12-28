// Given that these files exist and are accessible:
// /company/emp/info.txt
// /company/emp/benefits/b1.txt

// Which code fragment can be inserted at line n1 to enable the code to print only /company/emp?
// A. Stream<Path> stream = Files.list (Paths.get (“/company”));
// B. Stream<Path> stream = Files.find(
//    Paths.get (“/company”), 1,
//    (p,b) –> b.isDirectory (), FileVisitOption.FOLLOW_LINKS);
// C. Stream<Path> stream = Files.walk (Paths.get (“/company”));
// D. Stream<Path> stream = Files.list (Paths.get (“/company/emp”));

// Correct Answer: A

package q53_Files_list_find_walk;

import java.util.stream.*;
import java.nio.file.*;

public class Test {

	public static void main(String[] args) throws Exception {	
		
		Stream<Path> stream = Files.list (Paths.get ("C:/temp/company"));		//line n1		A
		// prints - C:\temp\company\emp
		
		//Stream<Path> stream = Files.find(Paths.get ("C:/temp/company"), 1, (p, b) -> b.isDirectory (), FileVisitOption.FOLLOW_LINKS);		//line n1		B
			// prints - C:\temp\companyC:\temp\company\emp
		
		//Stream<Path> stream = Files.walk (Paths.get ("C:/temp/company"));				// line n1 		C
		
		//Stream<Path> stream = Files.list (Paths.get ("C:/temp/company/emp"));			// line n1		D
		
		
		
		
		stream.forEach(s -> System.out.print(s));

	}

}
