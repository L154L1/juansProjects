// Polymorphic assignments can't be applied to generic type.

package Test1Q57_subclass;
import java.util.*;

class Animal{}
class Dog extends Animal{}
public class Pro {

	public static void main(String[] args) {
		List<Dog> c2 = new ArrayList<Dog>();
		List<Animal> c3 = new ArrayList<Dog>();
		ArrayList<Object> c4 = new ArrayList<Animal>();

	}

}
