// Q. 58  	Which of the following can be inserted in main? (Choose all that apply.)

// An anonymous inner class can either extend a class or implement an interface. Runnable is an interface with one method. 
// Thread is a concrete class, making implementing the run() method optional.

package q58;

public class Test {
	
	public static void call(Object obj) { }

	public static void main(String[] args) {
		call(new Runnable() {
			public void run() { }
			});
		
		call(new Thread() { });
		
		call(new Thread());		// with or without {} are both ok
		
		call(new Thread() {
			public void run() { }
			});

	}

}
