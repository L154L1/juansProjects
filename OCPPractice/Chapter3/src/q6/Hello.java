package q6;




public class Hello<T> {
	T t;
	public Hello(T t) { this.t = t; }
	public String toString() { return t.toString(); }	// toString() can be called on generic type variable.
	
	public static void main(String[] args) {
		System.out.print(new Hello<String>("hi"));
		System.out.print(new Hello("there"));
	}
	
	
}

// hithere