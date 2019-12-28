package q14;

public class Q14 {

	public static void main(String[] args) {
		StringBuilder puzzle = new StringBuilder("Java");
		
		//System.out.println(puzzle.capacity());
		
		puzzle.reverse();
		System.out.println(puzzle);	// avaJ
		
		StringBuilder puzzle2 = new StringBuilder("Java");
		puzzle2.append("vaJ$").delete(0, 3).deleteCharAt(puzzle2.length()-1);
		System.out.println(puzzle2);	//avaJ

	}
}
