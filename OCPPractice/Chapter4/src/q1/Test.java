package q1;
import java.util.stream.*;
public class Test {

	public static void main(String[] args) {
		Stream<String> stream = Stream.iterate("", (s) -> s + "1");
		
		// No terminal operation is called, so the stream never executes.
		System.out.println(stream.limit(2).map(x -> x + "2"));	// java.util.stream.ReferencePipeline$3@3e3abc88

	}

}
