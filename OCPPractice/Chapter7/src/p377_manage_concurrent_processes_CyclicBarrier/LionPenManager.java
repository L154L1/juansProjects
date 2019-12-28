// p379 CyclicBarrier - takes a limit value in its constructor, indicating the number of threads to wait for. 
// As each thread finishes, it calls await() method on the cyclic barrier. Once the specified number of threads have each called await(), the barrier is released and all threads can continue.

// p380 If you are using a thread pool, the number of available threads should be no less than your cyclic barrier limit value, otherwise the code will hang indefinitely 
// because the barrier would never be reached as the only threads available in the pool are stuck waiting for the barrier to be complete. This is a form of deadlock.

// p381 reuse CyclicBarrier
// After a CyclicBarrier is broken, all threads are released and the number of threads waiting on the CyclicBarrier goes back to zero. At this point, the CyclicBarrier may be used again for a new set of waiting threads. 
// For example, if our CyclicBarrier limit is 5 and we have 15 threads that call await(), then the CyclicBarrier will be activated a total of three times.


package p377_manage_concurrent_processes_CyclicBarrier;

import java.util.concurrent.*;

public class LionPenManager {
	
	private void removeAnimals() { System.out.println("Removing animals"); }
	private void cleanPen() { System.out.println("Cleaning the pen"); }
	private void addAnimals() { System.out.println("Adding animals"); }
	
	public void performTask(CyclicBarrier c1, CyclicBarrier c2) {
		try {
			removeAnimals();
			c1.await();
			cleanPen();
			c2.await();
			addAnimals();
			
		} catch(InterruptedException | BrokenBarrierException e) {
			// Handle checked exception
		}
	}

	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(4);
			
			LionPenManager manager = new LionPenManager();
			
			CyclicBarrier c1 = new CyclicBarrier(4);
			CyclicBarrier c2 = new CyclicBarrier(4, () -> System.out.println("*** Pen Cleaned!"));
			
			for(int i=0; i<4; i++)	// submit 4 threads which use cyclic barrier await
				service.submit(() -> manager.performTask(c1, c2));
						
		} finally {
			if(service != null) service.shutdown();
		}

	}

}


//Removing animals
//Removing animals
//Removing animals
//Removing animals
//Cleaning the pen
//Cleaning the pen
//Cleaning the pen
//Cleaning the pen
//*** Pen Cleaned!
//Adding animals
//Adding animals
//Adding animals
//Adding animals
