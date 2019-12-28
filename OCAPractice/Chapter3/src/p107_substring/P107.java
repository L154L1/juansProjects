package p107_substring;

public class P107 {

	public static void main(String[] args) {
		String s = "animals";
		
		System.out.println(s.substring(3));					// mals
		System.out.println(s.substring(s.indexOf('m')));	// mals
		System.out.println(s.substring(3, 4));				// m
		System.out.println(s.substring(3, 7));				// mals
		
		System.out.println(s.substring(3, 3));		// empty string
//		System.out.println(s.substring(3, 2));		// throws exception
		System.out.println(s.substring(3, 8));		// throws exception
	}

}
