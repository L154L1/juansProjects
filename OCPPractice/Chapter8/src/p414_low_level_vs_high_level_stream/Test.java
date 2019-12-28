package p414_low_level_vs_high_level_stream;

import java.io.*;
public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		try(BufferedReader bufferedReader = new BufferedReader(
				new FileReader("C:\\temp\\Test.java"))){
			System.out.println(bufferedReader.readLine());
		}
		
		try(ObjectInputStream objectStream = new ObjectInputStream(
				new BufferedInputStream(
						new FileInputStream("C:\\temp\\Test.java")))){
			System.out.println(objectStream.readObject());
			
		}

	}

}
