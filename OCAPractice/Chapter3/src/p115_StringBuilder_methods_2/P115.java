package p115_StringBuilder_methods_2;

public class P115 {

	public static void main(String[] args) {
		// append() is overloaded with other types of parameter so you don't need to convert the parameter to a String first.
		StringBuilder sb = new StringBuilder().append(1).append('c');
		sb.append("-").append(true);
		System.out.println(sb);					// 1c-true
		
		System.out.println(sb.toString());		// 1c-true
		
		StringBuilder sb2 = new StringBuilder("animals");
		sb2.insert(7, "-");
		sb2.insert(0, "-");
		sb2.insert(4, "-");
		System.out.println(sb2);			// -ani-mals-
		
		StringBuilder sb3 = new StringBuilder("abcdef");
		sb3.delete(1, 3);
		System.out.println(sb3);			// adef
		sb3.deleteCharAt(3);
		System.out.println(sb3);			// ade
//		sb3.deleteCharAt(4);			// throws exception
		
		StringBuilder sb4 = new StringBuilder("ABC");
		sb4.reverse();
		System.out.println(sb4);			// CBA
	}
}
