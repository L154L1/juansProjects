// The threads t1 and t2 execute asynchronously and possibly prints ABCA or AACB.
// You have been asked to modify the code to make the threads execute synchronously and prints ABC.

// Which modification meets the requirement?
// A. start the threads t1 and t2 within a synchronized block.
// B. Replace line n1 with:private synchronized int count = 0;
// C. Replace line n2 with:public synchronized void run () {
// D. Replace line n2 with:volatile int count = 0;

// Answer: C

package q52_synchronized;

class MyThread implements Runnable {
	private String src[] = {"A", "B", "C"};
	private int count = 0; 	// line n1
	//public void run() {		// line n2
	public synchronized void run() {		// line n2 replacement	
		while(count < src.length) {
			System.out.print(src[count]);
			count++;
		}
	}
}

public class Test {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		
		// same Runnable mt is run by two threads
		Thread t1 = new Thread(mt);
		Thread t2 = new Thread(mt);		
		t1.start();
		t2.start();
		
	}

}
