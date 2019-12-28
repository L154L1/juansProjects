package p423_BufferedInputStream_BufferedOutputStream;

import java.io.*;

public class CopyBufferFileSample {
	
	public static void copyFile(File source, File destination) throws IOException {
		try(InputStream in = new BufferedInputStream(new FileInputStream(source)); 
				OutputStream out = new BufferedOutputStream(new FileOutputStream(destination))) {
			byte[] buffer = new byte[1024];
			int lengthRead;
			while((lengthRead = in.read(buffer)) > 0) {
				out.write(buffer, 0, lengthRead);
				out.flush();
			}
		}
	}

	public static void main(String[] args) throws IOException {
		File source = new File("C:\\temp\\Test.class");
		File dest = new File("C:\\temp\\TestCopy.class");
		copyFile(source, dest);

	}

}
