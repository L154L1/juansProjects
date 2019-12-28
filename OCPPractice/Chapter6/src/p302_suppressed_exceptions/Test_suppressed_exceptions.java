// Both try block and close() throw an exception in below example.
// When multiple exceptions are thrown, the first exception is primary, and the others are suppressed.
// catch block looks for matches on the primary exception.

package p302_suppressed_exceptions;

public class Test_suppressed_exceptions {

	public static void main(String[] args) {
		try(JammedTurkeyCage t = new JammedTurkeyCage()){
			throw new IllegalStateException("turkeys ran off");
		}catch(IllegalStateException e) {
			System.out.println("caught: " + e.getMessage());	// caught: turkeys ran off
			for(Throwable t: e.getSuppressed() )
				System.out.println(t.getMessage());				// Cage door does not close

		}

	}

}
