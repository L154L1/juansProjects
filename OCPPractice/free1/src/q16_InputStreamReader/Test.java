// Given that course.txt is accessible and contains:
// Course : : Java

// What is the result?
// ue Ja

package q16_InputStreamReader;

import java.io.*;

public class Test {

	public static void main(String[] args) {
		int i;
		char c;
		try (FileInputStream fis = new FileInputStream ("C:/temp/course.txt");
		InputStreamReader isr = new InputStreamReader(fis);) {
			while (isr.ready()) { //line n1
				isr.skip(2);
				i = isr.read ();
				c = (char) i;
				System.out.print(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
