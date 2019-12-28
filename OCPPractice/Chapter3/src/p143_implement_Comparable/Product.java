// You are strongly encouraged to make your comparable class consistent with equals() method implementation - compareTo() and equals() should be consistent.
// Below is an example that compareTo() and equals() are not consistent.

package p143_implement_Comparable;

public class Product implements Comparable<Product> {
	int id;
	String name;
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Product)) return false;
		Product other = (Product)obj;
		return this.id == other.id;
	}
	
	public int compareTo(Product p) {
		return this.name.compareTo(p.name);
	}
	
}
