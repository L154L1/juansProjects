// putIfAbsent() method is a method added to Map in Java 8.
// putIfAbsent method skips put if the value is already set to a non-null value.


package p156_Map_putIfAbsent;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		Map<String, String> favorites = new HashMap<>();
		favorites.put("Jenny", "Bus Tour");
		favorites.put("Jenny", "Tram");		// put method will just update the value if it was already present.
		System.out.println(favorites);		// {Jenny=Tram}
		
		Map<String, String> favorites2 = new HashMap<>();
		favorites2.put("Jenny", "Bus Tour");
		favorites2.put("Tom", null);			
		favorites2.putIfAbsent("Jenny", "Tram");
		favorites2.putIfAbsent("Sam", "Tram");
		favorites2.putIfAbsent("Tom", "Tram");		// Tom was present as a key but has a null value. Therefore, he was added too.
		System.out.println(favorites2);		// {Tom=Tram, Jenny=Bus Tour, Sam=Tram}
	}

}
