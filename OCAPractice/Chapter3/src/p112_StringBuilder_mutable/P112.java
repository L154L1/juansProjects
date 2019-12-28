package p112_StringBuilder_mutable;

public class P112 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("start");
		sb.append("+middle");
		System.out.println(sb);						// start+middle
		StringBuilder same = sb.append("+end");
		System.out.println(sb);						// start+middle+end
		System.out.println(same);					// start+middle+end
		
		
		// There is only one StringBuilder object here because new StringBuilder() is only called once.
		// There are two variables referring to that same object.
		StringBuilder a = new StringBuilder("abc");
		StringBuilder b = a.append("de");
		//b = b.append("f").append("g");
		b.append("f").append("g");
		System.out.println(a);			// abcdefg
		System.out.println(b);			// abcdefg
	}
}
