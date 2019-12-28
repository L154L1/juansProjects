// HashMap and TreeMap implement Map interface.

// HashMap : stores keys in a hash table. lose the order in which you insert the elements.LinkedHashMap will retain the order elements were inserted.
// TreeMap : stores the keys in a sorted tree structure.

package p139_Map;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("koala", "bamboo");
		map.put("lion", "meat");
		map.put("giraffe", "leaf");
		map.put(null, "leaf");		// HashMap allows null key
		String food = map.get("koala");
		
		//System.out.println("value of null key: " + map.get(null));	// value of null key: leaf
		
		System.out.println(map.remove("giraffe"));
		
		//System.out.println(map.remove(null));		// removes entry of null leaf
		
		for(String key: map.keySet()) System.out.print(key + ",");	// null,koala,lion,
		
		map.put("lion", "meat2");
		System.out.println("\n update key lion: " + map.get("lion"));
		
		
		System.out.println();
		
		Map<String, String> map2 = new TreeMap<>();
		map2.put("koala", "bamboo");
		map2.put("lion", "meat");
		map2.put("giraffe", "leaf");
		//map2.put(null, "leaf");		// throws NullPointerException. TreeMap cannot contain null keys.
		String food2 = map2.get("koala");
		for(String key: map2.keySet()) System.out.print(key + ",");	// giraffe,koala,lion,
		
		System.out.println();
		
		// test other Map methods
		//System.out.println(map.contains("lion"));	// no such method
		System.out.println(map.containsKey("lion"));	// true
		System.out.println(map.containsValue("lion"));	// false
		System.out.println(map.size());					// 4

	}

}
