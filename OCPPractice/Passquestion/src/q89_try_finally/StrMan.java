// What is the result?
// A. -catch-
//    -finally-
//    -dostuff-
// B. -catch-
// C. -finally-
//    -catch-
// D. -finally-
//    -dostuff-
//    -catch

// Answer: C

package q89_try_finally;

public class StrMan {
	public static void doStuff(String s) {
		try {
			if(s == null) {
				throw new NullPointerException();
			}
		}finally {
			System.out.println("-finally-");
		}
		System.out.println("-doStuff-");
	}

	public static void main(String[] args) {
		try {
			doStuff(null);
		}catch(NullPointerException e) {
			System.out.println("-catch-");
		}

	}

}

//-finally-
//-catch-
