// From what threading problem does the program suffer?
// A. race condition
// B. deadlock
// C. starvation
// D. livelock

// Answer: B

package q67_deadlock;

class Counter extends Thread{
	int i = 10;
	public synchronized void display(Counter obj) {
		try {
			Thread.sleep(5);
			obj.increment(this);
			System.out.print(i);
		} catch(InterruptedException ex) { }		
	}
	
	public synchronized void increment(Counter obj) {
		i++;
	}
}

public class Test {

	public static void main(String[] args) {
		final Counter obj1 = new Counter();
		final Counter obj2 = new Counter();
		new Thread(new Runnable() {
			public void run() {obj1.display(obj2);}
		}).start();
		new Thread(new Runnable() {
			public void run() {obj2.display(obj1);}
		}).start();

	}

}
