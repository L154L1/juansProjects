package Test2Q77;

public class Program {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("");
		System.out.println(sb.capacity());
		sb.append("OCPAJP");
		sb.deleteCharAt(4);
		System.out.println(sb.capacity());
		sb.trimToSize(3);		// does not compile. This method takes no argument.
		//sb.trimToSize();		// compiles
		System.out.println(sb);
		System.out.println(sb.capacity());

	}
}
