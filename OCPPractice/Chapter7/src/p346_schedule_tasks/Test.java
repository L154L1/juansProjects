// schedule() method can take Runnable or Callable.
// scheduleAtFixedRate() and scheduleWithFixedDelay can only take Runnable.

package p346_schedule_tasks;

import java.util.concurrent.*;

public class Test {

	public static void main(String[] args) {
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		
		Runnable task1 = () -> System.out.println("Hello Zoo");
		Callable task2 = () -> "Monkey";
		
		ScheduledFuture<?> result1 = service.schedule(task1, 10, TimeUnit.SECONDS);
		Future<?> result2 = service.schedule(task2, 10, TimeUnit.MINUTES);
		
		System.out.println(result1.getDelay(TimeUnit.SECONDS));
		
		service.scheduleAtFixedRate(task1, 5, 1, TimeUnit.SECONDS);
		
		service.scheduleWithFixedDelay(task1, 0, 2, TimeUnit.MINUTES);

	}

}
