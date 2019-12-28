package p420_FileInputStream_FileOutputStream;

import java.io.*;

public class CopyFileSample {
	
	public static void copyFile(File source, File destination) throws IOException {
		try(InputStream in = new FileInputStream(source); 
				OutputStream out = new FileOutputStream(destination)) {
			int b;
			while((b = in.read())!=-1) out.write(b);
		}
	}

	public static void main(String[] args) throws IOException {
		File source = new File("C:\\temp\\Test.class");
		File dest = new File("C:\\temp\\TestCopy.class");
		copyFile(source, dest);
	}

}
