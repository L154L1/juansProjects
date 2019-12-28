// When we create our own custom exception, we can use three most common constructors defined by the Exception class :
// - The first constructor is the default constructor with no parameters. 
// - The second constructor shows how to wrap another exception inside yours. 
// - The third constructor shows how to pass a custom error message.

// Java automatically prints the stack trace when the program throws an exception. They show the exception along with the method calls it took to get there.

package p290_create_custom_exceptions;

public class CannotSwimException extends Exception {
	
	public CannotSwimException() {
		super();
	}
	public CannotSwimException(Exception e) {
		super(e);
	}
	public CannotSwimException(String message) {
		super(message);
	}

	public static void main(String[] args) throws Exception {
		//throw new CannotSwimException();
		
		//throw new CannotSwimException(new RuntimeException());
		
		throw new CannotSwimException("broken fin");
		
//		try {
//			throw new CannotSwimException();
//		} catch(CannotSwimException e) {
//			e.printStackTrace();
//		}

	}

}
