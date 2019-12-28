package p408_create_file_object;

import java.io.File;

public class FileSample {

	public static void main(String[] args) {
		File file = new File("/home/smith/data/zoo.txt");
		System.out.println(file.exists());
		
		File parent = new File("/home/smith");
		File child = new File(parent, "data/zoo.txt");
		
		System.out.println(System.getProperty("file.separator"));
		System.out.println(File.separator);

	}

}
