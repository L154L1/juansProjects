// String class has method called toCharArray which returns an array of characters of given string. 
// Also String class has a constructor which can take char array and create string.
// But StringBuilder doesn't have toCharArray method.

package Test4Q35;

class Program {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("OCAJP");
		String s = new String(sb.toCharArray());
		s = s.concat("8");
		System.out.print(s);
		
		String str = "OCAJP";
		char[] cs = str.toCharArray();
		String s2 = new String(str.toCharArray());
		s2 = s2.concat("8");
		System.out.print(s2);
	}

}
