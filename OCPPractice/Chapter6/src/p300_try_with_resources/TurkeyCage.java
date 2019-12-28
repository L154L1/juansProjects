// In order for a class to be created in the try clause of try-with-resources statement, Java requires it to implement an interface called AutoCloseable. 
// It has only one method called close(). Once close() method is implemented, all Java has to do is to call the close() method when it comes to auto-close in try-with-resources.


package p300_try_with_resources;

public class TurkeyCage implements AutoCloseable {
	
	public void close() {
		System.out.println("Close gate");
	}

	public static void main(String[] args) {
		try(TurkeyCage t = new TurkeyCage()){
			System.out.println("put turkeys in");
		}

	}

}
