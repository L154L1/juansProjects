//What is the result?
//A. Open-Close–
//Exception – 1
//Open–Close–
//B. Open–Close–Open–Close–
//C. A compilation error occurs at line n1.
//D. Open–Close–Open–

//Correct Answer: C

package q61_AutoCloseable;

public class Resource implements AutoCloseable {
	public void close() throws Exception {
		System.out.print("Close-");
	}
	
	public void open() {
		System.out.print("Open-");
	}

	public static void main(String[] args) {
		Resource res1 = new Resource();
		try {
			res1.open();
			res1.close();
		} catch(Exception e) {
			System.out.print("Exception - 1");
		}
		
		try(res1 = new Resource()) {	// line n1
			res1.open();
		} catch(Exception e) {
			System.out.print("Exception - 2");
		}

	}

}
