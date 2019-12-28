package p354_synchronized_block;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SheepManager {

	private int sheepCount = 0;
	
	private void incrementAndReport() {
		synchronized(this) {
			System.out.print(++sheepCount + " ");
		}
		
	}

	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(20);
			SheepManager manager = new SheepManager();
			
			//submit 10 tasks - they run concurrently with 20-thread pool
			for(int i=0; i<10; i++)
				service.submit(() -> manager.incrementAndReport());
						
		}finally {
			if(service != null) service.shutdown();
		}

	}

}

// order is guaranteed
// 1 2 3 4 5 6 7 8 9 10