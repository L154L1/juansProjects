// Passquestion q80

//Assume that the ready method of the BufferedReader, when called on a closed BufferedReader, throws an exception, and employee.txt is accessible and contains
//valid text.
//What is the result?
//A. A compilation error occurs at line n3.
//B. A compilation error occurs at line n1.
//C. A compilation error occurs at line n2.
//D. The code prints the content of the employee.txt file and throws an exception at line n3.

//Correct Answer: D

package q50_BufferReader;

import java.io.*;

public class Test {

	public static void main(String[] args) throws IOException {
		BufferedReader brCopy = null;
		try (BufferedReader br = new BufferedReader (new FileReader("C:/temp/studynotes.txt"))) { //line n1
			br.lines().forEach(c -> System.out.println(c));
			brCopy = br; //line n2
		}
		brCopy.ready(); //line n3;

	}

}
