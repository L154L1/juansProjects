// Passquestion q39

// What is the result?
// A. The program prints:
//	Run Runner
//	Call Caller : null
//	And the program does not terminate.
// B. The program terminates after printing:
//	Run Runner
//	Call Caller : Run
// C. A compilation error occurs at line n1.
// D. An Execution is thrown at run time.

// Correct Answer: A


package q22_Callable_Runnable;

import java.util.concurrent.*;

class Caller implements Callable<String> {
	String str;
	public Caller (String s) {this.str=s;}
	public String call()throws Exception { return str.concat ("Caller");}
}
class Runner implements Runnable {
	String str;
	public Runner (String s) {this.str=s;}
	public void run () { System.out.println (str.concat ("Runner"));}
}

public class Test {

	public static void main(String[] args) throws InterruptedException, ExecutionException{
		ExecutorService es = Executors.newFixedThreadPool(2);
		Future f1 = es.submit (new Caller ("Call"));
		Future f2 = es.submit (new Runner ("Run"));		// RunRunner
		
		String str1 = (String) f1.get();
		String str2 = (String) f2.get(); //line n1
		System.out.println(str1+ ":" + str2);		// CallCaller:null

	}

}
