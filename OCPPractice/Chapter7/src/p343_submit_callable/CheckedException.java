// Thread.sleep() throws a checked InterruptedException. It can be in a Callable but not a Runnable.

package p343_submit_callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CheckedException {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService service = null;
		service = Executors.newSingleThreadExecutor();
		service.submit(() -> {Thread.sleep(1000); return null;});	// compiles. The lambda is a Callable. Callable declares exception.
		service.submit(() -> {Thread.sleep(1000);});	// does not compile. Runnable does not declare exception.
		

	}
	
	
	public static void test2(String[] args) {
		ExecutorService service = null;
		service = Executors.newSingleThreadExecutor();
		service.submit(() -> {Thread.sleep(1000); return null;}); // compiles. The lambda is a Callable. Callable declares exception.
		service.submit(() -> {Thread.sleep(1000);});	// does not compile. The lambda is a Runnable. Runnable does not declare exception.
		

	}

}
