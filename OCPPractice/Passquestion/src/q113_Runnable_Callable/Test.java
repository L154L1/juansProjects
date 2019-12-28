// What is the result?
// A. The program prints Run… and throws an exception.
// B. A compilation error occurs at line n1.
// C. Run…
//    Call…
// D. A compilation error occurs at line n2.

// Answer: C

package q113_Runnable_Callable;

import java.util.concurrent.*;

class R implements Runnable{
	public void run() { System.out.println("Run..."); }
}

class C implements Callable<String> {
	public String call() throws Exception { return "Call...";} 
}

public class Test {

	public static void main(String[] args) throws ExecutionException, InterruptedException {
		ExecutorService es = Executors.newSingleThreadExecutor();
		es.execute(new R());					//line n1
		Future<String> f1 = es.submit(new C());	//line n2
		System.out.println(f1.get());
		es.shutdown();

	}

}

//Run...
//Call...
