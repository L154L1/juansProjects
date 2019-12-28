// catch block looks for matches on the primary exception. 
// In below example, the primary exception thrown in try block is not caught by catch block, and will be thrown to the caller.
// the exception thrown by close() matches the catch block but it's suppressed.

package p302_suppressed_exceptions;

public class Test2_suppressed_exceptions {

	public static void main(String[] args) {
		try(JammedTurkeyCage t = new JammedTurkeyCage()){
			throw new RuntimeException("turkeys ran off");		// primary exception not caught
		}catch(IllegalStateException e) {
			System.out.println("caught: " + e.getMessage());	

		}

	}

}
