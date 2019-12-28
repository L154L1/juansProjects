// You have been asked to ensure that the run methods of both the Worker and Master classes are executed.
// Which modification meets the requirement?
// A. At line n2, insert CyclicBarrier cb = new CyclicBarrier(2, master);
// B. Replace line n1 with class Master extends Thread {
// C. At line n2, insert CyclicBarrier cb = new CyclicBarrier(1, master);
// D. At line n2, insert CyclicBarrier cb = new CyclicBarrier(master);

// Answer : C

package q35_CyclicBarrier;

import java.util.concurrent.*;

class Worker extends Thread {
	CyclicBarrier cb;
	public Worker(CyclicBarrier cb) { this.cb = cb; }
	public void run () {
		try {
			cb.await();
			System.out.println("Worker…");
		} catch (Exception ex) { }
	}
}

class Master implements Runnable { //line n1
	public void run () {
		System.out.println("Master…");
	}
}

public class Test {

	public static void main(String[] args) {
		Master master = new Master();
		CyclicBarrier cb = new CyclicBarrier(1, master);	//line n2
		//CyclicBarrier cb = new CyclicBarrier(2, master);	// will hang! Because worker.start() only starts one thread.
		Worker worker = new Worker(cb);
		worker.start();

	}

}
