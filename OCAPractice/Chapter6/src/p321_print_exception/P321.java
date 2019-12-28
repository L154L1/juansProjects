package p321_print_exception;

public class P321 {

	public static void main(String[] args) {
		try {
			hop();
		} catch (Exception e) {
			System.out.println(e);			// by default, prints exception type and message
			System.out.println(e.getMessage());	// prints message
			e.printStackTrace();			// prints stack trace, most useful
		}

	}
	
	private static void hop() {
		throw new RuntimeException("cannot hop");
	}
}
