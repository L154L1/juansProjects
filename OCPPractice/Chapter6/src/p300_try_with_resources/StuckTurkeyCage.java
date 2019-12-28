// close() method in AutoCloseable interface declares Exception, so the implementers may throw any exceptions they chose, or even no exception.

package p300_try_with_resources;

public class StuckTurkeyCage implements AutoCloseable {
	
	public void close() throws Exception {
		throw new Exception("Cage door does not close");
	}

	public static void main(String[] args) throws Exception {
		try(StuckTurkeyCage t = new StuckTurkeyCage()){
			System.out.println("put turkeys in");
		}

	}

}
