package Test1Q29_predicate_generic_type;

import java.util.ArrayList;
import java.util.function.*;

public class EPractizeLab {

	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<>();
		list.add(21.6);
		list.add(21.39);
		list.add(21.5d);
		list.add(21.41);
		
		
		// Predicate ip = (i) -> {return i > 21.4;};	// doesn't compile because generic type must be given.
		//Predicate<Double> ip = (i) -> {return i > 21.4;};
		
		DoublePredicate ip = i -> i > 21.4;
		
		for(Double d : list){
			if(ip.test(d)){
				System.out.println(d);
			}			
		}
	}

}
