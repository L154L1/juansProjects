package Q20_getClass;

import java.util.*;
class Ref {

	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("Hello Java!");
		String s2= s1.toString();
		List<String> lst = new ArrayList<String>();
		lst.add(s2);
		System.out.println(s1.getClass());	//class java.lang.StringBuilder
		System.out.println(s2.getClass());	//class java.lang.String
		System.out.println(lst.getClass());	//class java.util.ArrayList

	}

}



