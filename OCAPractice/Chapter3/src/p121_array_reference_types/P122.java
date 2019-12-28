package p121_array_reference_types;

public class P122 {

	public static void main(String[] args) {
		String[] strings = {"stringValue"};
		Object[] objects = strings;
		String[] againStrings = (String[])objects;
//		againStrings[0] = new StringBuilder();	// doesn't compile
		objects[0] = new StringBuilder();	// throws ArrayStoreException - because we have a String[] referred to from an Object[] variable.
		
//		objects[0] = "abc";
//		System.out.print(objects[0]);
	}
}
