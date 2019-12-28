package p81_for_loops;

public class ForEach2 {

	public static void main(String[] args) {
		java.util.List<String> values = new java.util.ArrayList<>();
		values.add("Lisa");
		values.add("Kevin");
		values.add("Roger");
		
		for(String value : values){
			System.out.print(value + ", ");		// Lisa, Kevin, Roger,
		}
		
		System.out.println();
		
		// equivalent basic for loop
		for(java.util.Iterator<String> i = values.iterator(); i.hasNext();){
			String value = i.next();
			System.out.print(value + ", ");		// Lisa, Kevin, Roger,
		}
		
		System.out.println();
		
		// control printing ", "
		for(int i = 0; i < values.size(); i++){
			String value = values.get(i);
			if(i > 0) System.out.print(", ");
			System.out.print(value);			// Lisa, Kevin, Roger
			
		}
	}
}
