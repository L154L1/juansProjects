// merge() is a method added to Map in Java 8.

// merge method uses a BiFunction as mapper. It will pass an key's present value(v1) and a new value(v2) as input to this BiFunction and take its returned value as final value for the key.
// merge method also has logic for what happens if a null value or a missing key are involved. In this case, it doesn't call the BiFunction at all, and it simply uses the new value.
// if the mapping function is called and returns null, the key is removed from the map.

package p156_Map_merge;

import java.util.*;
import java.util.function.*;

public class Test {

	public static void main(String[] args) {
		
		// this mapper is defined to return the longer one between two strings.
		// v1 - old value, v2 - new value
		BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;
		
		Map<String, String> favorites = new HashMap<>();
		favorites.put("Jenny", "Bus Tour");
		favorites.put("Tom", "Tram");		
				
		String jenny = favorites.merge("Jenny", "Skyride", mapper);
		String tom = favorites.merge("Tom", "Skyride", mapper);
		System.out.println(jenny);		// Bus Tour
		System.out.println(tom);		// Skyride
		System.out.println(favorites);	// {Tom=Skyride, Jenny=Bus Tour}
		
		// merge method also has logic for what happens if nulls or missing keys are involved. In this case, it doesn't call the BiFunction at all, and it simply uses the new value.
		Map<String, String> favorites2 = new HashMap<>();
		favorites2.put("Sam", null);
		favorites2.merge("Tom", "Skyride", mapper);	
		favorites2.merge("Sam", "Skyride", mapper);
		System.out.println(favorites2);		// {Tom=Skyride, Sam=Skyride}
		
		// if the mapping function is called and returns null, the key is removed from the map.
		BiFunction<String, String, String> mapper2 = (v1, v2) -> null;
		Map<String, String> favorites3 = new HashMap<>();
		favorites3.put("Jenny", "Bus Tour");
		favorites3.put("Tom", "Bus Tour");
		favorites3.merge("Jenny", "Skyride", mapper2);
		favorites3.merge("Sam", "Skyride", mapper2);		// Sam is new key so mapper2 will not be called and key/value pair will be added.
		System.out.println(favorites3);		// {Tom=Bus Tour, Sam=Skyride}
	}

}
