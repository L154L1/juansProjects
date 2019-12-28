package q28;

import java.util.*;

public class Q28 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.removeIf(s -> s.isEmpty());
		list.removeIf(s -> {return s.isEmpty();});
		list.removeIf((String s) -> s.isEmpty());
		list.removeIf((s) -> s.isEmpty());
	}
}
