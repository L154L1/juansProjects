// Which option fails?
// A. Foo<String, Integer> mark = new Foo<String, Integer> (“Steve”, 100);
// B. Foo<String, String> pair = Foo.<String>twice (“Hello World!”);
// C. Foo<Object, Object> percentage = new Foo<String, Integer>(“Steve”, 100);
// D. Foo<String, String> grade = new Foo <> (“John”, “A”);

// Correct Answer: C

package q72_generic;

public class Foo<K, V> {
	private K key;
	private V value;
	
	public Foo(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public static <T> Foo<T, T> twice(T value){ return new Foo<T, T>(value, value); }

	public static void main(String[] args) {
		Foo<String, Integer> mark = new Foo<String, Integer> ("Steve", 100);		// A.
		
		Foo<String, String> pair = Foo.<String>twice ("Hello World!");				// B.
		
		Foo<Object, Object> percentage = new Foo<String, Integer>("Steve", 100);	// C.
		
		Foo<String, String> grade = new Foo<>("John", "A");							// D.
		
		
		
		Foo percentage2 = new Foo(97, 32);		// free7 q1 C - compiles

	}

}
