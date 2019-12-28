// What definition of the ColorSorter class sorts the blocks list?

// Answer: C

package q142_Comparator;

import java.util.*;

public class Block {
	String color;
	int size;
	Block(int size, String color){
		this.size = size;
		this.color = color;
	}

	public static void main(String[] args) {
		List<Block> blocks = new ArrayList<>();
		blocks.add(new Block(10, "Green"));
		blocks.add(new Block(7, "Red"));
		blocks.add(new Block(12, "Blue"));
		Collections.sort(blocks, new ColorSorter());
		
		System.out.println(blocks);

	}
	
	public String toString() { return color;}

}


// B.
//class ColorSorter2 implements Comparable<Block> {		// does not compile because Block is not a Comparable.
//	public int compareTo(Block o1, Block o2) {
//		return o1.color.compareTo(o2.color);
//	}
//}

//C.
class ColorSorter implements Comparator<Block> {	
	public int compare(Block o1, Block o2) {
		return o1.color.compareTo(o2.color);
	}
}
