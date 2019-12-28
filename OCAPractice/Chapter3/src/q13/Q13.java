package q13;

public class Q13 {

	public static void main(String[] args) {
		StringBuilder b = "rumble";
		//StringBuilder b = new StringBuilder("rumble");		// correct way
		b.append(4).deleteCharAt(3).delete(3, b.length() - 1);
		System.out.println(b);	// rum4
	}

}
