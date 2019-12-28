// A try statement must have catch and/or finally. Having both is fine. Having neither is a problem. 
// Catch is not required if finally is present.

package p308_try_finally;

public class P308 {	
	public void test1() {
		try{
			fall();
		}
		catch (Exception e) {
			System.out.println("oh no");
		}
	}
	
	public void test2() {		// Catch is not required if finally is present.
		try{
			fall();
		}
		finally {
			System.out.println("all better");
		}
	}
	
	public void test3() {
		try{
			fall();
		}
		catch (Exception e) {
			System.out.println("oh no");
		}
		finally {
			System.out.println("all better");
		}
	}
	
	public static void fall() {}

}
