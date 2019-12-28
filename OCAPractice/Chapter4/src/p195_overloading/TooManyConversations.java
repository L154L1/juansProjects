package p195_overloading;

public class TooManyConversations {
	public static void play(Long l) {}
	public static void play(Long... l) {}
	
	public static void main(String[] args) {
		Long l = 4;
		
		play(4L);
		
		play(4);	// Java can convert int 4 to long 4 or Integer 4. But it cannot handle two steps to a long then a Long.
	}
}
