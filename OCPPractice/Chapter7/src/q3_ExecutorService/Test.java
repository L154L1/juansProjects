package q3_ExecutorService;

import java.util.concurrent.*;

public class Test {

	public static void main(String[] args) {
		ExecutorService service = Executors.newSingleThreadScheduledExecutor();
		service.scheduleWithFixedDelay(() -> { // w1
		System.out.println("Open Zoo");
		return null; // w2
		}, 0, 1, TimeUnit.MINUTES);
		Future<?> result = service.submit(() -> System.out.println("Wake Staff")); // w3
		System.out.println(result.get()); // w4

	}

}
