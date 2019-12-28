// t2 is closed first since Java closes resources in the reverse order from which they were created.
// the exception thrown in t2 close() is primary, and the one thrown in t1 close() is suppressed.

package p302_suppressed_exceptions;

public class Test3_suppressed_exceptions {

	public static void main(String[] args) {
		try(JammedTurkeyCage t1 = new JammedTurkeyCage();
			JammedTurkeyCage t2 = new JammedTurkeyCage()) {
			System.out.println("turkeys entered cages");		
		} catch(IllegalStateException e) {
			System.out.println("caught: " + e.getMessage());	
			for(Throwable t: e.getSuppressed())
				System.out.println(t.getMessage());
		}

	}

}
