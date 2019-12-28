// What change should you make to guarantee a single order of execution (printed values 1 -100 in order)?

// A. Line 3: public synchronized void run() {
// B. Line 1: class MyClass extends Thread {
// C. Line 2: public volatile int value;
// D. Line 2: public synchronized int value;

// Answer: A

package q72_synchronized;

class MyClass implements Runnable {		// line 1
	public int value;					// line 2
	//public void run() {				// line 3
	public synchronized void run() {	// line 3 replacement
		while(value < 100) {
			value++;
			System.out.println("value: " + value);
		}
	}
}

public class TestThread {

	public static void main(String[] args) {
		MyClass mc = new MyClass();
		
		// same Runnable ms is run by two threads
		Thread a = new Thread(mc);
		a.start();
		Thread b = new Thread(mc);
		b.start();

	}

}
