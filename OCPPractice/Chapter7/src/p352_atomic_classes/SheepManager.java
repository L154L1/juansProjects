package p352_atomic_classes;

import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

public class SheepManager {
	
	private AtomicInteger sheepCount = new AtomicInteger(0);
	
	private void incrementAndReport() {
		//System.out.print(sheepCount.incrementAndGet() + " ");
		System.out.print(sheepCount.getAndIncrement() + " ");
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
