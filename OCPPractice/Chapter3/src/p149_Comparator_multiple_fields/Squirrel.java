// Below comparator first sort species field. If they don't match, we finish sorting. It they match, it looks at the next field weight.

package p149_Comparator_multiple_fields;
import java.util.*;

public class Squirrel {
	
	private int weight;
	private String species;
	public Squirrel(String species) {
		if(species == null) throw new IllegalArgumentException();
		this.species = species;
	}
	public int getWeight() { return weight; }
	public void setWeight(int weight) { this.weight = weight; }
	public String getSpecies() { return species; }
}

class MultiFieldComparator implements Comparator<Squirrel> {
	public int compare(Squirrel s1, Squirrel s2) {
		int result = s1.getSpecies().compareTo(s2.getSpecies());
		if(result != 0) return result;
		return s1.getWeight() - s2.getWeight();
	}	
}

// using the static and default methods defined in Comparator interface in Java 8
class ChainingComparator implements Comparator<Squirrel> {
	public int compare(Squirrel s1, Squirrel s2) {
		Comparator<Squirrel> c = Comparator.comparing(s -> s.getSpecies());
		c = c.thenComparing(s -> s.getWeight());
		return c.compare(s1, s2);
	}
}
