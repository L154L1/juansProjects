package p81_for_loops;

public class ForEach1 {

	public static void main(String[] args) {
		final String[] names = new String[3];
		names[0] = "Lisa";
		names[1] = "Kevin";
		names[2] = "Roger";
		
		
		for(String name : names){
			System.out.print(name + ", ");
		}
		
		System.out.println();
		
		// equivalent basic for loop
		for(int i = 0; i < names.length; i++){
			System.out.print(names[i] + ", ");
		}
		
	}
}
