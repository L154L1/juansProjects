package p65_short_circuit_operators;

public class P65 {
	static String x;
	
	public static void main(String[] args) {
		if(x != null && x.length() < 5) {}	// short-circuit && prevents a NullPointerException from being thrown
		
		//if(x != null & x.length() < 5) {}		// throws a NullPointerException when x was null
		
		int z = 6;
		boolean y = (z>=6) || (++z <= 7);
		System.out.println(z);	// 6
	}

}
