// Callable functional interface resembles Supplier functional interface, in that they both take no argument and return a generic type.
// You can't really tell the difference.
// One difference is that the method in Callable can throw a checked exception.

package p342_Callable_vs_Supplier;

import java.util.concurrent.*;
import java.util.function.*;
import java.io.*;

public class AmbiguousLambdaExample {
	
	public static void useCallable(Callable<Integer> expression) {}
	public static void useSupplier(Supplier<Integer> expression) {}
	
	public static void use(Callable<Integer> expression) {}
	public static void use(Supplier<Integer> expression) {}

	public static void main(String[] args) {
		useCallable(() -> {throw new IOException();});	// compiles
		useSupplier(() -> {throw new IOException();});  // does not compile
		
		
		//use(() -> {throw new IOException();});			// does not compile
		use((Callable<Integer>)() -> {throw new IOException();});	// compiles

	}

}
