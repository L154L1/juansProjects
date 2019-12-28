// Q17 - Assuming the current directory is /animals/cute, which are possible results of executing the following code? 
// A.	It compiles but may throw an exception at runtime.
// G.	It prints all .java files in the root directory tree.
// E.	It prints all .java files in the /animals directory tree.		(book is wrong)
// F.	It prints all .java files in the /animals/cute directory tree.	(book is wrong)

// The code compiles without issue.
// The first line actually resolves to the root path since .. and getParent()are conceptually equivalent. 
// It may encounter a file that it does not have access to read, which is common when trying to read an entire file system.

package q17;
import java.nio.file.*;
import java.io.*;
import java.util.stream.*;
public class Test {

	public static void main(String[] args) throws IOException {
		
		//System.out.println(Paths.get("..").toRealPath().getParent());	// C:\OCP	(eclipse workspace is C:\OCP\OCPPractice)
		
		Files.walk(Paths.get("..").toRealPath().getParent()) // u1		// C:\OCP
		.map(p -> p.toAbsolutePath().toString()) // u2
		.filter(s -> s.endsWith(".java") && s.contains("forCharpter9")) // u3
		.collect(Collectors.toList())
		.forEach(System.out::println);

	}

}
