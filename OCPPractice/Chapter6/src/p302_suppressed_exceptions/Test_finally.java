// suppressed exceptions apply only to exceptions thrown in the try clause. 
// In below example, the primary exception does not get thrown because the exception in finally block takes precedence.

package p302_suppressed_exceptions;

public class Test_finally {

	public static void main(String[] args) {
		try(JammedTurkeyCage t = new JammedTurkeyCage()){
			throw new IllegalStateException("turkeys ran off");		
		}finally {
			throw new RuntimeException("and we couldn't find them");	
		}

	}

}
