// Consumer is used when you want to do something with a parameter but not return anything. (BiConsumer takes two parameters)

package p176_implement_Consumer;

import java.util.*;
import java.util.function.*;

public class Test {

	public static void main(String[] args) {
		Consumer<String> c1 = System.out::println;
		Consumer<String> c2 = s -> System.out.println(s);
		c1.accept("Annie");
		c2.accept("Annie");
		
		Map<String, Integer> map = new HashMap<>();
		BiConsumer<String, Integer> c3 = map::put;
		BiConsumer<String, Integer> c4 = (k, v) -> map.put(k, v);
		c3.accept("chicken", 7);
		c4.accept("chick", 1);
		System.out.println(map);		// {chicken=7, chick=1}
		
		Map<String, String> map2 = new HashMap<>();
		BiConsumer<String, String> c5 = map2::put;
		BiConsumer<String, String> c6 = (k, v) -> map2.put(k, v);
		c5.accept("chicken", "Cluck");
		c6.accept("chick", "Tweep");
		System.out.println(map2);		// {chicken=Cluck, chick=Tweep}

	}

}
