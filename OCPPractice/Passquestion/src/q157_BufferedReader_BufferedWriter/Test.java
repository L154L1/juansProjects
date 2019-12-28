// Given that data.txt and alldata.txt are accessible.
// What is required at line n1 to enable the code to overwrite alldata.txt with data.txt
// A. br.close()
// B. bw.writeln()
// C. br.flush()
// D. bw.flush()

// Answer: D

package q157_BufferedReader_BufferedWriter;

import java.io.*;

public class Test {
	
	public void writeFiles() throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("C:\\temp\\data.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\temp\\alldata.txt"));
		String line = null;
		while((line = br.readLine()) != null) {
			bw.append(line + "\n");
		}
		
		bw.flush();		//line n1
		//bw.close();	// also works

	}

	public static void main(String[] args) throws Exception{
		new Test().writeFiles();

	}

}
