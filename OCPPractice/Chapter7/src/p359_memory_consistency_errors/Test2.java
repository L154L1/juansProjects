package p359_memory_consistency_errors;

import java.util.*;
import java.util.concurrent.*;

public class Test2 {

	public static void main(String[] args) {
		Map<String, Object> foodData = new ConcurrentHashMap<>();
		
		foodData.put("penguin", 1);
		foodData.put("flamingo", 2);
		
		for(String key : foodData.keySet())
			foodData.remove(key);					// will not throw java.util.ConcurrentModificationException like Test1
		
		System.out.println(foodData.size());


	}

}
