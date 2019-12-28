package p308_assertions;

public class Assertions {

	public static void main(String[] args) {
		int numGuests = -5;
		assert numGuests > 0;
		// or, assert (numGuests > 0);
		System.out.println(numGuests);

	}

}
