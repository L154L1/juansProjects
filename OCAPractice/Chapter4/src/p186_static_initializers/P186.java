package p186_static_initializers;

public class P186 {
	private static final int NUM_SECONDS_PER_HOUR;
	static {
		int numSecondsPerMinute = 60;
		int numMinutesPerHour = 60;
		NUM_SECONDS_PER_HOUR = numSecondsPerMinute * numMinutesPerHour;
	}
	
	private static int one;
	private static final int two;
	private static final int three = 3;
	private static final int four;
	static {
		one = 1;
		two = 2;
		three = 3;
		two = 4;
	}
}
