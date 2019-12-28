// lambda expression can access static variables, instance variables, effectively final method parameters, and effectively final local variables.		

package p173_access_variables_in_lambda;

interface Gorrila{ String move(); }

public class GorrilaFamily {
	String walk = "walk";
	void everyonePlay(boolean baby) {
		String approach = "amble";
		//approach = "run";		// causes compiler error because approach must be effectively final to be used by lambda.
		
		play(() -> walk);
		play(() -> baby ? "hitch a ride" : "run");
		play(() -> approach);
	}
	
	void play(Gorrila g) {
		System.out.println(g.move());
	}

}
