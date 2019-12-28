// If close() method throws a checked exception, using try-with-resources needs to catch or declare it.

// In this example, IllegalStateException is runtime exception.

package p302_suppressed_exceptions;

public class JammedTurkeyCage implements AutoCloseable {
	
	public void close() throws IllegalStateException {
		throw new IllegalStateException("Cage door does not close");
	}

	public static void main(String[] args) {
		try(JammedTurkeyCage t = new JammedTurkeyCage()){
			System.out.println("put turkey in");
		}catch(IllegalStateException e) {
			System.out.println("caught: " + e.getMessage());
		}

	}

}
