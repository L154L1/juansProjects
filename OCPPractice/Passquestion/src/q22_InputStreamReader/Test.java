// Which code fragment, when inserted at line 1, enables the code to read the GDP from the user?
// A. int GDP = Integer.parseInt (br.readline());
// B. int GDP = br.read();
// C. int GDP = br.nextInt();
// D. int GDP = Integer.parseInt (br.next());

// Answer: A

package q22_InputStreamReader;

import java.io.*;

public class Test {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter GDP: ");
		int GDP = Integer.parseInt(br.readLine());	//line n1
		
		System.out.print("\n" + GDP);
	}

}
