package q5;

public class Q5 {

	public int howMany(boolean b, boolean... b2) {
		return b2.length;
	}
	public static void main(String[] args) {
		Q5 q = new Q5();
		System.out.println(q.howMany(true, true, true));		// 2
		System.out.println(q.howMany(true, new boolean[2]));	// 2
		
		//System.out.println(q.howMany(true, {true, true}));		// array type is not declared by {true, true}
		System.out.println(q.howMany(true, new boolean[]{true, true}));	// 2
		
		System.out.println(q.howMany(true));		// 0
		
		System.out.println(q.howMany(true, null));	// NullPointerException (when calling b2.length)
	}
}
