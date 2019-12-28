package p184;

public class Counter {
	private static int count;		// static or instance variable are automatically initialized to default value, 0 for int.
	public Counter() { count++; }	// each time the constructor gets called, it increments count by 1
	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
		System.out.println(count);
	}
}
