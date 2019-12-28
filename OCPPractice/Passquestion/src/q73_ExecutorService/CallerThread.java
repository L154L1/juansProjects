// free1 q43

// Which statement is true?
// A. The program prints CallCall and terminates.
// B. The program prints CallCall and does not terminate.
// C. A compilation error occurs at line n1.
// D. An ExecutionException is thrown at runtime.

// Answer : B

package q73_ExecutorService;

import java.util.concurrent.*;

public class CallerThread implements Callable<String> {
	
	String str;
	public CallerThread(String s) { this.str = s;}
	public String call() throws Exception {
		return str.concat("Call");
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(4);
		Future f1 = es.submit(new CallerThread("Call"));
		String str = f1.get().toString();
		System.out.println(str);

	}

}
