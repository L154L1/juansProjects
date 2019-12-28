package p313_rethrow;

public class P313 {

	public static void main(String[] args) {
		System.out.println(new P313().exceptions());

	}
	
	public String exceptions() {
		String result = "";
		String v = null;
		try {
			try {
				result += "before";
				v.length();
				result += "after";
			} catch (NullPointerException e) {
				result += "catch";
				throw new RuntimeException();
			} finally {
				result += "finally";
				throw new Exception();
			}
			
		} catch (Exception e) {
			result += "done";
		}
		return result;
	}
}
