// Which code fragment can be inserted at line n1 to start r1 and c1 threads?

// A. Future<String> f1 = (Future<String>) es.submit (r1);es.execute (c1);
// B. es.execute (r1);Future<String> f1 = es.execute (c1) ;
// C. Future<String> f1 = (Future<String>) es.execute(r1);Future<String> f2 = (Future<String>)es.execute(c1);
// D. es.submit(r1);Future<String> f1 = es.submit (c1);

// Answer: D

package q106_Runnable_Callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class ThreadRunner implements Runnable{
	public void run() { System.out.print("Runnable");}
}

class ThreadCaller implements Callable {
	public String call() throws Exception { return "Callable";}
}

public class Test {

	public static void main(String[] args) {
		ExecutorService es = Executors.newCachedThreadPool();
		Runnable r1 = new ThreadRunner();
		Callable c1 = new ThreadCaller();
		
		// line n1	- D.
		es.submit(r1);
		Future<String> f1 = es.submit(c1);
		
		es.shutdown();
		
		 //Future<String> f1 = (Future<String>) es.execute(r1);Future<String> f2 = (Future<String>)es.execute(c1);	// C
		 
		 //es.execute (r1);Future<String> f1 = es.execute (c1) ;					// B
		 
		 //Future<String> f1 = (Future<String>) es.submit (r1);es.execute (c1);		// A

	}

}
