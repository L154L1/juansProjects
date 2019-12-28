package q11;
import java.util.Optional;
import java.util.stream.*;
public class Test {
	
	private static void magic(Stream<Integer> s) {
		Optional o = s.filter(x -> x < 5).limit(3).max((x, y) -> x-y);
		System.out.println(o.get());
		}

	public static void main(String[] args) {
		//magic(Stream.empty());		// throws NoSuchElementException: No value present
		//magic(Stream.of(5, 10));		// throws NoSuchElementException: No value present
		magic(Stream.of(2, 3, 5, 10));		// 3
		magic(Stream.iterate(1, x->x++));

	}

}
