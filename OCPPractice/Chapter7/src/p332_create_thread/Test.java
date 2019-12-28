// Two ways to create a thread :  the first is preferred way.
// - Provide a runnable object or lambda expression to the Thread constructor.
// - create a class that extends Thread and overrides its run() method.

// start the task by using Thread.start()
// in below example there are 4 threads in total - main() user thread and three additional threads created by the main() method.

package p332_create_thread;

public class Test {

	public static void main(String[] args) {
		System.out.println("begin");
		new ReadInventoryThread().start();
		new Thread(new PrintData()).start();	// pass a runnable to construct a Thread object
		new ReadInventoryThread().start();
		System.out.println("end");
	}

}

// implement Runnable (implement its run() method)
class PrintData implements Runnable {
	public void run() {
		for(int i = 0; i < 3; i++)
			System.out.println("Printing record: " + i);
	}
}

// extends Thread and overrides its run() method
class ReadInventoryThread extends Thread{
	public void run() {
		System.out.println("Printing zoo inventory");
	}
}