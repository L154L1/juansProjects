package p66_tricky;

public class Tricky {

	public static void main(String[] args) {
		boolean y = false;
		boolean x = (y = true);
		System.out.println(x);		// true
		
		boolean y2 = false;
		boolean x2 = (y2 == true);
		System.out.println(x2);		// false
	}
}
