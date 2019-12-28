// Q. 60  	Assuming the current directory is /home and the directories and files referenced by the program exist, what is true about the following code snippet? (Choose all that apply.)
// Answer -
// C.	It will access the file /home/habitat/party.txt.
// E.	If the String value ,hat, is contained within the file, it will definitely print false.


// First, we need to know what path2 resolves to. The value path1.subpath(1,4) returns habitat/./party.txt, which we join to the current directory /home with the toAbsolutePath() method in order to see that we are accessing the file /home/habitat/party.txt.
// Next, the code returns true if all of the non-empty strings separated by commas are greater than three characters long. That means a value of ,,, may still return true, since all of the empty strings are filtered out, 
// The value ,hat, on the other hand, is definitely not greater than three characters, and it will cause the result to be false.

package q60;

import java.util.stream.*;
import java.nio.file.*;
import java.io.*;

public class Test {

	public static void main(String[] args) throws IOException {
		Path path1 = Paths.get("/lemur/habitat/./party.txt");
		Path path2 = path1.subpath(1,4).toAbsolutePath();
		
		//System.out.println(path2);
		
		System.out.println(Files.lines(path2)
		.flatMap(p -> Stream.of(p.split(",")))
		.filter(s -> s.trim().length()>0)
		.allMatch(s -> s.length()>3));

	}

}
