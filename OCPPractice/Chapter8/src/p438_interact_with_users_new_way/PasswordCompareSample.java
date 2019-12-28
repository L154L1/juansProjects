// Java console does not work in non-intelligent condition, (for example, in an IDE).


package p438_interact_with_users_new_way;

import java.io.*;
import java.util.Arrays;

public class PasswordCompareSample {

	public static void main(String[] args) {
		Console console = System.console();
		if(console == null) {
			throw new RuntimeException("Console not available");
		} else {
			char[] password = console.readPassword("Enter your password: ");
			console.format("Enter your password again: ");
			console.flush();
			char[] verify = console.readPassword();
			boolean match = Arrays.equals(password, verify);
			
			//Immediately clear password from memory
			for(int i=0; i<password.length; i++) {
				password[i] = 'x';
			}
			// Or
			// Arrays.fill(password, 'x');
			
			
			for(int i=0; i<verify.length; i++) {
				verify[i] = 'x';
			}
			// Or
			// Arrays.fill(verify, 'x');
			
			console.format("Your password was ", (match ? "correct":"incorrect"));
		}
		
		

	}

}
