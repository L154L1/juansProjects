// Unlike java.nio Files methods, java.io.File methods don't need to handle IOException if a file doesn't exist.
// It throws NullPointerException instead.

package p410_work_with_file_object;

import java.io.File;

public class ReadFileInformation {

	public static void main(String[] args) {
		File file = new File("C:\\temp\\tree");

		System.out.println("File Exists: " + file.exists());
				
		if(file.exists()) {
			System.out.println("Absolute Path:" + file.getAbsolutePath());
			System.out.println("Is Directory:" + file.isDirectory());
			System.out.println("Parent Path:" + file.getParent());	
			if(file.isFile()) {
				System.out.println("File size: " + file.length());
				System.out.println("File LastModified: " + file.lastModified());
			} else {
				for(File subfile: file.listFiles()) {
					System.out.println("\t"+subfile.getName());
				}
			}

		}
		
		// Other methods on a instance of File
		File file2 = new File("C:\\temp4\\tree");
		file2.mkdirs();
		file2.mkdir();
		file2.renameTo(new File("C:\\temp4\\tree"));
		System.out.println(file2.isFile());
		for(File f: file2.listFiles()) System.out.println(f);
		file2.delete();
	}
}
