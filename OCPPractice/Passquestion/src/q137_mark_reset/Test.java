// Given that version.txt is accessible and contains : 1234567890

// What is the result?
// A. 121
// B. 122
// C. 135
// D. The program prints nothing.

// Answer: B

package q137_mark_reset;

import java.io.*;

public class Test {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("C:\\temp\\version.txt");
				InputStreamReader isr = new InputStreamReader(fis);
				BufferedReader br = new BufferedReader(isr);){
			if(br.markSupported()) {
				System.out.print((char)br.read());
				br.mark(2);
				System.out.print((char)br.read());
				br.reset();
				System.out.print((char)br.read());
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}

// 122