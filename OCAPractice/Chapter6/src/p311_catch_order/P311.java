// The order of exceptions should be from most specific to most general.

package p311_catch_order;

public class P311 {
	public void visitSnakes() {
		try {
			seeAnimal();
		} catch (RuntimeException e) {
			System.out.print("runtime exception");
		} 
		
		catch (ExhibitClosed e) {
			System.out.print("not today");
		} 
		
		catch (Exception e) {
			System.out.print("exception");
		}		
	}
	
	public static void seeAnimal() throws Exception { throw new Exception();}

}

class AnimalOutForAWalk extends RuntimeException {}
class ExhibitClosed extends RuntimeException {}
class ExhibitClosedForLunch extends ExhibitClosed {}



