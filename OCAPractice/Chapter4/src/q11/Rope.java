package q11;

public class Rope {
	public static void swing() {
		System.out.print("swing ");
	}
	public void climb() {
		System.out.print("climb ");
	}
	public static void play() {
		swing();
//		climb();		// static method cannot call instance method
	}

	public static void main(String[] args) {
		Rope rope = new Rope();
		rope.play();
		Rope rope2 = null;
		rope2.play();	// will not throw NullPointerException because play() is static method. 
						// Java looks at the reference type of rope2 and translate the call to Rope.play()
	}
}
