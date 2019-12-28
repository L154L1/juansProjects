package q12;
import java.io.*;

public class Helper {

	public static <U extends Exception> void printException(U u) {

		System.out.println(u.getMessage());
		}

		public static void main(String[] args) {

			Helper.printException(new FileNotFoundException("A"));
			
			Helper.printException(new Exception("B"));
			
			Helper.<NullPointerException>printException(new NullPointerException ("D"));

		}

}


//A
//B
//D
