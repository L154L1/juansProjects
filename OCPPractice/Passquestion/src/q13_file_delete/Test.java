// Assume that Project contains subdirectories that contain .class files and is passed as an argument to the recDelete () method when it is invoked.
// What is the result?
// A. The method deletes all the .class files in the Project's directory and its subdirectories.
// B. The method deletes the .classfiles of the Projectsdirectory only.
// C. The method executes and does not make any changes to the Projectsdirectory.
// D. The method throws an IOException.

// Answer: A

package q13_file_delete;

import java.io.*;

public class Test {
	
	public void recDelete(String dirName) throws IOException {
		File[] listOfFiles = new File(dirName).listFiles();
		if(listOfFiles != null && listOfFiles.length > 0) {
			for(File aFile : listOfFiles) {
				if(aFile.isDirectory()) {
					recDelete(aFile.getAbsolutePath());
				} else {
					if(aFile.getName().endsWith(".class"))
						aFile.delete();
				}
			}
		}
	}

	public static void main(String[] args) throws Exception {
		new Test().recDelete("C:/temp/q13");

	}

}
