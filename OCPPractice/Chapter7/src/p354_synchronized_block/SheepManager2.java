package p354_synchronized_block;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SheepManager2 {

	private int sheepCount = 0;
	
	private final Object lock = new Object();	// synchronized can be on any object, as long as it is the same object.
	
	private void incrementAndReport() {
		synchronized(lock) {
			System.out.print(++sheepCount + " ");
		}
		
	}

	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(20);
			SheepManager2 manager = new SheepManager2();
			
			//submit 10 tasks - they run concurrently with 20-thread pool
			for(int i=0; i<10; i++)
				service.submit(() -> manager.incrementAndReport());
						
		}finally {
			if(service != null) service.shutdown();
		}

	}

}

// 1 2 3 4 5 6 7 8 9 10