// Without generic type, ArrayList is collection of Objects, with generic type, ArrayList is type safe.
// ArrayList implements toString() method so you can easily see contents by printing it. (Array doesn't do the same)

package p130_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Add_Remove_Set {

	public static void main(String[] args) {
		// without generic type, ArrayList is collection of Objects
		ArrayList list = new ArrayList();
		list.add("hawk");
		list.add(Boolean.TRUE);
		list.add(true);
		list.add(10);
		System.out.println(list);		// [hawk, true, true, 10]
		
		// with generic type, ArrayList is type safe
		ArrayList<String> safer = new ArrayList<>();
		safer.add("sparrow");
//		safer.add(Boolean.TRUE);		// does not compile
		
		List<String> birds = new ArrayList<>();
		birds.add("hawk");
		birds.add(1, "robin");
		birds.add(0, "blue jay");
		birds.add(1, "cardinal");
		System.out.println(birds);		// [blue jay, cardinal, hawk, robin]		
		
		List<String> birds2 = new ArrayList<>();
		birds2.add("hawk");
		birds2.add("hawk");
		System.out.println(birds2.remove("cardinal"));		// false
		System.out.println(birds2.remove("hawk"));			// true
		System.out.println(birds2);							// [hawk]
		System.out.println(birds2.remove(0));				// hawk
		System.out.println(birds2);							// []
		
		birds2.add("hawk");
		System.out.println(birds2);			// [hawk]
		birds2.set(0, "robin");
		System.out.println(birds2);			// [robin]
		birds2.set(1, "robin");				// IndexOutOfBoundsException
	}
}
