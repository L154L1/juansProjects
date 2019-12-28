package q5;

public class Q5 {

	public static void main(String[] args) {
		String s1 = "java";
		StringBuilder s2 = new StringBuilder("java");
		if (s1 == s2) System.out.print("1");
		if (s1.equals(s2)) System.out.print("2");
		else System.out.print("3");
	}
}
